package string;

public class ReverseWords {

    public static String reverseWords(String temp) {
        if (temp.length() == 0) {
            return "";
        }
        String[] tmp = temp.trim().split(" ");
        String res = "";
        for (int i = tmp.length-1; i >=0; i--) {
            res = res + tmp[i] + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String temp = "I am alex";
        System.out.println("result:" + reverseWords(temp));
    }
}
