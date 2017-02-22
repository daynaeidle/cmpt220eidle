/*
* File: Lab2_prob10.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/22/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_prob10{
  public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
    int number = 0;
    
    System.out.print("Enter a letter: ");
    char letter = input.next().charAt(0);

    
    if (letter == 'a' || letter == 'A' ||
        letter == 'b' || letter == 'B' ||
        letter == 'c' || letter == 'C')
      number = 2;
      
    else if (letter == 'd' || letter == 'D' ||
             letter == 'e' || letter == 'E' ||
             letter == 'f' || letter == 'F')
      number = 3;
    
    else if (letter == 'g' || letter == 'G' ||
             letter == 'h' || letter == 'H' ||
             letter == 'i' || letter == 'I')
      number = 4;
      
    else if (letter == 'j' || letter == 'J' ||
             letter == 'k' || letter == 'K' ||
             letter == 'l' || letter == 'L')
      number = 5;
      
    else if (letter == 'm' || letter == 'M' ||
             letter == 'n' || letter == 'N' ||
             letter == 'o' || letter == 'O')
      number = 6;
      
    else if (letter == 'p' || letter == 'P' ||
             letter == 'q' || letter == 'Q' ||
             letter == 'r' || letter == 'R' ||
             letter == 's' || letter == 'S')
      number = 7;
      
    else if (letter == 't' || letter == 'T' ||
             letter == 'u' || letter == 'U' ||
             letter == 'v' || letter == 'V')
      number = 8;
    
    else if (letter == 'w' || letter == 'W' ||
             letter == 'x' || letter == 'X' ||
             letter == 'y' || letter == 'Y' ||
             letter == 'z' || letter == 'Z')
      number = 9;
      
    else number = 0;
      
      
    if (number == 0)
      System.out.println(letter + " is an invalid input");
    else
      System.out.println("The corresponding number is " + number);
      
             
    
    
  }
}
