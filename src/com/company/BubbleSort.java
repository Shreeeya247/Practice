package com.company;

import java.util.Scanner;

public class BubbleSort {
    public void Sorting(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        Integer n = scan.nextInt();
        int []array = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i =0; i< n; i++){
            array[i] = scan.nextInt();
        }
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i=0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main (String args[]){
        BubbleSort obj = new BubbleSort();
        obj.Sorting();
    }
}
