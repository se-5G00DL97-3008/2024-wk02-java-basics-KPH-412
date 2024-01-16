import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Give a number (0 to quit)");
        int num = scanner.nextInt();
        
        //Check if the number is 0
        if (num == 0) {
            break;
        }

        if (num > 0) {
            if (num % 2 == 0) {
            System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
        else {
             System.out.println("GIve a positive number");}
        
    } 
    scanner.close();
    }
}
