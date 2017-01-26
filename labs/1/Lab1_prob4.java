/*
* File: Lab1_prob4.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 1
* Due Date: 1/26/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab1_prob4{
  public static void main(String[] args){
  
  int remainder, sum;
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a number between 0 and 1000: ");
  int number = input.nextInt();
  
  remainder = number % 10;
  
  number = number / 10;
  
  remainder += number % 10;
  
  number = number / 10;
  
  sum = number + remainder;
  
  System.out.println("The sum of the digits is " + sum);
  
  }
}