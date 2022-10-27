package com.bridgelabz.Generics;

public class FindMaxValueWithClass<T extends Comparable <T>> {
T a1, a2, a3, a4;

public FindMaxValueWithClass(T a1, T a2, T a3, T a4) {
	this.a1 = a1;
	this.a2 = a2;
	this.a3 = a3;
	this.a4 = a4;
}
public T maximux(){
    return FindMaxValueWithClass.maxOfValues(a1, a2, a3, a4);
}
public static <T extends Comparable <T>> T maxOfValues(T a1, T a2, T a3, T a4) {
	T max = a1;
	if (a2.compareTo(max) > 0)
		max = a2;
	if (a3.compareTo(max) > 0)
		max = a3;
	if (a4.compareTo(max) > 0)
		max = a4;
	return max;
}

// Generic method to print the max value
public static <T> void printMax(T a) {
	System.out.println("Maximum value is : "+ a);
}

public static void main(String[] args) {
	System.out.println("Welcome to the find maximum value of three Integer using Class\n");
//	System.out.println("The maximum value between the three Integer is : " + maxOfValues (2, 25, 50, 60)+ "\n");
//	System.out.println("The maximum value between the three Float is : " + maxOfValues (2.7f, 25.5f, 50.9f, 44.9f)+ "\n");
//	System.out.println("The maximum value between the three String is : " + maxOfValues ("abc", "pug", "zca", "zza"));
	FindMaxValueWithClass<Integer> maxInteger = new FindMaxValueWithClass<Integer>(2, 25, 50, 60);
	System.out.println("The maximum value between the three Integer is : "+ maxInteger.maximux());
	FindMaxValueWithClass<Float> maxFloat = new FindMaxValueWithClass<Float>(2.7f, 25.5f, 50.9f, 44.9f);
	System.out.println("The maximum value between the three Float is : "+ maxFloat.maximux());
	FindMaxValueWithClass<String> maxString = new FindMaxValueWithClass<String>("abc", "pug", "zca", "zza");
	System.out.println("The maximum value between the three String is : "+ maxString.maximux());
}
}
