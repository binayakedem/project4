package com.array_complete_task;

import java.util.Scanner;

public class DiffLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable declaration
        int size, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        // Taking input size from user
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        // Array declaration
        int[] arr = new int[size];

        // Taking array input from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index [" + i + "]:");
            arr[i] = sc.nextInt();
        }

        // Finding largest and smallest values
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        // Displaying output to user
        System.out.println("Difference between largest and smallest value is: " + (largest - smallest));
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
    }
}
