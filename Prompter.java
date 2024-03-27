import java.util.*;
public class Prompter {
    public static void main(String args[]){
        int min;
        int max;
        int between;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        min = input.nextInt();
        System.out.print("Enter a second number: ");
        max = input.nextInt();

        while (max != 0){
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            between = input.nextInt();
            if (between < max && between > min){
                break;
        }
        }
        
    }
}
