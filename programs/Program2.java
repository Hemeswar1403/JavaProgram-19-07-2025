package com.practicing.programs;

import java.util.Scanner;

//WAP to find the maximum of two given numbers using if else condition.
public class Program2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = scn.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scn.nextInt();
        if (num1>num2){
            System.out.println("First Number is Greater");
        }
        else {
            System.out.println("Second Number is Greater");
        }
    }
}
