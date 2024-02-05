package ExceptionHandling;

public class MultipleExceptions {


        public static void main(String[] args) {
            try {
                performOperation("5", 2);
                performOperation("abc", 2); // This will throw NumberFormatException
                performOperation("10", 0); // This will throw ArithmeticException
                performOperation("3", 5);  // This will throw ArrayIndexOutOfBoundsException

            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + e.getMessage());

            } catch (ArithmeticException e) {
                System.err.println("ArithmeticException: " + e.getMessage());

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }

        static void performOperation(String str, int divisor) {
            try {
                int number = Integer.parseInt(str);
                int result = 10 / divisor;
                int[] array = new int[4];
                System.out.println("Result: " + result);
                System.out.println("Array element: " + array[divisor]);

            } catch (NumberFormatException e) {
                // This block catches NumberFormatException
                throw e;

            } catch (ArithmeticException e) {
                // This block catches ArithmeticException
                throw e;

            } catch (ArrayIndexOutOfBoundsException e) {
                // This block catches ArrayIndexOutOfBoundsException
                throw e;
            }
        }
    }


