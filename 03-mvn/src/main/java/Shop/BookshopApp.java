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
        System.out.println(authorAddress);

        Authors author1 = new Authors("Pete Smith", authorAddress,"Horror");
        Address publisherAddress1 = new Address(1, "Main Street", "Some City", "Kent", "KA1 43A");
        Publishers publisher1 = new Publishers("Tech Books Publishing Ltd.",publisherAddress1, "Penguin");
        Books book1 = new Books("Java Unleashed",15.95, publisher1, author1);
        System.out.println("Book: " + book1);
        System.out.println("Calculating the Sales Discount price");
        book1.setDiscount(0.9);
        System.out.println("Sale price of book: " + book1.getSalePrice());

        System.out.println("Book 2");
        Books book2 = new Books("A Book",10.50, publisher1, author1);
        System.out.println("Book2: " + book2);
        System.out.println("Calculating the Sales Discount price");
        book2.setDiscount(0.7);
        System.out.println("Sale price of book: " + book2.getSalePrice());

        System.out.println("The number of books in the shop: " + Books.getCount());
        book1.printer();
        book2.printer();

    }
}
