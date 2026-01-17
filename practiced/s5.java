import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the User name ");
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}