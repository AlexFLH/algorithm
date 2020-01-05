package string;

public class StrToInt {
    public static long strToInt(String temp) {
        int len = temp.length();
        if (len == 0) {
            return 0;
        }
        int symbol = 1;
        long res = 0;
        if (temp.charAt(0) == '-') {
            symbol = -1;
        }
        for (int i = (temp.charAt(0) == '+' || temp.charAt(0) == '-') ? 1:0; i< len; i++) {
            if(temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
                res = res*10 + (temp.charAt(i) - '0');
            } else {
                return 0;
            }
        }
        return res*symbol;
    }

    public static void main(String[] args) {
        String temp = "123456";
        String temp2 = "+123445";
        String temp3 = "-123445";
        System.out.println("result:" + strToInt(temp));
        System.out.println("result:" + strToInt(temp2));
        System.out.println("result:" + strToInt(temp3));
    }
}
