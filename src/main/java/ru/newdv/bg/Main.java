package ru.newdv.bg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr =  new int [4];

        for (int i = 0; i <= 3; i++) {
            int j = i + 1;
            System.out.println("enter pls " + j  + " numeral");
            Scanner inputNum = new Scanner(System.in);
            int num;
            num = inputNum.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i <= 3; i++) {
            int j = i + 1;
            System.out.println("Your " + j + " numeral is: " + arr[i]);
            if (arr[i] > 10) {
                System.out.println("and it is MORE than 10, it is '" + arr[i] + "'");
            } else if (arr[i] < 10) {
                System.out.println("and it is LESS than 10, it is '" + arr[i] + "'");
            } else System.out.println("and it is exactly 10");
        }
        System.out.println("Well done!");
    }
}
