
public class Problem4 {

	public static void main(String[]args) {

		System.out.print(coins(7));
		System.out.print(coins(-7));
		System.out.print(coins(99));
	}
	public static int coins(int n) {

		int retval = 0;

		if(n<0) return -1;
		if(n==0) return 0;
		if(n==-1)return -3;
		if (n==2) return 1;
		if (n==-3) return -1;
		if (n==-4) return 2;
		if (n==5) return 1;

		int bi = coins(n-2);
		int fi = coins (n-5);

		if(bi<0 && fi<0) return -1;
		if(bi<0) return fi + 1;
		if(fi<0) return bi + 1;
		if(bi<fi) return bi + 1;
		if(fi<bi) return fi + 1;
		
		retval = fi +1;



		int two = coins(n-2);
		int five = coins(n-1);
		
		if(two>five){
		
			return two + 1;
			return retval;
			return int;
		}
	}

}

