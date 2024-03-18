import java.util.*;
public class DeMorgansLaw {
    public static void main(String[] args){
        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        a = input.nextInt();

        System.out.print("Enter a value for b: ");
        b = input.nextInt();

        Boolean value = (a <= 0 || b <= 0);
        Boolean value2 = !(a > 0 && b > 0);

        Boolean value3 = !((a <= b) && (b > 10));
        Boolean value4 = (a >= b) || (b < 10);

        System.out.println("According to DeMorgan's Law, the expression (a <= b || b <= 0) is equivalent to !(a > 0 && b > 0), as (a <= b || b <= 0) is " + value + " and " + "!(a > 0 && b > 0) is " + value2);
        System.out.println("The same thing occurs with different expressions as well, such as this expression !((a <= b && (b > 10)) is equivalent to (a >= b) || (b < 10), as !((a <= b && (b > 10)) is " + value3 + " and " + "(a >= b) || 1b < 10) is " + value4);
    }
}