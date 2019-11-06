package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public int[] createArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public void mergeArray(int[] arr1, int[] arr2)
}
