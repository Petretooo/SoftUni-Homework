package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class softUniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, String> parkingDatabase = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            Matcher m = Pattern.compile("(\\w+) (\\w+) *(\\w*)")
                    .matcher(reader.readLine());

            if (m.find()) {
                String command = (m.group(1));
                String usernameCurrent = (m.group(2));

                if (command.equals("register")) {

                    if (parkingDatabase.containsKey(usernameCurrent)) {
                        System.out.printf("ERROR: already registered with plate number %s\n",
                                parkingDatabase.get(usernameCurrent));
                    } else {
                        System.out.printf("%s registered %s successfully\n", usernameCurrent, m.group(3));
                        parkingDatabase.put(usernameCurrent, m.group(3));
                    }
                } else if (command.equals("unregister")) {
                    if (!parkingDatabase.containsKey(usernameCurrent)) {
                        System.out.printf("ERROR: user %s not found\n", usernameCurrent);
                    } else {
                        System.out.printf("%s unregistered successfully\n", usernameCurrent);
                        parkingDatabase.remove(usernameCurrent);
                    }
                }
            }
        }


        for (Map.Entry kv : parkingDatabase.entrySet()
        ) {
            System.out.printf("%s => %s \n", kv.getKey(), kv.getValue());
        }
    }
}
