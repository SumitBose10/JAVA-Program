
import java.util.Scanner;

public class Function {

    public static void main(String[] args) { // Corrected 'Args[]' to 'args[]' and 'function' to 'Function'
        Scanner meow = new Scanner(System.in);

        // Declare variables a, b, and c
        int a = meow.nextInt();
        int b = meow.nextInt();
        int c = meow.nextInt();

        int result = avg(a, b, c);
        System.out.println("The average is " + result); // Added a semicolon at the end of the statement

        meow.close(); // It's a good practice to close the Scanner
    }

    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

}
