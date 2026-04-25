package pack1;

import java.util.Scanner;

public class CurrencyConverter 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch='y';
		do 
		{
	System.out.println("Choose conversion");
	System.out.println("1.INR to USD");
	System.out.println("2.USD to INR");
	System.out.println("3.INR to EUR");
	int choice=sc.nextInt();
	System.out.println("Enter amount:");
	double amount=sc.nextDouble();
	double rate=0;
	String to="";
	switch(choice) 
	{
	case 1:
		rate=0.012;
		to = "USD";
		break;
	case 2:
		rate=83;
		to = "INR";
		break;
	case 3:
		rate=0.011;
		to = "EUR";
		break;
		default:
			System.out.println("Invalid choice");
			continue;
	}
	double result=amount*rate;
	System.out.printf("Converted Amount:%.2f %s",result,to);
	System.out.println("\nDo you want to continue?(y/n)");
	ch = sc.next().charAt(0);
		}
	while(ch == 'y'|| ch == 'Y');
	sc.close();
}
}
