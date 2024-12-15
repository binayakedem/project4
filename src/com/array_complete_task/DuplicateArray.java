package com.array_complete_task;

import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        //        question: Find the duplicate element in an array.
        Scanner sc = new Scanner(System.in);
//taking input size from user

        int size;
        System.out.println("Ënter the size of array:");
        size = sc.nextInt();

//        array declaration


        int[] arr = new int[size];

//        taking array input from user up to 10
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index " + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

//        displaying output to user
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }


    }
}
