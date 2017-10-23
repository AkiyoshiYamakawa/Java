package chap07_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RWConsole {
	public char readChar() {
		String str;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			str = br.readLine();
		}catch(Exception e) {
			str = " ";
			System.out.println("br.readLine エラー:"+e.getMessage());
		}
		return str.charAt(0);

	}

	public double readDouble(){
		double dbl;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
			dbl = Double.parseDouble(buf);
		}catch(Exception e) {
			dbl = -1;
			System.out.println("parseInt エラー:"+e.getMessage());
		}
		return dbl;

	}

	public void print(String str) {
		System.out.print(str);
	}
	public void println(String str) {
		System.out.println(str);
	}

}
