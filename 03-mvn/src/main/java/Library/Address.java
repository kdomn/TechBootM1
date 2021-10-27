package Library;

public class Address {

    private int number;
    private String street, city, county, postcode;

    public Address(int number,String  street,String city, String county, String postcode) {
        super();
        number = this.number;
        street = this.street;
        city = this.city;
        county = this.county;
        postcode = this.postcode;
    }

    @Override
    public String toString() {
        return String.format("Library.Address [number=%s, street=%s,  city=%s, county=%s,postcode=%s]", number, street, city, county,postcode);
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getCounty(){
        return county;
    }
    public void setCounty(String county){
        this.county = county;
    }

    public String getPostcode(){
        return postcode;
    }
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
}
