/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise7;


import java.util.Scanner;



public class Solution7
{
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("What is the length of the room in feet?");
            double roomLength = scan.nextDouble();
            System.out.println("What is the width of the room in feet?");
            double roomWidth = scan.nextDouble();

            System.out.println("You entered dimensions of " + roomLength + " feet by " + roomWidth + " feet.");

            double area = roomLength * roomWidth;
            final double conversion = area * 0.09290304;

            System.out.println("The area is");
            System.out.println(area + " square feet");
            System.out.println(conversion + " square meters");

        }
}
