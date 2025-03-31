package Semester1.Lesson6;

import java.util.Scanner;

public class array2 {

    public static int[] arrayWithoutRepeatNum(int[] currNewArr, int[] arr, int num){
        for (int i : currNewArr) {
            if (i == num){
                return currNewArr;
            }
        }

        int[] newArr = new int[currNewArr.length+1];
        for (int i = 0; i < currNewArr.length; i++) {
               newArr[i] = currNewArr[i];
        }
        newArr[currNewArr.length] = num;
        return newArr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 1 ,8, 9, 2, 1, 3, 0, 1, 4, 7};
        int [] finaleArr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            finaleArr = arrayWithoutRepeatNum(finaleArr, arr, arr[i]);
        }
        printArray(finaleArr);
    }
}

class Ex2{
    public static boolean[] arrayIsEvenNumbers(int[] arr){
        boolean[] isEven = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                isEven[i] = true;
            }
            else {
                isEven[i] = false;
            }
        }
        return isEven;
    }

    public static void printBooleanArr(boolean[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 1 ,8, 9, 2, 1, 3, 0, 1, 4, 7, 11};
        boolean[] boolArr = arrayIsEvenNumbers(arr);
        printBooleanArr(boolArr);
    }
}

class Ex3{

    public static void main(String[] args) {

    }
}

class Ex4{

    public static void printBoard(char[] board){
        System.out.println("┏━━━┳━━━┳━━━┓");
        for (int i = 0; i < board.length; i++) {
            System.out.print("┃ " + (board[i] == '\u0000' ? ' ' : board[i]) + " ");

            if (i % 3 == 2) {
                System.out.println("┃");

                if (i != board.length - 1) {
                    System.out.println("┣━━━╋━━━╋━━━┫");
                }
            }
        }
        System.out.println("┗━━━┻━━━┻━━━┛");
    }

    public static boolean isAvailable(char[] board, int index){
        if (board[index] == 'X' || board[index] == 'O'){
            return false;
        }
        return true;
    }

    public static int getPositionFromUser(char[] board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the position where you want to place your symbol.");
        System.out.println("Enter a number between 1 and 9, corresponding to the board positions:");
        System.out.println();
        System.out.println("  1 | 2 | 3 ");
        System.out.println(" ---+---+--- ");
        System.out.println("  4 | 5 | 6 ");
        System.out.println(" ---+---+--- ");
        System.out.println("  7 | 8 | 9 ");
        System.out.println();
        System.out.println("Choose wisely!");

        while (true){
            int userPosition = sc.nextInt();
            if (userPosition > 9 || userPosition < 1){
                System.out.println("Enter number between 1-9. Try again.");
            } else if (isAvailable(board, userPosition-1)){
                return userPosition;
            } else {
                System.out.println("This position already taken. Try again.");
            }
        }
    }

    public static char checkWinner(char[] board) {
        for (int j = 0; j < 9; j += 3) {
            if (board[j] == board[j+1] && board[j+1] == board[j+2]){
                return board[j];
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[j] == board[j+3] && board[j+3] == board[j+6]){
                return board[j];
            }
        }

        if (board[0] == board[4] && board[4] == board[8]){
            return board[0];
        }
        if (board[2] == board[4] && board[4] == board[6]){
            return board[0];
        }

        return '-';
    }

    public static boolean placeSymbolOnBoard(char[] board, int index, char player){
        board[index-1] = player;
        printBoard(board);
        char winner = checkWinner(board);
        if (winner == 'X' || winner == 'O'){
            System.out.println("🎉 Congratulations! 🎉");
            System.out.println("Player " + winner + " has claimed victory! 🏆");
            System.out.println("Well done, champion! 🥳");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] board = new char[9];
        char[] players = {'X', 'O'};
        char currPlayer;
        boolean isOver = false;

        while (true){
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0){
                    currPlayer = players[0];
                } else {
                    currPlayer = players[1];
                }

                int position = getPositionFromUser(board);
                boolean isWinner = placeSymbolOnBoard(board, position, currPlayer);
                if (isWinner){
                    isOver = true;
                    break;
                }
            }
            if (!isOver) {
                System.out.println("🤝 It's a close game! Better luck next time. 👏");
            }
            System.out.println();
            System.out.println("Would you like to play again?");
            System.out.println("👉 Press 1 to play another round or any other number to exit.");
            System.out.println();
            if (sc.nextInt() != 1) {
                System.out.println("Thanks for playing! See you next time. 🎮");
                break;
            }
        }
    }
}