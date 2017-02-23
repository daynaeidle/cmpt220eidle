/*
* File: Lab3_prob1.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/23/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab3_prob1{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
    
    float sum = 0;
    int negNums = 0;
    int posNums = 0;
    float average;
    int number;
    
    do {
    System.out.print("Enter an integer, the input ends if it is 0: ");
    number = input.nextInt();
    
    if (number < 0)
      negNums+=1;
    else if (number > 0)
      posNums+=1;
      
    sum += number;
    
    } while (number != 0);
    
    average = sum/(negNums + posNums);
    
    System.out.println("The number of positives is: " + posNums);
    System.out.println("The number of negatives is: " + negNums);
    System.out.println("The total is: " + sum);
    System.out.println("The average is: " + average);
    
  }
}