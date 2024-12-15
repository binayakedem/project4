package com.array_complete_task.question_22;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

//Find the first non-repeating element in a given array of integers.
public class NonRepeating {
    public static void main(String[] args) {
        // variable declaration

        int []arr;
        InputArray inp=new InputArray();
        arr= inp.inputArray("Enter the array to find the non repeating element:");

//        displaying output

        OutputArray outp=new OutputArray();

        outp.noRepeatArray(arr);
    }
}
