package com.array_complete_task;

import java.util.Scanner;

public class ReadArrayDisplay {
    public static void main(String[] args) {
//        question: take input 10 array value and display

        Scanner  sc=new Scanner(System.in);

//        array declaration

        int [] arr=new int[10];

//        taking array input from user up to 10
        for(int i=0;i<10;i++){
            System.out.println("Enter array value at index "+"["+i+"]:");
            arr[i]=sc.nextInt();
        }

//        displaying output to user
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}
