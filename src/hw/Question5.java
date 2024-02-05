package hw;

public class Question5 {
    public static void findFutureDate(int dayOfWeek, int daysElapsed) {
        int futureDay = (dayOfWeek + daysElapsed) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Sorry, please enter a day value between 0 and 6.");
        }
        switch (futureDay) {
                    case 0: System.out.println("The future day is Sunday"); break;
                    case 1: System.out.println("The future day is Monday"); break;
                    case 2: System.out.println("The future day is Tuesday"); break;
                    case 3: System.out.println("The future day is Wednesday"); break;
                    case 4: System.out.println("The future day is Thursday"); break;
                    case 5: System.out.println("The future day is Friday"); break;
                    case 6: System.out.println("The future day is Saturday"); break;
                    default: System.out.println("Sorry, please enter a day value between 0 and 6.");

                }
        }
    public static void main(String[] args) {
        findFutureDate(1,3);
    }
}
