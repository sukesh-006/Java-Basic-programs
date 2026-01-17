
import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong();  
        if (num == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return; 
        }
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            count++;                   
            num = num / 10;    
        }
        System.out.println("Number of digits: " + count);
        sc.close();

    }
}
