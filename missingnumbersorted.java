package veer.com;

public class missingnumbersorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {1,2,3,4,6};
  int n=arr.length+1;
  
  int total=(n*(n+1)/2);
  
  int sum=0;
  
  for (int i = 0; i < arr.length; i++) {
	sum=sum+arr[i];
}
  
  System.out.print(total-sum + " ");
	}

}
