/********************************
 * Indicates that the main class
 * is part of the app package
 ********************************/
package app;

/********************************
 * Required Resources
 ********************************/
import java.util.Scanner;

/********************************
 * This is the main entry point of
 * the Money Manager App
 ********************************/
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TransactionManager transactionManager = new TransactionManager();
            new MoneyManager(scanner, transactionManager).menu();
        }
    }
}
