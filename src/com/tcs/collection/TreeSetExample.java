package com.tcs.collection;

import java.util.TreeSet;

interface Name{
	void name();
	// we cannot create normal methods
	static int sum() {
		int a = 1 ,b = 2;
		return  a+b;
	}
	void Sample();
	/*
	 * if you are create abstact method in interface no need to write abstract
	 * keyword before method
	 */
}


public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Integer> TS = new TreeSet<Integer>();
      TS.add(42);
      TS.add(34);
      TS.add(99);
      TS.add(12);
      TS.add(2);
      System.out.println(TS);//[2, 12, 34, 42, 99] output is always ascending order
      //TreeSet doesnot allow the Duplicate Value
      
      
	}

}
