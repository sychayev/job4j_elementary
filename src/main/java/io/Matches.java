package io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        int count1 = 0;
        int count2 = 0;
        boolean player = true;
        while (run){
            String name = player ? "gamer1" : "gamer2";
            System.out.println("Enter your number from 1 to 3 - " + name);
            count1 = in.nextInt();
            if (count1 < 1 || count1 > 3) {
                System.out.println("You entered not right number ");
            }

            String name1 = player ? "gamer2" : "gamer1";
            System.out.println("Enter your number from 1 to 3 " + name1);
            count2 = in.nextInt();
            if (count2 < 1 || count2 > 3) {
                System.out.println("You entered not right number ");
            }
            int sum = count1 + count2;
            int sub = matches - sum;
            System.out.println(sub);
            if (sub == 0) {
                run = false;
            }
        }
    }
}