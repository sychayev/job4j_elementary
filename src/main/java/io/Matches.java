package io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int matches = 11;
        int count = 0;
        boolean player = true;
        String name = "";
        while (matches > 0) {
            name = player ? "gamer1" : "gamer2";
            System.out.println("Enter your number from 1 to 3 - " + name);
            count = in.nextInt();
            if (count > 0 && count < 4) {
                matches = matches - count;
                if(matches > 0) {
                    player = !player;
                }
                System.out.println(matches);
            } else {
                System.out.println("You entered not right number!!");
            }
        }
        System.out.println("You won.Congratulation - gamer1" + name);
    }
}