package InterfacesAndAbstractions.food;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(in.nextLine());

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String person = in.nextLine();
            String[] personArray = person.split("\\s+");

            if(personArray.length == 4){
                Person person1 = new Citizen(personArray[0],
                        Integer.parseInt(personArray[1]), personArray[2], personArray[3]);
                people.add(person1);
            }else if(personArray.length == 3){
                Person person1 = new Rebel(personArray[0], Integer.parseInt(personArray[1]),
                        personArray[2]);
                people.add(person1);
            }
        }

        String input;

        while(!"End".equals(input = in.nextLine())){

            for (Person person : people) {
                if(person.getName().equals(input)){
                    if(person instanceof Citizen){
                        ((Citizen) person).buyFood();
                    }
                    if(person instanceof Rebel){
                        ((Rebel) person).buyFood();
                    }
                }
            }
        }

        int sum = 0;
        for (Person person : people) {
            sum += ((Buyer) person).getFood();
        }

        System.out.println(sum);


    }
}