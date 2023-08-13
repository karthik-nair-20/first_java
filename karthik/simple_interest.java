package com.karthik;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();

        int SI;
        SI = (P * T *R)/100;
        System.out.println("the si is "+SI);
    }
}
