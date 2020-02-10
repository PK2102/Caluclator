import java.util.*;
import java.lang.*;
public class Main {
	static char check_input(String input1,String input2,char op)
	{
		double num1,num2;
		try
		{
			num1 = Double.parseDouble(input1);
			num2 = Double.parseDouble(input2);
		}catch(Exception e)
		{
			return '0';
		}
		return op;
	}

	public static void main(String [] args)
	{
		Scanner scan  = new Scanner(System.in);
		String input1,input2;
		char op;
		char choice ='y';
		while(choice!='n')
		{
			System.out.println("Enter a number:");
			input1 = scan.next();
			System.out.println("Enter a number:");
			input2=  scan.next();
			System.out.println("Enter operator you want to perform on numbers(+,-,*,/)");
			op = scan.next().charAt(0);
			op = check_input(input1,input2,op);
			Functions ob = new Functions();
			switch(op)
			{
			case '+':
				System.out.println("Result is: "+ob.add(input1,input2));
				break;
			case '-':
				System.out.println("Result is: "+ob.subtract(input1,input2));
				break;

			case '*':
				System.out.println("Result is: "+ob.multiply(input1,input2));
				break;

			case '/':
				System.out.println("Result is: "+ob.divide(input1,input2));
				break;
			default:
				System.out.println("You entered wrong input");			

			}
			System.out.println("Do you want to continue (y/n)");
			choice = scan.next().charAt(0);


		}
	}
}
