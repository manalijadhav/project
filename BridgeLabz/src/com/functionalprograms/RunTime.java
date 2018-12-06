package com.functionalprograms;

 /*class Math {
	
 public static double Add (double aNumber1, double aNumber2) {
 return (aNumber1 + aNumber2);
 }

 }

public class RunTime {

 public static void main() {

Math m = new Math();
 System.out.println(m.Add(50, 50));
 }

 }*/

class Data{
	
	public void foo() {
		
		System.out.println("foo");
	}
	
	public void bar() {
		
	System.out.println("boo");
}
}

public class RunTime {
	
	public static void main(String[] args) {

		Data d = new Data();
		
		d.foo();
		
		d.bar();

}
}