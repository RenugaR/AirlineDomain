package org.banks;

public class IciciBank {

	public static void main(String[] args) {
		System.out.println("Immutable String");
		String S1="Greens";
		String S2="Tech";
		
		String ans=S1.concat(S2);
		System.out.println(ans);
		System.out.println(System.identityHashCode(ans));
		System.out.println();
		
		System.out.println("Mutable String");

		StringBuffer x1=new StringBuffer("Greens");
		StringBuffer x2=new StringBuffer("Tech");
		
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));

		x1.append(x2);
		System.out.println(x1);
		System.out.println(System.identityHashCode(x1));


	}
}
