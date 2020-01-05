package string;

public class RotateString {
    public static Boolean rotateString(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }

        if ((a+a).contains(b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "abcde";
        String b = "bcdea";
        System.out.println("result:" + rotateString(a, b));
    }
}
