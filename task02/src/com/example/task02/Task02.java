package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num <= Byte.MAX_VALUE) return "byte";
        if (num <= Short.MAX_VALUE) return "short";
        if (num <= Integer.MAX_VALUE) return "int";
        return "long";
    }

    public static void main(String[] args) {
    }

}