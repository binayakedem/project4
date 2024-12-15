package com.array_complete_task.question_21;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

//Find the first repeating element in an array of integers.
public class RepeatingArr {
    public static void main(String[] args) {

//        declaring variable

        int []arr;

//        taking input from user
        InputArray inp=new InputArray();

        arr= inp.inputArray(" Enter the array to find the repeating element:");

//        displaying output

        OutputArray outp=new OutputArray();
        outp.repeatArray(arr);
    }
}
