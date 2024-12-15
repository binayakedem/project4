package com.array_complete_task;

import java.util.Scanner;

public class ArraySubQuestions {
    public static void main(String[] args) {
        //        question:Create a array with elements
        //and then find and display using functions
        //All the even numbers of an array
        //All the odd numbers of an array
        //All the prime numbers
        //All the negative numbers of an array
        //All the numbers exactly divisible by 5
        //Largest element in the array
        //Second largest element in the array
        //Sum of all the numbers
        //Sum of all the prime numbers
        //Copy all the negative numbers in separate array
        //Copy all the positive numbers in a separate array and increment every element by 10.

        Scanner sc = new Scanner(System.in);
//variable declaration
        int size, even, odd, prime, negative, divisible, largest = 0, secondLargest = 0, sum = 0, sumOfPrime = 0, copyNegativeArray[], copyPositive[];
//taking input size from user
        System.out.println("Ënter the size of array:");
        size = sc.nextInt();

//        array declaration


        int[] arr = new int[size];

//        taking array input from user up to 10
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array value at index " + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

//        displaying even output only
        System.out.println("Even numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

//        displaying odd numbers only
        System.out.println("Odd numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }


//        prime number finding
        for (int i = 0; i < size; i++) {
            boolean isPrime = true;


            if (arr[i] < 2) {
                continue;
            }


            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number is: " + arr[i]);
                int num = arr[i];
                sumOfPrime = sumOfPrime + num;

            }
        }


//        this is for displaying only negative array only:

        System.out.println("Negative array:");
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.println("Negative array is:" + arr[i]);
            }
        }

//        finding the the value divisible by exactly 5
        System.out.println("Value divisible by exact 5 only");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }


//        finding largest number among the given array
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
//        displaying largest value in array:

        System.out.println("Largeset value is:" + largest);
        System.out.println("Second Largeset value is:" + secondLargest);


//        sum of array
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            sum = sum + num;
        }
//        displaying the sum and sum of prime value of array
        System.out.println("Sum of array is:" + sum);
        System.out.println("Sum of prime value  is:" + sumOfPrime);



//        copying all the negative number to another array:
        int sizeOfNegativeArray=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                sizeOfNegativeArray++;
            }
        }
        copyNegativeArray=new int[sizeOfNegativeArray];
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                copyNegativeArray[count]=arr[i];
                count++;
            }
        }

        System.out.println("DIsplaying the negative values:");
        for(int i=0;i<sizeOfNegativeArray;i++){
            System.out.println(copyNegativeArray[i]);
        }


//        copying the all the positive number and

        int sizeOfPositiveArray=0;

        for(int i=0;i<size;i++){
            if(arr[i]>0){
                sizeOfPositiveArray++;
            }
        }
        copyPositive=new int[sizeOfPositiveArray];
        int counts=0;
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                copyPositive[counts]=(arr[i]+10);
                counts++;
            }
        }

        System.out.println("DIsplaying the Positive values:");
        for(int i=0;i<sizeOfPositiveArray;i++){
            System.out.println(copyPositive[i]);
        }

    }
}
