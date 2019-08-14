import java.util.Scanner;

public class whileLoop9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String book = in.nextLine();
        int books = Integer.parseInt(in.nextLine());

        String wantedBook = "";
        int counter = 0;

        while (true) {
            counter++;
            wantedBook = in.nextLine();

            if (wantedBook.equalsIgnoreCase(book)) {
                System.out.printf("You checked %d books and found it.", counter - 1);
            } else if (counter == books && !wantedBook.equalsIgnoreCase(book)) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", counter);
            }
        }

    }
}
