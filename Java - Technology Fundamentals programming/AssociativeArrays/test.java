package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;

public class test {


    public static void main(String[] args) {


        Map<Integer, Map<String, Integer>> mapse = new HashMap<>();
        Map<String, Integer> mapse1 = new HashMap<>();
        mapse1.put("Ivan", 53);
        mapse.put(1, mapse1);

        System.out.println(mapse);

        mapse1.clear();

        System.out.println(mapse);


        mapse1.remove(1);

        System.out.println(mapse);
    }


}
