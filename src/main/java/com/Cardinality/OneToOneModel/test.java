package com.Cardinality.OneToOneModel;

import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Rohit", "Viru", "Rishabh", "Yashaswi", "Anil"));

        List<String> res = arr.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }else if(o1.length() < o2.length()){
                    return -1;
                }else
                    //Viru o1, anil 02
                    return o1.compareTo(o2);
            }
        }).collect(Collectors.toList());

        List<String> ans  = arr.stream().sorted(
                Comparator.comparingInt(String:: length)
                        .thenComparing(Comparator.naturalOrder())
        ).collect(Collectors.toList());

        System.out.println(ans);

//        Collections.sort(res);
//        System.out.println(res);
    }
}
