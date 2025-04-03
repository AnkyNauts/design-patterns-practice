package com.test;

import io.swagger.models.auth.In;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDemo {

    public static void main(String[] args) {
        //I
        int sum=5;
        int array[]= {0,1,2,3,4,5,6,7,8,9};
        //pair of sum is 5
        // 0,5  , 1,4 ,
        //Arrays.stream(i).asDoubleStream().filter(xx->x/5==0)

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]+array[j]==sum){
                    System.out.println(array[i]+" "+array[j]);
                }
            }

        }

        //product , brand , price
        String product[]= {"Iphone","Macbook","Chromebook"};
        String brand[]= {"Apple","Samsung","Google"};
        int price[]= {10,20,30};


        int array1[]= {0,1,2,3,11,4,5,6,7,8,9,1,2,3,0};
        Map<Integer, Integer> map= new HashMap<>();

        Map<Integer,Long> map1= Arrays.stream(array1).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map1.entrySet().stream().filter(x->x.getValue()==1).findFirst());

        for (int i = 0; i < array1.length; i++) {
            //if(map.containsKey(array1[i])) {
                map.put(array1[i], map.getOrDefault(array1[i],0)+1);
           // }
        }

       // System.out.println(map);

      //  System.out.println(map.entrySet().stream().filter(x->x.getValue()==1).findFirst());
        System.out.println(Arrays.stream(array1).boxed().filter(x->map.get(x)==1).findFirst());
       // if(map.get())

    }
}
