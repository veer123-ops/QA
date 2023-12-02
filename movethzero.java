package veer.com;

public class movethzero {

	
	public static void moveseror(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,2,40,3,2,0,0,2,2,4,5,0};
  
  
  for (int i = 0; i < arr.length-1; i++) {
	for (int j = i; j < arr.length-i-1; j++) {
		if (arr[j]==0  && arr[j+1]!=0) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
	
	
}
  moveseror(arr);
	}

}
