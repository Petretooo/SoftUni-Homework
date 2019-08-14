import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayList3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> listArr = new ArrayList();
        for (int i = 0; i < 5; i++) {
            listArr.add(i);
            listArr.size();
        }

        System.out.println(Arrays.toString(listArr.toArray()));
/*

        add(T element);
        get(Index);
        remove(Index);
        remove(Element);
        size();

*/


    }
}
