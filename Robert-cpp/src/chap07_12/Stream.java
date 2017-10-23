package chap07_12;

public abstract class Stream {
	protected double m_n;

	public Stream() {

	}
	public Stream(double n) {
		System.out.println("Stream(double)コンストラクタ ");
	}

	public double get() {
		return m_n;
	}

	protected abstract void set_Base() ;

	public boolean set() {
		set_Base();
		return m_n >=0 ;
	}
}
