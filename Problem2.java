
public class Problem2 {

	public static boolean land (boolean a, boolean b, boolean c) {
		boolean logicalAndoftheThree = false;
		return logicalAndoftheThree; 
	}	


	public static boolean logic(boolean x, boolean y, boolean z)
	{

		boolean retval = true;
		//x & y & z
		retval = x&&y&&z;

		return retval;

	}


	public static void main(String[] args) {
		boolean a,b,c; 

		a = true;
		b = true;
		c= true; 	
		System.out.println(logic(a,b,c));
	}

}