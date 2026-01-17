import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        String input = scanner.nextLine();

        int countZero = input.length() - input.replace("0", "").length();
        int countOne = input.length() - input.replace("1", "").length();

        System.out.println("Number of 0s: " + countZero);
        System.out.println("Number of 1s: " + countOne);
        scanner.close();
    }
}