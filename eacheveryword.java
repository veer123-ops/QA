package veer.com;

public class eacheveryword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="sky the blue";
  String string2 ="";
  String [] strings =string.split("\\s");
  
  for(String waString :strings) {
	  StringBuilder stringBuilder =new StringBuilder(waString);
	  stringBuilder.reverse();
	  
	  string2=string2+stringBuilder.toString()+ " ";
  }
  
  System.out.print(string2);
	}

}
