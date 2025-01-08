import java.util.Scanner;

class Area_Of_Circle{
	
	public double AreaOfCircle(double r){
		return Math.PI * r * r ;
		
	}
	public static void main(String args[]){
		
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		Area_Of_Circle a = new Area_Of_Circle();
		double area = a.AreaOfCircle(r);
		
		System.out.println("Area: "+area);
		
	}
	
}