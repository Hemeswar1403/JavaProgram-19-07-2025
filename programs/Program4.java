package com.practicing.programs;

import java.util.Scanner;

//WAP to check if a given string is a palindrome.
public class Program4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scn.nextLine();
        String temp = "";
        for (int i = str.length()-1; i>=0; i--) {
            temp=temp+str.charAt(i);
        }
        if (str.equals(temp)){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is Not a Palindrome");
        }
        System.out.println("Enter a Number");
        int num = scn.nextInt();
        int rev = 0;
        for(int i=num;i>0;i=i/10){
            int digit = i%10;//0001
            rev = rev*10 + digit;//01
        }
        System.out.println(rev);
        if(num==rev){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is Not a Palindrome");
        }
    }
}
