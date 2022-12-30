import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if (digit > -15 && digit <= 12) {
            System.out.println("True");
        } else if (digit > 14 && digit < 17) {
            System.out.println("True");
        } else if (digit >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}