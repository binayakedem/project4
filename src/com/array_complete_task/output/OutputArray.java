package com.array_complete_task.output;

public class OutputArray {
    public void oututArray(int[] a, String outMessage) {
        System.out.println(outMessage);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void duplicateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (val == array[j]) {
                    count++;
                }
            }
            System.out.println(array[i] + " element is found " + count + " times");
        }
    }


    public void repeatArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (val == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(array[i] + " element is found " + count + " times");
            } else {
                System.out.println("No found repeating!!");
            }
        }
    }


    public void noRepeatArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (val == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("No repeat: " + array[i]);
            }
        }
    }


//    rearranging the array in alterative of positive and negative

    public void reArranging(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] < 0) {
                    break;
                } else {
                    if (a[i] < 0) {
                        if (a[j] > 0) {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                            break;
                        }
                    }
                    if (a[i] > 0) {
                        if (a[j] < 0) {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Re-arranging array is :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    //    maximum product of subarray
    public void maxProductOfSubarr(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int product = 1;
                for (int k = i; k < j; k++) {
                    product = product * a[k];


                }
                if (product > max) {
                    max = product;
                }
            }
        }
        System.out.println("Maximum sub array value is:" + max);
    }


    //    maximum sum array is
    public void maxSumOfSubarr(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 1;
                for (int k = i; k < j; k++) {
                    sum = sum + a[k];


                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sub array value is:" + max);
    }


//    this finds the sum of sub array =0

    public void sumOfSubZero(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (sum == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("The array contains the sum of sub array = 0");
        } else {
            System.out.println("The array does not contain the sum of sub array = 0");
        }
    }

    //    largest digit from the given number
    public void largestDigit(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

        }
    }

//    finding factorial

    public void calFactorial(int f) {
        int temp = 1;
        for (int i = 1; i <= f; i++) {
            temp = temp * i;
        }
        System.out.println("Factorial of " + f + " is = " + temp);
    }


    //    finding union and intersection of sorted array
    public void unionIntersection(int[] a, int[] b) {
        int var = a.length;
        int var1 = b.length;

        if (var > var1) {
            System.out.println("Union value is :");
            for (int i = 0; i < var; i++) {
                System.out.println(a[i]);
            }
        } else {
            System.out.println("Union value is :");
            for (int i = 0; i < var; i++) {
                System.out.println(a[i]);

            }
        }
        if (var < var1) {
            System.out.println("Intersection value is :");
            for (int i = 0; i < var; i++) {
                System.out.println(a[i]);
            }
        } else {
            System.out.println("INtersection value is :");
            for (int i = 0; i < var; i++) {
                System.out.println(a[i]);

            }
        }
    }
}