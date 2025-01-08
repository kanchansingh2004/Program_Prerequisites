import java.util.Scanner;

class Vol_of_Cyl{
	
	public double Cylinder(double r,double h){
		return Math.PI * r * r * h;
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the radius and height: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		
		
		Vol_of_Cyl Obj = new Vol_of_Cyl();
		double Vol = Obj.Cylinder(r,h);
		
		System.out.println("Volumn of Cylinder: "+Vol);
		
	}
	
}