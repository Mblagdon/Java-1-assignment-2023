package Assignment1;

/**
 * Product class for Assignment 1
 * Create a class called Product which has three attributes:
 * id (int), description (String) and price (double).
 * Create a constructor that takes in all three attributes and create a getting and setter for each.
 * Don’t let the id attribute or the price be negative.
 *
 * @author MBlagdon
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Simple constructor that sets a new products id. Id and price must be greater than 0 or is set to 0
     * @param id Id- must be greater than 0
     * @param description description
     * @param price price- must be greater than 0
     */
    public Product(int id, String description, double price) {
        if(id > 0){
            this.id = id;}

        this.description = description;
        if (price > 0) {
            this.price = price;
        }
    }

    /**
     * Get the product ID
     * @return product ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the product ID. ID must be positive. If ID is negative, value will not be changed.
     * @param id product ID must be greater than 0
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set product price, must be greater than 0
     * @param price price
     */
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
