package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x > 0) {
            if (x % 2 == 0) x /= 10;
            else return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
    }

}

