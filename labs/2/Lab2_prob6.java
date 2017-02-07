/*
* File: Lab2_prob6.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.lang.Math.*;

public class Lab2_prob6{
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    int numSides;
    double sideLength;
    double area;
    
    System.out.print("Enter the number of sides: ");
    numSides = input.nextInt();
    
    System.out.print("Enter the length of a side: ");
    sideLength = input.nextDouble();
    
    area = (numSides * Math.pow(sideLength, 2))/(4 * Math.tan(Math.PI/numSides));
    
    System.out.println("The area of the polygon is: " + area);
    
  }
}