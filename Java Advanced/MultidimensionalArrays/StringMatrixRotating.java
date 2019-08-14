package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String text = in.nextLine();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        int rotation=0;
        if(matcher.find()){
            rotation = Integer.parseInt(matcher.group(0));
        }
        ArrayList<String> wordList = new ArrayList<>();

        String word;
        while(!"END".equalsIgnoreCase(word = in.nextLine())){
            wordList.add(word);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < wordList.size(); i++) {
            if(max < wordList.get(i).length()){
                max = wordList.get(i).length();
            }
        }

        char[][] matrix = null;

        if(rotation >= 360) {
            while (rotation >= 360) {
                rotation = rotation - 360;
            }
            if(rotation == 0) {
                matrix = new char[wordList.size()][max];
                for (int i = 0; i < matrix.length; i++) {
                    //matrix[i] = new char[wordList.get(i).length()];
                    for (int j = 0; j < matrix[i].length; j++) {
                        try {
                            matrix[i][j] = wordList.get(i).charAt(j);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[i][j] = ' ';
                        }
                    }
                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }else if (rotation == 90) {
                matrix = new char[max][wordList.size()];
                for (int col = 0; col < max; col++) {
                    for (int row = wordList.size()-1; row >= 0; row--) {
                        try {
                            matrix[col][row] = wordList.get(row).charAt(col);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[col][row] = ' ';
                        }
                    }

                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = matrix[i].length - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }else if(rotation == 180){
                matrix = new char[wordList.size()][max];
                for (int i = 0; i < matrix.length; i++) {
                    //matrix[i] = new char[wordList.get(i).length()];
                    for (int j = 0; j < matrix[i].length; j++) {
                        try {
                            matrix[i][j] = wordList.get(i).charAt(j);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[i][j] = ' ';
                        }
                    }
                }
                for (int i = matrix.length-1; i >= 0; i--) {
                    for (int j = matrix[i].length-1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }else if(rotation == 270){
                matrix = new char[max][wordList.size()];
                for (int col = 0; col < max; col++) {
                    for (int row = wordList.size()-1; row >= 0; row--) {
                        try {
                            matrix[col][row] = wordList.get(row).charAt(col);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[col][row] = ' ';
                        }
                    }

                }
                for (int i = matrix.length-1; i >= 0; i--) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }
        }else {
            if(rotation == 0) {
                matrix = new char[wordList.size()][max];
                for (int i = 0; i < matrix.length; i++) {
                    //matrix[i] = new char[wordList.get(i).length()];
                    for (int j = 0; j < matrix[i].length; j++) {
                        try {
                            matrix[i][j] = wordList.get(i).charAt(j);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[i][j] = ' ';
                        }
                    }
                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }else if (rotation == 90) {
                matrix = new char[max][wordList.size()];
                for (int col = 0; col < max; col++) {
                    for (int row = wordList.size()-1; row >= 0; row--) {
                        try {
                            matrix[col][row] = wordList.get(row).charAt(col);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[col][row] = ' ';
                        }
                    }

                }
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = matrix[i].length-1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }

            }else if(rotation == 180){
                matrix = new char[wordList.size()][max];
                for (int i = 0; i < matrix.length; i++) {
                    //matrix[i] = new char[wordList.get(i).length()];
                    for (int j = 0; j < matrix[i].length; j++) {
                        try {
                            matrix[i][j] = wordList.get(i).charAt(j);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[i][j] = ' ';
                        }
                    }
                }
                for (int i = matrix.length-1; i >= 0; i--) {
                    for (int j = matrix[i].length-1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }

            }else if(rotation == 270){
                matrix = new char[max][wordList.size()];
                for (int col = 0; col < max; col++) {
                    for (int row = wordList.size()-1; row >= 0; row--) {
                        try {
                            matrix[col][row] = wordList.get(row).charAt(col);
                        }catch (StringIndexOutOfBoundsException e){
                            matrix[col][row] = ' ';
                        }
                    }

                }
                for (int i = matrix.length-1; i >= 0; i--) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "");

                    }
                    System.out.println();
                }
            }
        }
        }
    }
