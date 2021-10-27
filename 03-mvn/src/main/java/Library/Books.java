package Library;

public class Books {

    private String title;
    private double price;
    private double discount;
    private Publishers publisher;
    private Authors author;


    public Books(String title, double price, Publishers publisher, Authors author) {
        super();
       this.title = title;
       this.price = price;
       this.publisher = publisher;
       this.author = author
       ;
    }

    @Override
    public String toString() {
        return String.format("Book [title=%s, price=%s,  publisher=%s, author=%s]", title, price, publisher, author);
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

    public Authors getAuthor(){
        return author;
    }
    public void setAuthor(Authors author){
        this.author = author;
    }


    public Publishers getPublisher(){
        return publisher;
    }
    public void setPublisher(Publishers publisher){
        this.publisher = publisher;
    }



}
