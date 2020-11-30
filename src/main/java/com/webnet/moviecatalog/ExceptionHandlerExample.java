package com.webnet.moviecatalog;

import java.util.*;
import java.util.function.BiConsumer;

public class ExceptionHandlerExample {

    public static void main(String[] args) {
/*
        int [] someNumbers = {1, 2, 3, 4, 5};
        int key = 8;

        process(someNumbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
        });
*/
        Map<String, String> map = new LinkedHashMap<>();
        map.put("boy", null);
        map.put("one", "first");
        map.put("two", "second");
        map.put("three", "third");
        map.put("four", "forth");
        map.put("five", "fifth");

        System.out.println(map);
        List<String> s = new ArrayList<String>(map.values());

//        for(Map.Entry<String, String> e: map.entrySet()){
//            if(e.getKey() == null)
//                map.remove(null);
//        }
        System.out.println(Arrays.toString(s.toArray()));
    }

    public static void process(int [] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer){
        for(int i: someNumbers){
           biConsumer.accept(i, key);
        }
    }
}
