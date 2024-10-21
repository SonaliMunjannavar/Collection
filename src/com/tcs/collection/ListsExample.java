package com.tcs.collection;

import java.util.ArrayList;

public class ListsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li =new ArrayList<Integer>();//Integer -generic
		//add , remove, remove all, get ,size, contains,
		li.add(10);//object .method which is calling from ArrayList class
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);//entire elements will print
		System.out.println(li.size());//number of elements present.
		System.out.println(li.size()-1);// last index
		System.out.println(li.get(0));// 10 get method is used to fetch the elemet from arraylist
		
		System.out.println(li.get(3));
		System.out.println(li.contains(40));//return true or false
		System.out.println(li.contains(60));//to check the values present or not
		System.out.println();
		
		
		ArrayList<Integer> li1 = new ArrayList<Integer>();
		
		li1.add(60);
		li1.add(70);
		
		li.addAll(li1);//adding li1 to li with same generic
		System.out.println(li);//we cannot add different generic ArrayList
		ArrayList<String> S1 = new ArrayList<String>();
		
		S1.add("Sonali");
		S1.add("Sona");
		S1.add("Pavan");
		S1.add("Kalyan");
		
		System.out.println(li.remove(3));//remove the element from ArrayList wrt index 
		System.out.println(li);
		System.out.println(li.removeAll(li1));
		System.out.println(li);//[10, 20, 30, 50]removes all the element from li
		li.clear();//removes entire elements in the list
		System.out.println(li);
		//ArrayList maintains the insertion order compare to LinkedList
		
		
		

	}

}
