package ru.skypro;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //task 3

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int num : arr) {
           sum += num;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //task 4

        int minNumber = arr[0];
        int maxNumber = arr[0];
        for (int a : arr) {
            if (a < minNumber)
                minNumber = a;

            for (int j : arr) {
                if (j > maxNumber)
                    maxNumber = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNumber + " рублей." +
                " Максимальная сумма трат за день составила " + maxNumber + " рублей.");

        //task 5

        long averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSum = (long) sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

    }

    public static int[] generateRandomArray() {
        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            // System.out.println(arr[i]);
        }
        return arr;
    }


}
