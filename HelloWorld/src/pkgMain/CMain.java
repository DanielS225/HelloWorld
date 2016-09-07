package pkgMain;


public class CMain {

	public static void main(String[] args) {
		
		int t = 40;//years until retirement
		
		double P = 0;//Principle amount (original investment)
		
		double r = 7;//annual interest rate*/
		
		double t2 = 20;//how many years do you expect to live in retirement
		
		double SSI = 2642;//SSI monthly payments in retirement
		
		double needed = 10000;//expected income during retirement
		
		double diff = needed - SSI;
		
		double r2 = 2;//interest while retired
		
		double M = 0;//money is zero, counting backwards
		
		for (int x = 1; x <= t2; x++) {//calculates money needed for retirement by reversing interest/withdrawal process
			for (int y = 1; y <= 12;y++) {//based on given number of years and a monthly compounding of interest
				M = M + diff;//adds withdrawals (difference between income and SSI)
				M = M/(1+r2/1200);//subtracts the interest the account would make
			}
		}
		System.out.println("You will need $" + M + " saved by retirement.");
		
		double money = M/(((Math.pow((1+r/1200),(12*t)))-1)/(r/1200));//monthly deposit needed each month before retirement
		System.out.println("You will have to deposit $" + money + " per month before retirement.");
	}

}
