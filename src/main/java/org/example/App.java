/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variable Creation
        Scanner input = new Scanner(System.in);
        int principal, years;
        double rate, a;

        //Query
        System.out.println("Enter the principal amount:");
        principal = input.nextInt();

        System.out.println("Enter the rate of interest (in percent) :");
        rate = input.nextDouble();

        System.out.println("Enter the number of years to invest:");
        years = input.nextInt();

        //Calculation
        rate = rate / 100;
        a = (principal * (1 + rate * years));

        //Final output
        System.out.println("After investing for " + years + " at an interest rate of " + rate + " the investment will be worth:");
        System.out.format("$%.2f", a);
    }
}
