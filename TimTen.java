package com.appota.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
*
* @author Quang Thanh
*/
public class TimTen {

	    static final String fileName = "book1.txt";
	    static int linecount = 0;
	 	 
	    private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
	        File file = new File(fileName);
	        FileInputStream fis = new FileInputStream(file);
	        InputStreamReader isr = new InputStreamReader(fis, cs);
	        BufferedReader br = new BufferedReader(isr);
	        String line;
	        while ((line = br.readLine()) != null) {
				if (line != null && line.length() > 1){	
	        		if (kiemTraTen(line)) {
						System.out.println(line);
						linecount ++;
					}
	        	}
	        	
/*	        	if (line != null && line.length()!=0){
	        		char a = line.charAt(0);
	        		char c = line.charAt(line.length()-1);
	        		if (Character.isUpperCase(a) && Character.isUpperCase(c)){
	        			System.out.println(line);
	        		}*/		
	        		
/*	        			if(line.matches("[A-Z\\s]*")){
	        			System.out.println(line);
	        		}
	        	*/
	        			
	        	
	        }
	        br.close();
	    }	 	    
		
		public static boolean kiemTraTen (String ten) {
			boolean upper = true;
				for (int i=0; i<ten.length(); i++) {
					   if (!(Character.isUpperCase(ten.charAt(i)) || Character.isDigit(ten.charAt(i)) || ' '==ten.charAt(i) || '*'==ten.charAt(i))){
					    upper = false;
					    break;
					   }
				}
			return upper;
		}
		 
	    public static void main(String[] args) throws IOException {
	    	
	        readUsingBufferedReader(fileName, StandardCharsets.UTF_8);

	    }
}