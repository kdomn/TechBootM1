package Library;

public class CD extends Product{

    private static int instances;
    private Publishers publisher;
    private Authors author;
    private int tracks;


    public CD(String title, double price, Publishers publisher, Authors author, int tracks) {
        super(title, price);
        instances ++;
        this.publisher = publisher;
        this.author = author;
        this.tracks = tracks;

    }

    @Override
    public String toString() {
        return String.format("Book [title=%s, price=%s,  publisher=%s, author=%s]", getTitle(), getPrice(), publisher, author);
    }

    public void printer(){
        System.out.println("This product is of type :" + this.getClass().getSimpleName());

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

    public int getTracks(){
        return tracks;
    }
    public void setTracks(int tracks){
        this.tracks = tracks;
    }

    public static int getCount(){
        return instances;
    }
}

