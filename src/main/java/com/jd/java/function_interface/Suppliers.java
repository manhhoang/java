package com.jd.java.function_interface;

import com.jd.java.Person;

import java.util.function.Supplier;

public class Suppliers {

  public static void main(String[] args) {
    Supplier<Person> personSupplier = Person::new;
    personSupplier.get(); // new Person
  }

}
