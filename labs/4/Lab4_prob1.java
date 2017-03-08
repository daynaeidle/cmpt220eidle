/*
* File: Lab4_prob1.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: 3/9/17
* Version: 1.8
*/

import java.text.DecimalFormat;

public class Lab4_prob1{
  public static void main(String[]args){
  
  DecimalFormat df = new DecimalFormat("#.##");
  
  System.out.println("Celsius     Fahrenheit");
  System.out.println("------------------------");
  
  for (double celsius = 40.0; celsius > 30.0; celsius--){
  System.out.println(celsius + "        " + 
      df.format(celsiusToFahrenheit(celsius)));
  }
  
  System.out.println("Fahrenheit     Celsius");
  System.out.println("-----------------------");
  
  for (double fahrenheit = 120.0; fahrenheit > 29.0; fahrenheit-=10){
  System.out.println(fahrenheit + "          " + 
      df.format(fahrenheitToCelsius(fahrenheit)));
  }
  
  
  
  }
  
  public static double celsiusToFahrenheit(double celsius){
    
    double fahrenheit = (9.0 / 5.0) * celsius + 32;
    
    return fahrenheit;
  }
  
  public static double fahrenheitToCelsius(double fahrenheit){
    
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
    
    return celsius;
  }
}