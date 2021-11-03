package LambdaVersions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findUnique(new ArrayList(Arrays.asList(1,1,1,1,1,2,3,4,5,5))));
    }

    static List<Integer> findUnique(ArrayList<Integer> x){
        return x.stream().filter(a-> Collections.frequency(x, a) == 1).collect(Collectors.toList());
    }
}
