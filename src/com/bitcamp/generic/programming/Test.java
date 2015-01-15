package com.bitcamp.generic.programming;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {

		LinkListNew<Integer> tnt = new LinkListNew<Integer>();

		tnt.add(36);
		tnt.add(316);
		tnt.add(362);
		tnt.add(364);
		tnt.add(316);
		tnt.add(3226);
		tnt.add(362);
		tnt.add(362);
		tnt.add(346);

		System.out.println(tnt.toString());

		Iterator<Integer> tst = tnt.iterator();

		while (tst.hasNext()) {
			System.out.println(tst.next());

			LinkedList<Integer> test2 = new LinkedList<Integer>();

			test2.add(23);
			test2.add(273);
			test2.add(283);
			test2.add(273);

			Iterator<Integer> bnj = test2.iterator();
			while (bnj.hasNext()) {
				System.out.println(bnj.next());
			}

		}

	}

}
