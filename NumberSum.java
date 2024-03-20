import java.util.*;
public class NumberSum {
    public static void main(String[] args){
        int startNum = 1;
        int num;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        while (startNum <= num){
            System.out.println(startNum*startNum);
            sum += startNum;
            startNum++;
        }
        System.out.println("This is the sum:" + sum);
    }
}
