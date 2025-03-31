package Semester1.Connect4;

import java.util.Scanner;

public class Main {
    public static int askRow(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter ROW: ");
            int row = sc.nextInt();
            if (row >= 1 && row <= 7){
                return row;
            }
        }
    }

    public static int getY(int row, Board board){
        for (int i = 1; i < 7; i++) {
            if (board.getPlayerInSquare(row, i) == 0){
                return i;
            }
        }
        return -1;
    }

    public static int isWinner(Board board){
        for (int k = 1; k <= 2; k++) {
            for (int i = 1; i <= 7; i++) {
                int counter = 0;
                for (int j = 1; j <= 6; j++) {
                    if (board.getPlayerInSquare(i, j) == k){
                        counter++;
                    } else {
                        counter = 0;
                    }
                    if (counter == 4){
                        return k;
                    }
                }
            }

            for (int i = 1; i <= 6; i++) {
                int counter = 0;
                for (int j = 1; j <= 7; j++) {
                    if (board.getPlayerInSquare(j, i ) == k){
                        counter++;
                    } else {
                        counter = 0;
                    }
                    if (counter == 4){
                        return k;
                    }
                }
            }

            for (int i = 1; i <= 7; i++) {
                int counter = 0;
                for (int j = 1; j <= 6; j++) {
                    if (i <= 4 && j <= 3){
                        for (int h = 0; h <= 3; h++) {
                            if (board.getPlayerInSquare(i+h, j+h) == k){
                                counter++;
                            } else {
                                counter = 0;
                            }
                            if (counter == 4){
                                return k;
                            }
                        }
                    }
                }
            }

            for (int i = 1; i <= 6; i++) {
                int counter = 0;
                for (int j = 1; j <= 7; j++) {
                    if (i >= 4 && j <= 3){
                        for (int h = 0; h <= 3; h++) {
                            if (board.getPlayerInSquare(i-h, j+h) == k){
                                counter++;
                            } else {
                                counter = 0;
                            }
                            if (counter == 4){
                                return k;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void fillAll(Board board, int player) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 6; j++) {
                board.placeSquare(i, j, player);
                try {
                    Thread.sleep(50); // Wait for 200 milliseconds before placing the next square
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        int currTurn = 1;
        while (true){
            int row = askRow();
            int line = getY(row, board);
            if (line == -1){
                System.out.println("The line is full. Try again.");
                continue;
            }
            board.placeSquare(row, line, currTurn);

            int playerWin = isWinner(board);
            if (playerWin == 1){
                System.out.println("Player one wins");
                fillAll(board, playerWin);
                break;
            }
            if (playerWin == 2){
                System.out.println("Player two wins");
                fillAll(board, playerWin);
                break;
            }



            if (currTurn == 1){
                currTurn = 2;
            } else {
                currTurn = 1;
            }
        }
    }

    //Method 1: Board board = new Board();
    //This method shows the initial empty board


    //Method 2: placeSquare (int x, int y, int player)
    //This method gets 3 arguments
    //x is the x position of the square to be placed
    //y is the y position of the square to be placed
    //player can be either of value 1 or 2. For the value 1, a red square is being placed, For the value 2, a yellow square


    //Method 2: int getPlayerInSquare (int x, int y)
    //This method gets 2 arguments
    //x is the x position of the asked square
    //y is the y position of the asked square
    //The method returns an int value: if the value is 0 - the square is empty, if the value is 1 - the square is occupied by
    //player 1, if the value is 2 - the square is occupied by player 2


}

