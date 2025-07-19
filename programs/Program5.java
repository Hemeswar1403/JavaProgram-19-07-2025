package com.practicing.programs;

import java.util.Scanner;

//WAP to calculate the factorial of a number using a loop.
public class Program5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scn.nextInt();
        int factorial = 1;
        for (int i=num;i>0;i--){
            factorial = factorial * i ;
        }
        System.out.println("factorial = " + factorial);
    }
}
