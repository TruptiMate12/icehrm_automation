package com.icecrm_automation.testngExample;

import org.testng.annotations.Test;

public class TestNGExample {
  @Test
  public void add() {
	  int a=10;
	  int b=20;
	  System.out.println("This is a addition method");
	  System.out.println("addition of an a and b is :" + (a+b));
	  }
  @Test
  public void multi() {
	  int a=10;
	  int b=20;
	  System.out.println("This is a multiplication method");
	  System.out.println("multiplication of an a and b is :" + (a*b));
	  }
 
  @Test
  public void sub() {
	  int a=10;
	  int b=20;
	  System.out.println("This is a subtraction method");
	  System.out.println("subtraction of an a and b is :" + (a-b));
	  }
  @Test
  public void div() {
	  int a=10;
	  int b=5;
	  System.out.println("This is a division method");
	  System.out.println("division of an a and b is :" + (a/b));
	  }
  @Test
  public void mod() {
	  int a=10;
	  int b=20;
	  System.out.println("This is a modulas method");
	  System.out.println("modulas of an a and b is :" + (a%b));
	  }
}

