/*
* File: DriverLocation.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 6 - 9.13
* Due Date: 4/20/2017
* Version: 1.8
*/

import java.util.Scanner;

public class DriverLocation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    double [][] numbers = new double[row][column];
    
    System.out.println("Enter in array:");
    for (int i = 0; i < row; i++){
      for (int j = 0; j < column; j++){
        numbers[i][j] = input.nextDouble();
      }
    }
    
    Location largest = Location.locateLargest(numbers);
    
    System.out.print("The location of the largest element is " + largest.maxValue + " at (" +
        largest.row + ", " + largest.column + ").");
  }
}
