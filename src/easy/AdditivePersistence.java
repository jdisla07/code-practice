package easy;

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
