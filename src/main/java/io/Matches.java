package io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        int player1, player2;
        int count = 0;
        while (run) {
            System.out.println("Enter  your number player1 from 1 to 3");
            player1 = in.nextInt();
            int sum1 = matches - player1;
            System.out.println(sum1);
            System.out.println("Enter  your number player2 from 1 to 3");
            player2 = in.nextInt();
            int sum2 = sum1 - player2;
            System.out.println(sum2);
            for (int i = count; i <= matches; i++) { int res = matches - count;
                if (res == 0) {
                    System.out.println("You won!!");
                    run = false;
                    break;
                }else{
                    continue;
                }

            }
        }
    }
}