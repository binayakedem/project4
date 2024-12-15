package com.array_complete_task.question_18;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

//Move all the negative elements to one side of the array.
public class DivisionNegative {
    public static void main(String[] args) {

//        variable declaration
        int[] arr;

//        taking input from user
        InputArray inp = new InputArray();
        arr = inp.inputArray("Enter the values to seperate the positive and negative:");


//        logic to separate
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>0 && arr[j]<0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


//        displaying the result to user
        OutputArray outp=new OutputArray();
        outp.oututArray(arr,"This is the separated array:");
    }
}
