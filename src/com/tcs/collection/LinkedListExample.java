package com.tcs.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manipulating the data is easier 
		//LinkedList predefined class name which cannout be used as class name
        LinkedList<Integer> ll =new LinkedList<Integer>();
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.add(16);
        ll.add(17);
        ll.peek();
        System.out.println(ll.pop());
        System.out.println(ll);
        
        //all methods which are present in ArrayList and LinkedList are Async methods
        
        
	}

}
