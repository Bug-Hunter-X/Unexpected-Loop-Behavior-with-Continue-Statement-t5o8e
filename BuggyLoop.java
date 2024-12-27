public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                continue; // Skip the rest of the loop body for i == 5
            }
            System.out.println(i);
            i++;
        }
    }
}