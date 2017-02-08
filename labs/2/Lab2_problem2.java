/*
* File: Lab2_problem2.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_problem2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int firstNum, secondNum, thirdNum;
    int swap = 0; //place holder variable
    
    System.out.print("Please enter three integers: ");
    firstNum = input.nextInt();
    secondNum = input.nextInt();
    thirdNum = input.nextInt();
    
    while (firstNum > secondNum || firstNum > thirdNum || secondNum > thirdNum){
      if (secondNum < firstNum){
        swap = secondNum;
        secondNum = firstNum;
        firstNum = swap;
      }
      if (thirdNum < secondNum){
        swap = thirdNum;
        thirdNum = secondNum;
        secondNum = swap;
      }
    }
    
    System.out.println("First: " + firstNum);
    System.out.println("Second: " + secondNum);
    System.out.println("Third: " + thirdNum);

  }
}