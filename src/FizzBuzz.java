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

        int idx = 1;
        while (idx < 100) {
            if (idx % 15 == 0) { // If idx is divisible by 3 and 5, print Fizz Buzz
                System.out.println("Fizz Buzz");
            } else if (idx % 5 == 0) { // If idx is divisible by 5, print Buzz
                System.out.println("Buzz");
            } else if (idx % 3 == 0) { // If idx is divisible by 3, print Fizz
                System.out.println("Fizz");
            }
            idx ++;
        }
    }
}
