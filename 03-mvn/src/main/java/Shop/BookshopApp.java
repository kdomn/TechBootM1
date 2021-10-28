package Shop;
import Library.Address;
import Library.Publishers;
import Library.Books;
import Library.Authors;


public class BookshopApp {

    public static void main(String[] args) {

            System.out.println("Welcome to the Java Bookshop");
            System.out.println("============================");


        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Authors author = new Authors("Pete Smith", authorAddress);
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publishers publisher =
                new Publishers("Tech Books Publishing Ltd.",
                        publisherAddress);
        Books book = new Books("Java Unleashed",15.95,
                 publisher, author);
        System.out.println("Book: " + book);
        System.out.println("Calculating the Sales Discount price");
        book.setDiscount(0.9);
        System.out.println("Sale price of book: " +
                book.getSalePrice());
    }
}
