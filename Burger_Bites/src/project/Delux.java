package project;
	import java.util.Scanner;
	public class Delux extends Welcome
		{	
		double Deluxprice;
		int Choice;
		double DP=0,DP2=0;
		Scanner sc=new Scanner(System.in);
		public void delux() 
		{		
			do
			{
				System.out.println("Delux additions that you want to add:" + "\n\n1. CHIPS --> 1 $" +
				"\n2. PEPSI  --> 0.70 $" +
				"\n3. COCA-COLA  --> 0.85 $" +
				"\n4. CANADIAN DRY  --> 0.50 $" +
				"\n5. MOUNTAIN DEW  --> 0.50 $" +
				"\n6. Exit");
			System.out.println("\nPlease enter your choose between 1 to 6:");
			Choice = sc.nextInt();
			sc.nextLine();
			Delux_price DXP=new Delux_price(Choice);
			DP=DXP.getPrice();
			DP2=DP2+DP;
			System.out.println("Total additions price is:"+DP2);
			}while(Choice!=6);		
			return;
		}
		public double getPrice() 
	    {
	        return DP2;
	    }}