package com.karthik;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {

            System.out.println(first + "");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
