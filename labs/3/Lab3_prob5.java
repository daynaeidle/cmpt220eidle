/*
* File: Lab3_prob5.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/2/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab3_prob5{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter in an integer: ");
    int integer = input.nextInt();
    
    System.out.println("The sum of the digits is: " +
        sumDigits(integer));
    
  }
  
  public static int sumDigits(long n){
    int sum = 0;
    
    while (n > 0){
      sum += n % 10;
      n = n / 10;
    }
    return sum;  
  }
  
}