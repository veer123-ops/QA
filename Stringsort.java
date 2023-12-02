package veer.com;

import java.util.Arrays;

public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string  []= {"veer","raja","ama","mummy","ajju"};
   
   String string2;
   
   for (int i = 0; i < string.length-1; i++) {
	for (int j = 0; j < string.length-i-1; j++) {
		if (string[j].compareTo(string[j+1])>0) {
			string2=string[j];
			string[j]=string[j+1];
			string[j+1]=string2;
		
		}
	}
   }
	
	for (int j = 0; j < string.length; j++) {
		System.out.print(string[j] + " ");
	
}
	}

}
/*







public static void main(String[] args) {
				
				String[] strArray = {"Apple", "Orange", "Banana", "Apple", "Grape", "Banana", "Orange"};
				Arrays.sort(strArray);
				sortig(strArray);
				
			}
				public static  void sortig (String [] strArray1) {
					for (String valString :strArray1){
					System.out.print(valString + " ");
						
					}
					
					System.out.println();
				}

			}







*/