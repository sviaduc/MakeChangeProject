import java.util.Scanner;

public class MakeChange {
static int[] denom = {2000, 1000, 500, 100, 25, 10, 5, 1};

static String[] bill = {"twenty dollar bill", "ten dollar bill", "five dollar bill", "one dollar bill", 
"quarter", "dime", "nickel", "penny"};

static String[] bills = {"twenty dollar bills", "ten dollar bills", "five dollar bills", "one dollar bills", 
		"quarters", "dimes", "nickels", "pennies"};
static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PromptUser();
		
	}
		
		
				static void PromptUser() {
				System.out.println("What is the price of the item?");
				double price = kb.nextDouble();
				
				System.out.println("How much are you giving me?");
				double tender = kb.nextDouble();
				
				double change = ((100*tender) - (100*price)) ;
				
				if (tender < price) {
					System.out.println("Sorry, you're a little short.");
				}
				
				else if (tender == price){
					System.out.println("Thanks, run along now.");
				}
				
				else
					PrintChange(tender, price, change) ;
				}
			
			static void PrintChange(double tender, double price, double change) {
			
			int amount;
			for(int i = 0; i <denom.length; i++ ) {
				amount = (int)(change/denom[i]);
				change = change%denom[i];
				if ((amount < 2)&&(amount != 0)) {
				System.out.println(amount + " " + bill[i]);
				}
				else if(amount > 1) {
				System.out.println(amount + " " + bills[i]);
				}
			
			}
		
				

	}

}
