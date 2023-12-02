package veer.com;

public class findthsecondmininumber {

	public static int finsecod(int arr []) {
		int min=Integer .MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	
	public static int Findees(int arr []) {
		int min=finsecod(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==min) {
				arr[i]=Integer.MAX_VALUE;
			}
		}
		
		int min1=finsecod(arr);
		return min1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,3,4,5,8,9};
   System.out.println(finsecod(arr));
   
   System.out.println(Findees(arr));
   
	}

}
