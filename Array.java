import java.util.Arrays;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 0, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] pass = new int[size];
        for (int i = 0; i < pass.length; i++) {
            pass[i] = (int) (Math.random() * 10);
        }
        while (true) {
            try {
                if (Arrays.equals(arr, pass)) {
                    System.out.println("Access granted");
                } else {
                    throw new PatternNotMatchException("Acesss denied");
                }
            } catch (PatternNotMatchException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

}

class PatternNotMatchException extends Exception {
    PatternNotMatchException(String message) {
        super(message);
    }
}