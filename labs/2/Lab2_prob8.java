/*
* File: Lab2_prob8.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/22/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_prob8{
  public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
    int codeNum = -1;
    
    System.out.print("Enter an ASCII code: ");
    codeNum = input.nextInt();
    
    System.out.println("The character for ASCII code " + codeNum + " is " +
                        (char)codeNum); 
      
  }
}