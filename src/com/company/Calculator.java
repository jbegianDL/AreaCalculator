//Create a new project in IntelliJ named AreaCalculator using the Command Line App template
//
//Initialize your project as a Git repository and be sure to add and commit all changes as you work
//
//Rename your Main file to CalculatorDemo (right-click -> Refactor -> Rename...)
//
//Create a new Java class file (File -> New -> Java Class) named Calculator
//
//Your Calculator should have (2) properties: width and height (with accessor methods)
//
//Your Calculator should have a method named calculateArea() which:
//
//Accepts width and height as parameters
//
//Calculates the area of the rectangle
//
//Returns the area
//
//In your CalculatorDemo, create an instance of Calculator and test your calculateArea() method

package com.company;



public class Calculator {

    public String calculateArea(double width, double height){
        double area = width * height;
        String result = "The area is: " + area;
        return result;
    }

}
