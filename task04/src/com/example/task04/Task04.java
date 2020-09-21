package com.example.task04;

public class Task04 {

    public static float calculate(float a, int b, String operation) {
        float result;
        if (operation == "/") {
            return result = a / b;
        } else if (operation == "+") {
            return result = a + b;
        } else if (operation == "-") {
            return result = a - b;
        } else if (operation == "*") {
            return result = a * b;
        }

        return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(5, 2, "/");
        System.out.println(result);

    }

}
