package com.practicing.programs;

import java.util.Arrays;
import java.util.Scanner;

//WAP to find the second highest number with sorting the array.
public class Program8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the ArraySize");
        int num = scn.nextInt();
        int[] arr= new int[num];
        System.out.println("Enter "+num+" Numbers");
        for (int i=0;i<num;i++){
            arr[i]= scn.nextInt();
        }
        Arrays.sort(arr);
        int highest=arr[arr.length-1];
        for (int i= arr.length-2;i>=0;i--) {
            if (arr[i]<highest) {

                System.out.println(arr[i]);
                break;
            }
        }
    }
}
