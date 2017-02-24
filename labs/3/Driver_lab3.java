/*
* File: Driver_lab3.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/23/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.lang.Math.*;

public class Driver_lab3{
  public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);   
    
    while (true){
    
      double x1 = input.nextDouble();
      if (x1 == 0)
        break;
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double p = input.nextDouble();

      double distance = Math.pow(Math.pow((Math.abs(x1-x2)),p) + 
                        Math.pow((Math.abs(y1-y2)),p),(1/p));
      System.out.println(distance);
    }
  }
}