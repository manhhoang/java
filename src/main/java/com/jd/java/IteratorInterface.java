package com.jd.java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {

	@SuppressWarnings("rawtypes")
	private static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String)
				break;
		}
		return it;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] argh) {
		ArrayList mylist = new ArrayList();
		for (int i = 0; i < 3; i++) {
			mylist.add(12);
		}
		mylist.add("###");
		for (int i = 0; i < 3; i++) {
			mylist.add("ABC");
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}

	}
}
