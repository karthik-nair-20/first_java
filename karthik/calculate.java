package com.karthik;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number");
        int num1 = input.nextInt();
        System.out.print("Enter the second number");
        int num2 = input.nextInt();
        System.out.println("choose the operation to be performed(+,-,/,*)");
        char ops = input.next().charAt(0);

        if(ops == '+'){
            System.out.println(num1 +num2);
        }
        else if (ops == '-'){
            System.out.println(num1-num2);
        } else if (ops == '/') {
            System.out.println(num1/num2);
        } else if (ops == '*') {
            System.out.println(num1*num2);
        }
        else{
            System.out.println("Please choose a correct operation");
        }


    }
}
