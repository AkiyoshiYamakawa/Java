package chap07_12;

public class ArrayStream extends Stream{
	private double m_array[];
	private int    m_i = 0;
	public ArrayStream( double array[], int size) {
		m_array = array;
	}
	@Override
	protected void set_Base() {
		// TODO 自動生成されたメソッド・スタブ
		m_n = m_array[m_i];
		if( m_n >= 0 && m_i < m_array.length - 1) {
			++m_i;
		}else {
			m_i = 0;
		}
	}
}
