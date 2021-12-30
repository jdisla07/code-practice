package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function ABCheck(str) take the str parameter being passed
 * and return the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (i.e. "lane borrowed" would result in true
 * because there is exactly three characters between a and b). Otherwise, return the string false.
 */
public class AbCheck {
    private static String aBCheck (String s){
        Pattern pattern = Pattern.compile("(a...b|b...a)");
        Matcher matcher = pattern.matcher(s);
        return matcher.find() ? "true":"false";
    }

    public static void main(String[] args) {
        String result1 = aBCheck("agfdb");
        System.out.println(result1);
        String result2 = aBCheck("assbhfdgfbdds");
        System.out.println(result2);
    }
}
