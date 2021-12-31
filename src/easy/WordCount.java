package easy;

public class WordCount {
    public static int wordCount(String a, String b) {
        int[] timesA = new int [26];
        int[] timesB = new int [26];
        for(char c: a.toCharArray()){
            timesA[c-'a']+=1;
        }
        for(char c: b.toCharArray()){
            timesB[c-'a']+=1;
        }
        int count = Integer.MAX_VALUE;
        for(char c: a.toCharArray()){
            if(timesA[c-'a']!=0){
                count = Math.min(count,timesB[c-'a']/timesA[c-'a']);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("abc","abcfgdfabc"));;
    }
}
