public class Multiples {
    public static void main(String[] args) {
        // Print out how many non-negative (but not including 0) multiples of 3 or 5 are below 1000
        System.out.println(doMultiplesLoop(1000));
        System.out.println(doMultiplesMath(1000));

    }

    private static int doMultiplesLoop(int k) {
        int count = 0;
        for (int i = 1; i < k; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                count ++;
            }
        }
        return count;
    }

    private static int doMultiplesMath(int k) {
        int multiplesOf3 = k / 3;
        int multiplesOf5 = k / 5;
        int multiplesOfBoth = k / 15;
        return multiplesOf3 + multiplesOf5 - multiplesOfBoth;
    }
}
