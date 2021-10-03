package org.type;
//immutabel dont Share the memory loction
//likelitterl steing method

public class Immutabe {
	public static void main(String[] args) {
		String s= "Java";
		System.out.println("Immutabel String");
		
		 String s1= "Application";
		 
		 String concat = s.concat(s1);
		 System.out.println(concat);
		 
		 int a = System.identityHashCode(s);
		 System.out.println(a);
		 
		 int b = System.identityHashCode(s1);
		 System.out.println(b);
		 int code = System.identityHashCode(concat);
		 System.out.println(code);
		 
		
	}

}
