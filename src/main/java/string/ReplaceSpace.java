package string;

/**
 * @author bjfenglihang
 * please repalce space in %20 at string
 */
public class ReplaceSpace {
    public static String replaceSpace(String temp) {
        StringBuffer tmp = new StringBuffer();
        int len = temp.length();
        for (int i = 0; i < len; i++) {
            if (temp.charAt(i) == ' ') {
                tmp.append("%20");
            } else {
                tmp.append(temp.charAt(i));
            }
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        String temp = "I am a student! ";
        String tmp = replaceSpace(temp);
        System.out.println("result is :" + tmp);
    }
}
