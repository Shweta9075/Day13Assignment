package com.bridgelabz;

public class MaximumFloat {
    public static void main(String[] args) {
        float num1 = 2.5f;
        float num2 = 7.2f;
        float num3 = 3.8f;
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 + " is the maximum number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 + " is the maximum number.");
        else
            System.out.println( num3 + " is the maximum number.");
    }
}
