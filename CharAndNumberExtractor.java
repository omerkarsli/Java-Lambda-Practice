package LambdaVersions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharAndNumberExtractor {
    public static void main(String[] args) {

        String exp = "saldjf9s87dffdg68fd5h768fdh7gf";
        System.out.println("Letters are " + letterExtractor(exp)+ "\nNumbers are " + numberExtractor(exp));
    }

    static List<String> numberExtractor(String str){
//        return  str.chars()
//                .filter(Character::isDigit)
//                .collect(ArrayList::new,
//                        (a,b)-> a.add(String.valueOf((char) b)),
//                        (b1,b2)-> b1.addAll(b2));
        //Collectors.toList()
        return str.chars()
                .filter(Character::isDigit)
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.toList());
    }

    static ArrayList<String> letterExtractor(String str){
        return  str.chars()
                .filter(Character::isLetter)
                .collect(ArrayList::new,
                        (a,b)-> a.add(String.valueOf((char) b)),
                        (b1,b2)-> b1.addAll(b2));
    }
}
