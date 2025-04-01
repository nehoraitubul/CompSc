package Semester2.OOP1.Lesson1;

import com.github.javafaker.Faker;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void counter(int num){
        while (num > 0){
            System.out.println(num);
            num--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        counter(num);
    }

}

class Ex2{

    public static void sumOfNums(int num1, int num2){
        int sum = num1 + num2;
        String text = "The sum of the two numbers is: " + sum;
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sumOfNums(num1,num2);
    }
}

class Ex3{

    public static void main(String[] args) {
        Random rnd = new Random();
        Faker faker = new Faker();
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = faker.name().fullName();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ":");
            String genText = faker.esports().team();
            for (int j = 0; j < genText.length(); j++) {
                System.out.print(genText.charAt(j));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println();
            int timeSleep = rnd.nextInt(400,4000);
            try {
                Thread.sleep(timeSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Ex4{

    public static void printSce(String str, String name, long date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.print(simpleDateFormat.format(date) + "  ");
        System.out.println(name + ":");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Date date = new Date();
        Random rnd = new Random();
        Faker faker = new Faker();
        long currDate;
        int[] messagesLeft = new int[4];
        String[] names = new String[4];

        for (int i = 0; i < names.length; i++) {
            names[i] = faker.funnyName().name();
            messagesLeft[i] = rnd.nextInt(5,31);
        }
        int bot = rnd.nextInt(4);
        String str = "";
        while (true){
            for (int i = 0; i < names.length; i++) {
                currDate = date.getTime();
                if (i == bot){
                    String response = faker.expression("I love ");
                    str = response + str;
                    System.out.print("*BOT* ");
                } else {
                    str = faker.shakespeare().hamletQuote();
                }
                printSce(str,names[i],currDate);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
