package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        String[] names = new String[]{"byte", "short", "int", "long"};
        Class[] classes = new Class[]{Byte.class, Short.class, Integer.class, Long.class};

        for (int i = 0; i < names.length; i++) {
            try {
                Number num = (Number) classes[i].getConstructor(new Class[]{String.class}).newInstance(input);
                return names[i];
            } catch (Exception exception){

            }
        }
        return "unknown";
    }

    public static void main(String[] args) {

    }

}
