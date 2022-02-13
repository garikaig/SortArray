package com.ggwaradzimba;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[5];

        myIntArray = getIntegers(myIntArray);

        printArray(myIntArray);

        int[] sortedArray = sortIntegers(myIntArray);
        printArray(sortedArray);
    }

    // method to capture keyboard input of the array values
    public static int[] getIntegers(int[] array) {
        System.out.println("Please capture " + array.length + " integers: " + "\r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents: " + array[i]);
        }
    }

    // method to sort array in place
    public static int[] sortIntegers(int[] array) {
        int temp;
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
