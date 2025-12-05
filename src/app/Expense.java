/*********************************
 * Indicates that this subclass of
 * AbstractTransaction is in the package
 * app.
 *********************************/
package app;


public class Expense extends AbstractTransaction  {

    public Expense(double amount, String date, String category, String description) {
        super(amount, date, category, description);
    }

    // Asked chatGPT if I still needed to use the @Override even if
    // the toString method was not defined in the superclass. The answer
    // was yes because the derived class still inherits a toString method
    // even if it was not defined.
    @Override
    public String toString() {
        return String.format(
                // String blueprint where placeholders will be replaced with
                // type indicated. e.g. amount=%.2f will be replaced with the
                // input of an amount in a floating point number with 2 decimal places
                "app.Expense(amount=%.2f, date=%s, category=%s, description=%s)",
                // The following methods called get the values of the placeholders
                getAmount(), getDate(), getCategory(), getDescription()
        );
    }
}
