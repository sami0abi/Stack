public class GenericUtils {
    public static <T> T[] reverse(T[] arr) {
        int n = arr.length;
        //Switch the first and last elements, then the second and second last elements, and so on
        for (int i = 0; i < n / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static <T extends Number> double sum(T[] numbers){
        double total = 0.0;
        for (T num : numbers) {
            total += num.doubleValue(); // Convert each number to double and add it
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        GenericUtils.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        String[] arr2 = {"Hello", "World", "!"};
        GenericUtils.reverse(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        Double[] arr3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(GenericUtils.sum(arr3));

        String[] arr4 = {"Hello", "World", "!"};
        //System.out.println(GenericUtils.sum(arr4)); // Compile-time error
    }
}
