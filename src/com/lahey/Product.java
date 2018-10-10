package com.lahey;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Jack Lahey
 *
 * Assignment
 * Make the following application work. To check your result, print out all the object instances you created.
 */
public class Product {

    private String code;
    private String description;
    private double price;

    protected static int count = 0;
    protected Locale enLocale = new Locale("en", "US");
    protected NumberFormat numberFormat = NumberFormat.getInstance(enLocale);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product() {
        count++;
        code = "";
        description = "";
        price = 0.0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:\t" + code + "\n" +
                "Description:\t" + description + "\n" +
                "Price:\t" + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double d) {
        // Use the NumberFormat class to format the price to 2 decimal places
        numberFormat = NumberFormat.getInstance(enLocale);

         return numberFormat.format(d);
    }//end private String getFormattedPrice(double d)

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    public boolean equals(Product product){
        if( this.code.equals(product.getCode())
            && this.description.equals(product.getDescription())
            && this.price == product.getPrice()
            ){
            return true;
        }
        else{

            return false;
        }//end if()

    }//end public boolean equals(Product p)

}//end public class Product