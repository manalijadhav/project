package com.functionalprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	//	StringBuffer str = new StringBuffer(br.readLine());
		
		System.out.println("Enter a string");
		
		String s = br.readLine();
		
		//adding spaces
        s=" "+s; 
        
      //calculate length of that string
        int len=s.length();
        
        //array to store initials
        char temp[] = new char[len];
        
        //traverse string s
        for(int i=0 ; i < len ; i++) {
        
        //char x checks letter at ith position
        char x = s .charAt(i);
        
        //if space is present store the next letter at position i+1
        if(x ==' ') {
        	
        temp[i] = s.charAt(i+1);
        
        System.out.print(temp[i]+" ");
        
        	}
        
        
        }
		
		for(int m =0; m< len; m++) {
			 if(temp[m] == 'k') {
			        
					System.out.println();
		
		showLines("/home/bridgeit/Desktop/Bridgelabz/BridgeLabz/src/com/functionalprograms/Pattern" , 1 ,9);
			 
			 }
		}
			 for(int n =0; n< len; n++) {
				 if(temp[n] == 'd') {
				        
						System.out.println();

		
			 showLines("/home/bridgeit/Desktop/Bridgelabz/BridgeLabz/src/com/functionalprograms/Pattern" , 10 ,19);
				 }
			 }
			 for(int l =0; l< len; l++) {
				 if(temp[l] == 'w') {
				        
						System.out.println();

		showLines("/home/bridgeit/Desktop/Bridgelabz/BridgeLabz/src/com/functionalprograms/Pattern" , 21 , 29);
	}
			 }
	}
	
	
	
	public static void showLines(String fileName, int startLine, int endLine) 
    {
       String str = " ";
       
       String newstr = " ";
       
        int currentLine = 1;

        try {
        
        	BufferedReader br = new BufferedReader (new FileReader(fileName));                
            
        	//read to startLine
            
        	while(currentLine < startLine) 
            
        	{
           
        		if (br.readLine()==null)
                
        		{
                
        			System.out.println("File too small");
                
        		}
        		
                 currentLine++;
             }        
             
        	//read until endLine
            
        	while(currentLine <= endLine) 
            
        	{
               String  line = br.readLine();
            
                 if (line == null) 
                 
                 {
                     return;
                 
                 }
                 
              //   System.out.println(line);
                 
                 currentLine++;
                 
                 str = line;
                 
               //  System.out.println(str);
                 
                 newstr = str.replaceAll("0", " ");
                 
                 String newstr1 = newstr.replaceAll("1", "*");
                 
                 System.out.println(newstr1);
                 

             }
        	
        	
         } 
         
        catch (IOException ex) 
        
        {
        
        	System.out.println("Problem reading file.\n" + ex.getMessage());
         } 
        
                }                    
            
    }

