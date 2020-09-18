package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (Float.isFinite(a) && Float.isFinite(b)){

            String aString = Float.toString(a);
            if(aString.indexOf(".")+precision + 1  < aString.length())
                aString = aString.substring(0, aString.indexOf(".")+precision);

            String bString = Float.toString(b);
            if(bString.indexOf(".")+precision + 1 < bString.length())
                bString = bString.substring(0, bString.indexOf(".")+precision);

            return Float.compare(new Float(aString), new Float(bString)) == 0;
        }
        else if (Float.isNaN(a) && Float.isNaN(b))
            return true;
        else if (a == Float.NEGATIVE_INFINITY || a == Float.POSITIVE_INFINITY && b == Float.NEGATIVE_INFINITY || b == Float.POSITIVE_INFINITY){
            return a == b;
        }

        return false;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
