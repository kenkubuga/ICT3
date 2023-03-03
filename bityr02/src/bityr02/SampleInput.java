package bityr02;
import java.util.Scanner;
public class SampleInput {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		String fname;
		String sex;
		int age;
		float weight;
		
		System.out.println("What is your name?");
		fname = myScanner.nextLine();
	
		System.out.println("How old are you?");
		age = myScanner.nextInt();
		
		System.out.println("What is your weight?");
		weight = myScanner.nextFloat();
		
		System.out.println("What is your sex?");
		sex=myScanner.next();
		
		System.out.println("Your name is "+fname);
		System.out.println("I am "+age + " years old");
		
		System.out.println("My weight is "+weight+"kg");
		System.out.println("You are a "+sex);
		
	}
	

}
