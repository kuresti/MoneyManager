/********************************
 * Indicates that the MoneyManager
 * class is part of the app package
 ********************************/
package app;

/********************************
 * Required Resources
 ********************************/
import java.util.Scanner;

public class MoneyManager {
    // Scanner is used to parse input from user
    private final Scanner input;
    private final TransactionManager transactionManager;

    // This constructor initialized Scanner and TransactionManager
    public MoneyManager(Scanner input, TransactionManager transactionManager) {
        this.input = input;
        this.transactionManager = transactionManager;
    }

    public void menu() {
        // Set to true so that the menu will run in the while loop
        // until running is set to false.
        boolean running = true;

        while (running) {
            System.out.println("\nMoney Manager Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Deposit");
            System.out.println("3. View Expenses");
            System.out.println("4. View Deposits");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            int choice = input.nextInt();
            this.input.nextLine(); // the nextLine method reads input and consumes the line separator

            switch (choice) {
                case 1: transactionManager.addExpense(); break;
                case 2: transactionManager.addDeposit(); break;
                case 3: transactionManager.viewExpenses(); break;
                case 4: transactionManager.viewDeposits(); break;
                case 5: transactionManager.viewTransactions(); break;
                case 6: System.out.println("Thank you for using Money Manager!");
                running = false;
                break;
                default: System.out.println("Invalid option. Please try again.");
            }


        }


    }
}
