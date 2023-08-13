package com.karthik;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter temperature in celsius");
        float cel = input.nextFloat();
        double frad = (cel * 1.8) +32;
        System.out.println(frad);


        }
    }

