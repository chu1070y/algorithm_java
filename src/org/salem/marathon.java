package org.salem;

import java.util.HashMap;
import java.util.Map;

public class marathon {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map1 = new HashMap<>();

        for (String str: participant) {
            if (map1.get(str) == null){
                map1.put(str,1);
                continue;
            }
            map1.put(str, map1.get(str) + 1);
        }

        for (String string : completion) {

            map1.put(string,map1.get(string) - 1);

            if (map1.get(string) == 0){
                map1.remove(string);
            }
        }

        for (String s : map1.keySet()){
            answer = s;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] data1 = {"leo", "kiki", "eden"};
        String[] compare1 = {"kiki", "eden"};

        System.out.println(solution(data1, compare1));
    }
}
