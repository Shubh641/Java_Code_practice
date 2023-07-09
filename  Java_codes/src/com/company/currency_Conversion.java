package com.company;

import java.util.Scanner;

                //Input currency in rupee and output in dollar.

public class currency_Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount in rupee");
        int num1 = in.nextInt();
        if(num1>0){
            int dollar = num1 / 83;
            System.out.println("Amount in Dollar is " + dollar);
        }

    }
}
