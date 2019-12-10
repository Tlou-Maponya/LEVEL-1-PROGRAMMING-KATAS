import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        evenOrOdd(number);
    }

    public static void evenOrOdd(int num) {
        if(num % 2 ==0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}
