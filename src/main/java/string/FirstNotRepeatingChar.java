package string;

import java.util.HashMap;

public class FirstNotRepeatingChar {
    public static char firstNotRepeatingChar(String temp) {
        int len = temp.length();
        if (len == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i<len; i++) {
            if(hashMap.containsKey(temp.charAt(i))) {
                int value = hashMap.get(temp.charAt(i));
                hashMap.put(temp.charAt(i), value + 1);
            } else {
                hashMap.put(temp.charAt(i), 1);
            }
        }

        for (int i = 0; i< len; i++) {
            if (hashMap.get(temp.charAt(i)) == 1) {
                return temp.charAt(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String temp = "aabvcdds";
        System.out.println("result:" + firstNotRepeatingChar(temp));
    }
}
