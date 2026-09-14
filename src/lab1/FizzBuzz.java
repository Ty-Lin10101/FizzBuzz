package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        doFizzBuzz();
    }

    private static void doFizzBuzz() {
        int x = 0;
        while (x <= 100) {
            boolean divBy3 = x % 3 == 0;
            boolean divBy5 = x % 5 == 0;
            if (divBy3 && divBy5) {
                System.out.println("Fizz Buzz");
            } else if (divBy3) {
                System.out.println("Fizz");
            } else if (divBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
            x++;
        }
    }
}
