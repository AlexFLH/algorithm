package string;

public class IsPalindrome {
    public static Boolean isPalindrome(String temp) {
        if (temp.length() == 0) {
            return false;
        }
        int i = 0, j = temp.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(temp.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(temp.charAt(j))) {
                j--;
            } else {
                if (Character.toLowerCase(temp.charAt(i)) != Character.toLowerCase(temp.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String temp = "A man";
        System.out.println(isPalindrome(temp));
    }
}
