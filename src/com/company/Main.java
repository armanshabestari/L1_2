package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        double plus = 0, average;
        System.out.println("How many Points?");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        double[] array = new double[number];
        System.out.println("Enter the points:");
        for (int i = 0; i < number; i++) {
            array[i] = input.nextDouble();
            plus = plus + array[i];
        }
        System.out.print("Average is : ");
        average = plus / number;
        System.out.println(average);
        if (average<12)
            System.out.println("\n\tMASHROOT!");
        else
            System.out.println("\n\tGhabool");
    }
}
