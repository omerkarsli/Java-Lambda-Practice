package LambdaVersions;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverse("Omer Karsli"));
    }

    public static String reverse(String str){
        return Arrays.stream(str.split(""))
                .collect(StringBuilder::new, (b,c) -> b.insert(0,c), (b1,b2) -> b1.insert(0, b2))
                .toString();
    }
}
