package com.practicing.programs;
//WAP that takes an integer input and checks whether its even or odd.
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number");

        int num = scn.nextInt();
        if (num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }

}
