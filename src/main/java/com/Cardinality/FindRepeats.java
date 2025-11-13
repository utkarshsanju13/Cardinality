package com.Cardinality;

/*Given an array of numbers which repeat and the repetitions are consecutive.
FInd the number with largest consecutive repetations.

        Eg:Input [1,1,1,1,2,2,2,2,2,1,1,1,1,1,1,3,3,3,3,3]
        output = 1*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRepeats {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,1,1,1,2,2,2,2,2,1,1,1,1,1,1,3,3,3,3,3));

        System.out.println(findMaxRepeat(arr));

    }

    public static int findMaxRepeat(List<Integer> list){

        HashMap<Integer,Integer> hm = new HashMap();
        int max = 0;
        int ans = list.get(0);

        for(int i = 0; i < list.size(); i++){
            int ele = list.get(i);
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
            if(max < hm.get(ele)){
                ans = ele;
                max = hm.get(ele);
            }
        }

        return ans;

    }

//    select * from employee limit 10 offset 2

}
