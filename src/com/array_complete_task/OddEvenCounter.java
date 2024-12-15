package com.array_complete_task;

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {

//        question: Write a java program to find the number of even and odd integers in a given array of integers.
        Scanner sc = new Scanner(System.in);

//variable declaration
        int size, evenCounter = 0, oddCounter = 0;

//taking input size from user
        System.out.println("Ënter the size of array:");
        size = sc.nextInt();

//        array declaration
        int[] arr = new int[size];

//        taking array input from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index " + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

//        displaying output to user
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

//        displaying out to user
        System.out.println("Total number of even:" + evenCounter);
        System.out.println("Total number of odd:" + oddCounter);

    }
}
