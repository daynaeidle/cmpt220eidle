/*
* File: Lab2_prob7.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 2
* Due Date: 2/9/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab2_prob7{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int finalGrade;
    String letterGrade = "";
    
    System.out.println("Please enter the following as a percentage...");
    System.out.print("Midterm Exam: ");
    int midtermEx = input.nextInt();
    
    System.out.print("Final Exam: ");
    int finalEx = input.nextInt();
    
    System.out.print("Projects: ");
    int projects = input.nextInt();
    
    System.out.print("Homework and Labs: ");
    int hw_labs = input.nextInt();
    
    finalGrade = (midtermEx + finalEx + projects + hw_labs)/4;
    
    if (finalGrade >= 95){
      letterGrade = "A";
    }
    else if (finalGrade >= 90){
      letterGrade = "A-";
    }
    else if (finalGrade >= 87){
      letterGrade = "B+";
    }
    else if (finalGrade >= 83){
      letterGrade = "B";
    }
    else if (finalGrade >= 80){
      letterGrade = "B-";
    }
    else if (finalGrade >= 77){
      letterGrade = "C+";
    }
    else if (finalGrade >= 73){
      letterGrade = "C";
    }
    else if (finalGrade >= 70){
      letterGrade = "C-";
    }
    else if (finalGrade >= 65){
      letterGrade = "D+";
    }
    else if (finalGrade >= 60){
      letterGrade = "D";
    }
    else if (finalGrade < 60){
      letterGrade = "F";
    }
    
    System.out.println("Your final grade is: " + letterGrade);
    
  }
}