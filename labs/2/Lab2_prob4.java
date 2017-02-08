/*
* File: Lab2_prob4.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.util.Random;

public class Lab2_prob4{
  public static void main(String[] args){
  
    Random rand = new Random();
    
    Scanner input = new Scanner(System.in);
    
    int caseNum;
    
    //generates random 3 digit lottery number
    int lottery = rand.nextInt(900) + 100;
    
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();
    
    //lottery digits
    int lotDig1 = lottery / 100;
    int lotDig2 = (lottery % 100) / 10;
    int lotDig3 = (lottery % 100) % 10;
    
    //guess digits
    int guessDig1 = guess / 100;
    int guessDig2 = (guess % 100) / 10;
    int guessDig3 = (guess % 100) % 10;
    
    //match all in order
    if (guess == lottery){
      caseNum = 0;
    }
    //match all digits
    else if (((guessDig1==lotDig2)&&(guessDig2==lotDig3)&&(guessDig3==lotDig1))||
            ((guessDig1==lotDig2)&&(guessDig2==lotDig1)&&(guessDig3==lotDig3))||
            ((guessDig1==lotDig3)&&(guessDig2==lotDig2)&&(guessDig3==lotDig1))||
            ((guessDig1==lotDig3)&&(guessDig2==lotDig1)&&(guessDig3==lotDig2))||
            ((guessDig1==lotDig1)&&(guessDig2==lotDig3)&&(guessDig3==lotDig2))){
      caseNum = 1;
    }
    //match one digit
    else if ((guessDig1==lotDig1)||(guessDig1==lotDig2)||(guessDig1==lotDig3)||
            (guessDig2==lotDig1)||(guessDig2==lotDig2)||(guessDig2==lotDig3)||
            (guessDig3==lotDig1)||(guessDig3==lotDig2)||(guessDig3==lotDig3)){
      caseNum = 2;
    }
    //no digits match
    else{
      caseNum = 3;
    }
    
    switch (caseNum){
      case 0:  System.out.println("Lottery Number: " + lottery);
               System.out.println("Exact Match: You win $10,000!");
               break;
      case 1:  System.out.println("Lottery Number: " + lottery);
               System.out.println("Match All Digits: You win $3,000!");
               break;
      case 2:  System.out.println("Lottery Number: " + lottery);
               System.out.println("Match One Digit: You win $1,000!");
               break;
      case 3:  System.out.println("Lottery Number: " + lottery);
               System.out.println("Sorry, no match...you lose :( ");
      
    }
    
    
    
    
  }
}