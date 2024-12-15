package com.array_complete_task.question_23;

import com.array_complete_task.input.InputArray;
import com.array_complete_task.output.OutputArray;

//Rearrange the array in alternating positive and negative items.
//Example:
//Input:
//N = 9
//Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
//Output:
//9 -2 4 -1 5 -5 0 -3 2
public class ReaarangeArr {
    public static void main(String[] args) {

//        variable declartion

        int[] arr;
        InputArray inp = new InputArray();
        arr = inp.inputArray("Enter the array element to rearrange array:");

//        displaying array

        OutputArray outp = new OutputArray();
        outp.reArranging(arr);
    }
}
