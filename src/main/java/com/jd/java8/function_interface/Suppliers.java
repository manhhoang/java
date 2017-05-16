package com.jd.java8.function_interface;

import com.jd.java8.Person;

import java.util.function.Supplier;

public class Suppliers {

  public static void main(String[] args) {
    Supplier<Person> personSupplier = Person::new;
    personSupplier.get(); // new Person
  }

}
