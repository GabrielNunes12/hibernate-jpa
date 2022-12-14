package org.example.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Person implements Serializable {
  private static final long serialVersionUID = 1l;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;

  public Person(Integer id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public Person() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return Objects.equals(getId(), person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getEmail());
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
