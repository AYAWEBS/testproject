package com.company;

public class TestIf {

    public static void main(String[] args) {
        // creat check of temperature if temp is higher then 80.1 print hot
        double tempTest = 80.2;
        if (tempTest >= 80.1) {
            System.out.println("Hot!");
        } else if (tempTest >= 75.0) {
            System.out.println("Just Right!");
        } else {
            System.out.println("Cold!");
        }
    }
}
