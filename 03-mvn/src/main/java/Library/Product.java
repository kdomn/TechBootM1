package Library;

abstract class Product {
    private String title;
    private double price;
    private double discount;

    public abstract void printer();

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
        ;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSalePrice(){
        return(price*discount);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product [ title=%s, price=%s]",  getTitle(), getPrice());
    }
}