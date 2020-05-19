package project;

import java.util.Scanner;


public class Welcome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double finalp=0;
		
            System.out.println("\n\n  *******  MENU  *******\n"
            		+ "\nType of Hamburger available:" +
                    "\n\n1. Base Hamburger with cost of 3.50$"+
                    "\n2. Healthy Hamburger with cost of 5.50$"+
                    "\n3. Deluxe Hamburger with cost of 10.50$"+"\n All PRICE EXCLUDED TAXES....."+
                    "\n\nEnter your choice: ");

            int burgerchoice = sc.nextInt();
            sc.nextLine();
            switch(burgerchoice)
            {
            case 1:	
            	Toppins tp=new Toppins();
            	tp.choose();
            	tp.getpot();
            	double payment=tp.getpot()+3.50;
    			System.out.println("Price to checkout:"+payment);
    			
    			break;
            case 2:
            	Toppins tp2=new Toppins();
            	tp2.choose();
            	tp2.getpot();
            	payment=tp2.getpot()+5.50;
    			System.out.println("Price to checkout:"+payment); 
    			break;
            case 3:
            	System.out.println();
            	Delux dx=new Delux();
            	dx.delux();
            	payment=dx.getPrice()+10.50;
    			System.out.println("Price to checkout:"+payment); 
    			break;
            }
		double finalp2=finalp*0.15;
		System.out.println("Your final amount without tax:"+finalp+"$");
		finalp=finalp+finalp2;
		System.out.println("Your tax amount is:"+finalp2+"$");
		System.out.println("Your final amount is includig tax:"+finalp+"$");
		sc.close();
		System.out.println("Your order has been successfully placed.");
	}
}