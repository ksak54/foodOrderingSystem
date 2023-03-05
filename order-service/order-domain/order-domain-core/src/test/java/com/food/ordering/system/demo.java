package com.food.ordering.system;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Dog {
 String name;

 Dog(String name) {
  this.name = name;
 }

}

public class demo {

 public static void main(String[] args) {
  Dog aDog = new Dog("Start");
  Dog oldDog = aDog;

  // we pass the object to foo
  foo(aDog);
  // aDog variable is still pointing to the "Max" dog when foo(...) returns
  System.out.println(aDog.getName().equals("Max")); // true
  System.out.println(aDog.getName().equals("Fifi")); // false
  System.out.println(aDog == oldDog);// true
 }

 public static void foo(Dog d) {
  d.setName("Max"); // true
  // change d inside of foo() to point to a new Dog instance "Fifi"
  d = new Dog("Fifi");
  d.getName().equals("Fifi"); // true
 }

}
