/*
* File: Location.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 6 - 9.13
* Due Date: 4/20/2017
* Version: 1.8
*/

class Location{
  
  static int row;
  static int column;
  static double maxValue;
  
  Location(){
  }
  
  Location(int row, int column, double maxValue){
    row = row;
    column = column;
    maxValue = maxValue;
  }
    
  
  public static Location locateLargest(double[][] a){
    row = 0;
    column = 0;
    maxValue = a[row][column];
    
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        if (maxValue < a[i][j]){
          row = i;
          column = j;
          maxValue = a[i][j];
        }
      }
    }
    return new Location(row, column, maxValue);
  }
}


