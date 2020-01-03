package test;

public class SubString {
    public static void main(String[] args) {
        String api = "/nc-omad/api/v1/article/preload/ES4GVICA0001899O/full";
        int length = api.length();
        String contentId = api.substring(length - 21,length - 5);
        System.out.println(contentId);
    }
}
