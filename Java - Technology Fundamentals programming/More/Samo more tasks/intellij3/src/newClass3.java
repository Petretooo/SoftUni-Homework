import java.util.Scanner;

public class newClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int m = Integer.parseInt(in.nextLine());
        char[] symbolArray = new char[n];
        char[] symbolArray1 = new char[m];
        boolean equal = true;
        for (char i = 0; i < symbolArray.length; i++) {
            System.out.print("Input synmbol for first array: ");
            symbolArray[i] = in.next().charAt(0);
        }
        System.out.println();
        for (char i = 0; i < symbolArray1.length; i++) {
            System.out.print("Input symbol for second array: ");
            symbolArray1[i] = in.next().charAt(0);
        }
        System.out.println();
        if (symbolArray.length > symbolArray1.length) {
            System.out.println("First array is lexicographicaly first " + symbolArray);
        } else if (symbolArray.length < symbolArray1.length) {
            System.out.println("Second array is lexicographicaly  first " + symbolArray1);
        } else if (symbolArray.length == symbolArray1.length) {
            for (int i = 0; i < symbolArray.length; i++) {
                if (symbolArray[i] < symbolArray1[i]) {
                    System.out.println("First array is lexicographicaly first ");
                } else if (symbolArray[i] > symbolArray1[i]) {
                    System.out.println("Second array is lexicographicaly  first");
                }
            }
        } else {
            System.out.println("Both arrays are equals");
        }
    }
}
