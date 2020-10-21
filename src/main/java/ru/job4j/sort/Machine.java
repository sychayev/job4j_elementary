package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] COINS = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;

        int balance = 0;
        System.out.println(balance = money - price);
        for (int i = 0; i < COINS.length; i++) {
            while (balance >= COINS[i]) {
                balance -= COINS[i];
                rsl[size] = COINS[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int mas1[] = Machine.change(100, 100);
        int mas2[] = Machine.change(50, 35);

    }
}
