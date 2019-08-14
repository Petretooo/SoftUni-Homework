package AbstractionsEnumerationsStatic.TrafficLight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String[] input = in.nextLine().split("\\s+");

        int n = Integer.parseInt(in.nextLine());

        TrafficLight[] lights = new TrafficLight[input.length];

        for (int i = 0; i < input.length; i++) {
            lights[i] = TrafficLight.valueOf(input[i]);
        }

        StringBuilder builder = new StringBuilder();

        TrafficLight[] lightsValues  = {TrafficLight.RED, TrafficLight.GREEN, TrafficLight.YELLOW};
        while (n-- > 0){
            for (int i = 0; i < lights.length; i++) {
                TrafficLight light = lights[i];

                if(lights[i].ordinal()==2){
                    lights[i] = TrafficLight.RED;
                }else {
                    lights[i] = lightsValues[lights[i].ordinal() + 1];
                }

                builder.append(lights[i].toString()).append(" ");

            }
            builder.append(System.lineSeparator());
        }

        System.out.println(builder.toString());

    }
}
