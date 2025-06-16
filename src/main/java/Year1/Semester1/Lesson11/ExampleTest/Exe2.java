package Year1.Semester1.Lesson11.ExampleTest;

public class Exe2 {
    public static int calculateSquareRoot(int number){
        int returnNum = -1;
        for (int i = 0; i < number; i++) {
            if (i * i == number){
                returnNum = i;
                break;
            }
            if (i * i > number){
                returnNum = i - 1;
                break;
            }
        }
        return returnNum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSquareRoot(1));
    }
}
