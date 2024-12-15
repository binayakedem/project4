package com.array_complete_task.question_28;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

// finding the intersection and union
public class IntersectionUnion {
    public static void main(String[] args) {
//        variable declaration
        int []arr1;
        int []arr2;

//        taking input from the user
        InputArray inp=new InputArray();
        arr1=inp.inputArray("Enter first array");
        arr2=inp.inputArray("Enter second array");

//        displaying the result
        OutputArray outp=new OutputArray();
        outp.unionIntersection(arr1,arr2);
    }
}
