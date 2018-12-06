package com.functionalprograms;

import java.util.*;

public class randomnumbs {

	public static void main(String[] args) {

		int [] array = new int[5];
		
		int [] array1 = new int[] {};
		
		int count =0;
		
		int repcount=0;
		
		Random r = new Random();
		
		while(count < 5) {
			
			int numb = r.nextInt(10);
			
			count++;
		
		//	boolean exists = false;
			
			System.out.println("Number generated" + numb);
			
			//repcount++;
			
			for(int i = 0; i< 5; i++) {
				
				array[i] = numb;
				
				//if(array[i] == numb) {
					
				//	exists = true;
				
				}
			
		//	if(!exists) {
				
				//array[count++] = numb;
				
		}
			
		
			Arrays.sort(array);
			
			for(int j =0; j<array.length; j++) {
				
				System.out.println(array[j]);
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int count = 0;
        
        int repcount= 0;
        
        
        int[] array = new int[] {};
      
        Random r = new Random();
        
        while (count < len) {
           
            int number = r.nextInt(25) ;

             boolean exists = false;
          
             System.out.println("Number generated"+ number);
             
              repcount++;
            
            for (int i = 0; i < count; i++) {
                
            	//int x = array [i];
            	
            //	al.add(x);
            	
            	if (array[i]  == number) {
                
            		exists = true;
                    
                  }
            }

            
            if (!exists) {
           
            	array[count++] = number;
            }
            
            
            
        }

       // for (int j = 0; j < len; j++) {
          
        //	int x = array [j];
        	
          // 	al.add(x);
        	
        //	System.out.println(al);
        	
        	Arrays.sort(array);
        	
        	for(int i=0; i<len; i++) {
        		
        		int x = array[i];
        		
        		al.add(x);
        		
        		System.out.println(al);
        		*/
     

		
		
		
		/*int[] array = new int[5];
		
        int count = 0;
        
        int repcount= 0;
        
        int numb =1;
        
        Random r = new Random();
         
        while (count < array.length) {
           
            int number = r.nextInt(10) ;

             boolean exists = false;
          
             System.out.println("Number generated"+ number);
             
              repcount++;
            
            for (int i = 0; i < count; i++) {
                
            	if (array[i] == number) {
                
            		exists = true;
                    
                  }
            }

            
            if (!exists) {
           
             	array[count++] = number;
            }
        }

        for (int j = 0; j < array.length; j++) {
          
        	System.out.println(array[j]);
        }
     
        
        System.out.println("Total Repeated counts" + repcount);
    }*/
	


