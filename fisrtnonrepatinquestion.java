package veer.com;

public class fisrtnonrepatinquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String srString ="javaahahha";
  
  for (int i = 0; i <srString.length(); i++) {
	int count=0;
	
	for (int j = 0; j <srString.length(); j++) {
		if (srString.charAt(i)==srString.charAt(j)) {
			count++;
		}
	}if (count==1) {
		System.out.print(srString.charAt(i));
	}
}
	}

}
