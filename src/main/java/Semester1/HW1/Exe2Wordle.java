package Semester1.HW1;

import java.util.Random;
import java.util.Scanner;

public class Exe2Wordle {

    public static String getRandomWord(){
        Random rnd = new Random();
        String[] words = {
                "smoke", "grape", "beach", "house", "light", "chair", "blink", "frost", "heart", "plant",
                "smile", "grasp", "bread", "cloud", "paper", "grass", "flame", "brick", "river", "storm"
        };
        return words[rnd.nextInt(words.length)];

    }

    public static String playerGuessAnswer(String word, String gameWord){
        String wordInLowerCase = word.toLowerCase();
        String answer = "";
        for (int i = 0; i < wordInLowerCase.length(); i++) {
            char currLetterAnswer = letterAtWord(gameWord, wordInLowerCase.charAt(i), i);
            answer += currLetterAnswer;
        }
        return answer;
    }

    public static char letterAtWord(String word, char letter, int index){
        int letterIndexInWord = word.indexOf(letter);
        if (letterIndexInWord == -1){
            return '_';
        }
        if (letterIndexInWord == index){
            return 'G';
        }
        return 'Y';
    }

    public static boolean isWinner(String finalAnswer){
        if (finalAnswer.equals("GGGGG")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String randomGameWord = getRandomWord();
        int playerTurns = 6;
        String guessAnswer = "";
        boolean winner = false;
        while (playerTurns != 0){
            System.out.println("Enter a 5 letter word: ");
            String guess = sc.next();
            if (guess.length() != 5){
                System.out.println("Your word needs to be with 5 letters.");
            } else {
                guessAnswer =  playerGuessAnswer(guess, randomGameWord);
                System.out.println(guessAnswer);
                if (isWinner(guessAnswer)){
                    winner = true;
                    break;
                }
                playerTurns--;
            }
        }

        if (winner) {
            System.out.println("Well done, you're a Wordle master!");
        } else {
            System.out.println("Oh no, so close!");
            System.out.println("The word was: " + randomGameWord);
        }
    }
}
