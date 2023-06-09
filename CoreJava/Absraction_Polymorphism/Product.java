public class Product {
    private double price = 16.6;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(double quantity) {
        System.out.println("Inside Double Overloaded Method ");
        return price;
    }
    public double getPrice(int quantity) {
        System.out.println("Inside Integer Overloaded Method ");
        return  price;
    }

}
