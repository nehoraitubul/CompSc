package Year1.Semester1.Lesson11.ExampleTest;

public class Exe4 {
    public static void reverseArray(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int leftNum = arr[i];
            int rightNum = arr[arr.length - i - 1];
            arr[i] = rightNum;
            arr[arr.length - i - 1] = leftNum;
        }
    }

    public static void main(String[] args) {
        // a
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // b - סיבוכיות: O(n)
    }
}
