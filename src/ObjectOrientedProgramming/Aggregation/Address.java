package ObjectOrientedProgramming.Aggregation;

public class Address {
    public String city;
    public String state;
    public String country;




    public Address(String city,String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }



    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
