import java.util.Scanner;

public class whileLoop7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width = Integer.parseInt(in.nextLine());
        int lenght = Integer.parseInt(in.nextLine());
        int height = Integer.parseInt(in.nextLine());

        int cubicMeter = width * lenght * height;
        boolean volume = true;

        String box1 = in.nextLine();
        while (!box1.equalsIgnoreCase("Done")) {

            int box = Integer.parseInt(box1);

            cubicMeter -= box;

            if (cubicMeter < 0) {
                volume = false;
                break;
            }
            box1 = in.nextLine();

        }
        if (volume) {
            System.out.printf("%d Cubic meters left.", cubicMeter);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(cubicMeter));
        }

    }
}
