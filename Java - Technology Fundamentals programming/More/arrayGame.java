import java.util.Random;
import java.util.Scanner;

public class arrayGame {


    public static void inPutArray(double prices[][], int prices1[][]) {
        Scanner in = new Scanner(System.in);
        Random rand1 = new Random(System.currentTimeMillis());
        Random rand = new Random(100);

        for (int i = 0; i < prices1.length; i++) {
            for (int j = 0; j < 4; j++) {
                prices1[i][j] = rand1.nextInt(1000);
            }
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 4; j++) {
                prices[i][j] = rand.nextDouble() * prices1[i][j];
            }
        }
        System.out.println();
    }

    public static void outPutArray(double prices[][], int prices1[][]) {
        for (int i = 0; i < prices.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.3f |", prices[i][j]);
            }
            System.out.println();
        }
    }

    public static void algorithmOne(int A, double B) {

        Scanner in = new Scanner(System.in);
        double[][] prices = new double[4][4];
        int[][] prices1 = new int[4][4];

        inPutArray(prices, prices1);

        for (int i = 0; i < prices.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.3f |", prices[i][j]);
            }
            System.out.println();
        }


        System.out.println();

        System.out.print("Possition 0-15: ");
        int position = Integer.parseInt(in.nextLine());
        double sum = 0;

        System.out.println();

        if (position >= 0 && position <= 3) {
            if (position == 0) {
                sum = prices[0][0];
                prices[0][0] = 0;
            } else if (position == 1) {
                sum = prices[0][1];
                prices[0][1] = 0;
            } else if (position == 2) {
                sum = prices[0][2];
                prices[0][2] = 0;
            } else if (position == 3) {
                sum = prices[0][3];
                prices[0][3] = 0;
            }
        } else if (position >= 4 && position <= 7) {
            if (position == 4) {
                sum = prices[1][0];
                prices[1][0] = 0;
            } else if (position == 5) {
                sum = prices[1][1];
                prices[1][1] = 0;
            } else if (position == 6) {
                sum = prices[1][2];
                prices[1][2] = 0;
            } else if (position == 7) {
                sum = prices[1][3];
                prices[1][3] = 0;
            }
        } else if (position >= 8 && position <= 11) {
            if (position == 8) {
                sum = prices[2][0];
                prices[2][0] = 0;
            } else if (position == 9) {
                sum = prices[2][1];
                prices[2][1] = 0;
            } else if (position == 10) {
                sum = prices[2][2];
                prices[2][2] = 0;
            } else if (position == 11) {
                sum = prices[2][3];
                prices[2][3] = 0;
            }
        } else if (position >= 12 && position <= 15) {
            if (position == 12) {
                sum = prices[3][0];
                prices[3][0] = 0;
            } else if (position == 13) {
                sum = prices[3][1];
                prices[3][1] = 0;
            } else if (position == 14) {
                sum = prices[3][2];
                prices[3][2] = 0;
            } else if (position == 15) {
                sum = prices[3][3];
                prices[3][3] = 0;
            }
        }


        String put = "";
        System.out.println("Enter R for Right or L for Left to move :)");
        System.out.println("You have 3 moves!");


        int counter = 0;

        while (!put.equalsIgnoreCase("stop")) {
            put = in.nextLine();
            if (put.equalsIgnoreCase("stop")) {
                break;
            }
            // number = Integer.parseInt(put);
            if (put.equalsIgnoreCase("L")) {
                if (position == 0) {
                    System.out.println("You cannot move left, move right!");
                } else {
                    position = position - 1;
                    if (position >= 0 && position <= 3) {
                        if (position == 0) {
                            sum += prices[0][0];
                            prices[0][0] = 0;
                        } else if (position == 1) {
                            sum += prices[0][1];
                            prices[0][1] = 0;
                        } else if (position == 2) {
                            sum += prices[0][2];
                            prices[0][2] = 0;
                        } else if (position == 3) {
                            sum += prices[0][3];
                            prices[0][3] = 0;
                        }
                    } else if (position >= 4 && position <= 7) {
                        if (position == 4) {
                            sum += prices[1][0];
                            prices[1][0] = 0;
                        } else if (position == 5) {
                            sum += prices[1][1];
                            prices[1][1] = 0;
                        } else if (position == 6) {
                            sum += prices[1][2];
                            prices[1][2] = 0;
                        } else if (position == 7) {
                            sum += prices[1][3];
                            prices[1][3] = 0;
                        }
                    } else if (position >= 8 && position <= 11) {
                        if (position == 8) {
                            sum += prices[2][0];
                            prices[2][0] = 0;
                        } else if (position == 9) {
                            sum += prices[2][1];
                            prices[2][1] = 0;
                        } else if (position == 10) {
                            sum += prices[2][2];
                            prices[2][2] = 0;
                        } else if (position == 11) {
                            sum += prices[2][3];
                            prices[2][3] = 0;
                        }
                    } else if (position >= 12 && position <= 15) {
                        if (position == 12) {
                            sum += prices[3][0];
                            prices[3][0] = 0;
                        } else if (position == 13) {
                            sum += prices[3][1];
                            prices[3][1] = 0;
                        } else if (position == 14) {
                            sum += prices[3][2];
                            prices[3][2] = 0;
                        } else if (position == 15) {
                            sum += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }

                }
            } else if (put.equalsIgnoreCase("R")) {
                if (position == 15) {
                    System.out.println("You cannot move right, move left!");
                } else {
                    position = position + 1;
                    if (position >= 0 && position <= 3) {
                        if (position == 0) {
                            sum += prices[0][0];
                            prices[0][0] = 0;
                        } else if (position == 1) {
                            sum += prices[0][1];
                            prices[0][1] = 0;
                        } else if (position == 2) {
                            sum += prices[0][2];
                            prices[0][2] = 0;
                        } else if (position == 3) {
                            sum += prices[0][3];
                            prices[0][3] = 0;
                        }
                    } else if (position >= 4 && position <= 7) {
                        if (position == 4) {
                            sum += prices[1][0];
                            prices[1][0] = 0;
                        } else if (position == 5) {
                            sum += prices[1][1];
                            prices[1][1] = 0;
                        } else if (position == 6) {
                            sum += prices[1][2];
                            prices[1][2] = 0;
                        } else if (position == 7) {
                            sum += prices[1][3];
                            prices[1][3] = 0;
                        }
                    } else if (position >= 8 && position <= 11) {
                        if (position == 8) {
                            sum += prices[2][0];
                            prices[2][0] = 0;
                        } else if (position == 9) {
                            sum += prices[2][1];
                            prices[2][1] = 0;
                        } else if (position == 10) {
                            sum += prices[2][2];
                            prices[2][2] = 0;
                        } else if (position == 11) {
                            sum += prices[2][3];
                            prices[2][3] = 0;
                        }
                    } else if (position >= 12 && position <= 15) {
                        if (position == 12) {
                            sum += prices[3][0];
                            prices[3][0] = 0;
                        } else if (position == 13) {
                            sum += prices[3][1];
                            prices[3][1] = 0;
                        } else if (position == 14) {
                            sum += prices[3][2];
                            prices[3][2] = 0;
                        } else if (position == 15) {
                            sum += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }
                }
            }
            counter++;
            if (counter == 3) {
                break;
            }
        }

        System.out.print("The sum of the first player is: ");
        System.out.printf("%.3f%n", sum);
        System.out.println();


        String put1 = "";
        System.out.print("Possition 0-15: ");
        int position1 = Integer.parseInt(in.nextLine());
        System.out.println();
        double sum1 = 0;
        if (position1 >= 0 && position1 <= 3) {
            if (position1 == 0) {
                sum1 = prices[0][0];
            } else if (position1 == 1) {
                sum1 = prices[0][1];
            } else if (position1 == 2) {
                sum1 = prices[0][2];
            } else if (position1 == 3) {
                sum1 = prices[0][3];
            }
        } else if (position1 >= 4 && position1 <= 7) {
            if (position1 == 4) {
                sum1 = prices[1][0];
            } else if (position1 == 5) {
                sum1 = prices[1][1];
            } else if (position1 == 6) {
                sum1 = prices[1][2];
            } else if (position1 == 7) {
                sum1 = prices[1][3];
            }
        } else if (position1 >= 8 && position1 <= 11) {
            if (position1 == 8) {
                sum1 = prices[2][0];
            } else if (position1 == 9) {
                sum1 = prices[2][1];
            } else if (position1 == 10) {
                sum1 = prices[2][2];
            } else if (position1 == 11) {
                sum1 = prices[2][3];
            }
        } else if (position1 >= 12 && position1 <= 15) {
            if (position1 == 12) {
                sum1 = prices[3][0];
            } else if (position1 == 13) {
                sum1 = prices[3][1];
            } else if (position1 == 14) {
                sum1 = prices[3][2];
            } else if (position1 == 15) {
                sum1 = prices[3][3];
            }
        }
        int number1;
        System.out.println("Enter R for Right or L for Left to move :)");
        System.out.println("You have 3 moves! ");

        int counter1 = 0;

        while (!put1.equalsIgnoreCase("stop")) {
            put1 = in.nextLine();
            if (put1.equalsIgnoreCase("stop")) {

                break;
            }

            /*
                 number = Integer.parseInt(put);
            */

            if (put1.equalsIgnoreCase("L")) {

                if (position1 == 0) {
                    System.out.println("You cannot move left, move right!");

                } else {

                    position1 = position1 - 1;

                    if (position1 >= 0 && position1 <= 3) {

                        if (position1 == 0) {
                            sum1 += prices[0][0];
                            prices[0][0] = 0;
                        } else if (position1 == 1) {
                            sum1 += prices[0][1];
                            prices[0][1] = 0;
                        } else if (position1 == 2) {
                            sum1 += prices[0][2];
                            prices[0][2] = 0;
                        } else if (position1 == 3) {
                            sum1 += prices[0][3];
                            prices[0][3] = 0;
                        }
                    } else if (position1 >= 4 && position1 <= 7) {

                        if (position1 == 4) {
                            sum1 += prices[1][0];
                            prices[1][0] = 0;
                        } else if (position1 == 5) {
                            sum1 += prices[1][1];
                            prices[1][1] = 0;
                        } else if (position1 == 6) {
                            sum1 += prices[1][2];
                            prices[1][2] = 0;
                        } else if (position1 == 7) {
                            sum1 += prices[1][3];
                            prices[1][3] = 0;
                        }
                    } else if (position1 >= 8 && position1 <= 11) {

                        if (position1 == 8) {
                            sum1 += prices[2][0];
                            prices[2][0] = 0;
                        } else if (position1 == 9) {
                            sum1 += prices[2][1];
                            prices[2][1] = 0;
                        } else if (position1 == 10) {
                            sum1 += prices[2][2];
                            prices[2][2] = 0;
                        } else if (position1 == 11) {
                            sum1 += prices[2][3];
                            prices[2][3] = 0;
                        }
                    } else if (position1 >= 12 && position1 <= 15) {

                        if (position1 == 12) {
                            sum1 += prices[3][0];
                            prices[3][0] = 0;
                        } else if (position1 == 13) {
                            sum1 += prices[3][1];
                            prices[3][1] = 0;
                        } else if (position1 == 14) {
                            sum1 += prices[3][2];
                            prices[3][2] = 0;
                        } else if (position1 == 15) {
                            sum1 += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }
                }
            } else if (put1.equalsIgnoreCase("R")) {

                if (position1 == 15) {

                    System.out.println("You cannot move right, move left!");

                } else {

                    position1 = position1 + 1;

                    if (position1 >= 0 && position1 <= 3) {
                        if (position1 == 0) {
                            sum1 += prices[0][0];
                            prices[0][0] = 0;
                        } else if (position1 == 1) {
                            sum1 += prices[0][1];
                            prices[0][1] = 0;
                        } else if (position1 == 2) {
                            sum1 += prices[0][2];
                            prices[0][2] = 0;
                        } else if (position1 == 3) {
                            sum1 += prices[0][3];
                            prices[0][3] = 0;
                        }

                    } else if (position1 >= 4 && position1 <= 7) {

                        if (position1 == 4) {
                            sum1 += prices[1][0];
                            prices[1][0] = 0;
                        } else if (position1 == 5) {
                            sum1 += prices[1][1];
                            prices[1][1] = 0;
                        } else if (position1 == 6) {
                            sum1 += prices[1][2];
                            prices[1][2] = 0;
                        } else if (position1 == 7) {
                            sum1 += prices[1][3];
                            prices[1][3] = 0;

                        }
                    } else if (position1 >= 8 && position1 <= 11) {

                        if (position1 == 8) {
                            sum1 += prices[2][0];
                            prices[2][0] = 0;
                        } else if (position1 == 9) {
                            sum1 += prices[2][1];
                            prices[2][1] = 0;
                        } else if (position1 == 10) {
                            sum1 += prices[2][2];
                            prices[2][2] = 0;
                        } else if (position1 == 11) {
                            sum1 += prices[2][3];
                            prices[2][3] = 0;
                        }

                    } else if (position1 >= 12 && position1 <= 15) {

                        if (position1 == 12) {
                            sum1 += prices[3][0];
                            prices[3][0] = 0;
                        } else if (position1 == 13) {
                            sum1 += prices[3][1];
                            prices[3][1] = 0;
                        } else if (position1 == 14) {
                            sum1 += prices[3][2];
                            prices[3][2] = 0;
                        } else if (position1 == 15) {
                            sum1 += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }
                }
            }

            counter1++;
            if (counter1 == 3) {
                break;
            }
        }

        System.out.print("The sum of the second player is: ");
        System.out.printf("%.3f%n ", sum1);
        System.out.println();

        if (sum > sum1) {
            System.out.println("The winner is the first player!");
        } else {
            System.out.println("The winner is the second player!");
        }

        System.out.println();

        System.out.println("The new array looks like: ");
        for (int i = 0; i < prices.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.3f |", prices[i][j]);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String YN = "";

        while (!YN.equalsIgnoreCase("N")) {

            double[][] prices = new double[4][4];
            int[][] prices1 = new int[4][4];

            inPutArray(prices, prices1);

    /*
          System.out.print("Possition 0-15: ");
          outPutArray(prices, prices1);
*/
            int position = 0;
            double sum = 0;

            algorithmOne(position, sum);

            System.out.println();

            System.out.println("Do you want to try again?");
            System.out.println("If YES press Y or for NO press N :)");
            YN = in.nextLine();
            if (YN.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println();
        System.out.println("END GAME");

















/*
        String put = "";
        System.out.println("Enter R for Right or L for Left to move :)");
        System.out.println("You have 3 moves!");

        int counter = 0;

        while(!put.equalsIgnoreCase("stop")){
            put = in.nextLine();
            if(put.equalsIgnoreCase("stop")){
                break;
            }
           // number = Integer.parseInt(put);
            if(put.equalsIgnoreCase("L")) {
                if(position == 0){
                    System.out.println("You cannot move left!, move right");
                }else {
                    position = position - 1;
                    if(position >= 0 && position <= 3){
                        if(position == 0) {
                            sum += prices[0][0];
                            prices[0][0] = 0;
                        }else if( position == 1){
                            sum += prices[0][1];
                            prices[0][1] = 0;
                        }else if( position == 2){
                            sum += prices[0][2];
                            prices[0][2] = 0;
                        }else if( position == 3){
                            sum += prices[0][3];
                            prices[0][3] = 0;
                        }
                    }else if(position >= 4 && position <= 7){
                        if(position == 4) {
                            sum += prices[1][0];
                            prices[1][0] = 0;
                        }else if( position == 5){
                            sum += prices[1][1];
                            prices[1][1] = 0;
                        }else if( position == 6){
                            sum += prices[1][2];
                            prices[1][2] = 0;
                        }else if( position == 7){
                            sum += prices[1][3];
                            prices[1][3] = 0;
                        }
                    }
                    else if(position >= 8 && position <= 11){
                        if(position == 8) {
                            sum += prices[2][0];
                            prices[2][0] = 0;
                        }else if( position == 9){
                            sum += prices[2][1];
                            prices[2][1] = 0;
                        }else if( position == 10){
                            sum += prices[2][2];
                            prices[2][2] = 0;
                        }else if( position == 11){
                            sum += prices[2][3];
                            prices[2][3] = 0;
                        }
                    }else if(position >= 12 && position <= 15){
                        if(position == 12) {
                            sum += prices[3][0];
                            prices[3][0] = 0;
                        }else if( position == 13){
                            sum += prices[3][1];
                            prices[3][1] = 0;
                        }else if( position == 14){
                            sum += prices[3][2];
                            prices[3][2] = 0;
                        }else if( position == 15){
                            sum += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }

                }
            }else if(put.equalsIgnoreCase("R")){
                if(position == 15) {
                    System.out.println("You cannot move right!, move left");
                }else{
                    position = position + 1;
                    if(position >= 0 && position <= 3){
                        if(position == 0) {
                            sum += prices[0][0];
                            prices[0][0] = 0;
                        }else if( position == 1){
                            sum += prices[0][1];
                            prices[0][1] = 0;
                        }else if( position == 2){
                            sum += prices[0][2];
                            prices[0][2] = 0;
                        }else if( position == 3){
                            sum += prices[0][3];
                            prices[0][3] = 0;
                        }
                    }else if(position >= 4 && position <= 7){
                        if(position == 4) {
                            sum += prices[1][0];
                            prices[1][0] = 0;
                        }else if( position == 5){
                            sum += prices[1][1];
                            prices[1][1] = 0;
                        }else if( position == 6){
                            sum += prices[1][2];
                            prices[1][2] = 0;
                        }else if( position == 7){
                            sum += prices[1][3];
                            prices[1][3] = 0;
                        }
                    }
                    else if(position >= 8 && position <= 11){
                        if(position == 8) {
                            sum += prices[2][0];
                            prices[2][0] = 0;
                        }else if( position == 9){
                            sum += prices[2][1];
                            prices[2][1] = 0;
                        }else if( position == 10){
                            sum += prices[2][2];
                            prices[2][2] = 0;
                        }else if( position == 11){
                            sum += prices[2][3];
                            prices[2][3] = 0;
                        }
                    }else if(position >= 12 && position <= 15){
                        if(position == 12) {
                            sum += prices[3][0];
                            prices[3][0] = 0;
                        }else if( position == 13){
                            sum += prices[3][1];
                            prices[3][1] = 0;
                        }else if( position == 14){
                            sum += prices[3][2];
                            prices[3][2] = 0;
                        }else if( position == 15){
                            sum += prices[3][3];
                            prices[3][3] = 0;
                        }
                    }
                }
            }
            counter++;
            if(counter == 3){
                break;
            }
        }*/
        /*System.out.print("The sum of the first player is: ");
        System.out.printf("%.3f%n", sum);
        System.out.println();*/


        //______________________________________________________________________-



/*
        String put1 = "";
        System.out.print("Possition 0-15: ");
        int position1 = Integer.parseInt(in.nextLine());
        System.out.println();
        double sum1=0;
        if(position1 >= 0 && position1 <= 3){
            if(position1 == 0) {
                sum1 = prices[0][0];
            }else if( position1 == 1){
                sum1 = prices[0][1];
            }else if( position1 == 2){
                sum1 = prices[0][2];
            }else if( position1 == 3){
                sum1 = prices[0][3];
            }
        }else if(position1 >= 4 && position1 <= 7){
            if(position1 == 4) {
                sum1 = prices[1][0];
            }else if( position1 == 5){
                sum1 = prices[1][1];
            }else if( position1 == 6){
                sum1 = prices[1][2];
            }else if( position1 == 7){
                sum1 = prices[1][3];
            }
        }
        else if(position1 >= 8 && position1 <= 11){
            if(position1 == 8) {
                sum1 = prices[2][0];
            }else if( position1 == 9){
                sum1 = prices[2][1];
            }else if( position1 == 10){
                sum1 = prices[2][2];
            }else if( position1 == 11){
                sum1 = prices[2][3];
            }
        }else if(position1 >= 12 && position1 <= 15){
            if(position1 == 12) {
                sum1 = prices[3][0];
            }else if( position1 == 13){
                sum1 = prices[3][1];
            }else if( position1 == 14){
                sum1 = prices[3][2];
            }else if( position1 == 15){
                sum1 = prices[3][3];
            }
        }
        int number1;
        System.out.println("Enter R for Right or L for Left to move :)");
        System.out.println("You have 3 moves! ");

        int counter1 = 0;

        while(!put1.equalsIgnoreCase("stop")){
            put1 = in.nextLine();
            if(put1.equalsIgnoreCase("stop")){
                break;
            }
            // number = Integer.parseInt(put);
            if(put1.equalsIgnoreCase("L")) {
                if(position1 == 0){
                    System.out.println("You cannot move left, move right!");
                }else {
                    position1 = position1 - 1;

                    if(position1 >= 0 && position1 <= 3){

                        if(position1 == 0) {

                            sum1 += prices[0][0];
                            prices[0][0] = 0;

                        }else if( position1 == 1){

                            sum1 += prices[0][1];
                            prices[0][1] = 0;

                        }else if( position1 == 2){

                            sum1 += prices[0][2];
                            prices[0][2] = 0;

                        }else if( position1 == 3){

                            sum1 += prices[0][3];
                            prices[0][3] = 0;

                        }
                    }else if(position1 >= 4 && position1 <= 7){

                        if(position1 == 4) {

                            sum1 += prices[1][0];
                            prices[1][0] = 0;

                        }else if( position1 == 5){

                            sum1 += prices[1][1];
                            prices[1][1] = 0;

                        }else if( position1 == 6){

                            sum1 += prices[1][2];
                            prices[1][2] = 0;

                        }else if( position1 == 7){

                            sum1 += prices[1][3];
                            prices[1][3] = 0;

                        }
                    }

                    else if(position1 >= 8 && position1 <= 11){

                        if(position1 == 8) {

                            sum1 += prices[2][0];
                            prices[2][0] = 0;

                        }else if( position1 == 9){

                            sum1 += prices[2][1];
                            prices[2][1] = 0;

                        }else if( position1 == 10){

                            sum1 += prices[2][2];
                            prices[2][2] = 0;

                        }else if( position1 == 11){

                            sum1 += prices[2][3];
                            prices[2][3] = 0;

                        }
                    }else if(position1 >= 12 && position1 <= 15){

                        if(position1 == 12) {

                            sum1 += prices[3][0];
                            prices[3][0] = 0;

                        }else if( position1 == 13){

                            sum1 += prices[3][1];
                            prices[3][1] = 0;

                        }else if( position1 == 14){

                            sum1 += prices[3][2];
                            prices[3][2] = 0;

                        }else if( position1 == 15){

                            sum1 += prices[3][3];
                            prices[3][3] = 0;

                        }
                    }

                }
            }else if(put1.equalsIgnoreCase("R")){

                if(position1 == 15) {

                    System.out.println("You cannot move right, move left!");

                }else{

                    position1 = position1 + 1;
                    if(position1 >= 0 && position1 <= 3){

                        if(position1 == 0) {
                            sum1 += prices[0][0];
                            prices[0][0] = 0;
                        }else if( position1 == 1){
                            sum1 += prices[0][1];
                            prices[0][1] = 0;
                        }else if( position1 == 2){
                            sum1 += prices[0][2];
                            prices[0][2] = 0;
                        }else if( position1 == 3){
                            sum1 += prices[0][3];
                            prices[0][3] = 0;

                        }
                    }else if(position1 >= 4 && position1 <= 7){

                        if(position1 == 4) {
                            sum1 += prices[1][0];
                            prices[1][0] = 0;
                        }else if( position1 == 5){
                            sum1 += prices[1][1];
                            prices[1][1] = 0;
                        }else if( position1 == 6){
                            sum1 += prices[1][2];
                            prices[1][2] = 0;
                        }else if( position1 == 7){
                            sum1 += prices[1][3];
                            prices[1][3] = 0;

                        }
                    }
                    else if(position1 >= 8 && position1 <= 11){

                        if(position1 == 8) {
                            sum1 += prices[2][0];
                            prices[2][0] = 0;
                        }else if( position1 == 9){
                            sum1 += prices[2][1];
                            prices[2][1] = 0;
                        }else if( position1 == 10){
                            sum1 += prices[2][2];
                            prices[2][2] = 0;
                        }else if( position1 == 11){
                            sum1 += prices[2][3];
                            prices[2][3] = 0;

                        }
                    }else if(position1 >= 12 && position1 <= 15){

                        if(position1 == 12) {
                            sum1 += prices[3][0];
                            prices[3][0] = 0;
                        }else if( position1 == 13){
                            sum1 += prices[3][1];
                            prices[3][1] = 0;
                        }else if( position1 == 14){
                            sum1 += prices[3][2];
                            prices[3][2] = 0;
                        }else if( position1 == 15){
                            sum1 += prices[3][3];
                            prices[3][3] = 0;

                        }
                    }
                }
            }

            counter1++;
            if(counter1 == 3){
                break;
            }
        }

        System.out.print("The sum of the second player is: ");
        System.out.printf("%.3f%n ", sum1);
        System.out.println();*/

        /*if(sum > sum1){
            System.out.println("The winner is the first player!");
        }else{
            System.out.println("The winner is the second player!");
        }

        System.out.println();

        System.out.println("The new array looks like: ");
        for(int i = 0 ; i < prices.length ; i++){
            System.out.print("| ");
            for(int j = 0 ; j < 4 ; j++){
                System.out.printf("%.3f |", prices[i][j]);
            }
            System.out.println();
        }*/


    }
}