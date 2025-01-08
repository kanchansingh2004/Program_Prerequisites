import java.util.Scanner;

class kiloTOmiles{
	
	public  static double Solve(double k){
		return k*0.621371;
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		
		double res = Solve(k);
		
		System.out.println("The result is: "+res);
		
	}
	
}