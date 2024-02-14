public class ArrayAccess{
    public static void main(String[] args) {
        int[] array = new int[5];

        // Loop through the array
        for (int i = 0; i <= array.length; i++) {
            // This will throw an ArrayIndexOutOfBoundsException when i equals array.length
            System.out.println(array[i]);
        }
    }
}