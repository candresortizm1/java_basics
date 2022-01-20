package com.globant;

import exercises.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loop: while(true){
            System.out.println("-----------------------------------------------");
            System.out.println("Escriba el número del ejercicio que quiere ver (\"0\" para finalizar):");
            String number = scanner.nextLine();
            switch (number){
                case "1":
                    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
                    break;
                case "2":
                    FibonacciInt fibonacci = new FibonacciInt();
                    break;
                case "3":
                    BubbleSort bubbleSort = new BubbleSort();
                    break;
                case "0":
                    System.out.println("Adiós");
                    break loop;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("FIN");
        }

    }
}
