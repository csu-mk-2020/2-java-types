package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int count = 0;
        for (int sum = Math.abs(x + y); sum != 0; sum /= 10, ++count);
        if (count == 0)
            ++count;
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(12, 34);
        System.out.println(result);
    }

}
