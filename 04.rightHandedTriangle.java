import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        triangle(number);
    }

    public static void triangle(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
