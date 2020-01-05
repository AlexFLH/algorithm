package string;

public class ContainString {
    public static Boolean containString(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if (len2 > len1 || len1 == 0) {
            return false;
        }
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        int i=0,j=0;
        while (i < len1 && j < len2) {
            if(b1[j] == a1[i]) {
                i++;
                j++;
            } else {
                i++;
                j=0;
            }
        }
        if (j >= len2) {
            System.out.println("position is " + (i - j));
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "abcdee3";
        String b = "cde";
        System.out.println(containString(a, b));
    }
}
