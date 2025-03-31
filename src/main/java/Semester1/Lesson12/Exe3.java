package Semester1.Lesson12;

public class Exe3 {
    public static String[] arrayOfStrings(int number, String[] array){
        String[] newArray = new String[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == number){
                String[] temp = new String[newArray.length + 1];
                for (int j = 0; j < newArray.length; j++) {
                    temp[j] = newArray[j];
                }
                temp[temp.length - 1] = array[i];
                newArray = temp;
            }
        }
        return newArray;
    }

    public static char mostCommonChar(int number, String[] array){
        String[] newArray = arrayOfStrings(number, array);
        char mostCommonChar = newArray[0].charAt(0);
        int mostCommonCounter = 0;
        for (int i = 0; i < newArray.length; i++) {
            char currentChar = newArray[i].charAt(0);
            int currentCounter = 0;

            for (int j = 0; j < newArray.length; j++) {
                if (newArray[j].charAt(0) == currentChar){
                    currentCounter++;
                }
            }
            if (currentCounter > mostCommonCounter){
                mostCommonCounter = currentCounter;
                mostCommonChar = newArray[i].charAt(0);
            }
        }
        return mostCommonChar;
    }

    public static void main(String[] args) {
        String[] array = {"dsf", "fdd", "dfdfdfd", "df", "dfd", "fdfdfd","fdf", "fff"};
        int num = 3;
        String[] array2 = arrayOfStrings(num, array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(mostCommonChar(num, array));
    }
}
