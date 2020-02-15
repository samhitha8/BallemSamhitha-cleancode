package serial;
import java.util.Scanner;

import org.junit.Test;
public class costofconstruction {
	@Test
	public void enterdetails(){
		houseconstructioncost houseobject=new houseconstructioncost();
		Scanner scannerobject = new Scanner(System.in);
		System.out.printf("\nChoose the material standard from the options:\n 1.standard materails\n 2.above standard materials\n 3.high standard material\n 4.high standard material and fully automated home");
		int selectmaterial=scannerobject.nextInt();
		System.out.printf("\nenter the total area of the house in squarefeet:");
		int total_area_of_house =scannerobject.nextInt();
	   int costofconstruction= houseobject.calculateconstructioncost(selectmaterial , total_area_of_house);
		System.out.printf("\nThe total cost constuction per square feet is:%d",costofconstruction);
		System.out.printf("\nDo you want fully automated home,enter yes or no:\n");
		String opinion_about_automated_home = scannerobject.next();
			System.out.printf("Thank you for your opinion :-)");
		scannerobject.close();
		}
		}
	class houseconstructioncost{
		public int calculateconstructioncost(int selectmaterial, int total_area)
		{  int totalcost=0;
			switch(selectmaterial)
			{
			case 1:
				totalcost=1200*total_area;
				break;
			case 2:
				totalcost=1500*total_area;
				break;
			case 3:
				totalcost=1800*total_area;
				break;
			case 4:
				totalcost=2500*total_area;
				break;
			default:
				System.out.print("\nDefault block is executed");
					}
			return totalcost;
		}
}
