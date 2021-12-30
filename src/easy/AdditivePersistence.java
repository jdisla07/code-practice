package easy;

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its additive persistence which is the number of times
 * you must add the digits in num until you reach a single digit.
 * ---
 * For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9.
 */
public class AdditivePersistence {
    private static int additivePersistence(int num){
        int count = 0;
        int numAux = num;
        while (numAux > 9){
            String [] digits = String.valueOf(numAux).split("");
            int sum = 0;
            for(String digit : digits){
                sum += Integer.parseInt(digit);
            }
            count++;
            numAux = sum;
        }
        return count;
    }
    public static void main(String[] args) {
        int result1 = additivePersistence(199);
        System.out.println(result1);
        int result2 = additivePersistence(913);
        System.out.println(result2);
    }
}
