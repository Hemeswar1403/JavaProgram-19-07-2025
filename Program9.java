package com.practicing.programs;

import java.util.Scanner;

//WaP to find the second highest number without sorting the array.
public class Program9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the ArraySize");
        int num = scn.nextInt();
        int[] arr= new int[num];
        System.out.println("Enter "+num+" Numbers");
        for (int i=0;i<num;i++){
            arr[i]= scn.nextInt();
        }
        int max=0;
        int secondMax=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax) {
                secondMax=arr[i];
            }
        }
        System.out.println("Second highest Number is :"+secondMax);
    }
}
