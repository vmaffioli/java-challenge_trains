package com.vmaffioli.engine;

import com.vmaffioli.kiwiland.Railroad;
import com.vmaffioli.business.Calculate;
import com.vmaffioli.utils.ValidateSchema;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;


public class App {
	
	
	@SuppressWarnings("resource") // Reason: BufferedReader
	public static void main (String[] args) throws IOException  {
		
		List<String> results = new ArrayList<String>();
		FileReader read = null;
		try {
	        read = new FileReader("INPUT_AREA/INPUT_CUSTOM.txt");
	        
		} catch(Exception e) {
			System.out.println("!ERROR! INPUT_CUSTOM.txt not found! Loading INPUT_DEFAULT.txt");
	        read = new FileReader("INPUT_AREA/INPUT_DEFAULT.txt");
		}
        String line;
     
        while((line = new BufferedReader(read).readLine()) != null ){
    		   	Railroad.getBuilder(line,ValidateSchema.getValidateSchema(line));
    			results.add(Calculate.RouteValidation("A-B-C"));
    			results.add(Calculate.RouteValidation("A-D"));
    			results.add(Calculate.RouteValidation("A-D-C"));
    			results.add(Calculate.RouteValidation("A-E-B-C-D"));
    			results.add(Calculate.RouteValidation("A-E-D"));
    			results.add(Calculate.HowManyUpThree("C","C"));
    			results.add(Calculate.HowManyExactlyFour("A", "C"));
    			results.add(Calculate.ShortestWay("A", "C"));
    			results.add(Calculate.ShortestWay("B", "B"));
    			results.add(Calculate.RoutesUnderXDistance("C", "C", 30));

        }
		for (int i=0;i<results.size();i++) {
			System.out.println("Output #"+(i+1)+": "+results.get(i));
		}
	}

}
