package com.array_complete_task.question_50;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

public class SumOfSubZero {
    public static void main(String[] args) {

//        declaring variable

        int[] arr;

//        taking input from user
        InputArray inp = new InputArray();
        arr = inp.inputArray("Enter the element to find  sum of subarray=0:");


//        displaying output to user
        OutputArray outp = new OutputArray();
        outp.sumOfSubZero(arr);
    }
}
