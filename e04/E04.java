import java.util.Scanner;
public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = scanner.nextInt();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        
        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas");
        } else {
            System.out.println("");
        }
        scanner.close();
    }
    
}
