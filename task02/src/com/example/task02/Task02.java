package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try{
            byte num = new Byte(input);
            return "byte";
        } catch (NumberFormatException exception){

        }

        try {
            short num = new Short(input);
            return "short";
        } catch (NumberFormatException exception){

        }

        try {
            int num = new Integer(input);
            return "int";
        } catch (NumberFormatException exception){

        }

        try {
            long num = new Long(input);
            return "long";
        } catch (NumberFormatException exception){

        }

        return "unknown";
    }

    public static void main(String[] args) {

    }

}
