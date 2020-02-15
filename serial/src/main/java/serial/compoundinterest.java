package serial;
import java.util.Scanner;

import org.junit.Test;

public class compoundinterest {
	@Test
	public void methodtofindinterest() {
			int principal,rate,term;
			Scanner object = new Scanner(System.in);
			System.out.printf("Enter the principal rate and term respectively:");
			principal = object.nextInt();
			rate = object.nextInt();
			term = object.nextInt();
			double simple_interest=(principal*rate*term)/100;
			System.out.printf("\nSimple interest is:%.2f",simple_interest);
			double compound_interest=principal*Math.pow((1+rate),term)-principal;
			System.out.printf("\nCompound interest is:%.2f",compound_interest);
		
		}
		
	}

