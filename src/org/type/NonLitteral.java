package org.type;
//non litteral String dont share the memory Location
//string a= new string()

public class NonLitteral {
	public static void main(String[] args) {
		String s= new String("Java");
		System.out.println("non Litterl String");
		
		String s1= new String("Java Application");
		
		String s2 = new String("Java");
		
		int a = System.identityHashCode(s2);
		System.out.println(a);
		
		int b = System.identityHashCode(s1);
		System.out.println(b);
		
		int code = System.identityHashCode(s2);
		System.out.println(code);
		
	
	
	}

}
