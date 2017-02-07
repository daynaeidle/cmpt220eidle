/*
* File: Lab2_prob1.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Random;

public class Lab2_prob1{
  public static void main(String[]args){
  
    Random rand = new Random();
  
    String monthName = "";
  
    int monthNum = rand.nextInt(12) + 1;
    
    if (monthNum == 1){
      monthName = "January";
    }
    
    if (monthNum == 2){
      monthName = "February";
    }
    
    if (monthNum == 3){
      monthName = "March";
    }
    
    if (monthNum == 4){
      monthName = "April";
    }
    
    if (monthNum == 5){
      monthName = "May";
    }
    
    if (monthNum == 6){
      monthName = "June";
    }
    
    if (monthNum == 7){
      monthName = "July";
    }
    
    if (monthNum == 8){
      monthName = "August";
    }
    
    if (monthNum == 9){
      monthName = "September";
    }
    
    if (monthNum == 10){
      monthName = "October";
    }
    
    if (monthNum == 11){
      monthName = "November";
    }
    
    if (monthNum == 12){
      monthName = "December";
    }
    
    System.out.println("Integer: " + monthNum);
    
    System.out.println("Month: " + monthName);
    
  }
}
