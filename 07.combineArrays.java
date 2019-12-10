import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the size of your Arrays: ");

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        System.out.println("Please Enter "+amount+ " Strings for your 1st Array");

        Scanner scanner1 = new Scanner(System.in);
        String[] firstArray = new String[amount];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner1.nextLine();
        }

        System.out.println("Please Enter "+amount+ " Strings for your 2nd Array");

        Scanner scanner2 = new Scanner(System.in);
        String[] secondArray = new String[amount];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = scanner2.nextLine();
        }

        combine(firstArray, secondArray);
    }

    public static void combine(String[] firstArray, String[] secondArray) {
        //  Output
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " "+ secondArray[i] + " ");
        }
    }
}


