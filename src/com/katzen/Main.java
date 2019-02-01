package com.katzen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_3");
        Scanner w = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Task_1");
        IntArrayList intArrayList = new IntArrayList();
        methodForWorkWithIntArrayList(intArrayList);
        System.out.println("Task_2");
        int arrayLength;
        System.out.println("Enter the length of array");
        arrayLength = w.nextInt();
        System.out.println("Length of array is " + arrayLength);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        System.out.println("Your array is " + Arrays.toString(array));
        int countOfEvenNumbers = 0;
        int countOfUnevenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfUnevenNumbers++;
            }
        }
        int[] arrayOfEvenNumbers = new int[countOfEvenNumbers];
        int[] arrayOfUnevenNumbers = new int[countOfUnevenNumbers];
        int indexOfArrayOfEvenNumbers = 0;
        int indexOfArrayOfUnevenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayOfEvenNumbers[indexOfArrayOfEvenNumbers] = array[i];
                indexOfArrayOfEvenNumbers++;
            } else {
                arrayOfUnevenNumbers[indexOfArrayOfUnevenNumbers] = array[i];
                indexOfArrayOfUnevenNumbers++;
            }
        }
        System.out.println("Array of even numbers is " + Arrays.toString(arrayOfEvenNumbers));
        System.out.println("Array of uneven numbers is " + Arrays.toString(arrayOfUnevenNumbers));
        indexOfArrayOfEvenNumbers = 0;
        indexOfArrayOfUnevenNumbers = 0;
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            array[i] = arrayOfEvenNumbers[indexOfArrayOfEvenNumbers];
            indexOfArrayOfEvenNumbers++;
        }
        for (int i = arrayOfEvenNumbers.length; i < array.length; i++) {
            array[i] = arrayOfUnevenNumbers[indexOfArrayOfUnevenNumbers];
            indexOfArrayOfUnevenNumbers++;
        }
        System.out.println("Final array is " + Arrays.toString(array));
        System.out.println("Task_3");
        methodForThirdTaskOfTheSecondHomework();
    }

    public static int methodForWorkWithIntArrayList(IntArrayList intArrayList) {
        Scanner w = new Scanner(System.in);
        int action;
        System.out.println("Welcome to the method working with the intArrayList");
        System.out.println("1 adds elements to array");
        System.out.println("2 adds element to array by index");
        System.out.println("3 clears the array");
        System.out.println("4 will show you if array contains element by element value");
        System.out.println("5 prints element on the desktop by index");
        System.out.println("6 will check if array is empty");
        System.out.println("7 removes element from array by element index");
        System.out.println("8 rewrites the element by index");
        System.out.println("9 prints array size");
        System.out.println("10 prints array on the desktop");
        System.out.println("11 closes the program");
        System.out.println("What would you like to do? Please enter : ");
        action = w.nextInt();
        switch (action) {
            case 1:
                int element;
                System.out.println("Enter element");
                element = w.nextInt();
                intArrayList.add(element);
                break;
            case 2:
                int index;
                int element1;
                System.out.println("Enter index of element");
                index = w.nextInt();
                System.out.println("Enter element");
                element1 = w.nextInt();
                intArrayList.add(index, element1);
                break;
            case 3:
                intArrayList.clear();
                System.out.println("Array is clear");
                break;
            case 4:
                int element2;
                System.out.println("Enter element to check in the array");
                element2 = w.nextInt();
                intArrayList.contains(element2);
                break;
            case 5:
                int index2;
                System.out.println("Enter index of element");
                index2 = w.nextInt();
                System.out.println(index2 + " element of array is " + intArrayList.get(index2));
                break;
            case 6:
                intArrayList.isEmpty();
                break;
            case 7:
                int index3;
                System.out.println("Enter index");
                index3 = w.nextInt();
                intArrayList.remove(index3);
                break;
            case 8:
                int index4;
                int element3;
                System.out.println("Enter index of element");
                index4 = w.nextInt();
                System.out.println("Enter element");
                element3 = w.nextInt();
                intArrayList.set(index4, element3);
                break;
            case 9:
                System.out.println("Size of array is " + intArrayList.size());
                break;
            case 10:
                System.out.println(intArrayList.toString());
                break;
            case 11:
                System.out.println("Thank you for using the method. Method is closed.");
                return 0;
            default:
                System.out.println("You have entered uncorrected number. Try again, please.");
                return methodForWorkWithIntArrayList(intArrayList);
        }
        return methodForWorkWithIntArrayList(intArrayList);
    }

    public static void methodForThirdTaskOfTheSecondHomework() {
        Scanner w = new Scanner(System.in);
        Random r = new Random();
        int lines;
        int columns;
        System.out.println("Enter the quantity of lines");
        lines = w.nextInt();
        System.out.println("Quantity of lines is " + lines);
        System.out.println("Enter the quantity of columns");
        columns = w.nextInt();
        System.out.println("Quantity of columns is " + columns);
        int[][] array = new int[lines][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(2);
            }
        }
        System.out.println("Your array is ");
        printArray(array);
        System.out.println();
        int arrayElement;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                arrayElement = array[i][j];
                array[i][j] = array[i][array.length - j - 1];
                array[i][array.length - j - 1] = arrayElement;
            }
        }
        System.out.println("Reversed array is ");
        printArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        System.out.println("Inverted array is ");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "_");
            }
            System.out.println();
        }
    }
}
