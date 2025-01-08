import java.util.Scanner;
class cel2fahre{
	public float convert(float a){
		return ((a*(9/5))+32);
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		cel2fahre ob = new cel2fahre();
		
		System.out.println("Enter the data:");
		float a = sc.nextFloat();
		
		float b = ob.convert(a);
		
		System.out.println("Fahrenhiet: "+b);
	}
}