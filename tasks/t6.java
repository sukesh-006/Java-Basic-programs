import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.print("Enter an String: ");
        String s = su.nextLine();
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        su.close();
    }
}
