public class LinearSearch {



            public static int linearSearch(int[] array, int target) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == target) {
                        return i; // Return the index where the target is found
                    }
                }
                return -1; // Return -1 if the target is not found in the array
            }

            public static void main(String[] args) {
                int[] array = {10, 25, 4, 17, 8, 12, 30};
                int target = 17;

                int result = linearSearch(array, target);

                if (result != -1) {
                    System.out.println("Element found at index: " + result);
                } else {
                    System.out.println("Element not found in the array.");
                }
            }
        }

