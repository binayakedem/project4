package com.array_complete_task;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input size from user
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Array declaration and input
        int[] arr = new int[size];
        System.out.println("Enter the array values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates in place
        int newSize = 0; // Keeps track of unique elements
        for (int i = 0; i < size; i++) {
            boolean found = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr[newSize++] = arr[i];
            }
        }

        // Displaying the result
        System.out.println("Array without duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
