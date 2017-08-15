package com.jd.java;

import java.util.Optional;

public class Optionals {

  public static void main(String[] args) {
    Optional<String> optional = Optional.of("bam");

    optional.isPresent(); // true
    optional.get(); // "bam"
    optional.orElse("fallback"); // "bam"

    optional.ifPresent((s) -> System.out.println(s.charAt(0))); // "b"

    Optional<String> nullable = Optional.ofNullable(null);
    if(nullable.isPresent()){
      System.out.println(nullable.get());
    }
    System.out.println(nullable); // Optional.empty
  }
}
