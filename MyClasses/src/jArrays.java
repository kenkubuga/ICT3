
public class jArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		names [1] = "Ken";
		names[2] = "Ben";
		names[3] = "Joe";
		int[] ages = new int[4];
		ages[1]  =10; ages[2]=11;ages[3]=13;
		
		
		for (int i = 1;i<=3;i++){
			System.out.print(names[i]+"      |    ");
			System.out.println(ages[i]);
		}
		
	}

}
