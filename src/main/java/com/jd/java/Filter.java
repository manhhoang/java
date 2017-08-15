package com.jd.java;

import java.util.Arrays;
import java.util.List;

public class Filter {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
    names.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
  }
}
