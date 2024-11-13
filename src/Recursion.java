public class Recursion {
    public static void main(String[] args) {

        System.out.println(recursiveFactorial( 4));

    }
    public static long factorial(int number) {
        int result = 1;
        for(int i = 2; i <= number; i++) {

            result = result * i;
        }
        return result;
    }
    public static long recursiveFactorial(int number) {
        if (number <=1) return 1;
        return number * recursiveFactorial(number - 1);
    }
    public static int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

}
