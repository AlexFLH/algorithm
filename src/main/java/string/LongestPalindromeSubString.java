package string;

/**
 * @author bjfenglihang
 */
public class LongestPalindromeSubString {
    public static int longestPalindromeSubString(String temp) {

        int len = temp.length();
        if (len == 0) {
            return 0;
        }
        String longestString = temp.substring(0, 1);
        for (int i = 0; i < temp.length(); i++) {
            String tmp = helper(temp, i, i);
            if (tmp.length() > longestString.length()) {
                longestString = tmp;
            }

            tmp = helper(temp, i, i+1);
            if (tmp.length() > longestString.length()) {
                longestString = tmp;
            }
        }

        System.out.println("result:" + longestString);
        System.out.println("result's len is :" + longestString.length());
        return longestString.length();
    }

    public static String helper(String temp, int begin, int end) {
        while (begin >= 0 && end <= temp.length() - 1 && temp.charAt(begin) == temp.charAt(end)) {
            begin--;
            end++;
        }

        String subString = temp.substring(begin+1,end);
        return subString;
    }

    public static void main(String[] args) {
        String temp = "ababa";
        longestPalindromeSubString(temp);
    }
}
