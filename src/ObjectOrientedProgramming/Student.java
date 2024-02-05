package ObjectOrientedProgramming;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date dateCreated;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
        this.dateCreated = new Date();
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
