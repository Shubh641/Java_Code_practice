package com.company;

//Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if ((num % 2) != 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }


    }
}
