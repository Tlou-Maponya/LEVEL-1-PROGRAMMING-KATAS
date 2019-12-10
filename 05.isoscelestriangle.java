import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        isosceles(number);
    }

    public static void isosceles(int num) {
        for (int i = 1; i <= num; i++) {

            for (int j = i; j<num; j++)
                System.out.print(" ");

            for (int k = 1; k <(i*2); k++)
                System.out.print("#");
            System.out.print("\n");
        }
    }
}
