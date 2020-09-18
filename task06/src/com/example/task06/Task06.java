package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int res = x+y;
        int count = 0;
        if (res ==0){
            count++;
        }
        while (res !=0){
            count++;
            res /=10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
