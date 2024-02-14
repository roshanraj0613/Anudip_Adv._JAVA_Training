public class ArrayIndexOutOfBoundsExample {
    // Declare an array of int
    private int[] arr;
    // Constructor to create an array of size

    public ArrayIndexOutOfBoundsExample(int size) {
        // Create an array of size
        arr = new int[size];
    }

    public void printElements() {
        // Accessing elements at index 0 to arr.length
        for (int i = 0; i <= arr.length; i++) {
            // Accessing element at index arr.length will throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        // Create an instance of ArrayIndexOutOfBoundsExample
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample(5);
        example.printElements();
    }
}