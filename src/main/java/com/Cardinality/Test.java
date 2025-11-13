package com.Cardinality;


/*given an array as an input and chunk size, return an array with multiple arrays, each
 array of size equal to chunk sizeInput array = [1,2,3, 4, 5,6,7, 8, 9, 10]
Chunk size = 2
output = [[1,2], [3,4], [5,6], [7,8], [9, 10]]*/

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3, 4, 5,6,7, 8, 9, 10));
        int chunkSize = 2;

        System.out.println(convertInGivenChunk(list,chunkSize));

    }

    public static List<List<Integer>> convertInGivenChunk(List<Integer> list,int chunk){

        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        while(index < list.size()){ // 10;
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < chunk; j++){
                temp.add(list.get(index));
                index++;
            }
            result.add(temp);
        }

        return result;
    }

}
