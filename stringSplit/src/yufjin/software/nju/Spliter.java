package yufjin.software.nju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spliter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a string you want to split(end with enter button):");
		BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		try {
			str = strIn.readLine().toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] charList = str.toCharArray();
		int spaceNum = 0;
		int numberNum = 0;
		int letterNum = 0;
		int elseNum = 0;
		for(char m:charList) {
			if(m == ' '){
				spaceNum++;
			} else if ( m >= '0' && m <='9'){
				numberNum++;
			} else if((m >= 'a' && m <='z') || (m>='A' && m <= 'z')) {
				letterNum++;
			} else {
				elseNum++;
			}
		}
		System.out.println(spaceNum);
		System.out.println(numberNum);
		System.out.println(letterNum);
		System.out.println(elseNum);
		
	}

}
