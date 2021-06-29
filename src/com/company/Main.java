package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке. */

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(21);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}



