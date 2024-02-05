public class ThirdDay {
    public static void main(String[] args) {
        //Convert from F to C
        double celsius;
        double fahrenheit = -40;

        celsius = 5*(fahrenheit - 32)/9;

       System.out.println("Converted value from Fahrenheit is " +
                celsius  );

        //Convert from C to F;
        double c = -40;
        double f ;
        f = (9*c/5) +32;

        System.out.println("Converted value from Celsius is " +
                f  );


        //convert C to K

        double celsius1 = 0;
        double kelvin;

        kelvin = celsius1 +273;

        System.out.println("Converted temperature from Celsius to Kelvin is "+kelvin);


        //Convert K to C

        double celsius2;
        double kelvin2 = 0;

        celsius2 = kelvin2  - 273;

        System.out.println("Converted temperature from Celsius to Kelvin is "+celsius2);








    }
}
