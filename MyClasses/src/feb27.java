import java.util.Scanner;
public class feb27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xscanner = new Scanner(System.in);
		
		int qty;
		System.out.println("How many towns do you want to record?");
		qty = xscanner.nextInt();
		
		String [] town = new String[qty];
		int [] landmass  = new int[qty];
		
		for(int k=0;k<qty;k++) {
			System.out.println("Name of town...");
			town[k]=xscanner.next();
			System.out.println("Land Surface area of "+town[k]);
			landmass[k]= xscanner.nextInt();
		}
		System.out.println("Printing names of towns below.....");
		for(int j=0;j<qty;j++) {
			System.out.println(town[j]+"   |   "+landmass[j]);
			}
		
	}

}
