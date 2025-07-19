package com.practicing.programs;

import java.util.Scanner;
//WAP to reverse a string
public class Program3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scn.nextLine();
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--) {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
