package Assignment1;

/**
 * Instructions:
 * Create a class called InvoiceItem that has two attributes:
 * product (Product) and quantity (int).
 * Create getter and setters and a constructor.
 * Create a method called getItemTotal() which calculates the total based on product price and quantity.
 * Don't let quantity be negative.
 *
 * @author MBlagdon
 */
public class InvoiceItem {

    private Product product;
    private int quantity;

    /**
     *
     * @param product
     * @param quantity
     */

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }

    /**
     * Get the product
     * @return product
     */
    public Product getProduct() {return product;}

    /**
     * Set the product
     * @param product product
     */
    public void setProduct(Product product) {this.product = product;}

    /**
     * Get quantity
     * @return quantity
     */
    public int getQuantity() {return quantity;}

    /**
     * Set quantity
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {this.quantity = quantity;}

    /**
     * Get invoice item total
     * @return invoice item total
     */
    public double getItemTotal() {
        return getProduct().getPrice() * getQuantity();
    }

}
