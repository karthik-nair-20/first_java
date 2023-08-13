package com.karthik;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();
//
//        if(num1 > num2){
//            System.out.println("Number 1 is greater than number 2");
//        }
//        else if (num1 < num2){
//            System.out.println("Number 2 is greater than number 1");
//        }
//        else {
//            System.out.println("both number are equal");
//        }
        double result = Math.max(num1 , num2);
        System.out.println("the maximum of the "+num1 +" and "+num2+" is "+ result);
    }
}
