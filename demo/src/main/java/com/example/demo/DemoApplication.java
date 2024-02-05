package com.example.demo;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		Character[] vowelss = {'a','e', 'i', 'o', 'u'};
        ArrayList<Character> vowels = new ArrayList<Character>();
        Collections.addAll(vowels, vowelss); 
        
        String s = "Hello";
        int len_str = s.length();
        // if (len_str == 1) ret s;
        int left_index = -1;
        int right_index = -1;
        StringBuilder string = new StringBuilder(s);
        for(int i = 0, j = len_str -1;i < j; i++, j-- ){
            if (!vowels.contains(s.charAt(i)) && !vowels.contains(s.charAt(j))){
                System.out.println(!vowels.contains(s.charAt(i)));
                System.out.println(!vowels.contains(s.charAt(j)));
                System.out.println(vowels.get(0));

            continue;
            }

            else if (vowels.contains(s.charAt(i)) && !vowels.contains(s.charAt(j))){
                 i--;
            }
            else if (!vowels.contains(s.charAt(i))&& vowels.contains(s.charAt(j))){
                 j++;
            }
            else{
                string.setCharAt(i, s.charAt(j));
                string.setCharAt(j, s.charAt(i));

            }

            

        }
        System.out.println(string.toString());
           
	}

}
