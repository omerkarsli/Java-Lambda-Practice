package JavaExample;

import java.util.*;
import java.util.stream.IntStream;

public class $_7_11 {

    public static void main(String[] codingInJavaIsFun) {
        //Lesson05_1_for_Loop.timer(4);
        //System.out.println(removeDuplicates("racecar"));
        //System.out.println(isReverse("racecar"));
        //System.out.println(isPalindrome("madam"));
        //System.out.println(extracter("a1b2c3d4f5"));
        //System.out.println(Arrays.toString(arrayGenerater(10)));
    }

    //2. Write method that accepts a String and removes all duplicate from String. EX : aaabbc --> abc
    static String removeDuplicates(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);
            if(!result.contains(eachLetter + ""))
                result += eachLetter;
        }
        return result;
    }

    //4. Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj
    static String isReverse(String str){
        String reversedString = "";
        for(int i = str.length() - 1; i >= 0; i--)
            reversedString += str.charAt(i);
        return reversedString;
    }

    //5. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    static boolean isPalindrome(String str){
        //1st Logic:
//        for(int i = 0, j = 1; i < str.length()/2; i++, j++){
//            if(str.charAt(i) != str.charAt(str.length() - j))
//                return false;
//        }
//        return true;

        //2nd Logic:
        String reversed = isReverse(str);
        return reversed.equals(str);
    }

    //3. Write method that accepts a String and extracts letters and numbers. Method should return a String. EX: a1b2c3 --> Letters are abc and numbers are 123.
    static String extracter(String str){

        String letters, numbers;
        letters = numbers = "";

        for(int i = 0; i < str.length(); i++){
            char eachLetter = str.charAt(i);
            if(Character.isLetter(eachLetter))
                letters += eachLetter;
            if(Character.isDigit(eachLetter))
                numbers += eachLetter;
        }
        return "Letters are " + letters + " Numbers are " + numbers;
    }
    //8. Write a method that generates a single dimensional Array that consists of x numbers random numbers between 1 and 100. Method will accept int x as an argument.
    static int[] arrayGenerater(int num){
        int[] myArray = new int[num];
        for(int i = 0; i < myArray.length; i++)
            myArray[i] = new Random().nextInt(100);
        return myArray;
    }

    // 9. Write a method that accepts an Array of integers and returns the max and the secondMax.
    static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
    }
    static int findMaxsLE(int[] arr){
        Integer max2 = Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
        return max2;
    }

}
