package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей


        boolean positive = true;
        String numberWithoutMinus;
        if(input.charAt(0) == '-'){
            positive = false;
            numberWithoutMinus = input.substring(1);
        }
        else {
            numberWithoutMinus = input;
        }
        int lengthInputStr = numberWithoutMinus.length();
        if(lengthInputStr < 3) {
            return "byte";
        }
        else if(lengthInputStr <= 3){
            if (numberWithoutMinus.compareTo("127") <= 0) {
                return "byte";
            } else if (numberWithoutMinus.compareTo("128") <= 0 && !positive) {
                return "byte";
            }
        }
        if(lengthInputStr < 5){
            return "short";
        }
        else if(lengthInputStr <= 5){
            if(numberWithoutMinus.compareTo("32767") <= 0){
                return "short";
            }
            if(numberWithoutMinus.compareTo("32768") <= 0 && !positive){
                return "short";
            }
        }
        if(lengthInputStr < 10){
            return "int";
        }
        else if(lengthInputStr <= 10){
            if(numberWithoutMinus.compareTo("21474836487") <= 0){
                return "int";
            }
            if(numberWithoutMinus.compareTo("2147483648") <= 0 && !positive){
                return "int";
            }
        }
        if(lengthInputStr < 19){
            return "long";
        }
        else if(lengthInputStr <= 19){
            if(numberWithoutMinus.compareTo("9223372036854775807") <= 0){
                return "long";
            }
            if(numberWithoutMinus.compareTo("9223372036854775808") <= 0 && !positive){
                return "long";
            }
        }

        return "unknown";
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
