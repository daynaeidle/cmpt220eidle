/*
* File: Lab2_prob3.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_prob3{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    String monthName = "";
    int daysInMonth = 0;
    int daysInFeb = 0;
    
    System.out.print("Please enter the number of a month and a year: ");
    int monthNum = input.nextInt();
    int year = input.nextInt();
    
    if (year % 4 == 0){
      daysInFeb = 29;
      }
      else{
      daysInFeb = 28;
    }
    
    
    //what month
    switch(monthNum){
      case 1: monthName = "January";
              daysInMonth = 31;
              break;
      case 2: monthName = "February";
              daysInMonth = daysInFeb;
              break;
      case 3: monthName = "March";
              daysInMonth = 31;
              break;
      case 4: monthName = "April";
              daysInMonth = 30;
              break;
      case 5: monthName = "May";
              daysInMonth = 31;
              break;
      case 6: monthName = "June";
              daysInMonth = 30;
              break;
      case 7: monthName = "July";
              daysInMonth = 31;
              break;
      case 8: monthName = "August";
              daysInMonth = 31;
              break;
      case 9: monthName = "September";
              daysInMonth = 30;
              break;
      case 10: monthName= "October";
               daysInMonth = 31;
               break;
      case 11: monthName = "November";
               daysInMonth = 30;
               break;
      case 12: monthName = "December";
               daysInMonth = 31;
               break;
      default: System.out.println("Invalid Month Number");
               System.exit(0);
    }
    
    System.out.println(monthName + " " + year + " has " + daysInMonth + " days");
    
    
  }
}