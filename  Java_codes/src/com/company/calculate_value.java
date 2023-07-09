package com.company;

import java.util.Scanner;

public class calculate_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op = in.next().trim().charAt(0);
        int ans = 0;
        if (op == '+' || op == '*'  || op == '/' || op == '-'){
            //take two number
            System.out.println("Enter a two number");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

                if (op == '+'){
                     ans = num1 + num2;
                }
                if (op == '-'){
                     ans = num1 - num2;
                }
                if (op =='*'){
                     ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                     ans = num1/num2;
                }
                }

                }
        System.out.println(ans);
        }
}
