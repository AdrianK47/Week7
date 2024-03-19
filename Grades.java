import java.util.*;
public class Grades {
    public static void main(String args[]){
        int grade;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade");
        grade = input.nextInt();

        if (grade >= 100){
            System.out.println("A perfect grade! Finally...");
        }
        else if (grade >= 97){
            System.out.println("You got an A+, Decent job I guess.");
        }
        else if (grade >= 90){
            System.out.println("You got an A... Average");
        }
        else if (grade >= 87){
            System.out.println("You got a B+, only a tiny bit above below average");
        }
        else if (grade >= 83){
            System.out.println("You got a B... Below average");
        }
        else if (grade >= 80){
            System.out.println("You got a B-, that's below below average");
        }
        else if (grade >= 77){
            System.out.println("You got a C+, it's higher, but still can't eat dinner");
        }
        else if (grade >= 73){
            System.out.println("You got a C. Welp, you can't eat dinner now");
        }
        else if (grade >= 70){
            System.out.println("A C-!, your starving now");
        }
        else if (grade >= 67){
            System.out.println("D+, huh, still don't come home");
        }
        else if (grade >= 65){
            System.out.println("D, don't come home anymore");
        }
        else if (grade >= 60){
            System.out.println("D-, SERIOUSLY don't come home");
        }
        else if (grade < 60){
            System.out.println("F, Find a new family");
        }
    }
}
