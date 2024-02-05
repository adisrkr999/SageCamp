package ObjectOrientedProgramming.Aggregation;

public class TestEmployee {
    public static void main(String[] args) {
        Address address1 = new Address(
                "India","WB",
                "Mumbai"
        );
        Employee employee1 = new Employee(111,
                "Varun",
                address1) ;
        System.out.println(employee1);
    }
}
