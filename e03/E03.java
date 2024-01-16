
    import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        if (num >=0) {
            System.out.println("Positive number");
        } else { System.out.println("Negative number");}
        scanner.close();
    }
}

