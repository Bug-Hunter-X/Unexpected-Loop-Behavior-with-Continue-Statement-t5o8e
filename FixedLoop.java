public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++; // Increment i before continuing
                continue; 
            }
            System.out.println(i);
            i++;
        }
    }
}