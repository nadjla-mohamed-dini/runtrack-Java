package  com.exemple;
import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("ton prenom ?");
            String saisie = scanner.nextLine();
            System.out.println("Bonjour " +saisie);
        }
    }
}