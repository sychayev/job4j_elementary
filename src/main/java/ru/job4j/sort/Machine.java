package ru.job4j.sort;

import java.util.Arrays;
public class Machine {

    public static int[] change(int money, int price) {
        int[] COINS = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        System.out.println( size = money - price);
        for(int i = 0;i <COINS.length;i++){
            while(size > COINS[i]){
             int nom =  size - COINS[i];
            }
            System.out.println(COINS[i]);
//            System.out.println(i);
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
       int mas1[] =  Machine.change(100,100);
       int mas2[] =  Machine.change(50,35);

    }
}
