package collections;

import java.util.*;

public class SortHashMapByKey {
    public static void main(String[] args) {
        sortMap();
    }

    private static void sortMap() {

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);


        TreeMap<String, Integer> sortedMap = new TreeMap<>(scores);
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}

