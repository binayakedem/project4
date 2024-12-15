package com.array_complete_task.question_19;

import com.array_complete_task.input.InputArray;

//Count pairs with given sum
//Example:
//Input:
//N = 4, K = 6
//arr[] = {1, 5, 7, 1}
//Output: 2
//Explanation:
//arr[0] + arr[1] = 1 + 5 = 6
//and arr[1] + arr[3] = 5 + 1 = 6.
public class SumCounter {
    public static void main(String[] args) {

//        variable declaration

        int []arr;
        int k,n,count=0;

//        taking input from user
        InputArray inp=new InputArray();
        arr=inp.inputArray("Enter the integer to find the sum count:");

//        now asking user to find sum counter
        System.out.println("First integer");
        k= inp.integerInput();
        System.out.println("Second integer");
        n= inp.integerInput();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i]+arr[j];
                if(temp==k || temp==n){
                    count++;
                }
            }
        }

        System.out.println("Total count of sum of "+n+ " and "+k+" is "+count);
    }
}
