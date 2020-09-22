package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long number = Long.parseLong(input);
        String str = "";
        int count = 0;
        if (number <= 127 && number >= -128) {
            str = "byte";
            count++;
        }
        if (number <= 32767 && number >= -32768 && count == 0) {
            str = "short";
            count++;
        }
        if (number <= 2147483647 && number >= -2147483648 && count == 0) {
            str = "int";
            count++;
        }
        if (number <= 9223372036854775807l && number >= -9223372036854775808l && count == 0) {
            str = "long";
        }
        return str;
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
