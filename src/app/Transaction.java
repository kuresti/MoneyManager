package app;
/********************************
 * Indicates that this app.Transaction
 * interface is part of the app
 * package.
 ********************************/

/********************************
 * Interface to define what Deposit
 * and Expense should do. The implementation
 * of the methods included in Transaction
 * are defined in AbstractTransaction.
 * Which is then extended by Expense and
 * Deposit.
 * ********************************/
public interface Transaction {
    double getAmount();
    String getDate();
    String getCategory();
    String getDescription();
}

