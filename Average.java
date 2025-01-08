import java.util.Scanner;

class Average{
	
	public static void main(String args[]){
		
		System.out.println("Enter the Numbers: ");
		Scanner sc = new Scanner(System.in);
		float x=sc.nextInt();
		float y=sc.nextInt();
		float z=sc.nextInt();
		
		
		System.out.println("The result is "+ (float)((x+y+z)/3));
		
	}
	
}