package com.example.task07;

public class Task07 {

    public static long solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return ((long)(n-n%k)*(m-m%k))/(k*k);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(10, 20, 5);
        System.out.println(result);
        */
    }

}
