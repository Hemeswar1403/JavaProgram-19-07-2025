package com.practicing.programs;

import java.util.Scanner;

//WAP to find the sum of all elements in an integer array.
public class Program6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a ArraySize");
        int num= scn.nextInt();
        int[] arr= new int[num];
        System.out.println("Enter "+num+" Numbers");
        int sum=0;
        for (int i = 0; i<num; i++) {
            arr[i]=scn.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
