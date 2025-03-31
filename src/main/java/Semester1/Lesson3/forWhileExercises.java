package Semester1.Lesson3;

import java.util.Scanner;

public class forWhileExercises {
    public static void main(String[] args) {

    }
}

class Ex4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? ");
        int userIter = sc.nextInt();
        int result = 0;
        int num;
        for (int i = userIter; i > 0; i-- ){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if(num > 10){
                result++;
            }
        }
        System.out.println("This is the number: " + result);
    }

}

class Ex8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (counter < 5){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0){
                counter++;
            }
        }
        System.out.println("You have done it!");
    }
}

class Ex9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (counter < 3){
            System.out.println("Enter a number: ");
            double num = sc.nextDouble();
            if (num >= 10 && num <= 99){
               counter++;
            }
        }
        System.out.println("Done!");

    }
}

class Ex10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (counter < 5){
            System.out.println("Enter a number: ");
            double num = sc.nextDouble();
            if (num % 1 == 0){
                counter++;
            }
        }
        System.out.println("Done!");
    }
}

class Ex11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (counter < 3){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num % 111 == 0){
                counter++;
            }
        }
        System.out.println("Done");
    }
}

class Ex12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++){
            int iter = i;
            if (i % 7 == 0 || String.valueOf(i).contains("7")){
                System.out.println("BOOM!");
            } else {
                System.out.println(i);
            }

        }
    }
}

class Ex13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        Integer lastDigit = null;
        while (counter < 2){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (lastDigit != null && num - 1 == lastDigit){
                counter++;
            } else {
                counter = 0;
            }
            lastDigit = num;
        }

        System.out.println("Done!");
    }
}

class Ex14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            for (int k = 0; k < num; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Ex15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            for (int k = 0; k < num; k++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

class Ex16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            for (int k = 0; k < num; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Ex17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i < num+1; i++){
            for (int k = 0; k < i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Ex18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num % 2 == 0){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        for (int i = 1; i < num+1; i++){
            for (int k = 0; k < i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
        for (int j = num-1; j > 0; j--){
            for (int l = 0; l < j; l++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// not done!
class Ex19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num % 2 == 0){
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }

        for (int i = 1; i < num+1; i += 2){
            int help1 = num - i;
            int help2 = help1/2;
            for (int j = help2; j > 0; j--){
                System.out.print(" ");
            }
            for (int l = i; l > 0; l--){
                System.out.print(i);
            }
            for (int u = help2; u > 0; u--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class Ex20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me row count: ");
        int rowCount = sc.nextInt();
        System.out.println("Give me length count: ");
        int lengthCount = sc.nextInt();


        for (int i = 0; i < lengthCount; i++){
            if (i == 0 || i == lengthCount - 1){
                for (int k = 0; k < rowCount; k++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = lengthCount - 2; j > 0; j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}

class Ex21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the base of the power: ");
        int powerBase = sc.nextInt();
        System.out.println("Give me the exponent of the power: ");
        int powerExponent = sc.nextInt();
        int sum = powerBase;
        for (int i = 0; i < powerExponent-1; i++){
            sum *= powerBase;
        }
        System.out.println("The sum of you numbers in power is: " + sum);
    }
}

class Ex22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 1;
        for (int i = 2; i <= num; i++){
            sum *= i;
        }
        System.out.println("You number is: " + sum);
    }
}

class Ex23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the gap between the numbers: ");
        int gap = sc.nextInt();
        System.out.println("Enter the list length you want: ");
        int length = sc.nextInt();
        for (int i = 0; i <length; i++){
            System.out.print((i * gap) + firstNumber + " ");
        }
    }
}