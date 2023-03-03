package Assignment1;

/**
 * Assignment 1- a simple car class
 *
 * @author MBLagdon
 */
public class Car {

    private String make;
    private String model;
    private String year;
    private String color;

    /**
     * Constructor to set car
     * @param make
     * @param model
     * @param year
     * @param color
     */
    public Car(String make, String model, String year, String color){

    }

    /**
     * Get cars make
     * @return make
     */
    public String getMake() { return make; }

    /**
     * Set cars make
     * @param make cars make
     */
    public void setMake(String make) { this.make = make; }

    /**
     * Get cars model
     * @return model
     */
    public String getModel() {return model;}

    /**
     * Set cars model
     * @param model cars model
     */
    public void setModel(String model) { this.model = model; }

    /**
     * Get cars year
     * @return year
     */
    public String getYear() { return year; }

    /**
     * Set cars year
     * @param year cars year
     */
    public void setYear(String year) { this.year = year; }

    /**
     * Get cars color
     * @return color
     */
    public String getColor() { return color; }

    /**
     * Set cars color
     * @param color color
     */
    public void setColor(String color) { this.color = color; }
}
