package com.alevel.homework03;


public class AvgArithmeticAndGeometricValue {
    public static void main(String[] args) {
        int quantity = 400;
        int sum = 0;
        int array[] = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = (int) Math.round((Math.random() * (7 - 2) +2));
        }
        for (int i = 0; i < quantity; i++) {
            sum += array[i];
        }
        double avgArithmeticValue = sum / quantity;
        System.out.println("Среднее арифметическое занчение = "+avgArithmeticValue);
        double  multiply = 1;

        for (int i = 0; i < quantity; i++) {
            multiply = multiply* array[i];
        }
        double temp = 1.0 /  quantity;
        double avgAGeometricValue = Math.pow(multiply, temp);
        System.out.println("Среднее геометрическое занчение = "+avgAGeometricValue);
    }
}
