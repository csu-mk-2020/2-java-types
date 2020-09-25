package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float res = 0;
        if(operation.equals("+")) res = (float)a+b;
        else if(operation.equals("-")) res = (float)a-b;
        else if(operation.equals("*")) res = (float)a*b;
        else if(operation .equals("/")) res = (float)a/b;

        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
