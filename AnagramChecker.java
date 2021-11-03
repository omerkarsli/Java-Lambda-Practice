package LambdaVersions;

import java.util.Arrays;
import java.util.stream.Stream;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(isAnagram("elbow", "below"));
    }

    static boolean isAnagram(String str1, String str2){
        return Arrays.equals(str1.chars().sorted().toArray(),
                            str2.chars().sorted().toArray());
    }
}
