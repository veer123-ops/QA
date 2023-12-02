package veer.com;

public class fibonseries {
	
	
	public static int Fibnaserie(int n) {
		
		if (n==1 || n==0) {
			return n;
		}
		return Fibnaserie(n-1) + Fibnaserie(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=8;
  
  System.out.print(Fibnaserie(n));
	}

}
