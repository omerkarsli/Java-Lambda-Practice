package LambdaVersions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveWord {
    public static void main(String[] args) {
        System.out.println(removeWord(new ArrayList<>(List.of("a","a","a","b","c","a")), "a"));
    }

    static List<String> removeWord(ArrayList<String> arr, String str){
        return arr.stream().filter(a-> !a.equals(str)).collect(Collectors.toList());
    }
}
