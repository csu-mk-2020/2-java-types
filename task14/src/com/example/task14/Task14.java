package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        int re_value = 0;
        while (value > 0) {
            re_value = 10 * re_value + value % 10;
            value /= 10;
        }
        return re_value;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
