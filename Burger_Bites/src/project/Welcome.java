package project;
import java.util.Scanner;
import java.lang.Math;
public class Welcome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean menuFlag = true;
		double finalp=0;
		do {
            System.out.println("\n\n  *******  MENU  *******\n"
            		+ "\nType of Hamburger available:" +
                    "\n\n1. Base Hamburger on a White roll with Sausage"+"\n           Price: 3.50$"+
                    "\n2. Healthy Hamburger on a Brown rye roll with Bacon"+"\n           Price:5.50$"+
                    "\n3. Deluxe Hamburger on a White roll with Sausage & Bacon"+"\n           Price:10.50$"+"\n All PRICE EXCLUDED TAXES....."+
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
    			tp.YN();
    			finalp=finalp+payment;
    			if(tp.getYN()=='y')
    			{
    				menuFlag=true;
    			}
    			else 
    			{
    				menuFlag=false;
    			}
    			//System.out.println("Your final amount is:"+finalp+"$"); 
                break;
            case 2:
            	Toppins tp2=new Toppins();
            	tp2.choose();
            	tp2.getpot();
            	payment=tp2.getpot()+5.50;
    			System.out.println("Price to checkout:"+payment); 
    			tp2.YN();
    			finalp=finalp+payment;
    			if(tp2.getYN()=='y')
    			{
    				menuFlag=true;
    			}
    			else 
    			{
    				menuFlag=false;
    			}
    			//System.out.println("Your final amount is:"+finalp+"$"); 
            	break;
            case 3:
            	System.out.println();
            	Delux dx=new Delux();
            	dx.delux();
            	payment=dx.getPrice()+10.50;
    			System.out.println("Price to checkout:"+payment); 
    			dx.YN();
    			finalp=finalp+payment;
    			if(dx.getYN()=='y')
    			{
    				menuFlag=true;
    			}
    			else 
    			{
    				menuFlag=false;
    			}
    			//System.out.println("Your final amount is:"+finalp+"$");
            }
            }while(menuFlag);
		double finalp2=finalp*0.15;
		System.out.println("Your final amount without tax:   "+Math.round(finalp*100)/100D+"$");
		finalp=finalp+finalp2;
		System.out.println("Your tax amount is:              "+Math.round(finalp2*100)/100D+"$");
		System.out.println("Your final amount includig tax:  "+Math.round(finalp*100)/100D+"$");
		sc.close();
		System.out.println("Your order has been successfully placed.");
	}
}