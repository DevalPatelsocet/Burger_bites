package project;
import java.util.*;
public class Toppins extends Welcome 
	{	
	double pot=0;
	char YON;
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
			switch (baseChoice) 
	        {
	            case 1:
	                System.out.println("Tomato added successfully...!!!");
	                break;
	            case 2:
	            	System.out.println("Onion added successfully...!!!");	                
	                break;
	            case 3:
	            	System.out.println("Carrot added successfully...!!!");                
	                break;
	            case 4:
	            	System.out.println("Cabbage added successfully...!!!");	                
	                break;
	            case 5:
	            	System.out.println("Cheese added successfully...!!!");             
	                break;
	            case 6:
	            	System.out.println("Lettuce added successfully...!!!");	            
	                break;
	            case 7:
	            	System.out.println("Jalapenos added successfully...!!!");	                
	                break;
	            case 8:
	            	System.out.println("Mashrooms added successfully...!!!");
	                break;
	            case 9:
	            	break;
	            default:
	                System.out.println("\n" +
	                        "Unknown type Please select a number among the list above...");
	                break;
	        }
			pot=pot+fp;
			System.out.println("Total toppins price:"+pot);	
		}while(baseChoice!=9);
			return;
		}
		public void YN()
		{
			System.out.println("Do you want to buy another burger:(Y/N):");
			 YON = Character.toLowerCase(sc.findInLine(".").charAt(0));
             sc.nextLine();
		}
		 public double getpot() {
		        return pot;
	}
		 public double getYN() {
		        return YON;
	}
		 
}