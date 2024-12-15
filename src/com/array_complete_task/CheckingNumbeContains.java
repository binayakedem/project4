package com.array_complete_task;

import java.util.Scanner;

public class CheckingNumbeContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//quetion:Write a java program to check if an array of integers contains two specific elements 65 and 77.

//        variable declaration
        int size,flag=0;

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

        }
//        now this is for average calculation

        for(int i=0;i<size;i++){
           if(arr[i]==65){
               System.out.println("65 value is found in the index of "+i);
               flag=1;
           } else if (arr[i]==77) {
               System.out.println("77 value is found in the index of "+i);
               flag=1;
           }
        }

        if(flag==0){
            System.out.println("Both value are not found in the array");
        }

    }
}
