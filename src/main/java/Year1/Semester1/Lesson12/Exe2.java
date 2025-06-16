package Year1.Semester1.Lesson12;

public class Exe2 {
    public static boolean isEasyPassword(int password){
        int counter = 1;
        int temp = password % 10;
        int lastDigit = password % 10;
        boolean isUp = false;
        boolean isDown = false;
        while (temp != 0){
            if (temp % 10 == lastDigit){
                counter++;
            } else {
                lastDigit = temp % 10;
                counter = 1;
            }
            if (counter == 3){
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 65357774;
        System.out.println(isEasyPassword(num));
    }
}
