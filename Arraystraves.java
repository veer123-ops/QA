package veer.com;

import java.util.Arrays;

public class Arraystraves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,30,40,50};
  
  int i=0;
  int j=arr.length-1;
  
  while(i<=j) {
	  int temp =arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	  i++;
	  j--;
  }
  
  System.out.print(Arrays.toString(arr));
	}

}
