package javatest;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
	public static void main(String args[]){
		ArrayList<String> friendList = new ArrayList<String>();
		
		friendList.add("Amy");
		friendList.add("Mori");
		
		System.out.println("friendList :"+friendList.toString());
		
		
		List<String> friendList2 = new ArrayList<String>();
		friendList2.add("frank");
		friendList2.add("joe");
		
		System.out.println("friendList2 :"+friendList2.toString());
		
	}

}
