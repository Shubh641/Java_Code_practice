package com.company;
//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

/*Simple interest is a quick method of calculating the interest charge on a loan.
Simple interest is determined by multiplying the daily interest rate by the
 principal by the number of days that elapse between payments.

Simple interest formula is given by:

Simple Interest = (P x T x R)/100
Where,

P is the principal amount
T is the time and
R is the rate*/

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount = ");
        float principal = in.nextFloat();
        System.out.println("Enter Time = ");
        float  Rate = in.nextFloat();
        System.out.println("Enter Rate = ");
        float Time = in.nextFloat();

        float  Simple_Interest = (principal*Time*Rate)/100;
        System.out.println(" Simple_Interest is  "+ Simple_Interest);
    }
}
