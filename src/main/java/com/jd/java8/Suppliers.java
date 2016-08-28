package com.jd.java8;

import java.util.function.Supplier;

public class Suppliers {

  public static void main(String[] args) {
    Supplier<Person> personSupplier = Person::new;
    personSupplier.get(); // new Person
  }

}
