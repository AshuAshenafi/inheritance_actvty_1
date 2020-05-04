public class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        return String.format("$%(,.2f" , price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setPrice(double prc){
        this.price = prc;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
