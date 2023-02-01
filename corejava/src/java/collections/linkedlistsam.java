package java.collections;

import java.util.*;

public class linkedlistsam 
{
	public static void main(String[] args)
	{
		LinkedList <String>list=new LinkedList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Kangaro");
		list.add("Cheetha");
		list.add("Kingkong");
		System.out.println("Animal are"+list);
		list.add(2,"penguin");
		list.add("amingo");
		System.out.println(" new Animal name are"+list);
		list.remove(3);
		System.out.println("Animal are updated"+list);
		}
}
