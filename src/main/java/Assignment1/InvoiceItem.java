package Assignment1Invoice;



public class InvoiceItem {

    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }

    public Product getProduct() {return product;}
    public void setProduct(Product product) {this.product = product;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public double getItemTotal() {
        return getProduct().getPrice() * getQuantity();
    }

}
