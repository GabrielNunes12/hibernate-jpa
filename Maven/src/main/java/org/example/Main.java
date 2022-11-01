package org.example;

import org.example.Model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
//    Person person1 = new Person(null, "Carl", "carl@gmail.com");
//    Person person2 = new Person(null, "Carl2", "carl2@gmail.com");
//    Person person3 = new Person(null, "Carl3", "carl3@gmail.com");
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    //always to include a transaction if your "query" is not a simple SELECT * FROM table (adding, removing or updating)
//    entityManager.getTransaction().begin();
//    entityManager.persist(person1);
//    entityManager.persist(person2);
//    entityManager.persist(person3);
//    entityManager.getTransaction().commit();
//    System.out.println("Inserted");
    //finding by ID
    Person person = entityManager.find(Person.class, 2);
    System.out.println(person);
    entityManager.close();
    entityManagerFactory.close();
  }
}