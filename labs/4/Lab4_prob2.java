/*
* File: Lab4_prob2.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: 3/9/17
* Version: 1.8
*/

import java.util.Scanner;

public class Lab4_prob2{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter in a String: ");
    String userStr = input.nextLine();
    
    
    System.out.println("The number of letters in the String is: " +
        countLetters(userStr));
    
  }
  
  public static int countLetters(String s){
    int count = 0;
    
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) != ' ')
        count++;
    }
    return count;
  }
}