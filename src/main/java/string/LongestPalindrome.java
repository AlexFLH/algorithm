package string;

import java.util.HashSet;

/**
 * @author bjfenglihang
 */
public class LongestPalindrome {
    public static int longestPalindrome(String temp) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int count = 0;
        int len = temp.length();
        if (len == 0) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (hashSet.contains(temp.charAt(i))) {
                hashSet.remove(temp.charAt(i));
                count++;
            } else {
                hashSet.add(temp.charAt(i));
            }
        }

        if (hashSet.isEmpty()) {
            return count*2;
        } else {
            return count*2 + 1;
        }
    }

    public static void main(String[] args) {
        String temp = "abc";
        System.out.println(longestPalindrome(temp));
    }
}
