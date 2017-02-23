/*
* File: Lab3_prob2.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 3
* Due Date: 2/23/2017
* Version: 1.8
*/

import java.text.*;

public class Lab3_prob2{
  public static void main(String[]args){
    
    double tuition = 10000;
    
    double rate = 1.05;
    
    double total = 0;
    
    DecimalFormat df = new DecimalFormat("#.##");
    
    for (int i = 0; i < 11; i++){
      tuition *= rate;
    }
    
    System.out.println("The total after 10 years is: $" + (df.format(tuition)));
    
    tuition = 10000;
	for (int j = 0; j < 15; j++){
	  tuition *= rate;
	  if (j > 10)
	    total += tuition;
	}
	
	System.out.println("The total cost for four years is: $" + (df.format(total)));
	
	
    
    
  }
}