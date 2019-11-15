package com.example.java;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the amount of strings you wish to display: ");

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();


        System.out.println("Please enter "+amount+ " names:");

        Scanner s = new Scanner(System.in);
        String[] array = new String[amount];


        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextLine();
        }

        String spaces = " ";
        for (int j = 0; j < array.length; j++) {
            System.out.println( "* " + array[j] + spaces + "*");
        }


    }


}
