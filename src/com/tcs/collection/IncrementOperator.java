package com.tcs.collection;
interface Names {
	// interface it allows only abstract methods
	//it allow static methods as well as default method from java 8
	// we no need to declere the abstarct key for the method
	abstract void name();
	
	void age();
	
}
abstract class Sample {
	
	//it allows both abstract methods and normal methods
	//it is mandatory to declere the abstract key when you are creating the abstract method.
	abstract void name();
	
	void age () {
		// non static method
		System.out.println(99);
	}
	
	static void relation() {
		//static method
		System.out.println("Parents");
	}
}
class IncrementOperator {
	// normal class doesn't allows the abstract methods
	public static void main(String[] args){
		
	}
}