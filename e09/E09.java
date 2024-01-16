import java.util.Scanner;

public class E09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0; 
        int count = 0;   

        System.out.println("Give a test score (-1 to quit):");

        double score = scanner.nextDouble();

        while (score != -1) { 
            total += score; 
            count++; 

            double average = (double) total / count;
            System.out.println("Average: " + average);
         
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();
        }
        
        if (count > 0) {
            System.out.println("Program terminated. Total number of scores: " + count);
        } else {
            System.out.println("");
        }

        scanner.close();
    }
}
