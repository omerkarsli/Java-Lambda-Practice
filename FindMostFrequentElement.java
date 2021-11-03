package LambdaVersions;

import java.util.*;

public class FindMostFrequentElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("aaaaaaaeeeeiiddddddd".split("")));
        String mostFrequent = list.stream()
                .sorted(Comparator.comparingInt(a -> Collections.frequency(list, a)))
                .skip(list.size()-1)
                .findFirst().get();
        System.out.println(mostFrequent);
    }

//    static char findMostFrequentElement(String str){
//        Arrays.asList(str.split("")).stream()
//    }
}
