package Year1.Semester1.Lesson1;

import java.util.Scanner;

public class ClassExe {
    public static void main(String[] args) {
        System.out.println("Give me Radius size");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double circleShetah = (radius*radius) * pi;
        double circleEkef = 2 * pi * radius;
        System.out.println(circleShetah);
        System.out.println(circleEkef);
    }
}

class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me number");
        int number = sc.nextInt();
        System.out.println("Your number is " + number);
    }
}

class Exercise2 {
    public static void main(String[] args) {

    }
}

class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        int newAge = age + 16;
        System.out.println("Your age in 2040 will be " + newAge);
    }
}

class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Width");
        int width = sc.nextInt();
        System.out.println("The perimeter of the rectangle is " + (2*length+2* width));
        System.out.println("The area of the rectangle is " + (width*length));
    }
}

class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digits make sure to hit the Enter button after each number :D");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("The average of your numbers is " + ((num1 + num2 + num3 + num4))/4F);
    }
}

class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Leg 1");
        int leg1 = sc.nextInt();
        System.out.println("Enter Leg 2");
        int leg2 = sc.nextInt();
        float pitagoras = (leg1*leg1)+(leg2*leg2);
        System.out.println(pitagoras);
        double hypo = Math.sqrt(pitagoras);
        System.out.println("The Hypo is "+ hypo);

    }
}

class Exercise9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("This is the last digit of your number "+(num%10));
    }
}

class Exercise10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println((num/10));
    }
}

class Exercise11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstNum = num / 10;
        int secondNum = num % 10;
        System.out.println("The new number is " + (firstNum + secondNum));
    }
}

class Exercise12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of seconds ");
        int userSeconds = sc.nextInt();
        int secondsInHour = userSeconds/3600;
        userSeconds = userSeconds - (secondsInHour*3600);
        int secondsInMinute = userSeconds/60;
        userSeconds = userSeconds - (secondsInMinute*60);
        int seconds = userSeconds;

        System.out.println("Number of hours: " + secondsInHour + " Number of minutes: " + secondsInMinute + " Number of second: " + seconds);
    }
}

class IfElseExercise{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int newNum = (num / 10) + (num % 10);
        if(newNum % 2 == 0){
            System.out.println("Its Odd!");
        } else {
            System.out.println("Its Even!");
        }
    }
}

class IfElseExercise2{
    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        int number = scanner.nextInt();

    }
}