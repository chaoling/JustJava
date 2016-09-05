
/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p/>
 * package com.example.android.justjava;
 */
package com.lucassociates.chaol.justjava;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    private int mQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //int numberOfCoffees = 2;
        int unitPrice = 5;
        display(mQuantity);
        displayPrice(mQuantity * unitPrice);
    }

    /**
     * This method is called when the quantitiy increment button is clicked
     */
    public void increment(View view) {
        //int quantity = 2;
        mQuantity = mQuantity + 1;
        display(mQuantity);
    }

    /**
     * This method is called when the quantity decrement button is clicked
     */
    public void decrement(View view) {
        mQuantity = mQuantity - 1;
        display(mQuantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the total price value on the screen
     */
    private void displayPrice(int price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + price);
    }
}