package string;

public class ReverseString {
    public static String reverseString(String temp){
        int len = temp.length();
        if (len == 0) {
            return "";
        }
        char[] tmp = temp.toCharArray();
        for (int i=0; i<len; i++) {
            char t = tmp[i];
            tmp[i] = tmp[len-1];
            tmp[len-1] = t;
            len--;
        }

        return new String(tmp);
    }

    public static void main(String[] args) {
        String temp = "hello";
        String temp2 = "i'm a student!";
        System.out.println("result:" + reverseString(temp));
        System.out.println("result:" + reverseString(temp2));
    }
}
