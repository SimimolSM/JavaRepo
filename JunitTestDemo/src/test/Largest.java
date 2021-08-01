package test;

public class Largest {
	public static int large(int num1,int num2, int num3) {
		int num;
		if (num1>num2 && num1>num3) {
			num=num1;
			
		}
		else if (num2>num1 && num2>num3) {
			num=num2;
		}
		else {
			num=num3;

		}
		return num;
		
	}

}
