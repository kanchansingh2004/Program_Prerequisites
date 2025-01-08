import java.util.Scanner;

class Add{
	
	int add(int a,int b){
	   return a+b;
	}
	
	public static void main(String args[])
	{
		Add ad = new Add();
		
		System.out.println("Enter the Numbers");
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int a=ad.add(x,y);
		
		System.out.println("The addition is: "+a);
		
		
	}
	
	
}