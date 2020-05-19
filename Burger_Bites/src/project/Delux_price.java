package project;

public class Delux_price  extends Delux 
{
	public Delux_price(int Choice)
	{
	switch (Choice) 
	{
     case 1:
         this.Deluxprice = 1.0;        
         break;
     case 2:
         this.Deluxprice = 0.70;             
         break;
     case 3:
         this.Deluxprice = 0.85;             
         break;
     case 4:
         this.Deluxprice = 0.50;             
         break;
     case 5:
         this.Deluxprice = 0.50;             
         break;
     case 6:
     	break;
     default:
         System.out.println("\n" +
                 "Unknown type Please select a number among the list above...");
         break;
 } 
	}
	public double getPrice() 
    {
        return Deluxprice;
    }

}
 