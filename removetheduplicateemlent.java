package veer.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class removetheduplicateemlent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr []= {10,2,2,3,4,56,8,9,2,2};
  
 HashSet<Integer> mpEs=new HashSet<>();
 for (int i = 0; i < arr.length; i++) {
	mpEs.add(arr[i]);
}
 
 for(int val : mpEs) {
	 System.out.print(val + " ");
 }
}
	}


