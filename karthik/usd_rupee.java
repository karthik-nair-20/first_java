package com.karthik;

import java.util.Scanner;

public class usd_rupee {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter the amount in RS");
        double rupees = input.nextDouble();
        double usd = rupees * 0.012;
        System.out.println("the usd is "+usd);
    }
}
