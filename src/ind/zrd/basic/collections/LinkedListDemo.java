package ind.zrd.basic.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Ҽ");
		ll1.add("��");
		ll1.add("��");
		
		LinkedList<String> ll2 = new LinkedList<String>();
		
		System.out.println(ll1.toString());
	}
}
