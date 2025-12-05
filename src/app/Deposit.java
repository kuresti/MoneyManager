/********************************
 * Indicates that this subclass of
 * AbstractTransaction is part of
 * the app package app.
 ********************************/
package app;


public class Deposit extends AbstractTransaction{

    public Deposit(double amount, String date, String category, String description) {
        super(amount, date, category, description);
    }

    @Override
    public String toString() {
        return String.format(
                // String blueprint where placeholders will be replaced with
                // type indicated. e.g. amount=%.2f will be replaced with the
                // input of an amount in a floating point number with 2 decimal places
                "app.Deposit(amount=%.2f, date=%s, category=%s, description=%s)",
                // The following methods called get the values of the placeholders
                getAmount(), getDate(), getCategory(), getDescription()
        );
    }
}
