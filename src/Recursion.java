public class Recursion {
    public static void main(String[] args) {

        System.out.println(factorial( 5));

    }
    public static long factorial(int number) {
        int result = 1;
        for(int i = 2; i <= number; i++) {

            result = result * i;
        }
        return result;
    }
}
