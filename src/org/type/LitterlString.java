package org.type;
//litteral string
//share the memory location and duplicate value are allowed

public class LitterlString {
	public static void main(String[] args) {
		
		String s= "Java Application";
		System.out.println("litteral Sting");
				
		String s1= "java";
		
		String s2= "Java Application";
		
		int a = System.identityHashCode(s);
		System.out.println(a);
		
		int b = System.identityHashCode(s1);
		System.out.println(b);
		
		int code = System.identityHashCode(s2);
		System.out.println(code);
		
		
	}

}
