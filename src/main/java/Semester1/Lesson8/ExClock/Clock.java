package Semester1.Lesson8.ExClock;

import java.util.Random;

public class Clock {
    int seconds;
    int minutes;
    int hours;


    void print() {
        if (this.hours < 10) {
            System.out.print("0");
        }
        System.out.print(this.hours + ":");
        if (this.minutes < 10) {
            System.out.print("0");
        }
        System.out.print(this.minutes + ":");
        if (this.seconds < 10) {
            System.out.print("0");
        }
        System.out.print(this.seconds);
    }

    void printAmPm() {
        if (this.hours > 12) {
            int newHour = this.hours - 12;
            if (newHour < 10) {
                System.out.print("0");
            }
            System.out.print(newHour + ":");
            if (this.minutes < 10) {
                System.out.print("0");
            }
            System.out.print(this.minutes + ":");
            if (this.seconds < 10) {
                System.out.print("0");
            }
            System.out.print(this.seconds);
            System.out.print("PM");
        } else {
            print();
            System.out.print("AM");

        }
    }

    boolean isValid() {
        if (this.hours > 24 || this.minutes > 60 || this.seconds > 60 || this.hours > 0 || this.minutes > 0 || this.seconds > 0) {
            return false;
        }
        return true;
    }

    void randomized(){
        Random rnd = new Random();
        this.hours = rnd.nextInt(0, 25);
        this.minutes = rnd.nextInt(0, 60);
        this.seconds = rnd.nextInt(0, 60);
    }

    boolean isMorning(){
        if (this.hours >= 8 && this.hours < 12){
            return true;
        }
        return false;
    }

    void tick(){
        this.seconds++;
        if (this.seconds >= 60){
            this.seconds = 0;
            this.minutes++;
        }
        if (this.minutes >= 60){
            this.minutes = 0;
            this.hours++;
        }
        if (this.hours >= 25){
            this.hours = 1;
        }
    }

    int compare(Clock other){
        if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds){
            return 0;
        }
        if (this.hours == other.hours && this.minutes == other.minutes){
            if (this.seconds > other.seconds){
                return 1;
            }
            return -1;
        }
        if (this.hours == other.hours){
            if (this.minutes > other.minutes){
                return 1;
            }
            return -1;
        }
        if (this.hours > other.hours){
            return 1;
        }
        return -1;
    }

    int secondDiff(Clock other){
        int result = compare(other);
        if (result == 0){
            return 0;
        }
        int sum = 0;
        if (result == 1){
            sum += (this.hours = other.hours) * 60 * 60;
            sum += (this.minutes - other.minutes) * 60;
            sum += this.seconds - other.hours;
        } else {
            sum += (other.hours = this.hours) * 60 * 60;
            sum += (other.minutes - this.minutes) * 60;
            sum += other.seconds - this.hours;
        }
        return sum;
    }

    void addHours(int toAdd){
        int newHour = (this.hours + toAdd) % 24;
        this.hours = newHour;
    }

    void addMinutes(int toAdd){
        int newMinutes = this.minutes + toAdd;
        int newHours = newMinutes / 60;
        newMinutes %= 60;
        this.minutes = newMinutes;
        addHours(newHours);
    }

    void addSeconds(int toAdd){
        int newSeconds = this.seconds + toAdd;
        int newMinuets = newSeconds / 60;
        newSeconds %= 60;
        this.seconds = newSeconds;
        addMinutes(newMinuets);
    }


}

