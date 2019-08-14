package DemoExam;

import java.util.Scanner;

public class TheGarden {

    static int Carrot = 0;
    static int Potatoes = 0;
    static int Lettuce = 0;

    static int Vegetables = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());


        String[][]matrix = new String[n][];

        for (int i = 0; i < matrix.length; i++) {
            String[] line = in.nextLine().split("\\s+");
            matrix[i] = new String[line.length];
            for (int j = 0; j < line.length; j++) {
                matrix[i][j] = line[j];
            }
        }

        String command;
        while(!"End of Harvest".equals(command = in.nextLine())){
            String[] comrad = command.split("\\s+");




            if(comrad[0].equals("Harvest")){
                int row = Integer.parseInt(comrad[1]);
                int col = Integer.parseInt(comrad[2]);
                try{
                    if(matrix[row][col] != null
                    || !matrix[row][col].equals(" ")){
                        Check(matrix[row][col]);
                    }
                    matrix[row][col] = " ";
                }catch(Exception e) {
                    continue;
                }
            }
            else if(comrad[0].equals("Mole")){
                int row = Integer.parseInt(comrad[1]);
                int col = Integer.parseInt(comrad[2]);

                String direction = comrad[3];
                try{
                    if(matrix[row][col] != null) {
                        harmed(matrix[row][col]);
                    }
                    matrix[row][col] = " ";
                }catch(Exception e) {
                    continue;
                }
                if(direction.equals("up")){
                    for (int i = row; i >= 0; i-=2) {
                        try{
                            if(matrix[i][col] != null){
                                harmed(matrix[i][col]);
                            }
                            matrix[i][col] = " ";

                        }catch(Exception e) {
                            continue;
                        }
                    }
                }else if(direction.equals("down")){
                    for (int i = row; i < matrix.length; i+=2) {
                        try{
                            if(matrix[i][col] != null){
                                harmed(matrix[i][col]);
                            }
                            matrix[i][col] = " ";
                        }catch(Exception e) {
                            continue;
                        }
                    }
                }else if(direction.equals("right")){
                    for (int i = row; i <= row; i++) {
                        try{
                            for (int j = col; j < matrix[col].length; j+=2) {
                                if(matrix[row][j] != null){
                                    harmed(matrix[row][j]);
                                }
                                matrix[i][j] = " ";
                            }
                        }catch(Exception e) {
                            continue;
                        }
                    }

                }else if(direction.equals("left")){
                    for (int i = row; i <= row; i++) {
                        try{
                            for (int j = col; j >= 0; j-=2) {
                                if(matrix[row][j] != null){
                                    harmed(matrix[row][j]);
                                }
                                matrix[i][j] = " ";
                            }
                        }catch(Exception e) {
                            continue;
                        }
                    }
                }
            }

        }


        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Carrots: " + Carrot);
        System.out.println("Potatoes: " + Potatoes);
        System.out.println("Lettuce: " + Lettuce);
        System.out.println("Harmed vegetables: " + Vegetables);

    }

    static void harmed(String a){
        if(a.equals(" ")){
            return;
        }
        if(a.equals("C") ||
        a.equals("L") || a.equals("P")) {
            Vegetables++;
        }
    }

    static void Check(String a){

        if(a.equals(" ")){
            return;
        }

        if(a.equals("C")){
            Carrot++;
        }else if(a.equals("L")){
            Lettuce++;
        }else if(a.equals("P")){
            Potatoes++;
        }
    }
}
