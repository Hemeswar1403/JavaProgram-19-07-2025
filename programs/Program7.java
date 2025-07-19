package com.practicing.programs;

import java.util.Scanner;

//WAP to count the number of vowels in a given string.
public class Program7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scn.nextLine();
        int count=0;
        for (int i=0;i<str.length();i++){

            if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Number of Vowels =  " + count);
    }
}
