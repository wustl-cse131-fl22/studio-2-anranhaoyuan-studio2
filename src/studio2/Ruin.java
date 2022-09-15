package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your start amount: ");
		double startamount = in.nextDouble();
		
		System.out.print("Enter your win chance: ");
		double wc = in.nextDouble();
		
		System.out.print("Enter your win limit: ");
		double winLimit = in.nextDouble();
		
		System.out.print("Enter the amount of days you want to play: ");
		double d = in.nextDouble();
		
		int loss = 0;
		
		for (int n = 1; n <= d; n++) {
			double s = startamount;
			int gamenum = 0;
			while (s != winLimit && s != 0) {
				if (Math.random() <= wc) {
					//System.out.println("win!");
					s++; 
				}else{
					//System.out.println("lose!");
					s--;
				}
				gamenum++;
			}
			if (s == winLimit) {
				System.out.println("Simulation "+n+": "+gamenum+" successful!");
				//System.out.println(gamenum);
				//System.out.println("sucessful!");
				//System.out.println(s);
			} else {
				System.out.println("Simulation "+n+": "+gamenum+" ruin!");
				//System.out.println(gamenum);
				//System.out.println("ruin");
				//System.out.println(s);
				loss++;
			}
			
		}
		System.out.println("Losses: "+loss+" Simulation : "+d+"");
	}

}
