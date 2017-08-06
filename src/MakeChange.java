import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of the item?");
		double price = kb.nextDouble();
		
		System.out.println("How much are you giving me?");
		double tender = kb.nextDouble();
		
		// Make sure tendered amount isnt too little or an exact amount.
		
		if (tender < price) {
			System.out.println("Sorry, you're a little short.");
		}
		
		else if (tender == price){
			System.out.println("Thanks, run along now.");
		}
		
		//list of possible denominations 
		
		// division done to find remainder
		double change = ((100*tender) - (100*price))/100 ;
		System.out.println(change);
				

	}

}
