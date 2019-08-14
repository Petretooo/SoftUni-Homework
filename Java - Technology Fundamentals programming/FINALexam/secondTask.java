package FINALexam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedHashMap<String, List<String>> store = new LinkedHashMap<>();

        String command = "";

        while (!"END".equals(command = in.nextLine())){
            String[] line = command.split("->");
            
            
            if (line[0].equals("Add")){
                if(!store.containsKey(line[1])){
                    store.put(line[1], new ArrayList<>());
                    if(line[2].contains(",")){
                        String[] lists = line[2].split(",");
                        for (int i = 0; i < lists.length; i++) {
                            store.get(line[1]).add(lists[i]);
                        }
                    }else {
                        store.get(line[1]).add(line[2]);
                    }
                }else {
                    if(line[2].contains(",")){
                        String[] lists = line[2].split(",");
                        for (int i = 0; i < lists.length; i++) {
                            if(!store.containsValue(lists[i])) {
                                store.get(line[1]).add(lists[i]);
                            }
                        }
                    }else {
                        if(!store.containsValue(line[2])) {
                            store.get(line[1]).add(line[2]);
                        }
                    }
                }
            }else if(line[0].equals("Remove")) {
                if(store.containsKey(line[1])) {
                    store.remove(line[1]);
                }
            }
        }


        System.out.println("Stores list:");
        store.entrySet().stream().sorted((e1, e2) -> {
            int length = Integer.compare(e2.getValue().size(), e1.getValue().size());
            if (length == 0) {
                length = e2.getKey().compareTo(e1.getKey());
            }
            return length;
        }).forEach(key -> {
            System.out.println(String.format("%s", key.getKey()));
            key.getValue().forEach(u -> {
                System.out.println(String.format("<<%s>>", u));
            });
        });
    }
}
