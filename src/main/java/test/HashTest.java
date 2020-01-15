package test;
import com.google.common.hash.Hashing;

public class HashTest {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaa";
        int hashCode = 0;
        hashCode = Hashing.murmur3_32().hashUnencodedChars(str).asInt();
        hashCode = Math.abs(hashCode);
        int bucket = hashCode % 100;

        System.out.println("result:" + bucket);
    }
}
