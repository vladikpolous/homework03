package com.alevel.homework03;

public class HowManyPrimeNumbers {
    public static void main(String[] args) {
       int quantity = 400;
       int arr[] = new int[quantity];
       int count =0;
        for (int i = 0; i < quantity; i++) {
            arr[i] = (int) Math.round(Math.random()*15);
        }
        for (int i = 0; i < quantity; i++) {
            if(isPrime(arr[i])){
                count++;
            }
        }
        System.out.println("Количество простых чисел=" +count);
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
