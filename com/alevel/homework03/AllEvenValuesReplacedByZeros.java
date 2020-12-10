package com.alevel.homework03;

public class AllEvenValuesReplacedByZeros {
    public static void main(String[] args) {
        int quantity = 2000;
        int arr[] = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            arr[i] = (int) Math.round((Math.random() * (20 - 2) + 2));
        }
        for (int i = 0; i < quantity; i++) {
            if (arr[i] % 2 == 0){
                arr[i] = 0;
            }
        }
        for (int i = 0; i <quantity ; i++) {
            System.out.println(arr[i]);
        }

    }
}
