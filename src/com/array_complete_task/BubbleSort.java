package com.array_complete_task;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //        question: Wap to sort the array.
        Scanner sc = new Scanner(System.in);
//taking input size from user

        int size;
        System.out.println("Ënter the size of array:");
        size = sc.nextInt();

//        array declaration


        int[] arr = new int[size];

//        taking array input from
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index " + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

//        sorting

        for (int i = 0; i < size-1; i++) {
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
//displaying the reverse array:

        System.out.println("Displaying the reverse array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }


    }
}
