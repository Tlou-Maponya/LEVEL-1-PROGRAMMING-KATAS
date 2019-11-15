package com.example.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Please Enter Number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 ==0){
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }


}
