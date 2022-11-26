package task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив:" + Arrays.toString(array));

        Prime prime = new Prime();
        System.out.println("Индексы простых чисел: " + prime.getPrimeNumberIndexes(array));
    }
}