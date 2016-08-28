package com.jd.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("peter", "anna", "aike", "xenia");
    Optional<String> reduced = names.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

    reduced.ifPresent(System.out::println);

  }

}
