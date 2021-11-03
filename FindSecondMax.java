package LambdaVersions;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondMax {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findMaxs(new int[]{4,5,2,7,9,1,7,8})));
    }

    static int[] findMaxs(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Collections.reverseOrder())
                .mapToInt(a-> a)
                .limit(2)
                .toArray();

    }
}
