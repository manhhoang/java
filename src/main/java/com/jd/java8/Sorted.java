package com.jd.java8;

import java.util.Arrays;
import java.util.List;

public class Sorted {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "aike", "xenia");
    names.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
    
  }

}
