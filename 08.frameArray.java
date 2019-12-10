
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the list of Strings to frame: ");

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        //Call the frame function
        frame(words);
    }
    public static void frame(String[] arr){
        String longestString = arr[0];
        for(int a = 0; a < arr.length; a++){
            if(arr[a].length()>longestString.length()){
                longestString = arr[a];
            }
        }
        int FrLength = longestString.length()+4;
        for(int b = 0; b<FrLength; b++){
            if(b==(FrLength-1)){
                System.out.println("*");
            }else{
                System.out.print("*");
            }
        }
        for(String c : arr) {
            System.out.print("* "+c);
            int rmgSpace = FrLength - (c.length()+3);
            for(int k = 0; k<rmgSpace; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int b = 0; b<FrLength; b++){
            if(b==(FrLength-1)){
                System.out.println("*");
            }else{
                System.out.print("*");
            }
        }

    }
}