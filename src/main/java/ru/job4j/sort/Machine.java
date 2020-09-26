package ru.job4j.sort;

import java.util.Arrays;
public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public static int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        System.out.println( size = money - price);
        for(int i = 10;i < size;i+=10){
            System.out.println(i);
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
       int mas1[] =  Machine.change(100,100);
       int mas2[] =  Machine.change(50,35);

    }
}
