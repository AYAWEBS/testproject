package com.company;

public class ThernaryOperators {

    public static void main(String[] args) {
        int time = 20;

        if(time < 18){
            System.out.println("good day");
        }else{
            System.out.println("good evening");
            System.out.println("--------");
        }

        String result = (time < 18) ? "good day" : "good evening";
        System.out.println(result);

    }
}
