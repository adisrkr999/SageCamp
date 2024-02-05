package ObjectOrientedProgramming.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled ;

    private Date dateCreated ;

    public SimpleGeometricObject(){
        dateCreated = new Date();
    }
    public SimpleGeometricObject(String color , boolean filled){
        dateCreated = setDateCreated();
        this.color= color;
        this.filled=filled;
    }
    public Date setDateCreated(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        try {
            // Parse the date string
            this.dateCreated = dateFormat.parse("17 January 2020");

            // Print the customDate
            return this.dateCreated;
        } catch (
                ParseException e) {
            e.printStackTrace();
            return new Date();
        }

    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on "+dateCreated+
                "\ncolor: "+color+" and is it filled ? "
                +filled;
    }













}
