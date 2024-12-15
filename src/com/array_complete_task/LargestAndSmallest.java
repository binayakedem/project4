package com.array_complete_task;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        //        question: WAP to sum and average the elements of any array. Size of the array should be defined by the user and also input should be provided by the user.

        Scanner sc = new Scanner(System.in);
//taking input size from user

        int size, smallest = 0, largest = 0;
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
        for (int i = 0; i < size; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

//        displaying out put to user

        System.out.println("Smallest value is:" + smallest);
        System.out.println("Largeset value is:" + largest);

    }
}
