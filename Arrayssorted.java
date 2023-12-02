package veer.com;

public class Arrayssorted {
	
	
	public static void Bullosrt(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,3,4,5,4};
   
   for (int i = 0; i < arr.length-1; i++) {
	for (int j = 0; j < arr.length-1; j++) {
		if (arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			
			arr[j+1]=temp;
			
		}
	}
}
   
   Bullosrt(arr);
	}

}
