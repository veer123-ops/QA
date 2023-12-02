package veer.com;

import java.util.Arrays;

public class Angramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="veer";
  String  string2 ="nbevdbhj";
  char x [] =string.toCharArray();
  char y []=string2.toCharArray();
   Arrays.sort(x);
   Arrays.sort(y);
   
   boolean isrult=Arrays.equals(x,y);
   if ( isrult==true) {
	System.out.print(string  + " anagramstruing");
}else {
	System.out.print(string + " this is not aaga");
}

	}

}
