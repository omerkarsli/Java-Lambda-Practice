package LambdaVersions;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Omer"));
        System.out.println(isPalindrome("Efe"));
    }

    static boolean isPalindrome(String str){
        return str.equalsIgnoreCase(str
                .chars()
                .collect(StringBuilder::new, (b,c)-> b.insert(0,(char) c), (b1,b2)-> b1.insert(0, b2)).toString());

    }
}
