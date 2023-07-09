package com.company;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
                //Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number");
        int num2 = in.nextInt();
        if (num1>num2){
            System.out.println("First number is greater" +" ==>" +num1);
        }else {
            System.out.println("Second number is greater"+ "==> " + num2);
        }
    }

}
