package com.array_complete_task.question_25;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

public class FindingFactorial {
    public static void main(String[] args) {
//        declaration of variable

        int[] arr;
        int max = Integer.MIN_VALUE;

//        taking input from user
        InputArray inp = new InputArray();
        arr = inp.inputArray("Enter the array for finding factorial:");

//        finding max value from the given array
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
//        displaying the factorial
        OutputArray outp = new OutputArray();
        outp.calFactorial(max);

    }


    }

