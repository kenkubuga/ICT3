import java.util.Scanner;
public class averagej {

	public static void main(String[] args) {
		Scanner yscanner = new Scanner(System.in);
		int sum=0, qty;
		
		
		System.out.println("How many numbers do you have?");
		qty = yscanner.nextInt();
		int [] num = new int[qty];
		
		for (int k=0;k<qty;k++) {
			System.out.println("Next number please");
			num[k] = yscanner.nextInt();
			sum = sum+num[k];
		}
		System.out.println("The average of your "+qty+" numbers is "+(sum/qty));
	}

}
