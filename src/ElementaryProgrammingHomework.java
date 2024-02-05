public class ElementaryProgrammingHomework {
    public static void getGratuity(double subtotal, int gratuityRate){
        double gratuity = subtotal*gratuityRate/100;
        double total = subtotal+gratuity;
        System.out.println("the gratuity is "+gratuity+" and the total is "+total);
    }
    public static void getAcceleration(double initialVelocity, double finalVelocity, double time){
        double acceleration = (finalVelocity-initialVelocity)/time;
        System.out.println("the average acceleration is "+acceleration);
    }
    public static void getRunwayLength(double speed, double acceleration){
        double runwayLength = (speed*speed)/(2*acceleration);
        System.out.println("the minimum runway length for this airplane is "+runwayLength);
    }
    public static void getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));;
        double side2 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));;
        double side3 = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));;
        double s = (side1+side2+side3)/2;
        double areaOfTriangle = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("the area of the triangle is "+areaOfTriangle);
    }
    public static void getInterestRate(int balance, double interestRate){
        double interest = balance*(interestRate/1200);
        System.out.println("the interest is "+interest);
    }

    public static void main(String[] args) {
        //2.1
        double celsius = -40.0;
        double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
        System.out.println(celsius + " celsius is " + fahrenheit +" fahrenheit");

        //2.2
        double radius = 5.5;
        double length = 12.0;
        double area = Math.pow(radius,2)*22/7;
        double volume = area * length;
        System.out.println("the area is "+area);
        System.out.println("the volume is "+volume);

        //2.3
        double feet = 15.2;
        double meters = 0.305 * feet;
        System.out.println(feet + " feet is "+meters+" meters");

        //2.4
        double pounds = 15;
        double kilograms = 0.454*pounds;
        System.out.println(pounds+ " pounds in kilograms is "+kilograms+" kilograms");

        //2.5
        getGratuity(15.0, 10);

        //2.6
        int originalNumber = 1234;
        int copyNumber1=originalNumber;
        int sumOfDigits=0;

        while (copyNumber1!=0){
            int digit = copyNumber1%10;
            sumOfDigits=sumOfDigits+digit;
            copyNumber1=copyNumber1/10;
        }
        System.out.println("the sum of digits is "+sumOfDigits);

        //2.7
        int numberOfMinutes = 1000000000;
        int numberOfDays = numberOfMinutes/1440;
        int numberOfYears = numberOfDays/365;
//        int daysLeft = numberOfDays%365;
//        System.out.println("Alternate way " +daysLeft);

        numberOfDays = numberOfDays-(numberOfYears*365);


        System.out.println(numberOfMinutes + " is approximately "+numberOfYears+" years and "+numberOfDays+" days");

        //2.9
        getAcceleration(5.5,50.9,4.5);

        //2.10
        double amountOfWater = 55.5;
        double initialTemperature = 3.5;
        double finalTemperature = 10.5;
        double energyNeeded = amountOfWater*(finalTemperature-initialTemperature)*4184;
        System.out.println("the energy needed is "+ energyNeeded);

        //2.12
        getRunwayLength(60,3.5);

        //2.13
        double monthlySavingsAmount = 100;
        double monthlyInterestRate = 0.00417;
        double accountBalance = 0;
        int x = 0;
        while(x<6){
            accountBalance = (accountBalance+monthlySavingsAmount)*(1+monthlyInterestRate);
            x++;
        }
        System.out.println("after "+x+" months, the account value is "+accountBalance);

        //2.14
        double weight = 95.5;
        double height = 50;
        double bmi = (0.45359237*weight)/((0.0254*height)*(0.0254*height));
        System.out.println("bmi is "+bmi);

        //2.15
        double x1 =1.5;
        double y1 =-3.4;
        double x2 =4;
        double y2 =5;
        double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("the distance between the two points is "+distance);

        //2.16
        double sideOfHexagon =5.5;
        double areaOfHexagon = (3*Math.sqrt(3.0))/2*sideOfHexagon*sideOfHexagon;
        System.out.println("the area of the hexagon is "+areaOfHexagon);

        //2.17
        double temperatureInFahrenheit = 5.3;
        double windSpeed= 6;
        double windChillIndex= 35.74 +0.6215*temperatureInFahrenheit - 35.75*Math.pow(windSpeed,0.16)+0.4275*temperatureInFahrenheit*Math.pow(windSpeed,0.16);
        System.out.println("the wind chill index is "+windChillIndex);

        //2.18

        System.out.println("a      b      pow(a,b)");
        System.out.println("1      2      "+Math.pow(1,2));
        System.out.println("2      3      "+Math.pow(2,3));
        System.out.println("3      4      "+Math.pow(3,4));
        System.out.println("4      5      "+Math.pow(4,5));
        System.out.println("5      6      "+Math.pow(5,6));

        //2.19
        getTriangleArea(1.5,-3.4,4.6,5.0,9.5,-3.4);

        //2.20
        getInterestRate(1000,3.5);

        //2.21
        double investmentAmount = 1000.56;
        double annualInterestRate = 4.25/100;
        double monthlyInterestRate_= annualInterestRate/12;
        int years = 1;
        double accumulatedValue = investmentAmount*Math.pow((1+monthlyInterestRate_),(years*12));
        System.out.println("the accumulated value is "+accumulatedValue);

        //2.23
        double drivingDistance = 900.5;
        double milesPerGallon = 25.5;
        double pricePerGallon = 3.55;
        double cost = drivingDistance/milesPerGallon*pricePerGallon;
        System.out.println("the cost of driving is "+cost);

    }
}
