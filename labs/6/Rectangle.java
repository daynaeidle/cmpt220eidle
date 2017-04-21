/*
* File: Rectangle.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 6 - 9.1
* Due Date: 4/20/2017
* Version: 1.8
*/

class Rectangle{
  
  //default constructor
  double width = 1;
  double height = 1;
  
  Rectangle(){
  }
  
  Rectangle(double w, double l){
    width = w;
    height = l;
  }
  
  double getArea(){
    return width * height;
  }
  
  double getPerimeter(){
    return (2 * width) + (2 * height);
  }
}



/*UML Diagram

************************************
*             Rectangle            *
************************************
* width: double                    *
* height: double                   *
*                                  *
* Rectangle(): void                *
* Rectangle(width, height): void   *
* getArea(): double                *
* getPerimeter: double             *
************************************
*/

