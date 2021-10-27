package Library;

public class Authors{
    private String name;
    private Address address;

    public Authors(String name, Address address) {
        this.name = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return String.format("Author [name=%s, address=%s]", name, address);
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Address getAddress(){
        return address;
    }
    public void setName(Address address){
        this.address = address;
    }

}
