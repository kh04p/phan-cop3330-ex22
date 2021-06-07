/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        int max = num1;
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if (num2 > num1) {
            max = num2;
        }
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        if (num3 > num2) {
            max = num3;
        }
        if (num1 == num2 && num2 == num3) {
            System.exit(0);
        }
        System.out.printf("The largest number is %d.", max);
    }
}
