/*
* File: Lab5_prob4.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: 3/30/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab5_prob4{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the rows and columns of the array: ");
    int rowsNum = input.nextInt();
    int colNum = input.nextInt();
    
    double [][] twoDimArr = new double[rowsNum][colNum];
    
    System.out.println("Enter the array: ");
    for (int i = 0; i < rowsNum; i++){
      for (int j = 0; j < colNum; j++){
        twoDimArr[i][j] = input.nextDouble();
      }
    }
    
    int [] lrgIdx = new int[2];
    
    lrgIdx = locateLargest(twoDimArr);
    
    System.out.println("The location of the largest element is at (" +
        lrgIdx[0] + ", " + lrgIdx[1] + ")");
    
  }
  //outside of main method
  public static int[] locateLargest(double[][] a){
    int [] indexList = new int[2];
    
    double largestValue = 0;
    
    for (int c = 0; c < a.length; c++){
      for (int d = 0; d < a[0].length; d++){
        if (a[c][d] > largestValue){
          largestValue = a[c][d];
          indexList[0] = c;
          indexList[1] = d;
        }
      }
    }
    
    return indexList;
  }
}
