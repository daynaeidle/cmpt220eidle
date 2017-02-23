/*
* File: Lab3_prob4.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/23/2017
* Version: 1.8
*/

import java.lang.Math.*;

public class Lab3_prob4{
  public static void main(String[]args){
    
    int n = 1;
    
    while (Math.pow((n+1),3) < 12000){
      n++;
    }
    
    System.out.println("The largest value of n is: " + n);
  }
}