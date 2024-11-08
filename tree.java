
import java.util.Scanner;

class Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int digit = 0;
        for (int i = 10; i >= 0; i--) {
            digit = num % 10;
            sum = sum + (digit * i);
            num = num / 10;
        }

        if (num % 11 == 0) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
