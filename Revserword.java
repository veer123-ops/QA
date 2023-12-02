package veer.com;

public class Revserword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="sky the blue";
  String [] strings=string.split("\\s+");
  
  for (int i = strings.length-1; i>=0;i--) {
	System.out.print(strings[i] + " ");
}
	}

}
