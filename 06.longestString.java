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

        String longestString = array[0];
        for(int x=1; x<array.length; x++)
        {
            if(array[x].length()> longestString.length())
            {
                longestString = array[x];
            }
        }
        for(int y=0; y<array.length; y++)
        {
            if(array[y].length()== longestString.length())
            {
                System.out.println("Longest string is: " + array[y]);
            }
        }


    }


}
