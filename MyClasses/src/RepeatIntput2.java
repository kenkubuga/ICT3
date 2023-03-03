import java.util.Scanner;
public class RepeatIntput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObject = new Scanner(System.in);
		int numNames = 0;
		
		System.out.println("How many names do you want to capture?");
		numNames = myObject.nextInt();
		String [] lname = new String[numNames];
		
		//System.out.println(numNames);
		
		for(int i=0;i<numNames;i++) {
			System.out.println("Enter Name");
			lname [i]= myObject.next(); 
			
		}
		System.out.println("The names you entered are...");
		for (int k=0;k<numNames;k++) {
			System.out.print(lname[k]+", ");
		
		}
		
	
	}

}
