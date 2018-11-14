package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] stuffToBeSorted = {3, 645, 2, 7, 1, 9, 10, 35, 2, 0};
	    bubbleSort(stuffToBeSorted);
	    for (int i = 0; i < stuffToBeSorted.length; i ++) {
	        System.out.println(stuffToBeSorted[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
