package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed
 * and return the string with the letters in alphabetical order (i.e. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */
public class AlphabetSoup {

    private static String alphabetSoup(String str){
        List<String> stringList = Arrays.asList(str.split(""));
        Collections.sort(stringList);
        return String.join("", stringList);
    }

    public static void main(String[] args) {
        System.out.println(alphabetSoup("hello"));
    }
}
