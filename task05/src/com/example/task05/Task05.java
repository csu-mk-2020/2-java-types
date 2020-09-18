package com.example.task05;

public class Task05 {
    public static String solution(int x) {
        int temp = 0;
        int ch=0,ch1=0;
        if (x == 0){
            ch++;
        }
        while (x != 0){
            temp = x % 10;
            if (temp % 2 == 0){
                ch++;
            }else {
                ch1++;
            }
            x = x /10;
        }
        if (ch > 0 && ch1 <= 0){
            return "TRUE";
        }
        else
            return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
