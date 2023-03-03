import java.util.Scanner;
public class RepeatIntput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObject = new Scanner(System.in);
		int numStds = 0;
		float sum = 0;
		
		System.out.println("How many people do you have?");
		numStds = myObject.nextInt();
		String [] mnumber = new String[numStds];
		float [] mark = new float[numStds];
		
		for(int i=0;i<numStds;i++) {
			System.out.println("Matric Number");
			mnumber [i]= myObject.next(); 
			System.out.println("Enter Mark");
			mark[i] = myObject.nextFloat();
			sum = sum+mark[i];
			
		}
		
		System.out.println("The details you entered are...");
		for (int k=0;k<numStds;k++) {
			System.out.println(mnumber[k]+"      "+mark[k]);
		
		}
		System.out.println("The average score is "+(sum/numStds));
	
	}

}
