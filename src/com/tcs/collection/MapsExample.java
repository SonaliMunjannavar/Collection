package com.tcs.collection;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Maps is interface which is upcasted by HasMap
		 
		diff btw Hastset and HashMap is HashMap allows key value pair
		keys doesn't allow duplicate value 
		
		LinkedHashMap Maintains the insertion order and doesn't allows duplicate key values
		we prefer LinkedHashMap during manipulating data
		
		TreeMap will sort the data in ascending order doesn't allow duplicate key values
		*/
		Map<Integer, Integer> MP =new HashMap<Integer, Integer>();
		MP.put(0, 11);
		MP.put(1, 34);
		MP.put(2, 4);
		MP.put(0, 45);//11 is override by value ew value 45
		System.out.println(MP);//{0=45, 1=34, 2=4}	

	}

}
