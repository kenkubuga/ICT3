package bityr02;
import java.util.Scanner;

public class CollectInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];
        int[] ages = new int[10];
        
        for (int i = 101; i < 105; i++) {
            System.out.print("Enter name for student " + i + ": ");
            names[i-101] = input.nextLine();
            System.out.print("Enter age for student " + i + ": ");
            ages[i-101] = input.nextInt();
            input.nextLine(); // to consume the remaining newline character
        }
        
        System.out.println("Student information:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }
    }

}