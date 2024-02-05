package hw;

public class


Question20 {
    public static void windChillTemperature(double temperatureInFahrenheit, double windSpeed){

        if (windSpeed>2 && -58<temperatureInFahrenheit && temperatureInFahrenheit<41) {
            double windChillIndex = 35.74 + 0.6215 * temperatureInFahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperatureInFahrenheit * Math.pow(windSpeed, 0.16);
            System.out.println("the wind chill index is " + windChillIndex);
        }
        else{
            System.out.println("please enter valid temperature and wind speed");
        }
    }
    public static void main(String[] args) {
        windChillTemperature(5.3,6);
    }
}
