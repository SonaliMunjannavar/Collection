package com.tcs.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> St = new Stack<Integer>();
       //Stack is last in first out Lifo mechanism
       St.push(10);
       St.push(11);
       St.push(12);
       St.push(13);
       St.push(14);
       St.push(15);
       System.out.println(St);
       System.out.println(St.pop());//it removes last element
       System.out.println(St);
       //QUEUE is FIFO FIRST in FIRST out (water filling example, whoever come first will get water)
       //ArrayDeque we can add element from first and last of ArrayList
       Deque<Integer> dq = new ArrayDeque<Integer>();
       //Upcasting Sub class object storing into Superclass reference
	   
       dq.add(10);
       dq.add(20);
       dq.addFirst(30);
       dq.addLast(70);
       System.out.println(dq);//[30, 10, 20, 70]
       Queue<Integer> QU =new PriorityQueue<Integer>();
	   //Queue we cannot create directly object we have to use PriorityQueue object as Queue is interface
	   QU.add(10);
	   QU.add(20);
	   QU.add(30);
	   QU.add(40);
	   
	   System.out.println(QU.poll());
	   System.out.println(QU);// we have to use poll method First in First out
 	
	}

}
