package collections;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        sortMap();
    }

    private static void sortMap() {
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        HashMap<String,Integer > scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);


        Set<Map.Entry<String,Integer>> entrySet= scores.entrySet();
        System.out.println(entrySet);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        System.out.println("list-"+list);

        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);

        for(Map.Entry<String,Integer> entry:list){
            map2.put(entry.getKey(), entry.getValue());
        }
        System.out.println(map2);
        }
    }

