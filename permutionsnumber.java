package veer.com;

import java.util.Arrays;

public class permutionsnumber {

	
	public static  void permutions(int arr [] ,int j) {
		if (j==arr.length-1) {
			
			System.err.print(Arrays.toString(arr));
		}for (int i = j; i < arr.length; i++) {
			swap(arr, j, i);
			permutions(arr, j+1);
		}
		
	}
	
	public static void swap(int nums [] ,int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,3,5};
   
  // int resr [] =new int [arr.length];
   permutions(arr, 0);
   
	}

}
