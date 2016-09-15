package pkgMain;

import java.util.Scanner;

public class CMain {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);//new scanner for text input
		
		System.out.println("Number of passing attempts");
		double att = input.nextDouble();//years until retirement
		
		System.out.println("Number of completions");
		double comp = input.nextDouble();//years until retirement
		
		System.out.println("Number of passing yards");
		double yds = input.nextDouble();//years until retirement
		
		System.out.println("Number of touchdowns");
		double td = input.nextDouble();//years until retirement
		
		System.out.println("Number of interceptions");
		double intc = input.nextDouble();//years until retirement
		
		double a = ((comp/att) - .3)*5;
		double b = ((yds/att) - 3)*.25;
		double c = (td/att)*20;
		double d = 2.375 - ((intc/att)*25);
		
		if (a < 0) a = 0;
		else if (a > 2.375) a = 2.375;
		
		if (b < 0) b = 0;
		else if (b > 2.375) b = 2.375;
		
		if (c < 0)	c = 0;
		else if (c > 2.375) c = 2.375;
		
		if (d < 0) d = 0;
		else if (d > 2.375)	d = 2.375;
		
		double passRate = ((a+b+c+d)/6)*100;
		System.out.printf("The passer rating is " + "%3.1f",passRate);
		
		input.close();
	}
}