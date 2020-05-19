package project;
import java.util.*;
public class Toppins extends Welcome 
{	
double pot=0;

Scanner sc=new Scanner(System.in);
	public void choose()
	{
		int baseChoice;
		double fp;			
		do{
			System.out.println("toppins that you want to add:" + "\n\n1. Tomato --> 0.80 $" +
				"\n2. Onion  --> 0.70 $" +
				"\n3. Carrot  --> 0.85 $" +
				"\n4. Cabbage  --> 0.50 $" +
				"\n5. Cheese  --> 1.50 $" +
				"\n6. Lettuce  --> 0.50 $" +
				"\n7. Jalapenos  --> 0.90 $" +
				"\n8. Mashrooms  --> 1.00 $" +
				"\n9. Exit");
		System.out.println("\nPlease enter your choose between 1-9:");
		baseChoice = sc.nextInt();
		sc.nextLine();
		Price ps=new Price(baseChoice);
		fp=ps.getPrice();
		pot=pot+fp;
		System.out.println("Total toppins price:"+pot);	
	}while(baseChoice!=9);
		return;
	}
	
	 public double getpot() {
	        return pot;
}
	 
}
	 

