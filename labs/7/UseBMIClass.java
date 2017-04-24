/*
* File: UseBMIClass.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 7 - Problem 10.2
* Due Date: 4/27/2017
* Version: 1.8
*/

public class UseBMIClass{
  public static void main(String[]args){
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is " + 
        bmi1.getBMI() + " " + bmi1.getStatus());
        
    BMI bmi2 = new BMI("Susan King", 30, 215, 5, 10);
    System.out.println("The BMI for " + bmi2.getName() + " is " + 
        bmi2.getBMI() + " " + bmi2.getStatus());
  }
}