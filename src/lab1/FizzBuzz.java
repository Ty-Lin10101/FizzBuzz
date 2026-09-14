package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        doFizzBuzz(3, 5, 100);
    }

    static void doFizzBuzz(int a, int b, int n) {
        int x = 0;
        while (x <= n) {
            boolean divByA = x % a == 0;
            boolean divByB = x % b == 0;
            if (divByA && divByB) {
                System.out.println("Fizz Buzz");
            } else if (divByA) {
                System.out.println("Fizz");
            } else if (divByB) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
            x++;
        }
    }
}
