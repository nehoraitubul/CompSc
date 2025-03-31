package Semester1.Lesson7;

import java.util.Scanner;

public class stringsExe {
    public static boolean equalData(char[] arr1, char[] arr2){
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean contains(char[] arr, char toSearch){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toSearch){
                return true;
            }
        }
        return false;
    }

    public static int indexOf(char[] arr, char toFind){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public static boolean hasDuplicates(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            char currChar = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == currChar){
                    return true;
                }
            }
        }
        return false;
    }

    public static char[] replace(char[] arr, char original, char replacement){
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == original){
                newArr[i] = replacement;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        char[] arr1 = {'g', 'j', 'g'};
        arr1 = replace(arr1, 'g', 'k');
        System.out.println(arr1);
    }
}

class Ex1{
    public static String nameAndLastNameString(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        String firstAndLastName = nameAndLastNameString(firstName, lastName);
        System.out.println(firstAndLastName);
    }
}

class Ex2{
    public static String biggestString(String str1, String str2){
        if (str1.length() > str2.length()){
            return str1;
        }
        return str2;
    }

    public static void main(String[] args) {
        String firstString = "abcdef";
        String secondString = "abcdefg";
        System.out.println(biggestString(firstString, secondString));
    }
}

class Ex3{
    public static boolean isStringInIntLength(String str, int num){
        if (str.length() == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "dsfdstrtr";
        int strLength = 8;
        System.out.println(isStringInIntLength(str, strLength));
    }
}

class Ex4{
    public static int compareTwoStrings(String str1, String str2){
        if (str1.equals(str2)){
            return 1;
        }
        if (str1.charAt(0) == str2.charAt(0)){
            return 2;
        }
        return 3;
    }

    public static void main(String[] args) {
        String str1 = "Nehorai";
        String str2 = "Nehorai";
        System.out.println(compareTwoStrings(str1, str2));
    }
}

class Ex5{
    public static int timesCharInString(String str, char toCount){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCount){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String str = "abcdabcdabc";
        char toCount = 'd';
        System.out.println(timesCharInString(str, toCount));
    }
}

class Ex6{
    public static boolean isEquals(String str1, String str2){
        if (str1.length() == str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "abCd";
        String str2 = "abrCd";
        System.out.println(isEquals(str1, str2));
    }
}

class Ex7{
    public static String longestStringInArray(String[] arr){
        String longestString = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longestString.length()){
                longestString = arr[i];
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] strArr = {"a" , "aaa", "asfre", "fds", "dsfAArfds", "sdf", "dsfdff"};
        System.out.println(longestStringInArray(strArr));
    }
}

class Ex8{
    public static boolean isRightNumberInPlace(String str, int index){
        char[] arr = {'0', '2', '3', '4', '8'};
        if (str.charAt(index) == '5'){
            for (int i = 0; i < arr.length; i++) {
                if (str.charAt(index+1) == arr[i] ){
                    return true;
                }
            }
        }
        return false;
    }

    public static String validPhoneNumber(String str){
        String finalPhoneNum = "";
        if (str.length() >= 10 && str.length() <= 12){
            if (str.startsWith("972") && str.length() == 12){
                if (!str.contains("-")){
                    if (isRightNumberInPlace(str, 3)){
                        finalPhoneNum = str.replaceFirst("972", "0");
                    }
                }
                return finalPhoneNum;
            }
            if (str.startsWith("0") && str.length() == 10 || str.startsWith("0") && str.length() == 11){
                if (!str.contains("-")){
                    if (isRightNumberInPlace(str, 1)){
                        finalPhoneNum = str.substring(0,3) + "-" + str.substring(3);
                        System.out.println(finalPhoneNum);
                    }
                } else if (str.charAt(3) == '-'){
                    if (isRightNumberInPlace(str, 1)){
                        finalPhoneNum = str;
                        return finalPhoneNum;
                    }
                }
                return finalPhoneNum;
            }
        }
        return finalPhoneNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();
        System.out.println(validPhoneNumber(phoneNum));
    }
}

class Ex9 {
    public static String firstStringWithDollar(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                return arr[i];
            }
        }
        return "None";
    }

    public static void main(String[] args) {
        String[] arr = {"3242343432434", "2343242", "@$34324", "3434543$"};
        System.out.println(firstStringWithDollar(arr));
    }
}

class Ex10{
    public static String[] stringsThatContainsString(String[] arr, String toFind){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(toFind)){
                counter++;
            }
        }
        String[] newArr = new String[counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(toFind)){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }

    public static void printStringArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        String toFind = "Nehorai T";
        String[] arr = {"Nehorai The pro", "Neho Tubul", "Nehorai T", "Nehorai Tubul", " Nehorai g", "Nehorai t", "nehorai T"};
        String[] newArr = stringsThatContainsString(arr, toFind);
        printStringArray(newArr);
    }
}

class Ex11{
    public static String revesedString(String str){
        String newString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }


    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(revesedString(str));
    }
}

class Ex12{
    public static boolean validatePassword(String password){
        boolean isValid = false;
        if (password.length() >= 8 && password.length() <= 10){
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                    isValid = true;
                    break;
                }
            }
            if (password.contains("$") || password.contains("_") || password.contains("%")){
                isValid = true;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password, password needs to contain at least one of the following: %,$,_ , one number at least and between 8-10 chars.");
        String password = sc.next();
        System.out.println(validatePassword(password));
    }
}

class Ex13{
    public static char mostCommonCharAtStringFromArray(String str, char[] chars){
        str = str.toUpperCase();
        String charsAsString = "";
        for (int i = 0; i < chars.length; i++) {
            charsAsString += chars[i];
        }
        charsAsString = charsAsString.toUpperCase();

        char ch = str.charAt(0);
        int currCharCounter = 0;
        for (int i = 0; i < charsAsString.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == charsAsString.charAt(i)){
                    counter++;
                }
            }
            if (counter > currCharCounter){
                ch = charsAsString.charAt(i);
                currCharCounter = counter;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = "I ywiiiiiiiant itttiiccccccccccccccccccccccccccccccccccccciiiiiiiiiitttt, I got ityyyyyyyyyyiiiiiiyyyyyyyy";
        char[] chars = {'I','A','T','C','N'};
        System.out.println(mostCommonCharAtStringFromArray(str, chars));
    }
}

class Ex14{
    public static boolean isPolindrom(String str){
        str = str.toLowerCase();
        String avoid[] = {" ", "\\.", ","};
        for (int i = 0; i < avoid.length; i++) {
            str = str.replaceAll(avoid[i], "");
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Race    c.aR";
        System.out.println(isPolindrom(str));
    }
}

class Ex15{
    public static String stringOfFirstLetters(String str){
        str = str.replaceAll("\\.", "");
        str = str.replaceAll(",", "");

        String[] words = str.split(" ");

        String newString = "";
        for (int i = 0; i < words.length; i++) {
            if (!newString.contains(String.valueOf(words[i].charAt(0)).toLowerCase()) && !newString.contains(String.valueOf(words[i].charAt(0)).toUpperCase())){
                newString += words[i].charAt(0);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "I want it, I got it";
        System.out.println(stringOfFirstLetters(str));
    }
}