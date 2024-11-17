import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 чисел");

        int[] arr = new int[5];

        for(int i = 0; i<5; i++){
            arr[i] = scanner.nextInt();

        }

        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}