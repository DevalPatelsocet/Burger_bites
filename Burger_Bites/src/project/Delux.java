package project;
import java.util.*;
public class Delux extends Welcome
	{	
	double Deluxprice;
	int Choice;
	char YON;
	double DP=0,DP2=0;
	Scanner sc=new Scanner(System.in);
	public void delux() 
	{		
		do
		{
			System.out.print("Toppings can not be added to Delux burger But you might like Delux additions:");
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
		switch (Choice) 
        {
            case 1:
                System.out.println("CHIPS added successfully...!!!");
                break;
            case 2:
            	System.out.println("PEPSI added successfully...!!!");	                
                break;
            case 3:
            	System.out.println("COCA-COLA added successfully...!!!");                
                break;
            case 4:
            	System.out.println("CANADIAN DRY added successfully...!!!");	                
                break;
            case 5:
            	System.out.println("MOUNTAIN DEW added successfully...!!!");             
                break;
            case 6:
            	break;
            default:
                System.out.println("\n" +
                        "Unknown type Please select a number among the list above...");
                break;
        }
		DP2=DP2+DP;
		System.out.println("Total additions price is:"+DP2);
		}while(Choice!=6);		
		return;
	}   
	public void YN()
	{
		System.out.println("Do you want to buy another burger:(Y/N):");
		 YON = Character.toLowerCase(sc.findInLine(".").charAt(0));
         sc.nextLine();
	}

	public double getPrice() 
    {
        return DP2;
    }
	    
	 public double getYN() {
	        return YON;
}
}