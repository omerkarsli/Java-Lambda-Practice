package LambdaVersions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayGenerator {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayGenerator(6)));
    }

    static int[] arrayGenerator(int x){
        Random random = new Random();
        return random.ints(x, 1,100)
                           .toArray();
    }
}
