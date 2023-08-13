package com.karthik;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letter = input.next();
        int left = 0;
        int right = letter.length()-1;
        boolean isPalin =true;
        while(left < right){
            if(letter.charAt(left) != letter.charAt(right)){
//                System.out.println("this is not a palindrome");
                isPalin = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalin){
            System.out.println("this is a palindrome");
        }
        else {
            System.out.println("this is not a palindrome");
        }
    }
}
