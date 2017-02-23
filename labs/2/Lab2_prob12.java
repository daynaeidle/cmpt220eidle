/*
* File: Lab2_prob12.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/23/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_prob12{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the amount, in double, (Ex. 11.56): ");
    String amount = input.nextLine();
    
    String dollars = amount.substring(0, amount.indexOf("."));
    
    int cents = Integer.parseInt(amount.substring(amount.indexOf(".") + 1));
    
    int quarters = cents / 25;
    
    int remain = cents % 25;
    
    int dimes = remain / 10;
    
    remain = remain % 10;
    
    int nickels = remain / 5;
    
    remain = remain % 5;
    
    int pennies = remain;
    
    System.out.println("Dollars: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
    
  }
}