package com.jd.java;

import java.util.Arrays;
import java.util.List;

public class Match {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "aike", "xenia");
    boolean anyStartsWithA = names.stream().anyMatch((s) -> s.startsWith("a"));
    System.out.println(anyStartsWithA); // true

  }
}
