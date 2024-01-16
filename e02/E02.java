import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner object to read user input

        //Prompt the user for the first time
        System.out.println("Give a number:");
        int x = scanner.nextInt();
        //Prompt the 2nd time
        System.out.println("Give a number:");
        int y = scanner.nextInt();        

        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " - " + y + " = " + (x-y));
        if  (y != 0) {
            System.out.println(x + " / " + y + " = " + (x/y));
        } else {
            System.out.println("Cannot divided to zero");
        }

    }
    
}
