package org.example;

import org.example.Model.Person;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person(1, "Carl", "carl@gmail.com");
    Person person2 = new Person(2, "Carl2", "carl2@gmail.com");
    Person person3 = new Person(3, "Carl3", "carl3@gmail.com");
    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person3);
  }
}