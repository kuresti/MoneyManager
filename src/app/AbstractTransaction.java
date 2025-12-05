/********************************
 * Indicates that this super class
 * is part of the app package
 ********************************/
package app;


/********************************
 * Super class for Deposit and
 * Expense
 ********************************/
abstract class AbstractTransaction implements Transaction {
    protected  double amount;
    protected String date;
    protected String category;
    protected String description;

    public AbstractTransaction(double amount, String date, String category, String description) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

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
