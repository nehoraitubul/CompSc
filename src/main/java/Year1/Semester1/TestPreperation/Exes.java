package Year1.Semester1.TestPreperation;

import java.util.Arrays;

public class Exes {
    public static boolean func1(int[] array){
        if (array.length == 0){
            return false;
        }
        int diff = array[1] - array[0];
        for(int i = 0; i < array.length-1; i++){
            if ((array[i+1] - array[i]) != diff){
                return false;
            }
        }
        return true;
    }

    public static boolean func1b(int[] arr){
        if (arr.length == 0){
            return false;
        }
        int diff = arr[1] - arr[0];
        for(int i = 0; i < arr.length-1; i++){
            if ((arr[i+1] - arr[i]) != diff && ((arr[i+1] - arr[i])*-1) != diff){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {0,4,8, 4};
        System.out.println(func1b(arr));
    }
}

class Exe2{
    public static int[] func2(int[] arr1, int[] arr2, int num){
        int firstArr = 0;
        int secondArr = 0;
        for(int i = 0; i < arr1.length; i++){
            if (numberCounter(arr1[i]) == num){
                firstArr++;
            }
        }
        for(int i = 0; i < arr2.length; i++){
            if(numberCounter(arr2[i]) == num){
                secondArr++;
            }
        }
        int[] biggest;
        int size = 0;
        if(firstArr > secondArr){
            biggest = arr1;
            size = firstArr;
        } else {
            biggest = arr2;
            size = secondArr;
        }
        int[] result = new int[size];
        int index = 0;
        for(int i = 0; i < biggest.length; i++){
            if(numberCounter(biggest[i]) == num){
                result[index] = biggest[i];
                index++;
            }
        }
        return result;
    }

    public static int numberCounter(int num){
        int counter = 0;
        while (num != 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = {44,543,12,53,6834,12,6544,123};
        int[] arr2 = {4332,76128,1,8768,6544,123};
        int[] result = func2(arr1, arr2, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Ex3{
    public static boolean isZigZagArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0){

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isZigZagPart(int[] arr, int num){
        int counter = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0){
                counter++;
                if (counter == num){
                    return true;
                }
            } else {
                counter = 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, -2, -1, 12, -2, -1};
        System.out.println(isZigZagArray(arr));
        System.out.println(isZigZagPart(arr, 3));
    }
}

class Ex4{
    public static int mostCommonNoExist(int[] arr1, int[] arr2){
        int mostCommonNum = arr1[0];
        int mostCommonCounter = 0;
        for(int i = 0; i < arr1.length; i++){
            int counter = 0;
            boolean isExist = false;
            for(int k = 0; k < arr2.length; k++){
                if(arr2[k] == arr1[i]){
                    isExist = true;
                }
            }
            if (!isExist){
                for(int j = 0; j < arr1.length; j++){
                    if(arr1[j] == arr1[i]){
                        counter++;
                    }
                }
                if(counter > mostCommonCounter){
                    mostCommonCounter = counter;
                    mostCommonNum = arr1[i];
                }
            }
        }
        return mostCommonNum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,8,3,7,1,3,6,2,7,1,6,7,1,7,8,1,2,1,5,7,7,1,1,3};
        int[] arr2 = {1,6,2};
        System.out.println(mostCommonNoExist(arr1, arr2));
    }
}

class Ex5{
    public static boolean isCoupleArray(int[] arr){
        int sum = 0;
        if(arr.length % 2 == 0 && arr.length >= 2){
            sum = arr[0] + arr[1];
        } else {
            return false;
        }
        for(int i = 0; i < arr.length; i+=2){
            if(arr[i] + arr[i+1] != sum){
                return false;
            }
        }
        return true;
    }

    public static boolean isPartCoupleArray(int[] arr){
        int sum = 0;
        if(arr.length % 2 == 0 && arr.length >= 2){
            sum = arr[0] + arr[1];
        } else {
            return false;
        }
        int counter = 0;
        for(int i = 0; i < arr.length; i+=2){
            if(arr[i] + arr[i+1] == sum){
                counter++;
            }
        }
        if(counter > arr.length/2/2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,3,12,10,5};
        System.out.println(isCoupleArray(arr));
        System.out.println(isPartCoupleArray(arr));
    }
}

class Ex6{
    public static char mostCommonCharInAraay(String[] arr){
        char mostCommonChar = arr[0].charAt(0);
        int mostCommonCounter = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                int counter = 0;
                for(int k = 0; k < arr.length; k++){
                    for(int h = 0; h < arr[k].length(); h++){
                        if(arr[i].charAt(j) == arr[k].charAt(h)){
                            counter++;
                        }
                    }
                }
                if(counter > mostCommonCounter){
                    mostCommonCounter = counter;
                    mostCommonChar = arr[i].charAt(j);
                }
            }
        }
        return mostCommonChar;
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bba", "cbbb", "cc", "abbbb", "cccccccccc"};
        System.out.println(mostCommonCharInAraay(arr));
    }
}

class Ex7{
    public static String[] reverseArray(String[] arr){
        String[] result = new String[arr.length];
        int index = 0;
        for(int i = arr.length-1; i >= 0; i--){
            result[i] = arr[index];
            index++;
        }
        return result;
    }

    public static boolean isReverseDuo(String[] arr1, String[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        String[] result = reverseArray(arr1);
        for(int i = 0; i < result.length; i++){
            if(result[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "fig"};
        String[] arr2 = {"fig", "date", "cherry", "banana", "apple"};
        String[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(isReverseDuo(arr, arr2));

    }
}

class Ex8{
    public static boolean isProxomityArray(int[] arr, int max){
        for(int i = 0;i < arr.length - 2; i++){
            if(Math.abs(arr[i] - arr[i+2]) > max){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,11,7,12,9,10,13,16,12,8,13,10};
        System.out.println(isProxomityArray(arr, 7));
    }
}

class Ex9{
    public static char mostCommonLastChar(String[] arr){
        if (arr.length == 0){
            return ' ';
        }
        char mostCommonChar = arr[0].charAt(arr[0].length() - 1);
        int mostCommonCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].charAt(arr[i].length() - 1) == arr[j].charAt(arr[j].length() - 1)){
                    counter++;
                }
            }
            if (counter > mostCommonCounter){
                mostCommonCounter = counter;
                mostCommonChar = arr[i].charAt(arr[i].length() - 1);
            }
        }
        return mostCommonChar;
    }

    public static void main(String[] args) {
        String[] arr = {"asc", "ascc", "asccc", "ascff","ascf","ascf","ascf"};
        System.out.println(mostCommonLastChar(arr));
    }
}

class Ex10{
    public static int circulateArray(int[] arr, int num){
        if (num > 0){
            return arr[num % arr.length];
        }
        return arr[((num % arr.length) + arr.length)% arr.length];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(circulateArray(arr, -4));
    }
}

class Ex11{
    public static int[] binaryArray(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return new int[0];
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]){
                result[i] = 1;
            } else if (arr1[i] < arr2[i]) {
                result[i] = -1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,7,9,1,6,4,3,8};
        int[] arr2 = {4,6,9,9,2,1,0,1};
        int[] res = binaryArray(arr1, arr2);
        System.out.println(res);
    }
}

class Ex12{
    public static boolean isPrimary(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void allKafulNumbers(int num){
        if (num < 2){
            return;
        }
        int temp = num;
        for (int i = 2; i < num; i++) {
            if (isPrimary(i)){
                while (temp % i == 0){
                    System.out.print(i + "*");
                    temp /= i;
                }
            }
        }
        System.out.print("=" + num);
    }

    public static void main(String[] args) {
        System.out.println(isPrimary(3));
        allKafulNumbers(12600);
    }
}

class Ex13{
    public static boolean isPalindrom(String text){
        int start = 0;
        int end = text.length() - 1;
        while (start < end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("רבע הלילה עבר"));
    }
}

class Ex14{
    public static boolean isUpNumbers(int num){
        if (num < 100 || num > 999){
            return false;
        }
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        if ((hundreds+1 == tens && tens+1 == ones) || (ones+1 == tens && tens+1 == hundreds)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUpNumbers(123));
    }
}

class Ex15{
    public static int[] sumOfArrays(int[] arr1, int[] arr2){
        int[] bigger = arr1;
        int[] smaller = arr2;
        if (arr2.length > arr1.length){
            bigger = arr2;
            smaller = arr1;
        }
        int[] result = new int[bigger.length];
        for (int i = 0; i < result.length; i++) {
            if (i > smaller.length-1){
                result[i] = bigger[i];
            } else {
                result[i] = (bigger[i] + smaller[i]) / 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5};
        int[] res = sumOfArrays(arr1, arr2);
        System.out.println();
    }
}

class Ex16{
    public static String func17(String str){
        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char tempUp = arr[i].toUpperCase().charAt(0);
            char tempDown = arr[i].toLowerCase().charAt(0);
            if (result.length() == 0){
                result += arr[i].charAt(0);
            }
            boolean isExist = false;
            for (int j = 0; j < result.length(); j++) {
                char temp = result.charAt(j);
                if (temp == tempDown || temp == tempUp){
                    isExist = false;
                    break;
                } else {
                    isExist = true;
                }
            }
            if (isExist){
                result += arr[i].charAt(0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "I want it, I got it";
        System.out.println("func:" + func17(str));
    }
}

class Ex17{
    public static boolean canProduce(int[] numbers, int goal){
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] + numbers[i+1] == goal){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,12,4,5};
        System.out.println(canProduce(arr, 16));
    }
}

class Ex18{
    public static boolean isAnagram(String text1, String text2){
        if (text1.length() != text2.length()){
            return false;
        }
        String text1res = text1;
        String text2res = text2;
        for (int i = 0; i < text1.length(); i++) {

            text1res = text1res.replaceFirst(text1.charAt(i)+"", "");
            text2res = text2res.replaceFirst(text1.charAt(i)+"", "");
        }
        if (text1res.equals(text2res)){
            return true;
        }
        return false;
    }

