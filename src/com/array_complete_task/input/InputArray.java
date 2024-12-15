package com.array_complete_task.input;

import java.util.Scanner;

public class InputArray {
    public int[] inputArray(String inpMessage) {
        Scanner sc = new Scanner(System.in);

//        variable declaration
        int arr[];
        int size;

//       taking input size from user
        System.out.println("Enter the size of array:");
        size = sc.nextInt();

//        array Initialization
        arr = new int[size];
        System.out.println(inpMessage);

        for (int i = 0; i < size; i++) {
            System.out.print("array at " + "[" + i + "]=");
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    public  int integerInput(){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the integer value:");
        num=sc.nextInt();
        return num;
    }
}
