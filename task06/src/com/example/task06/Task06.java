package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        String tmp = Integer.toString(x + y);
        return tmp.startsWith("-") ? tmp.length() - 1 : tmp.length();
    }

    public static void main(String[] args) {
//        int result = solution(-0, +0);
//        System.out.println(result);
    }

}
