/*
* File: Lab1_prob5.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 1
* Due Date: 1/26/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab1_prob5{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Please enter the following as a percentage...");
  System.out.print("Midterm Exam: ");
  int midtermEx = input.nextInt();
  System.out.println();
  System.out.print("Final Exam: ");
  int finalEx = input.nextInt();
  System.out.println();
  System.out.print("Projects: ");
  int projects = input.nextInt();
  System.out.println();
  System.out.print("Homework and Labs: ");
  int hw_labs = input.nextInt();
  System.out.println();
  
  int finalGrade = (midtermEx + finalEx + projects + hw_labs)/ 4;
  
  System.out.println("Your final grade is: " + finalGrade + "%");
  }
}