package chap07_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream extends Stream {

	public InputStream() {
		m_n = -1;
	}
	public InputStream(double n) {
		super(n);
		System.out.println("InputStream コンストラクタ");
	}

	@Override
	protected void set_Base() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine().trim();
			m_n = Integer.parseInt(buf);
		}catch(Exception e) {
			m_n = -1;
			System.out.println("parseInt エラー:"+e.getMessage());
		}
	}

	/*
	public boolean set() {
		return m_n >= 0;
	}
	*/

}
