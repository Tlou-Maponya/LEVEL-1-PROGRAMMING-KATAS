package com.example.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please Enter unit Size: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }


}
