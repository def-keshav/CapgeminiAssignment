package com.company;

import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your desired values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Array ob=new Array();
        System.out.println("Max value:"+ob.max(arr));
        System.out.println("Min value:"+ob.min(arr));

    }
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
}
