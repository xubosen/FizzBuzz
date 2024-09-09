public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduceItLoop(100));
    }
    public static int reduceItLoop(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            count ++;
        }
        return count;
    }
}
