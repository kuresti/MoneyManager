/********************************
 * Indicates that this super class
 * is part of the app package
 ********************************/
package app;


/********************************
 * Super class which implements
 * Transaction for Deposit and
 * Expense
 ********************************/
abstract class AbstractTransaction implements Transaction {
    protected  double amount;
    protected String date;
    protected String category;
    protected String description;

    // Defines a protected constructor for AbstractTransaction needed to set common state fields for subclasses
    public AbstractTransaction(double amount, String date, String category, String description) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    // Implementations of methods defined in the Transaction Interface
    @Override
    public double getAmount() {
        return amount;
    }
    @Override
    public String getDate() {
        return date;
    }
    @Override
    public String getCategory() {
        return category;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
