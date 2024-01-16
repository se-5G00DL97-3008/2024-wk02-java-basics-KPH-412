import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show ?");
        int num = scanner.nextInt();

        //Choose multiplication to show
        for ( int i = 0 ; i <=10; i++ ) {
            System.out.println(i + "*" + num + "=" + (num*i));
        }
        scanner.close();
    }
}
