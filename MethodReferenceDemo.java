package com;

interface Sayable4 {
	void say();
}
public class MethodReferenceDemo {

 public static void saySomeThing() {

  System.out.println(" hello !");
    }

  public static void main(String ag[]) {

  Sayable4 sayblee = MethodReferenceDemo::saySomeThing; /// creating reference of FI and call the method on based
                                                                /// of class reference due tostatic in nature
  sayblee.say();
}
}