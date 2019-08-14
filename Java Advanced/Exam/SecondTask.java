package Exam;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int StephenRow=0;
        int StephenCol=0;

        int n = Integer.parseInt(in.nextLine());

        char[][] galaxyMatrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            char[] inputLine = in.nextLine().toCharArray();
            for (int col = 0; col < n; col++) {

                char element = inputLine[col];

                galaxyMatrix[row][col] = element;

                if (element == 'S') {
                    StephenRow = row;
                    StephenCol = col;
                }
            }
        }

        int energy = 0;
        try {
            while (energy <= 50) {

                String direction = in.nextLine();
                galaxyMatrix[StephenRow][StephenCol] = '-';

                if (direction.equals("up")) {
                    if (!canMove(StephenRow - 1, StephenCol, galaxyMatrix)) {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        System.out.println("Bad news, the spaceship went to the void.");
                        System.out.println("Star power collected: " + energy);
                        printField(galaxyMatrix);
                        return;
                    }

                    StephenRow--;
                    if (galaxyMatrix[StephenRow][StephenCol] == 'O') {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        for (int i = 0; i < galaxyMatrix.length; i++) {
                            for (int j = 0; j < galaxyMatrix.length; j++) {
                                if (galaxyMatrix[i][j] == 'O') {
                                    galaxyMatrix[i][j] = 'S';
                                    StephenRow = i;
                                    StephenCol = j;
                                }
                            }
                        }
                    } else if (Character.isDigit(galaxyMatrix[StephenRow][StephenCol])) {
                        energy += Integer.parseInt(String.valueOf(galaxyMatrix[StephenRow][StephenCol]));
                        galaxyMatrix[StephenRow][StephenCol] = 'S';
                    }

                } else if (direction.equals("down")) {
                    if (!canMove(StephenRow + 1, StephenCol, galaxyMatrix)) {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        System.out.println("Bad news, the spaceship went to the void.");
                        System.out.println("Star power collected: " + energy);
                        printField(galaxyMatrix);
                        return;
                    }
                    StephenRow++;
                    if (galaxyMatrix[StephenRow][StephenCol] == 'O') {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        for (int i = 0; i < galaxyMatrix.length; i++) {
                            for (int j = 0; j < galaxyMatrix.length; j++) {
                                if (galaxyMatrix[i][j] == 'O') {
                                    galaxyMatrix[i][j] = 'S';
                                    StephenRow = i;
                                    StephenCol = j;
                                }
                            }
                        }
                    } else if (Character.isDigit(galaxyMatrix[StephenRow][StephenCol])) {
                        energy += Integer.parseInt(String.valueOf(galaxyMatrix[StephenRow][StephenCol]));
                        galaxyMatrix[StephenRow][StephenCol] = 'S';
                    }

                } else if (direction.equals("left")) {
                    if (!canMove(StephenRow, StephenCol - 1, galaxyMatrix)) {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        System.out.println("Bad news, the spaceship went to the void.");
                        System.out.println("Star power collected: " + energy);
                        printField(galaxyMatrix);
                        return;
                    }
                    StephenCol--;
                    if (galaxyMatrix[StephenRow][StephenCol] == 'O') {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        for (int i = 0; i < galaxyMatrix.length; i++) {
                            for (int j = 0; j < galaxyMatrix.length; j++) {
                                if (galaxyMatrix[i][j] == 'O') {
                                    galaxyMatrix[i][j] = 'S';
                                    StephenRow = i;
                                    StephenCol = j;
                                }
                            }
                        }
                    } else if (Character.isDigit(galaxyMatrix[StephenRow][StephenCol])) {
                        energy += Integer.parseInt(String.valueOf(galaxyMatrix[StephenRow][StephenCol]));
                        galaxyMatrix[StephenRow][StephenCol] = 'S';
                    }

                } else if (direction.equals("right")) {
                    if (!canMove(StephenRow, StephenCol + 1, galaxyMatrix)) {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        System.out.println("Bad news, the spaceship went to the void.");
                        System.out.println("Star power collected: " + energy);
                        printField(galaxyMatrix);
                        return;
                    }
                    StephenCol++;
                    if (galaxyMatrix[StephenRow][StephenCol] == 'O') {
                        galaxyMatrix[StephenRow][StephenCol] = '-';
                        for (int i = 0; i < galaxyMatrix.length; i++) {
                            for (int j = 0; j < galaxyMatrix.length; j++) {
                                if (galaxyMatrix[i][j] == 'O') {
                                    galaxyMatrix[i][j] = 'S';
                                    StephenRow = i;
                                    StephenCol = j;
                                }
                            }
                        }
                    } else if (Character.isDigit(galaxyMatrix[StephenRow][StephenCol])) {
                        energy += Integer.parseInt(String.valueOf(galaxyMatrix[StephenRow][StephenCol]));
                        galaxyMatrix[StephenRow][StephenCol] = 'S';
                    }
                }

            }
        }catch (Exception e){

        }

        System.out.println("Good news! Stephen succeeded in collecting enough star power!");
        System.out.println(String.format("Star power collected: %d", energy));
        printField(galaxyMatrix);


    }

    private static void printField(char[][] field) {
        for (int r = 0; r < field.length; r++) {
            for (int c = 0; c < field.length; c++) {
                System.out.print(field[r][c]);
            }
            System.out.println();

        }
    }


    private static boolean canMove(int newRow, int newCol, char[][]field) {
        return newRow >= 0 && newRow < field.length && newCol >=0 && newCol < field[newRow].length;
    }
}
