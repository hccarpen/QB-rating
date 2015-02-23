import java.util.Scanner;
//created by https://github.com/hccarpen
public class calculator {
	
	public static double mm(double val) {
		double newValue;
		
		if (val < 0)
			newValue = 0;
		else if (val > 2.375)
			newValue = 2.375;
		else
			newValue = val;
		
		return newValue;
	}

	public static void main(String[] args) {
		
		double rating,
			touchDowns,
			totalYards,
			interceptions,
			completions,
			passAttempts;
		
		double a,
			b,
			c,
			d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Player's number of touchdowns: ");
		touchDowns = input.nextDouble();
		
		System.out.printf("Player's total yards: ");
		totalYards = input.nextDouble();
		
		System.out.printf("Number of player's interceptions: ");
		interceptions = input.nextDouble();
		
		System.out.printf("Number of player's completions: ");
		completions = input.nextDouble();
		
		System.out.printf("Number of player's attempted passes: ");
		passAttempts = input.nextDouble();
		
		input.close();
		
		a = (((completions / passAttempts) - .3) * 5);
		b = (((totalYards / passAttempts) - 3) * .25);
		c = ((touchDowns / passAttempts) * 20);
		d = ((2.375 - (interceptions / passAttempts) * 25));
		
		a = mm(a);
		b = mm(b);
		c = mm(c);
		d = mm(d);
		
		rating = (((a + b + c + d) / 6) * 100);
		
		System.out.println("==============================================\n" +
				"Player's calculated QB rating: " + rating);
	}
}
