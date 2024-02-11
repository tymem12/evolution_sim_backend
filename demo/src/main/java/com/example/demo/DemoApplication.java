package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        int[][] grid = {{3,2,1}, {1,7,6}, {2,7,7}}; 
		HashMap<List<Integer>, Integer> map = new HashMap();
        for(int i = 0; i< grid.length; i++){
            int j = i;
            List<Integer> columns = Arrays.stream(grid)
                              .mapToInt(r -> r[j])
                              .boxed()
                              .collect(Collectors.toList());

            List<Integer> rows = Arrays.stream(grid[i])
                           .boxed()
                           .collect(Collectors.toList());
            if(map.containsKey(columns)) map.put(columns, map.get(columns) + 1);
            else map.put(columns, 1); 
            if(map.containsKey(rows)) map.put(rows, map.get(rows) + 1);
            else map.put(rows, 1); 
        }

        int sum = 0;
        for(List<Integer> elem : map.keySet()){
            Integer count = map.get(elem);
            sum += ((count * (count -1))/2);
            
        }

    System.out.println(sum);
	}

}
