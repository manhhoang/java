package com.jd.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);

    map.forEach((k, v) -> System.out.println(k + "=" + v));
  }
}
