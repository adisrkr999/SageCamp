package ObjectOrientedProgramming.Aggregation;

public class Employee {
    private int id;
    private String name;
    private Address employeeAddress;

    public Employee(int id , String name, Address employeeAddress){
        this.id = id;
        this.name = name;
        this.employeeAddress = employeeAddress;
    }


    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}
