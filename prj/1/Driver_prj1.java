/*
* File: Driver_prj1.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Project 1
* Due Date: 3/30/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.lang.Math.*;

public class Driver_prj1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //variables
    int size1;
    int size2;

    size1 = input.nextInt();
    size2 = input.nextInt();
    
    
    //vectors
    double [] vFirst = new double[size1];
    double [] vSecond = new double[size2];
    
    for (int i = 0; i < vFirst.length; i++){
      vFirst[i] = input.nextDouble();
    }
    
    for (int j = 0; j < vSecond.length; j++){
      vSecond[j] = input.nextDouble();
    }
    
    System.out.println();
    
    double[] vResult = convolveVectors(vFirst, vSecond);
    for (int i = 0; i < vResult.length; i++){
      System.out.print(Math.round(vResult[i]) + " ");
    } 
    
    System.out.println(); 
  }
  
  public static double[] convolveVectors(double[] vFirst, double[] vSecond){
    double[] vResult = new double[(vFirst.length + vSecond.length) -1];
    
    
    for (int k = 0; k < vResult.length; k++){    //index
      vResult[k] = 0;
      for (int l = 0; l < vSecond.length; l++){  //shift
        if (((k-l) >= 0) && ((k-l) < vFirst.length))
          vResult[k] += vFirst[k-l] * vSecond[l];
      }
    }
    
    return vResult;
  }
}