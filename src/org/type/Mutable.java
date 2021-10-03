package org.type;
//mutable Steing like NonLitterl string share the memory location
//String a= new String()


public class Mutable {
	public static void main(String[] args) {
		StringBuilder s= new StringBuilder("Java");
		System.out.println("mutable String");
		
		StringBuilder s1= new StringBuilder("Application");
		
	   StringBuilder append = s.append(s1);
	   System.out.println(append);
	   
	   int a = System.identityHashCode(s);
	   System.out.println(a);
	   
	   int b = System.identityHashCode(s1);
	   System.out.println(b);
	   
	   int code = System.identityHashCode(append);
	   System.out.println(code);
	
	}

}
