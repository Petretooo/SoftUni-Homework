package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while(!"stop".equalsIgnoreCase(name = in.nextLine())){
            String email = in.nextLine();

            if(!email.endsWith("us") &&
            !email.endsWith("uk") &&
            !email.endsWith("com")){
                emails.putIfAbsent(name, email);
            }


        }


        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(String.format("%s -> %s",entry.getKey(),entry.getValue()));
        }
    }
}
