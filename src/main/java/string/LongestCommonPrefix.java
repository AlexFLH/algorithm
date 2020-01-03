package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] temp) {
        StringBuffer res = new StringBuffer();
        if (temp == null || temp.length == 0) {
            return "";
        }
        Arrays.sort(temp);
        char[] first = temp[0].toCharArray();
        char[] end = temp[temp.length - 1].toCharArray();
        int len = Math.min(first.length, end.length);
        for (int i = 0; i < len; i++) {
            if(first[i] == end[i]) {
                res.append(first[i]);
            }else {
                break;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] temp = {"abcd", "abc", "abcde"};
        String[] temp1 = {"abcd", "", "abcde"};
        String[] temp2 = {};

        System.out.println("temp:" + longestCommonPrefix(temp));
        System.out.println("temp1:" + longestCommonPrefix(temp1));
        System.out.println("temp2:" + longestCommonPrefix(temp2));

    }


}
