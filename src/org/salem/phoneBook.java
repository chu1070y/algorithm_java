package org.salem;

public class phoneBook {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String str: phone_book){
            for (int i = 0; i < phone_book.length; i++) {

                if (str.equals(phone_book[i])){ continue; }
                if (str.length() > phone_book[i].length()) {continue;}
                if (phone_book[i].substring(0,str.length()).equals(str)){
                    return false;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        String[] book = {"119", "97674223", "1195524421"};
        System.out.println(solution(book));

    }
}
