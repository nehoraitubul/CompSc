package Semester1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class functions {
    public static boolean allNumAbove10(int num1, int num2, int num3){
        if (num1 > 9 && num2 > 9 && num3 > 9){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(allNumAbove10(num1, num2, num3));
    }
}

class Ex2{
    public static boolean dividedBy(int num1, int num2){
        if(num1 % num2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(dividedBy(num1, num2));

    }
}

class Ex3{
    public static boolean isTrue(int num1, int num2, int num3){
        int sum = 0;
        if (num1 > 0) sum += 1;
        if (num2 > 0) sum += 1;
        if (num3 > 0) sum += 1;
        if (sum >= 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(isTrue(num1, num2, num3));
    }
}

class Ex4{
    public static void printNumNumbers(int num){
        Random rnd = new Random();
        System.out.println("You random numbers are: ");
        for (int i = 0; i < num; i++) {
            System.out.print(rnd.nextInt(num) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printNumNumbers(num);

    }
}

class Ex5{
    public static int printHighestNum(int num){
        Scanner sc = new Scanner(System.in);
        Integer highestNum = null;
        System.out.println("Enter " + num + " numbers: ");
        for (int i = 0; i < num; i++) {
            int num1 = sc.nextInt();
            if (highestNum != null && highestNum > num1){

            } else {
                highestNum = num1;
            }
        }
        return highestNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(printHighestNum(num));
    }
}

class Ex6{
    public static boolean isAvgGreaterThan60(int totalStudents){
        Scanner sc = new Scanner(System.in);
        int gradeSum = 0;
        System.out.println("Enter the students grades: ");
        for (int i = 0; i < totalStudents; i++) {
            gradeSum += sc.nextInt();
        }
        if (gradeSum/totalStudents > 60){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much students: ");
        int totalStudents = sc.nextInt();
        System.out.println(isAvgGreaterThan60(totalStudents));
    }
}

class Ex7{
    public static void randomNumbers(int num){
        Random rnd = new Random();
        int counter = num;
        while (counter > 0){
            int rnadomNumber = rnd.nextInt(0, 1001);
            if (rnadomNumber % num == 0){
                System.out.println(rnadomNumber);
                counter --;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        randomNumbers(num);
    }
}

class Ex8{
    public static boolean isAvgInNums(float num1, float num2, float num3, float num4){
        float avg = (num1+num2+num3+num4)/4f;
        if (avg == num1 || avg == num2 || avg == num3 || avg == num4){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        System.out.println(isAvgInNums(num1, num2, num3, num4));
    }
}

class Ex9{
    public static int highestNumber(){
        Scanner sc = new Scanner(System.in);
        int highestNum = Integer.MIN_VALUE;
        int num;
        System.out.println("Enter numbers, to stop enter 0. ");
        do {
            num = sc.nextInt();
            if (num > highestNum){
                highestNum = num;
            }
        } while (num != 0);
        return highestNum;
    }

    public static void main(String[] args) {
        System.out.println(highestNumber());
    }
}

class Ex10{
    public static void mpTable(int size){
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < size+1; j++) {
                System.out.print("\t" + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        mpTable(num);
    }
}

class Ex11{
    public static boolean isOneDigit(int num){
        if (num < 9 && num > -1){
            return true;
        }
        return false;
    }

    public static boolean isDigitInNum(int num, int digit){
        while (num != 0){
            if (num % 10 == digit){
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isOneDigit = false;
        int digit;
        do{
            System.out.println("Enter a digit: ");
            digit = sc.nextInt();
            isOneDigit = isOneDigit(digit);
        } while (!isOneDigit);

        System.out.println("Enter 1 more number ");
        int num2 = sc.nextInt();
        boolean digitInNum = isDigitInNum(num2, digit);
        if (digitInNum){
            System.out.println("The digit inside the number!");
        } else {
            System.out.println("The digit not in the number!");
        }
    }
}

class Ex12{
    public static int threePositiveNumbers(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a positive number");
            int num = sc.nextInt();
            if (num > 0){
                return num;
            }
        }
    }

    public static boolean isMovingUpNumbers(int num1, int num2, int num3){
        int gap = num2 - num1;
        if(num3 - num2 == gap){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = threePositiveNumbers();
        num2 = threePositiveNumbers();
        num3 = threePositiveNumbers();

        boolean isMovingUp = isMovingUpNumbers(num1, num2, num3);

        if (isMovingUp){
            System.out.println("You got it!");
        } else {
            System.out.println("You got it wrong!");
        }
    }
}

class Ex13{
    public static boolean NumberOfDigits(int num){
        int counter = 0;
        while (num != 0){
            num = num / 10;
            counter ++;
        }
        if (counter % 2 == 0){
            return false;
        }
        return true;
    }

    public static int numberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number with odd digits: ");
        int num = sc.nextInt();
        return num;
    }

    public static int middleNumber(int num){
        int counter = 0;
        int checkNum = num;
        while (checkNum != 0){
            checkNum = checkNum / 10;
            counter ++;
        }
        for (int i = 0; i < counter/2; i++) {
            num = num / 10;
        }
        return num % 10;
    }

    public static void main(String[] args) {
        int number = 0;
        boolean isTrue = false;
        while (!isTrue){
            number = numberFromUser();
            if (NumberOfDigits(number)){
                isTrue = true;
            }
        }
        System.out.println(middleNumber(number));
    }
}

class Ex14{
    public static int level(){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Please choose you level 1 for easy, 2 for medium, 3 for hard, 0 for surprise level.");
        int num = sc.nextInt();
        while (num > 3 || num < 0){
            System.out.println("Wrong number, please choose again! ");
            System.out.println("1 for easy, 2 for medium, 3 for hard, 0 for surprise level.");
            num = sc.nextInt();
        }
        if (num == 0){
            return rnd.nextInt(5, 26);
        } else if (num == 1) {
            return 20;
        } else if (num == 2) {
            return 15;
        } else {
            return 10;
        }

    }

    public static int randomCode(){
        Random rnd = new Random();
        int num = rnd.nextInt(1, 7)*1000;
        int counter = 100;
        while (counter > 0){
            int digit = rnd.nextInt(1, 7);
            if(!isDigitInsideNum(digit, num)){
                num += counter*digit;
                counter /= 10;
            }
        }
        return num;
    }

    public static boolean isDigitDuplicates(int num){
        for (int i = 0; i < 3; i++) {
            int digit = num % 10;
            num /= 10;
            int helpNum = num;
            while (helpNum != 0){
                if (helpNum % 10 == digit){
                    return false;
                }
                helpNum /= 10;
            }
        }
        return true;
    }

    public static boolean isDigitInRange(int num) {
        while (num != 0) {
            for (int i = 0; i < 4; i++) {
                int digit = num % 10;
                if (digit < 1 || digit > 6) {
                    return false;
                }
                num /= 10;
            }
        }
        return true;
    }


    public static boolean isDigitInsideNum(int digit, int num){
        while (num != 0){
            if (num % 10 == digit){
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }

    public static boolean isUserPassIs4Digits(int num){
        int counter = 0;
        while (num != 0){
            num /= 10;
            counter ++;
        }
        if (counter == 4){
            return true;
        }
        return false;
    }

    public static boolean isDigitInSamePlaceAsNumber(int digit, int index, int num){
        for (int i = 0; i < 4; i++) {
            if (num % 10 == digit){
                if (i == index){
                    return true;
                }
                return false;
            }
            num /= 10;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = randomCode();
//        System.out.println("The code is: " + num);
        int tryNumber = level();

        while (tryNumber > 0){
            System.out.println("Enter 4 digit try: ");
            int userCodeTry = sc.nextInt();
            if (!isUserPassIs4Digits(userCodeTry)){
                tryNumber--;
                System.out.println("You lost 1 attempt");
                System.out.println("You entered more than 4 digits code. Try again!");
            } else if (!isDigitDuplicates(userCodeTry)) {
                tryNumber -= 2;
                System.out.println("You lost 2 attempt");
                System.out.println("You entered a duplicate digit in you code. Try again!");
            } else if (!isDigitInRange(userCodeTry)){
                tryNumber--;
                System.out.println("You lost 1 attempt");
                System.out.println("Once or more of you digits are not in range 1-6. Try again!");
            }
            else {
                int exactly = 0;
                int half = 0;
                for (int i = 0; i < 4; i++) {
                    int currentDigit = userCodeTry % 10;
                    if (isDigitInsideNum(currentDigit, num)){
                        if (isDigitInSamePlaceAsNumber(currentDigit, i, num)){
                            exactly++;
                        } else half++;
                    }
                    userCodeTry /= 10;

                }
                if (exactly == 4){
                    System.out.println("BOOM! You got it!");
                    break;
                }
                System.out.println("You had " + exactly + " Digits in the right place.");
                System.out.println("AND");
                System.out.println("You had " + half + " right digits but in the wrong place.");
                tryNumber--;

            }

            System.out.println("You have left " + tryNumber + " attempts.");

        }
        if (tryNumber == 0){
            System.out.println("You out of tries!");
            System.out.println("The right code was: " + num);
            System.out.println("Maybe next time :D");
        }

    }
}