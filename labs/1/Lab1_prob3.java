/*
* File: Lab1_prob3.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 1
* Due Date: 1/26/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab1_prob3{
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    
    gratuityRate = (gratuityRate) / 100.0;
    double gratuity = subtotal * gratuityRate;
    double total = subtotal + gratuity;
    
    System.out.println("The gratuity is $" + gratuity +
                       " and the total is $" + total + ".");
  
  }
}