    public static boolean halfAnagram(String text1, String text2){
        if (text1.length() == text2.length()){
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (!text2.contains(text1.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abac";
        String s2 = "baacaa";
        System.out.println(isAnagram(s1,s2));
        System.out.println(halfAnagram(s1,s2));
    }
}

class Ex19{
    public static boolean isPrime(int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void func18(int num){
        if (!isPrime(num)){
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0){
                    System.out.println(i + " * " + (num/i));
                }
            }
        } else {
            System.out.println("NOO");
        }
    }

    public static void main(String[] args) {
        func18(18);
    }
}

class Ex20{
    public static void func20(String str){
        str = str.replace(" ", "");
        str = str.toUpperCase();
        String strUnique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!strUnique.contains(str.charAt(i)+"")){
                strUnique += str.charAt(i);
            }
        }

        for (int i = 0; i < strUnique.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == strUnique.charAt(i)){
                    counter++;
                }
            }
            System.out.println(strUnique.charAt(i) + "-" + counter);
        }
    }

    public static void main(String[] args) {
        func20("Hello, this is a java string");
    }
}

class Ex27{
    public static String func27(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i)+"")){
                unique += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < unique.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == unique.charAt(i)){
                    counter++;
                }
            }
            result += unique.charAt(i) +"" + counter;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(func27("Hello"));
    }
}

class Ex28{

    public static boolean triangleString(String str){
        //str1 = ABC
        //str2 = CAB
        if (str.length() % 3 == 0){

            String str1 = str.substring(0,3);
            if (str1.charAt(0) != str1.charAt(1) && str1.charAt(0) != str1.charAt(2) && str1.charAt(1) != str1.charAt(2)){

                for (int i = 3; i < str.length(); i+=3) {
                    if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2) && str.charAt(i+1) == str.charAt(i+2)){
                        String str2 = str.substring(i, i+3);
                        for (int j = 0; j < str1.length(); j++) {
                            if (!str2.contains(str1.charAt(j)+"")){
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ABCCBABAC";
        String s2 = "ABCCBABAC";
        System.out.println(triangleString(s1));

    }
}

class Ex29{
    public static int[] h(int[] nums){
        int rightNum = nums[nums.length - 1];
        int[] temp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            temp[i] = nums[i-1];
        }
        temp[0] = rightNum;
        return temp;
    }

    public static int[] s(int[] nums, int n){
        int[] ans = nums;
        for (int i = 0; i < n; i++) {
            ans = h(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] fds = {10,20,30,40};
        h(fds);
        s(fds, 2);
    }
}