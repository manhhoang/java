package com.jd.java;

import java.util.HashMap;
import java.util.Map;

public class MapJava8 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			map.putIfAbsent(i, "val" + i);
		}

		map.forEach((id, val) -> System.out.println(val));

		map.computeIfPresent(3, (num, val) -> val + num);
		map.get(3); // val33

		map.computeIfPresent(9, (num, val) -> null);
		map.containsKey(9); // false

		map.computeIfAbsent(23, num -> "val" + num);
		map.containsKey(23); // true

		map.computeIfAbsent(3, num -> "bam");
		map.get(3); // val33

		map.remove(3, "val3");
		map.get(3); // val33

		map.remove(3, "val33");
		map.get(3); // null

		map.getOrDefault(42, "not found"); // not found

		map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
		map.get(9); // val9

		map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
		map.get(9); // val9concat

		Map<Integer, Integer> map2 = new HashMap<>();
		map2.merge(1, 2, Integer::sum);
		System.out.println(map2.get(1));

	}

}
