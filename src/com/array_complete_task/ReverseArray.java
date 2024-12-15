package com.array_complete_task;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //        question: Wap to reverse the array.
        Scanner sc = new Scanner(System.in);
//taking input size from user

        int size;
        System.out.println("Ënter the size of array:");
        size = sc.nextInt();

//        array declaration


        int[] arr = new int[size];
        int[] arrRev = new int[size];

//        taking array input from user up to 10
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index " + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

//        displaying output to user
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            arrRev[count] = arr[i];
            count++;
        }
//displaying the reverse array:

        System.out.println("Displaying the reverse array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arrRev[i]);
        }


    }
}
