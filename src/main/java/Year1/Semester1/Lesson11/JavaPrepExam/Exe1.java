package Year1.Semester1.Lesson11.JavaPrepExam;

public class Exe1 {
    public static boolean isXCopyArray(int[] array, int x){
        int num = array.length / x;
        int j = 0;
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            if (j == num){
                j = 0;
                counter++;
            }
            if (array[j] != array[i]){
                return false;
            }
            j++;
        }
        if (counter == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {4,7,1,4,7,1,4,7,1,4,7,1};
        System.out.println(isXCopyArray(array, 4));
    }
}
