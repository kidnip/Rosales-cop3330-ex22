package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Compare
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int max, a, b ,c;

        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        System.out.print("Enter the third number: ");
        c = input.nextInt();
        max = a;

        if(b >= max){
            max = b;
            if(c >= max){
                max = c;
            }
        }
        else if(c >= max){
            max = c;
        }
        System.out.println("The largest number is " +max +".");
    }
}
