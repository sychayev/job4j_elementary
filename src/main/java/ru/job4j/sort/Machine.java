package ru.job4j.sort;

import java.util.Arrays;
public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        for(int  i =0;i < rsl.length;i++) {
            if (money > price) {
                size = money - price;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public double change() {
        double rsl = 0;
        return rsl;
    }

    public static void main(String[] args) {
        int[]change = new int[]{100,100};
        System.out.println(change);
        int[]change1 = new int[]{10,5};
        System.out.println(change1);
    }
}
