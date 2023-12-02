package veer.com;

import java.util.Arrays;

public class produselfarrays {
	
	public static void Productself(int arr [] ,int res []) {
		
		for (int i = 0; i < arr.length; i++) {
			int sum=1;
			
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {
					continue;
				}
					sum=sum*arr[i];
				
			}
			
			res[i]=sum;
		}
	}

	public   static  void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,4,5};
   
   int res []= new int [arr.length];
   Productself(arr, res);
   System.out.print(Arrays.toString(res));
	}

}
