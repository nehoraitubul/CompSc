package Year1.Semester1.Lesson2;

import java.util.Random;
import java.util.Scanner;

public class IfElseExercises {
    public static void main(String[] args) {

    }
}

class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 prices: ");
        int price1 = sc.nextInt();
        int price2 = sc.nextInt();
        int price3 = sc.nextInt();
        int sum = price3 + price2 + price1;
        if (sum > 500) {
            if (sum > 550) {
                System.out.println("Your price is: " + (sum * 0.9));
            } else {
                System.out.println("Your price is: 500");
            }
        } else {
            System.out.println("Your price is: " + sum);
        }
    }
}

class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        if (firstNum - secondNum == secondNum - thirdNum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Young");
        } else {
            System.out.println("Adult");
        }
    }
}

class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Young");
        } else if (age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }
    }
}

class Ex6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1001);
        System.out.println("Your number is: " + num);
        if (num % 3 == 0) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}

class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int grade = sc.nextInt();
        if (grade < 70) {
            System.out.println("Hard");
        } else if (grade > 90) {
            System.out.println("Easy");
        } else {
            System.out.println("Medium");
        }
    }
}

class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("OK");
            }
        }
    }
}

class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car maximum gas storage: ");
        int carGasStorage = sc.nextInt();
        System.out.println("Enter the car current gas storage: ");
        int currentGas = sc.nextInt();
        if ((carGasStorage * 0.15) > currentGas) {
            System.out.println("You have to fill gas now!");
        } else if ((carGasStorage * 0.5) > currentGas) {
            System.out.println("It is recommended to fill gas");
        } else {
            System.out.println("No need to fill gas");
        }
    }
}

class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(6);
        int num2 = rand.nextInt(6);
        int num3 = rand.nextInt(6);
        System.out.println(" The numbers are: " + num1 + ", " + num2 + ", " + num3);
        if (num2 - num1 == num3 - num2) {
            System.out.println("It is!");
        } else {
            System.out.println("Its not!");
        }
    }
}

class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        if (num > 10) {
            sum = (num % 10) + (num / 10);
            System.out.println("Your new number is: " + sum);
        }
    }
}

class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 / 100 > 0 && num2 / 100 > 0 && num3 / 100 > 0) {
            if ((num1 > num2 && num2 > num3) || (num1 < num2 && num2 < num3)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}

class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base salary: ");
        int baseSalary = sc.nextInt();
        System.out.println("Enter the sells target: ");
        int sellTarget = sc.nextInt();
        System.out.println("Enter how much you sell this month: ");
        int totalSells = sc.nextInt();
        if (totalSells > sellTarget) {
            System.out.println("You salary this month is: " + (baseSalary * 1.75));
        } else if (totalSells > (sellTarget * 0.5)) {
            System.out.println("Your salary this month is: " + (baseSalary + 2000));
        } else {
            System.out.println("Your salary is: " + baseSalary);
        }
    }
}

class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            int randNum1 = rand.nextInt(6);
            int randNum2 = rand.nextInt(6);
            int randNum3 = rand.nextInt(6);
            int finalNum;
            if (randNum1 == randNum2 && randNum2 == randNum3) {
                if (randNum1 == 7) {
                    int bonus = rand.nextInt(6);
                    finalNum = (num * 4 * bonus);
                } else {
                    finalNum = (num * 4);
                }
            } else if (randNum1 == randNum2 || randNum1 == randNum3 || randNum2 == randNum3) {
                finalNum = num * 2;
            } else {
                finalNum = num;
            }
            System.out.println("The random numbers are: " + randNum1 + ", " + randNum2 + ", " + randNum3);
            System.out.println("Your payback is: " + finalNum);
        } else {
            System.out.println("Wrong number!");
        }
    }
}

class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter the distance of the flight: ");
        int distance = sc.nextInt();
        System.out.println("Enter the max capacity of the plane: ");
        int maxCapacity = sc.nextInt();
        System.out.println("Enter the number of passangers in the flight");
        int passangers = sc.nextInt();
        int weather = rnd.nextInt(2);
        String weatherType = (weather == 0) ? "comfy" : "stormy";

        int sum;
        if (distance > 200){
           distance -= 200;
           sum = (int) (distance * 1.2) + 350;
        } else if (distance > 100) {
            distance -= 100;
            sum = (int) (distance * 1.5) + 200;
        } else {
            sum = (int) (distance * 2);
        }

        if (weather == 1){
            sum *= 2; // sum = sum * 2;
        }

        if (maxCapacity == passangers){
            sum *= 0.9;
        } else if (maxCapacity * 0.9 <= passangers) {
            sum *= 0.95;
        }

        System.out.println("The weather in the flight time is: " + weatherType);
        System.out.println("The price of your ticket is: " + sum);

    }
}