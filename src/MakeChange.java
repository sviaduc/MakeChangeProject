import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int[] denom = {2000, 1000, 500, 100, 25, 10, 5, 1};
		String[] bill = {"twenty dollar bill", "ten dollar bill", "five dollar bill", "one dollar bill", 
		"quarters", "dimes", "nickels", "pennies"};
		int amount;
		
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
		double change = ((100*tender) - (100*price)) ;
		System.out.println(change);
		
		// given the the change, it needs to be put into denominations.
		//need a loop? to repeat denominations if needed.
		
		
		for(int i = 0; i <denom.length; i++ ) {
			amount = (int)(change/denom[i]);
			change = change%denom[i];
			
			System.out.println(amount + " " + bill[i]);
		}
	
				

	}

}
