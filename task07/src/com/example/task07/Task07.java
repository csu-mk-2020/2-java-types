package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int size_x = n / k;
        int size_y = m / k;
        int result = size_x * size_y;
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
