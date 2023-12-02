package veer.com;

public class palindromstring {

	public static void main(String[] args) {
String string ="ababhj";
String syString="";

for (int i =string.length()-1;i>=0;i--) {
	syString=syString+string.charAt(i);
    }if (string.equals(syString)) {
	

		System.out.print(string + " this is palindrom string");
	}else {
		System.out.print(string + " this is palindom not string");
	}
}
  
	}


