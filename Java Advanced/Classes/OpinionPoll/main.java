package Classes.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        List<OpinionPoll> op = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = in.nextLine().split("\\s+");

            String name = line[0];
            int age = Integer.parseInt(line[1]);

            OpinionPoll ob = new OpinionPoll(name, age);
            if(ob.getAge() > 30){
                op.add(ob);
            }
        }

        Comparator<OpinionPoll> comparator = Comparator.comparing(OpinionPoll::getName);
        List<OpinionPoll> OP = op.stream().sorted(comparator)
                .collect(Collectors.toCollection(ArrayList::new));
        for (OpinionPoll opinionPoll : OP) {
            System.out.println(opinionPoll.getName() + " - " + opinionPoll.getAge());
        }







    }
}
