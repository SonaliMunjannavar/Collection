package com.tcs.collection;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashSet class doesnot maintain insertion order where as LinkedHashSet and
		 * List Classes(ArrayList, LinkedList, Stack) maintain insertion order HashSet
		 * doesnot allows the duplicate Values
		 * set allows only one null value
		 * LinkedHashSet doesnot allow duplicate values
		 */
		
		HashSet<Integer> HS = new HashSet<Integer>();
		
		HS.add(11);
		HS.add(4);
		HS.add(5);
		HS.add(6);
		HS.add(5);
		HS.add(7);
		HS.add(8);
		System.out.println(HS);// [4, 5, 6, 7, 8]
		
		//11 is adding at first but it will notmaintain insertion order
		
		HS.add(null);
		HS.add(1);
		HS.add(null);
		System.out.println(HS);//[null, 1, 4, 5, 6, 7, 8, 11]
		
	}

}
