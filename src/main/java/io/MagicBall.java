package io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        Scanner in  = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name );
        int answer = new Random().nextInt(3);
        if(answer == 0){
            System.out.println("Yes");
        }else if(answer ==1){
            System.out.println("No");
        }else{
            System.out.println("Maybe!");
        }

    }
}
