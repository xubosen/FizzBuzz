/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }

        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    // Does FizzBuzz from 0 to 100
    public static void do100FizzBuzz() {
        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    // Does Fizzbuzz on a positive integer i
    private static int doFizzBuzz(int i) {
        if (i % 15 == 0) { // If i is divisible by 3 and 5, print Fizz Buzz
            System.out.println("Fizz Buzz");
        } else if (i % 5 == 0) { // If i is divisible by 5, print Buzz
            System.out.println("Buzz");
        } else if (i % 3 == 0) { // If i is divisible by 3, print Fizz
            System.out.println("Fizz");
        }
        i++;
        return i;
    }
}
