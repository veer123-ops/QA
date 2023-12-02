package veer.com;

public class findseconlarfgetnumber {

	public static int finsecod(int arr []) {
		int max=Integer .MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static int Findees(int arr []) {
		int max=finsecod(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		
		int max1=finsecod(arr);
		return max1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,3,4,5,8,9};
   System.out.println(finsecod(arr));
   
   System.out.println(Findees(arr));
   
	}

}
