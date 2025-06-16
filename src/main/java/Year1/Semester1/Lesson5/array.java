package Year1.Semester1.Lesson5;


import java.util.Random;
import java.util.Scanner;

public class array {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static boolean isNumberExist(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int sumOfEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static int sumOfEvenNumbers(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isThereDuplicate(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            int cuurNum = array[i];
            for (int j = i+1; j < array.length; j++) {
                int tempNum = array[j];
                if (cuurNum == tempNum){
                    return true;
                }
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[] arr = {4,5,6,7, 2,8, 8};
        int num = 1;
        printArray(arr);
        System.out.println();
        System.out.println(isNumberExist(arr, num));
        System.out.println(sumOfEven(arr));
        System.out.println(isThereDuplicate(arr));
    }
}

class Ex1{

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54,5};
        printArray(arr);
    }
}

class Ex2{

    public static int[] newArraySize(int num){
        int[] arr = new int[num];
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int[] arr = newArraySize(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

class Ex3{

    public static double[] newArray(int size, double value){
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        double value;
        System.out.println("Enter a number: ");
        size = sc.nextInt();
        System.out.println("Enter a double num: ");
        value = sc.nextDouble();

        double[] arr =  newArray(size, value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex4{

    public static int[] randomNumsInArray(int[] arr, int num){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(num);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        int num = 10;
        arr = randomNumsInArray(arr, num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex5{
    public static int[] newArray(int size, int firstNum){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = firstNum + i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 10;
        int firstNum = 7;
        int[] arr = newArray(size, firstNum);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex6{
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfArray(arr));
    }
}

class Ex7{
    public static void highestNum(int[] arr){
        int highestNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highestNum){
                highestNum = arr[i];
            }
        }
        System.out.println(highestNum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,65,6,7,8,9,10};
        highestNum(arr);
    }
}

class Ex8{
    public static int highestNum(int[] arr){
        int highestNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highestNum){
                highestNum = arr[i];
            }
        }
        return highestNum;
    }

    public static void main(String[] args) {
        int[] arr = {1,222,3,4,65,6,7,8,9,10};
        System.out.println(highestNum(arr));
    }
}

class Ex9{
    public static int doAll(int num){
        Random rnd = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > highest){
                highest = arr[i];
            }
        }
        System.out.println();
        return highest;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(doAll(num));
    }
}

class Ex10and11 {
    public static int repeatNum(int num, int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                counter++;
            }
        }
        return counter;
    }

    public static int[] arrayWithoutRepeatNum(int num, int[] arr, int size){
        int[] newArr = new int[arr.length-size];
        int integer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num){
                newArr[integer] = arr[i];
                integer++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        // EX10
        int num = 2;
        int[] arr = {4,5,6,2,2,2,4,6,2,5,2,5,2,4};
        int count = repeatNum(num, arr);

        // EX11
        int[] newArr = arrayWithoutRepeatNum(num, arr, count);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

class Ex12{
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }

    public static int[] creatArray(int num){
        int[] arr = new int[num];
        return arr;
    }

    public static int[] createRandomArray(int num){
        Random rnd = new Random();
        int[] arr = creatArray(num);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(num*10);
        }
        return arr;
    }

    public static int mostCommonNumInArray(int[] arr){
        int mostCommon = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentNumberCounter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    currentNumberCounter++;
                }

            }
            if (currentNumberCounter > maxCount){
                mostCommon = arr[i];
                maxCount = currentNumberCounter;
            }
        }
        return mostCommon;
    }

    public static int[] arrayWithoutCommonNum(int commonNum, int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == commonNum){
                counter++;
            }
        }
        int[] newArr = new int[arr.length - counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != commonNum){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arrSize = 7;
        int[] arr = createRandomArray(arrSize);
        printArray(arr);

        System.out.println();
        int mostCommonNum = mostCommonNumInArray(arr);
        System.out.println("Most common number is: " + mostCommonNum);

        System.out.println();
        int[] newArr = arrayWithoutCommonNum(mostCommonNum, arr);
        System.out.println("New array:");
        printArray(newArr);

    }
}

class Ex13{
    public static int sumOfBiggerArray(int [] arr1, int[] arr2){
        int sumOfArray1 = 0;
        int sumOfArray2 = 0;
        for (int i : arr1){
            sumOfArray1 += i;
        }
        for (int j : arr2){
            sumOfArray2 += j;
        }
        if (sumOfArray1 == sumOfArray2){
            return 0;
        } else if (sumOfArray1 > sumOfArray2) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        int num = 10;

        int[] arr1 = Ex12.createRandomArray(num);
        System.out.println();
        int[] arr2 = Ex12.createRandomArray(num);
        System.out.println();

        Ex12.printArray(arr1);
        System.out.println();
        Ex12.printArray(arr2);
        System.out.println();

        System.out.println(sumOfBiggerArray(arr1, arr2));
    }
}

class Ex14{
    public static int[] creatingArrOfTheNum(int num){
        int counter = 0;
        int tempNum = num;
        while (tempNum != 0){
            counter++;
            tempNum /= 10;
        }
        int[] arr = new int[counter];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static void main(String[] args) {
        int num = 12387665;
        int[] arr = creatingArrOfTheNum(num);
        Ex12.printArray(arr);
    }
}

class Ex15{
    public static boolean isPalindromicArray(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr1[arr1.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,0,5,0,4,3,2,1};
        System.out.println(isPalindromicArray(arr1));
    }
}

class Ex16{

    public static void main(String[] args) {
       int num = 168161;
       int[] arr = Ex14.creatingArrOfTheNum(num);
        System.out.println(Ex15.isPalindromicArray(arr));
    }
}

class Ex17{
    public static int counterOfPolindromNumbers(int[] arr){
        int counter = 0;
        for (int i : arr){
            int[] tempArr = Ex14.creatingArrOfTheNum(i);
            if (Ex15.isPalindromicArray(tempArr)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {181, 777, 889, 16361 , 151 , 1981 , 18584 , 1581512};
        System.out.println(counterOfPolindromNumbers(arr));
    }
}