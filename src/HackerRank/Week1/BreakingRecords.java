package HackerRank.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Given the scores for a season, determine the number of times Maria breaks her records
 * for most and least points scored during the season.
 *
 */
public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> recordsCount = new ArrayList<>();
        int countMin = 0;
        int countMax = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        for(int i = 1; i<scores.size();i++){
            int points = scores.get(i);
            if( points < min){
                countMin++;
                min = points;
                continue;
            }
            if(max < points){
                countMax++;
                max = points;
            }
        }
        recordsCount.add(countMin);
        recordsCount.add(countMax);
        return recordsCount;
    }

    public static void main(String[] args) {
        Integer [] x = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        List<Integer> integers = Arrays.asList(x);
        System.out.println(breakingRecords(integers));
    }
}
