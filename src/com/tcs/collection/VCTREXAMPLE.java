package com.tcs.collection;

import java.util.Vector;

public class VCTREXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Integer> VC =new Vector<Integer>();
        VC.add(10);
		/*
		 * public synchronized boolean add(E e) { modCount++; add(e, elementData,
		 * elementCount); return true; }
		 */
        //Vector class can be used in MultiThreading operations
        VC.add(20);
        VC.add(30);
        VC.add(40);
       System.out.println(VC.hashCode()); //by default it generate Hashcode for every object
       //we have created one object so JVM will create hashcode for VC object 1241621
	}

}
