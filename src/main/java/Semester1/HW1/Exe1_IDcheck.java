package Semester1.HW1;

import java.time.Year;
import java.util.Scanner;
import java.util.Random;


public class Exe1_IDcheck {
    public static boolean isValidId(int id){
        int counter  = 0;
        for (int i = 8; i >= 0; i--) {
            int num = id % 10;
            if (i % 2 == 0){
                counter += num;
            } else {
                num *= 2;
                if (num > 9){
                    counter += (num % 10) + (num / 10);
                } else counter += num;
            }
            id /= 10;
        }
        if (id > 0) return false;
        if (counter % 10 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an ID number: ");
            int id = sc.nextInt();
            System.out.println(isValidId(id));
        }
    }
}

class Exe2_Wordle {

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



