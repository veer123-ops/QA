package veer.com;

public class Longcuitive {
	
	public static int Longcustive(int arr [] ,int targate) {
		int count=0;
		int max=0;
		for(int val :arr) {
			if (val==targate) {
				count++;
				max=Math.max(max,count);
				
			}else {
				count=0;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 int arr [] = {1, 2, 2, 3, 3, 3, 4, 4, 4,4 ,4,4,4, 5, 5};
		    int data =4;
		    System.out.print(Longcustive(arr, data));
	}

}
