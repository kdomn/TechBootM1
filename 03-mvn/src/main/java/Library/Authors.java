package Library;

public class Authors extends Person{
    private String genre;

    public Authors (String name, Address address, String genre) {
        super(name, address);

        this.genre = genre;
    }
    @Override
    public String toString() {
        return String.format("Author [name=%s, address=%s, genre=%s]", getName(), getAddress(), genre);
    }



}
