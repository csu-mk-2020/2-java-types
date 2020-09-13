package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long v = Long.parseLong(input);
        if (v >= Byte.MIN_VALUE && v <= Byte.MAX_VALUE) return "byte";
        if (v >= Short.MIN_VALUE && v <= Short.MAX_VALUE) return "short";
        if (v >= Integer.MIN_VALUE && v <= Integer.MAX_VALUE) return "int";
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
