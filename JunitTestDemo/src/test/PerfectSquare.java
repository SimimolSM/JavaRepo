package test;

public class PerfectSquare {
	public static boolean square(int num) {
		boolean res;
		double root = Math.sqrt(num);

		if(root%1==0)

		{
			res=true;
			System.out.println("Perfect Square");
		}

		else {
			res=false;
			System.out.println("Not a Perfect Square");
		}
		return res;
	}
}
