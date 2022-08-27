package com.bridgelabz.Generics;

public class FindMaxValueWithGenerics {
	public static <T extends Comparable <T>> T maxOfValues(T a1, T a2, T a3) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the find maximum value of three Integer using with Generics\n");
		System.out.println("The maximum value between the three Integer is : " + maxOfValues (2, 25, 50)+ "\n");
		System.out.println("The maximum value between the three Float is : " + maxOfValues (2.7f, 25.5f, 50.9f)+ "\n");
		System.out.println("The maximum value between the three String is : " + maxOfValues ("abc", "pug", "zca"));
}

}
