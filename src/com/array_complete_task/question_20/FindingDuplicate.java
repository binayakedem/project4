package com.array_complete_task.question_20;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

//Find the duplicate element in an array.
public class FindingDuplicate {
    public static void main(String[] args) {
//        variable declaration

        int[] arr;
        InputArray inp = new InputArray();
        arr = inp.inputArray("Enter array to find the duplicate:");

//        diaplaying the output to user

        OutputArray outp = new OutputArray();
        outp.duplicateArray(arr);
    }
}
