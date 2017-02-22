/*
* File: Lab2_prob11.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/22/2017
* Version: 1.8
*/

import java.util.Random;

public class Lab2_prob11{
  public static void main(String[]args){
  
    Random rand = new Random();
    
    char letter1 = (char)(rand.nextInt(26) + 65);
    char letter2 = (char)(rand.nextInt(26) + 65);
    char letter3 = (char)(rand.nextInt(26) + 65);
    char digit1 = (char)(rand.nextInt(10) + 48);
    char digit2 = (char)(rand.nextInt(10) + 48);
    char digit3 = (char)(rand.nextInt(10) + 48);
    char digit4 = (char)(rand.nextInt(10) + 48);
                          
    System.out.println("License Plate Number: " + letter1 + letter2 + letter3 +
                       digit3 + digit2 + digit3 + digit4);
    
  }
}