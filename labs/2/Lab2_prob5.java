/*
* File: Lab2_prob5.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.lang.Math.*;

public class Lab2_prob5{
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
    
    double radius;
    double area;
    double side;
    
    System.out.println("Pentagon Area Calculator");
    System.out.print("Enter the length from the center to a vertex: ");
    radius = input.nextDouble();
    
    side = 2 * radius * Math.sin(Math.PI/5);
    
    area = (5 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/5));
    
    //rounding area
    area = area*100;
    area = Math.round(area);
    area = area/100;
    
    System.out.println("The area of the pentagon is: " + area);
    

  }
}
