package com.company;

import java.util.Scanner;
//Take name as input and print a greeting message for that name.
public class greeting_msg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = in.next();
        System.out.println("great to meet you, " + name);
    }
}
