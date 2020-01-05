package string;

public class LeftRotateString {
    public static String leftRotateString(String temp, int n) {
        int len = temp.length();
        if(len == 0) {
            return "";
        }
        n = n % len;
        String s1 = temp.substring(n, len);
        String s2 = temp.substring(0, n);
        return s1+s2;
    }

    public static void main(String[] args) {
        String temp = "abcde";
        int n = 13;
        System.out.println("result:" + leftRotateString(temp, n));
    }
}
