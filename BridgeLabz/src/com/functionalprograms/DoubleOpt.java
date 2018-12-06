/*********************************************************************************************************

 *  Purpose: Accepts Double values from user and perform given arithmetic operations.
 *  
 *  @author  Manali Jadhav
 *  
 *  @version 1.0
 *  
 *  @since   27-11-2018
 *  
**********************************************************************************************************/
package com.functionalprograms;

import java.util.*;

import utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		
				Utility Utility = new Utility();
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter value of A");
				
				double a = scanner.nextDouble();
				
				System.out.println("Enter value of B");
				
				double b = scanner.nextDouble();
				
				System.out.println("Enter value of C");
				
				double c = scanner.nextDouble();
				
				System.out.println("A + B * C = " + a + (b * c));
				
				System.out.println("A * B + C = " + (a * b) + c);
				
				System.out.println("C + A / B = " + c + (a / b));
				
				System.out.println("A % B + C = " + (a % b) + c);
				
		
				
			}

		


	}


