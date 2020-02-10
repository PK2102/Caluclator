import java.lang.*;
public class Functions {
	double num1,num2;
	void convert(String input1,String input2)
	{
		num1 = Double.parseDouble(input1);
		num2 = Double.parseDouble(input2);

	}
	double add(String input1,String input2) {
		convert(input1,input2);
		return num1+num2;
	}
	double subtract(String input1,String input2) {
		convert(input1,input2);
		return num1-num2;
	}
	double multiply(String input1,String input2) {
		convert(input1,input2);
		return num1*num2;
	}
	double divide(String input1,String input2) {
		convert(input1,input2);
		try
		{
			double c=num1/num2;
			return c;
		}catch(Exception e)
		{
			System.out.println("Divide by zero occured");
			return 0;
		}

	}

}
