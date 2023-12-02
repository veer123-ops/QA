package veer.com;

import java.util.Scanner;

public class linarserch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr [] = {10,2,1,4,5,7,8,8,9,9,6,5,5,1,1,1,1,1,2,1,12};
    int data =1;
    
    for (int i = 0; i < arr.length; i++) {
		if (arr[i]==data) {
			System.out.print(i  + " postion ");
			break;
		}
	}
	}

}
