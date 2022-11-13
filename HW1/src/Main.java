import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert array length: ");
        int len = scanner.nextInt();
        double[] array = new double[len];
        for (int i = 0; i < len; i++){
            array[i] = Math.random();
        }
        System.out.print("Array:");
        for (int i = 0; i < len; i++){
            System.out.print( String.format(" %.3f", array[i]));
        }
        double max = Arrays.stream(array).max().getAsDouble();
        double average = Arrays.stream(array).average().getAsDouble();
        double min = Arrays.stream(array).min().getAsDouble();
        System.out.print(String.format("\nMaximum value:\t%.3f", max));
        System.out.print(String.format("\nAverage value:\t%.3f", average));
        System.out.print(String.format("\nMinimum value:\t%.3f", min));
        System.out.print(String.format("\nPrime numbers in range (2, 100): "));
        for (int i = 2; i < 100; i++){
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }

    }
}
