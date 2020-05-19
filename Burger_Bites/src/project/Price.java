package project;
public class Price extends Toppins
{
	private double basePrice;
    public Price(int baseChoice)
    {
    	
    	 switch (baseChoice) 
	        {
	            case 1:
	                this.basePrice = 0.80;
	                
	                break;
	            case 2:
	                this.basePrice = 0.70;
	                
	                break;
	            case 3:
	                this.basePrice = 0.85;
	                
	                break;
	            case 4:
	                this.basePrice = 0.50;
	                
	                break;
	            case 5:
	                this.basePrice = 1.50;
	                
	                break;
	            case 6:
	                this.basePrice = 0.50;
	                
	                break;
	            case 7:
	                this.basePrice = 0.90;
	                
	                break;
	            case 8:
	                this.basePrice = 1.00;
	                
	                break;
	            case 9:
	            	break;
	            default:
	                System.out.println("\n" +
	                        "Unknown type Please select a number among the list above...");
	                break;
	        } 
    }
    public double getPrice() {
        return basePrice;
    }
}
