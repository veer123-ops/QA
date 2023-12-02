package veer.com;

import java.util.Arrays;

public class Arrayseroted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,20,30,40,5};
   int n=5;
   for (int i = 0; i <n; i++) {
	
	   int first=arr[i],j;
	   
	   for (j = 0;  j< arr.length-1; j++) {
		arr[j]=arr[j+1];
}
	   arr[j]=first;
	   
	}
   
   for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]  + " ");
}

}
}