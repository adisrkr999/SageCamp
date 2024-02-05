package ObjectOrientedProgramming.Inheritance.ConstructorChaining;

public class Faculty extends Employee{
    public Faculty(){
        System.out.println("3 ...Faculty constructer invoked");
    }
}
class Employee extends Person{
    public Employee(){
        System.out.println("2...Employee constructor getting invoked");
    }
}
class Person{
    public Person(){
        System.out.println("1...Person constructor invoked");
    }

}
