import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int input = scanner.nextInt();

        int[] numbers = new int[input];

        System.out.println("Enter  integers:");
        for (int i = 0; i < input; i++) {
            numbers[i] = scanner.nextInt();
        }

        int countOdd = 0;
        int countEven = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        scanner.close();
        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
    }
}