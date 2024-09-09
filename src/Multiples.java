public class Multiples {
    public static void main(String[] args) {
        // Print out how many non-negative (but not including 0) multiples of 3 or 5 are below 1000
        System.out.println(doMultiplesLoop(1000));
        System.out.println(doMultiplesMath(1000));

    }

    private static int doMultiplesLoop(int k) {
        int count = 0;
        for (int i = 1; i < k; i++) { // Start at 1 to avoid counting 0
            if (i % 3 == 0 || i % 5 == 0){
                count ++;
            }
        }
        return count;
    }

    private static int doMultiplesMath(int k) {
        // Only works when the two numbers are not factors of each other
        int j = k - 1; // We are not including 1000
        int multiplesOf3 = j / 3;
        int multiplesOf5 = j / 5;
        int multiplesOfBoth = j / 15;
        return multiplesOf3 + multiplesOf5 - multiplesOfBoth;
    }
}
