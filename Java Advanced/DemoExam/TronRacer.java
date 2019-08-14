package DemoExam;

import java.util.Scanner;

public class TronRacer {
    private static int firstPlayerRow = 0;
    private static int firstPlayerCol = 0;
    private static int secondPlayerRow = 0;
    private static int secondPlayerCol = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        char[][] field = initializeMatrix(in, n);


        boolean isFirstPlayerIsAlive = true;
        boolean isSecondPlayerIsAlive = true;
        while (isFirstPlayerIsAlive && isSecondPlayerIsAlive) {
            String[] inputLine = in.nextLine().split(" ");
            String firstCommand = inputLine[0];
            String secondCommand = inputLine[1];

            isFirstPlayerIsAlive = moveFirstPlayer(firstCommand, field);
            if(!isFirstPlayerIsAlive){
                break;
            }
            isSecondPlayerIsAlive = moveSeondPlayer(secondCommand,field);
        }


        printMatrix(field);
    }

    private static void printMatrix(char[][] field) {
        for (char[] row : field) {
            for (char col : row) {
                System.out.print(col);

            }
            System.out.println();

        }
    }

    private static boolean moveSeondPlayer(String secondCommand, char[][] field) {
        int newPositionRow = secondPlayerRow;
        int newPositionCol = secondPlayerCol;

        boolean isAlive = true;

        switch (secondCommand) {
            case "up":
                newPositionRow = newPositionRow ==0? field.length-1:newPositionRow-1;
                break;
            case "down":
                newPositionRow = newPositionRow ==field.length-1? 0:newPositionRow+1;
                break;
            case "left":
                if(newPositionCol == 0){
                    newPositionCol=field.length-1;
                }else {
                    newPositionCol=newPositionCol-1;
                }
                break;
            case "right":
                if(newPositionCol == field.length-1){
                    newPositionCol=0;
                }else {
                    newPositionCol=newPositionCol+1;
                }
                break;
        }
        char newElement = field[newPositionRow][newPositionCol];
        if(newElement == 'f'){
            field[newPositionRow][newPositionCol] = 'x';
            isAlive=false;
        }else {
            field[newPositionRow][newPositionCol]='s';
        }
        secondPlayerRow=newPositionRow;
        secondPlayerCol=newPositionCol;

        return isAlive;
    }

    private static boolean moveFirstPlayer(String firstCommand, char[][] field) {
        int newPositionRow = firstPlayerRow;
        int newPositionCol = firstPlayerCol;

        boolean isAlive = true;

        switch (firstCommand) {
            case "up":
                if(newPositionRow==0){
                    newPositionRow=field.length-1;
                }else {
                    newPositionRow--;
                }
                break;
            case "down":
                if(newPositionRow==field.length-1){
                    newPositionRow=0;
                }else {
                    newPositionRow++;
                }
                break;
            case "left":
                if(newPositionCol==0){
                    newPositionCol=field.length-1;
                }else {
                    newPositionCol--;
                }
                break;
            case "right":
                if(newPositionCol==field.length-1){
                    newPositionCol=0;
                }else {
                    newPositionCol++;
                }
                break;
        }
        char newElement = field[newPositionRow][newPositionCol];
        if(newElement == 's'){
            field[newPositionRow][newPositionCol] = 'x';
            isAlive=false;
        }else {
            field[newPositionRow][newPositionCol]='f';
        }

        firstPlayerRow=newPositionRow;
        firstPlayerCol=newPositionCol;

        return isAlive;
    }

    private static char[][] initializeMatrix(Scanner in, int n) {
        char[][] matrix = new char[n][n];
        for (int row = 0; row < n; row++) {
            char[] inputLine = in.nextLine().toCharArray();
            for (int col = 0; col < n; col++) {

                char element = inputLine[col];
                matrix[row][col] = element;

                if (element == 'f') {
                    firstPlayerRow = row;
                    firstPlayerCol = col;
                } else if (element == 's') {
                    secondPlayerRow = row;
                    secondPlayerCol = col;
                }
            }
        }
        return matrix;
    }
}
