package Year1.Semester1.Lesson12;

import java.util.Random;

public class Exe1 {
    public static int[] switchArray(int number){
        Random rnd = new Random();
        int[] array = new int[number];
        array[0] = rnd.nextInt(1,10);
        for (int i = 1; i < array.length; i++) {
            int randomNumber;
            if (i == 1){
                randomNumber = rnd.nextInt(1,10);
                if (array[i - 1] > randomNumber || array[i - 1] < randomNumber){
                    array[i] = randomNumber;
                }
            } else {
                while (true){
                    randomNumber = rnd.nextInt(1,10);
                    if (array[i - 2] > array[i - 1] && array[i - 1] < randomNumber){
                        array[i] = randomNumber;
                        break;
                    } else {
                        if (array[i - 2] < array[i - 1] && array[i - 1] > randomNumber){
                            array[i] = randomNumber;
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static boolean isSwitchArray(int[] array){
        for (int i = 2; i < array.length; i+=2) {
            if (array[0] > array[1]){
                if (array[i - 1] > array[i]){
                    return false;
                }
            }
            if (array[0] < array[1]){
                if (array[i - 1] < array[i]){
                    return true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = switchArray(9);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int[] array2 = {9 ,3 ,5 ,4 ,8 ,4 ,5 ,3 ,4};
        System.out.println(isSwitchArray(array2));
    }
}
