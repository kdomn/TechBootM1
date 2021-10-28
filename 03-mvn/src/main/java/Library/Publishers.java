package Library;

public class Publishers extends Person{
    private String organisation;

    public Publishers (String name, Address address, String organisation) {
        super(name, address);

        this.organisation = organisation;

    }
    @Override
    public String toString() {
        return String.format("publisher [name=%s, address=%s, genre=%s]", getName(), getAddress(), organisation);
    }



}