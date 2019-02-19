package org.salem;

import java.util.*;

public class spy {

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<>();

        for (String[] strings: clothes){
            map.put(strings[1],map.getOrDefault(strings[0],1) + 1
            );
        }

        for (String string : map.keySet()){
            answer = answer * map.get(string);
        }

        return answer - 1;
    }

    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
        System.out.println(solution(clothes));

    }
}
