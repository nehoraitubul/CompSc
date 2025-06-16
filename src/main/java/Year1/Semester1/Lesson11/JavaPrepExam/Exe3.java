package Year1.Semester1.Lesson11.JavaPrepExam;

public class Exe3 {
    public static String[] returnAllSizeStringsInArray(String[] array, int size){
        String[] answer = new String[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == size){
                String[] temp = new String[answer.length + 1];
                for (int j = 0; j < answer.length; j++) {
                    temp[j] = answer[j];
                }
                temp[temp.length-1] = array[i];
                answer = temp;
            }
        }


//        String[] answer = new String[num];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() == s ize){
//                answer[index] = array[i];
//                index++;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "clown", "student", "rabbit"};
        String[] ans = returnAllSizeStringsInArray(array, 5);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
