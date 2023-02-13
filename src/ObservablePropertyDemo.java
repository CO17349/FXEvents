import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.DoublePropertyBase;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {

    public static void main(String[] args) {

        DoubleProperty balance = new SimpleDoubleProperty();

        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The new value of balance is " + balance.doubleValue());
            }
        });

        balance.set(4.5);
        System.out.println();
        System.out.println("Some other code executing here...");
        System.out.println();
        balance.set(100.0);
    }
}