package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
    public  void main(String[] args) {
        /**
         * String[] str = {"I", "AM", "LONGEST", "WORD"};
         *
         * O/P:
         * 7 : LONGEST
         * 4 : WORD
         * 2 : AM
         * 1 : I
         */

        String[] str = {"I", "AM", "LONGEST", "WORD"};
        //Map<String,Long> map= Arrays.stream(str).collect(Collectors.groupingBy(x->x,Collectors.counting()));

        //map.entrySet().stream().map(x->x.getValue(),x.getKey(),()).

        /*map.entrySet().stream().sorted((o1,o2)->{
            return Math.toIntExact(o2.getValue() - o1.getValue());
        }).forEach(System.out::println);*/


        Arrays.stream(str).sorted((o1,o2)->o2.length()-o1.length()).forEach(s->System.out.println(s.length()+" : "+s));
    } 
}
