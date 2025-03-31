package Semester1.Lesson11.JavaPrepExam;

public class Try {
    public static int factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num -1);
    }

    public static int notRecurctionFactorial(int num){
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(notRecurctionFactorial(5));
    }
}
