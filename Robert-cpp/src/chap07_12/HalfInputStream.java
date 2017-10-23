package chap07_12;

public class HalfInputStream extends InputStream{

	public void set_Base() {
		super.set_Base();
		m_n /= 2;
	}
}
