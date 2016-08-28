package com.jd.java8;

import java.util.function.Consumer;

public class Consumers {

  public static void main(String[] args) {
    Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
    greeter.accept(new Person("Luke", "Skywalker"));
  }
}
