package LambdaVersions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));
    }

    static String removeDuplicates(String str){
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining("","Pre-", "-Post"));
    }
}
