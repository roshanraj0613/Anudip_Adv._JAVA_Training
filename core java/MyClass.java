public class MyClass {
    private int var1;
    private int var2;
    private int var3;

    // Constructor with three variables
    public MyClass(int var1, int var2, int var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    // Method to perform addition
    public int add() {
        return this.var1 + this.var2 + this.var3;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(5, 10, 15);
        int result = myClass.add();
        System.out.println("The result of the addition is: " + result);
    }
}