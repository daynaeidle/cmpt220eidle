/*
* File: GetFit.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Semester Project
* Due Date: 5/10/2017
* Version: 1.8
*/

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import java.lang.Math.*;

public class GetFit extends JPanel{

  //global variables
  public static double rmr = 0; //resting metabolic rate
  public static boolean counter = false;
  public static String BMI = "";
  public static String name = "";
  
  //main
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    JFrame frame = new JFrame("GetFit");
    
    //frame properties
    frame.getContentPane().add(new GetFit());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 700);
    frame.setVisible(true);
    
    
    JLabel label = new JLabel();
    

    //variables
      //Strings
    //String name = "";
    String gender;
    String action;
    String activity;
    
      //ints
    int age;
    
      //doubles
    double height;
    double currWeight;
    //double rmr = 0; //resting metabolic rate
    double goalWeight;
    
    System.out.println("~~~~~~~~~~~~~~~Welcome to GetFit!~~~~~~~~~~~~~~~");
    
    System.out.println("Please fill out the following information: ");
    
    //name
    System.out.print("Name: ");
    name = input.nextLine();
    
    //age
    System.out.print("Age: ");
    age = input.nextInt();
    
    input.nextLine();
    
    //gender
    System.out.print("Gender (m/f): ");
    gender = input.nextLine();
    gender = gender.toLowerCase();
    
    //height
    System.out.print("Height (in inches): ");
    height = input.nextDouble();
      //convert to cm
    height = height * 2.54;
    
    //current weight
    System.out.print("Current weight: ");
    currWeight = input.nextDouble();
      //convert to kg
    currWeight = currWeight * .453592;
    
    //calc rmr for gender
    if (gender.equals("m")){
      rmr = calcMaleRMR(currWeight, height, age);
    }else{
      rmr = calcFemaleRMR(currWeight, height, age);
    }
      
    input.nextLine();
    System.out.println();
    
    //activity
    System.out.println("How active are you on a day-to-day basis?");
    System.out.println("A) Not active at all");
    System.out.println("B) Somewhat active (ex. take light walks)");
    System.out.println("C) Active (ex. go to gym daily)");
    System.out.println("D) Very Active (ex. play sports daily)");
    activity = input.nextLine();
    activity = activity.toLowerCase();
    
    if (activity.equals("a")){
      rmr = rmr + 300;
    }else if (activity.equals("b")){
      rmr = rmr + 400;
    }else if (activity.equals("c")){
      rmr = rmr + 500;
    }else{
      rmr = rmr + 600;
      }
    
    System.out.println();
      
    System.out.println("Enter in the letter of what you would like to do");
    System.out.println("A) Lose weight");
    System.out.println("B) Stay the same");
    System.out.println("C) Gain weight");
    action = input.nextLine();
    action = action.toLowerCase();
    
    if (action.equals("a")){
      rmr = rmr - 200;
    } else if (action.equals("c")){
      rmr = rmr + 200;
    } else{
      rmr = rmr;
      }
    rmr = Math.round(rmr * 100.0/100.0);
    
    counter = true;
    
    BMI = calcBMI(currWeight, height);
    
    
    if (counter){
      label.setText(String.valueOf(rmr));
      frame.add(label);
      //label.setVisible(true);
      frame.revalidate();
      frame.repaint();
    }
    
    input.nextLine();
    System.exit(0);
  }
  
//OUT OF MAIN

  //male RMR
  public static double calcMaleRMR(double currWeight, double height, int age){
    double rmr = (currWeight * 10.0) + (height * 6.25) - (age * 5) + 5;  
    System.out.println(rmr);
    return rmr;
  }
  
  //female RMR
  public static double calcFemaleRMR(double currWeight, double height, int age){
    double rmr = (currWeight * 10.0) + (height * 6.25) - (age * 5) - 161;
    return rmr;
  }
  
  public static String calcBMI(double currWeight, double height){
    double kg = currWeight;
    double meter = height * .01;
    meter = meter * meter;
    
    double BMI = kg/meter;
    
    if (BMI < 19){
      return "UNDERWEIGHT";
    }else if (BMI < 25){
      return "NORMAL WEIGHT";
    }else if (BMI < 30){
      return "OVERWEIGHT";
    }else{
      return "OBESE";
    }
  }
  
  //paint
  public void paint(Graphics g){
  
    JTextField input = new JTextField(15);
    add(input);
    
    Dimension d = this.getPreferredSize();
    g.setFont(new Font("Monospaced", Font.PLAIN, 40));
    g.setColor(Color.blue);
    
    //title
    g.drawString("Welcome to GetFit!", 130, 50);
    
    //new font
    g.setFont(new Font("Arial", Font.BOLD, 20));
    g.setColor(Color.black);
    
    g.drawString("~ Please enter your information in the terminal window ~ ", 75, 100);
    
    g.setFont(new Font("Arial", Font.PLAIN, 20));
    g.drawString("You daily caloric intake should be: ", 20, 200);
    
    //new font
    g.setFont(new Font("Serif", Font.BOLD,90));
    g.setColor(Color.red);
    
    if (counter){
      g.drawString(String.valueOf(rmr), 200, 400);
      g.setFont(new Font("Serif", Font.BOLD, 30));
      g.setColor(Color.BLACK);
      g.drawString(name + " - You are currently " + BMI, 50, 500);
      g.setFont(new Font("Arial", Font.BOLD, 20));
      g.setColor(Color.BLACK);
      g.drawString("<< Hit ENTER to exit program >>", 200, 600);
    }
  }
}