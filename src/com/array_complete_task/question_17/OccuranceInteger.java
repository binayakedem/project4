package com.array_complete_task.question_17;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

// Find the occurrence of an integer in the array.
public class OccuranceInteger {
    public static void main(String[] args) {
        //    variable declaration

        int [] array;
        InputArray inp=new InputArray();
        array= inp.inputArray("Enter the array to find integer count:");

       OutputArray outp=new OutputArray();
       outp.duplicateArray(array);
       }
    }



