/*
* File: Lab3_prob6.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/2/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab3_prob6{
  public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter in an integer: ");
    int number = input.nextInt();
    
    if (isPalindrome(number))
      System.out.println(number + " is a Palindrome Number");
    else
      System.out.println(number + " is not a Palindrome Number");
    
    
  }
  
  public static int reverse(int number){
    int reverse = 0;
    
    while (number != 0){
      
      reverse = reverse * 10;
      reverse = reverse + number%10;
      number = number / 10;
    }
    return reverse;
  }
  
  public static boolean isPalindrome(int number){
  int temp = reverse(number);
  
  if (temp == number)
    return true;
  else
    return false;
  }
}