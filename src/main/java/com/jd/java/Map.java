package com.jd.java;

import java.util.Arrays;
import java.util.List;

public class Map {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "aike", "xenia");
    names.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(
        System.out::println);

  }

}
