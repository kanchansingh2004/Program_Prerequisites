import java.util.Scanner;

class Perimeter{
	
	public float Perimeter(float l,float w){
		return 2*(l+w);
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the length and width: ");
		Scanner sc = new Scanner(System.in);
		float l = sc.nextFloat();
		float w = sc.nextFloat();
		
		
		Perimeter Obj = new Perimeter();
		float Vol = Obj.Perimeter(l,w);
		
		System.out.println("Perimeter of rectangle: "+Vol);
		
	}
	
}