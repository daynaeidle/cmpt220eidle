/*
* File: SquareNums.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 7 - Problem 10.17
* Due Date: 4/27/2017
* Version: 1.8
*/

import java.lang.Math.*;
import java.math.*;

public class SquareNums{
  public static void main(String[]args){
  
    BigDecimal maxVal = BigDecimal.valueOf(Long.MAX_VALUE);
    long firstVal = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal x = new BigDecimal(firstVal);
    BigDecimal y = new BigDecimal("1");
    int exp = 2;
  
    int counter = 0;
    
    while (counter < 10){
      BigDecimal squareNum = x.multiply(x);
      if (squareNum.compareTo(maxVal) > 0){
        counter++;
        System.out.print(counter + ": ");
        System.out.println(squareNum);
      }
      x = x.add(y);
    }
  }
}