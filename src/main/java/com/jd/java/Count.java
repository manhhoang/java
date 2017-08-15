package com.jd.java;

import java.util.Arrays;
import java.util.List;

public class Count {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "aike", "xenia");
    long startsWithB = names.stream().filter((s) -> s.startsWith("a")).count();

    System.out.println(startsWithB);

  }

}
