package Semester1.Lesson11.ExampleTest;

public class Exe1 {
    public static String removeMostCommonWord(String text){
        String newText = text.toLowerCase();
        String[] textWithHigherCase = text.split(" ");
        String[] words = newText.split(" ");
        String mostRepeatableWord = words[0];
        int mostRepeatWordCounter = 0;
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    counter++;
                }
            }

            if (counter > mostRepeatWordCounter){
                mostRepeatableWord = words[i];
                mostRepeatWordCounter = counter;
            }
        }

        String finalString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(mostRepeatableWord)){
                continue;
            }
            finalString += textWithHigherCase[i] + " ";
        }
        return finalString;
    }

    public static void main(String[] args) {
        // a
        String str = "Hello world! hello Everyone!";
        System.out.println(removeMostCommonWord(str));

        // b - סיבוכיות: O(n^2)
    }
}
