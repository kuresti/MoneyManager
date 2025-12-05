package app;
/********************************
 * Indicates that this app.Transaction
 * interface is part of the app
 * package.
 ********************************/


public interface Transaction {
    double getAmount();
    String getDate();
    String getCategory();
    String getDescription();
}

