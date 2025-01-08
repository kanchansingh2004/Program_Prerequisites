import java.util.Scanner;

class Power{
	
	public double Solve(double r,int h){
		if(h==1)
			return r;
		
		else
		{	h--;
		    return r*Solve(r,h);
		}
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the base and exponent: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		int h = sc.nextInt();
		
		
		Power Obj = new Power();
		double Vol = Obj.Solve(r,h);
		
		System.out.println("The result is: "+Vol);
		
	}
	
}