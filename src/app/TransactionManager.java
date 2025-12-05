package app;
/********************************
 * Indicates that app.TransactionManager
 * class is part of the app package.
 ********************************/

/********************************
 * Required Resources
 ********************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/********************************
 * Public class that holds methods
 * to add expenses, add deposits,
 * view expenses, view deposits,
 * and view transactions. As well
 * as helper methods to get Expense
 * Total, get Deposit Total, and
 * get Transaction Total.
 ********************************/
public class TransactionManager {
    private List<Transaction> transactions;
    public static Scanner scanner = new Scanner(System.in);

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addExpense() {
        // Prints prompts in the CLI for user input
        // Also reads prompts
        System.out.print("Enter the expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the expense date ('dd-MM-yyyy'): ");
        String date = scanner.nextLine();

        System.out.print("Enter the expense category: ");
        String category = scanner.nextLine();

        System.out.print("Enter the expense description: ");
        String description = scanner.nextLine();

        Expense expense = new Expense(amount, date, category, description);
        transactions.add(expense);

        System.out.println("app.Expense added successfully.");
    }

    public void addDeposit() {
        // Prints prompts in the CLI for user input
        // Also reads prompts
        System.out.print("Enter the deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the deposit date ('dd-MM-yyyy'): ");
        String date = scanner.nextLine();

        System.out.print("Enter the deposit category: ");
        String category = scanner.nextLine();

        System.out.print("Enter the deposit description: ");
        String description = scanner.nextLine();

        Deposit deposit = new Deposit(amount, date, category, description);
        transactions.add(deposit);

        System.out.println("app.Deposit added successfully.");
    }

    public double getExpenseTotal() {
        double total = 0;
        // The for loop iterates the Transaction ArrayList
        // If the transaction is an instance of Expense the
        // getAmount() method gets the amount and adds it to
        // the total
        for (Transaction t : transactions) {
            if (t instanceof Expense) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public void viewExpenses() {
        boolean found = false;
        // The Transaction ArrayList is iterated over
        // if an instance of Expense is found, each
        // instance is printed line by line.
        for (Transaction t : transactions) {
            if (t instanceof Expense) {
                System.out.println(t);
                found = true;
            }
        }
        // If an instance of expense is not found
        // A message is printed.
        if (!found) {
            System.out.println("No expenses found.");
        } else {
            // At the end of the list of expenses the total expenses
            // amount is printed by calling the getExpenseTotal() helper method.
            System.out.println("Total expenses: " + getExpenseTotal());
        }
    }


    public double getDepositTotal() {
        double total = 0;

        // The for loop iterates the Transaction ArrayList
        // If the transaction is an instance of Deposit the
        // getAmount() method gets the amount and adds it to
        // the total
        for (Transaction t : transactions) {
            if (t instanceof Deposit) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public void viewDeposits() {
        boolean found = false;

        // The Transaction ArrayList is iterated over
        // if an instance of Deposit is found, each
        // instance is printed line by line.
        for (Transaction t : transactions) {
            if (t instanceof Deposit) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            // If an instance of deposit is not found
            // A message is printed.
            System.out.println("No deposits found.");
        } else {
            // At the end of the list of deposits the total expenses
            // amount is printed by calling the getDepositTotal() helper method.
            System.out.println("Total deposits: " + getDepositTotal());
        }
    }

    public double getTransactionTotal() {
        // Helper method that calls getDepositTotal
        // and getExpenseTotal, subtracts getExpenseTotal
        // from getDepositTotal to get the Transaction Total
        double total = 0;
        total = getDepositTotal() - getExpenseTotal();
        return total;
    }

    public void viewTransactions() {
        // Check to see if there are any transactions
        if (transactions.isEmpty()) {
            System.out.println("No transactions have been added.");
            return;
        }
        // Transaction ArrayList is iterated and each
        // transaction is printed line by line
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        // At the end of the Transaction list the transactionTotal
        // is printed.
        System.out.println("Total Balance: " + getTransactionTotal());
    }

    public void viewExpensesByCategory() {
        // To be added later
    }
}
