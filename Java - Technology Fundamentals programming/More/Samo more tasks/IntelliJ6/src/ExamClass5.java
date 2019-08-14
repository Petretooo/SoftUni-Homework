import java.util.Scanner;

public class ExamClass5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberPeople = Integer.parseInt(in.nextLine());
        int numberStops = Integer.parseInt(in.nextLine());
        int people = 0, finalPeople = 0;
        int counter = 2;


        for (int i = 1; i <= numberStops; i++) {
            int minusPeople = Integer.parseInt(in.nextLine());
            int plusPeople = Integer.parseInt(in.nextLine());
/*

            if(i % 2 == 1){
                people = numberPeople - minusPeople;

            }else if(i % 2 == 0){
                people = numberPeople + minusPeople;

            }
*/

            people = numberPeople - minusPeople + plusPeople;
//             numberPeople = people;
//             finalPeople = people;

            if (i % 2 == 1) {
                people = people + 2;
            } else if (i % 2 == 0) {
                people = people - 2;
            }
            numberPeople = people;
            finalPeople = people;

        }
        System.out.printf("The final number of passengers is : %d", finalPeople);

    }
}
