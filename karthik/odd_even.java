package com.karthik;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
