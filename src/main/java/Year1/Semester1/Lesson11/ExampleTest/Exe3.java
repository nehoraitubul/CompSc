package Year1.Semester1.Lesson11.ExampleTest;

public class Exe3 {
    public static int[] getAllUniqueFactors(int number){
        int[] answer = new int[0];
        if (number < 0){
            number = number * -1;
        }
        if (number == 0){
            return answer;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                int[] temp = new int[answer.length + 1];
                for (int j = 0; j < answer.length; j++) {
                    temp[j] = answer[j];
                }
                temp[temp.length - 1] = i;
                answer = temp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // a
        int num = -0;
        int[] ans = getAllUniqueFactors(num);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.print("]");

        // b - סיבוכיות: O(n)
    }
}
