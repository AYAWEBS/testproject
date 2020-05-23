package com.company;

public class Calculator {
    public static void main(String[] args) {
        //build a code calculator with operators using if else if statement
        // /+ * - %

        /**
         * char operators =  '-'
         * double number1 = 20;
         * double number2 = 30;
         * double result = 0;
         *
         * else if (operators == '-') {
         * result = number1- number2;
         * system.out.println(result);
         */

        char operators = 'h';
        double number1 = 10.0;
        double number2 = 3.0;
        double result;
        //
        if(operators == '+'){
            result = number1 + number2;
            System.out.println(result);
        }else if(operators == '-'){
            result = number1 - number2;
            System.out.println(result);
        }else if(operators == '*'){
            result = number1 * number2;
            System.out.println(result);
        }else if(operators == '/'){
            result = number1 / number2;
            System.out.println(result);
        }else if(operators == '%'){
            result = number1 % number2;
            System.out.println(result);
        }else{
            System.out.println("No such operator present.");
        }
        }
    }

