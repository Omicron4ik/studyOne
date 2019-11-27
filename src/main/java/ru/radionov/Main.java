package ru.radionov;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static String readOneStringFromUser (int j) {
        System.out.println("enter pls " + j  + "any POSTITVE NUMBER");
        Scanner inputNum = new Scanner(System.in);
        return inputNum.next();
    }

    public static int []  readMultiStringFromUser() {
        int [] arr =  new int [4];
        for (int i = 0; i <= 3; i++) {
            int j = i + 1;
            String inputStr = readOneStringFromUser(j);
            if (Pattern.matches("\\d+",inputStr)) {
                int num = Integer.parseInt(inputStr);
                arr[i] = num;
            } else {
                System.out.println("OLOLO it's not a positive NUMBER, set '0'");
            }
        }
        return arr;
    }

    public static void showResults(int [] arr) {
        for (int i = 0; i <= 3; i++) {
            int j = i + 1;
            System.out.println("Your " + j + " numeral is: " + arr[i]);
            if (arr[i] > 10) {
                System.out.println("and it is MORE than 10, it is '" + arr[i] + "'");
            } else if (arr[i] < 10) {
                System.out.println("and it is LESS than 10, it is '" + arr[i] + "'");
            } else System.out.println("and it is exactly 10");
        }
    }
    public static void main(String[] args) {
        int [] arr = readMultiStringFromUser();
        if (arr[3] != 0) {
            showResults(arr);
            System.out.println("Well done!");
        } else {
            System.out.println("Sorry, no result");
        }
    }
}

// input and output
//        System.out.println("enter pls any num from 1 to 1000!");
//        Scanner inputNum = new Scanner(System.in);
//        Integer num;
//        num = inputNum.nextInt();
//        if (num > 100) {
//            System.out.println("input num is MORE than 100, it is '" + num + "'");
//        } else if (num < 100) {
//            System.out.println("input num is LESS than 100, it is '" + num + "'");
//        } else System.out.println("input num is 100");
