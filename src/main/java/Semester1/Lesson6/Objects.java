package Semester1.Lesson6;

import java.util.Scanner;

public class Objects {
    public static void initArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int index = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = newArr[index];
            index++;
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        printArray(arr);
        System.out.println();
        initArray(arr);
        System.out.println();
        printArray(arr);
        System.out.println();
        reverseArray(arr);
        printArray(arr);

    }
}
