import java.util.Scanner;

class SimpleInterest{
	
	public float SI(float P,float R,float T){
		return (P*R*T)/100;
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the Principal, Rate and Time: ");
		Scanner sc = new Scanner(System.in);
		float P = sc.nextFloat();
		float R = sc.nextFloat();
		float T = sc.nextFloat();
		
		
		SimpleInterest Obj = new SimpleInterest();
		float ans = Obj.SI(P,R,T);
		
		System.out.println("Simple Interest is: "+ans);
		
	}
	
}