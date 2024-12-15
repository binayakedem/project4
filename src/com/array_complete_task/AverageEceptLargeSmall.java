package com.array_complete_task;

import java.util.Scanner;

public class AverageEceptLargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//quetion:Write a java program to compute the average value of an array of integers except the largest and smallest  values.
        // Variable declaration
        int size, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE,average,sum=0;

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
//        now this is for average calculation

        for(int i=0;i<size;i++){
            if(arr[i]!=smallest && arr[i]!=largest){
                int num=arr[i];
                sum=num+sum;
            }
        }

        average=sum/(size-2);

        // Displaying output to user
        System.out.println("Average value except largest and smallest value is: " + average);

    }
}
