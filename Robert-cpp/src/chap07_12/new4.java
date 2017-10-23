package chap07_12; 
import java.lang.*;

public class new4
{
	public static void main(String[] args) {
		RWConsole rwc = new RWConsole();
		while (true)  {
			Stream stream = CreateStream();
			if(stream==null) break;
			double sum = Sum(stream);
			rwc.println("合計: "+ sum );
		}
		test2();
		rwc.println("プログラム終了");

	}

	public static Stream CreateStream(){
		char ch = ' ';
		RWConsole rwc = new RWConsole();

		while(true) {
			rwc.println("i: InputStream, h: HalfInputStream, a: ArrayStream e: End==>");

			ch = rwc.readChar();

			switch(ch) {
			case 'e':
				return null;
			case 'i':
				return new InputStream();
			case 'h':
				return new HalfInputStream();
			case 'a':
				while(true) {
					rwc.println("配列をえらんでください (1,2) > ");
					ch = rwc.readChar();
					if( ch == '1') {
						double ARRAY[] = { 1, 2, 3, -1 };
						int SIZE = ARRAY.length;
						return new ArrayStream(ARRAY, SIZE);
					}else if(ch == '2') {
						double ARRAY[] ={0.5, 1.5, -1 };
						int SIZE = ARRAY.length;
						return new ArrayStream(ARRAY, SIZE);
					}
				}
			}
		}
	}

	public static double Sum(Stream stream) {
		double sum = 0;
		while(stream.set()) {
			sum += stream.get();
		}
		return sum;
	}

	public static void test2() {
		double ARRAY11[] = { 1, 2, 3, -1 };
		int SIZE11 = ARRAY11.length ;
		ArrayStream astrm1 = new ArrayStream(ARRAY11, SIZE11);

		double ARRAY12[] = { 4, 5, 6, -1 };
		int SIZE12 = ARRAY12.length;
		ArrayStream astrm2 = new ArrayStream(ARRAY12, SIZE12);

		dump(astrm1, "=== astrm1={ 1,2,3,-1} ===");
		dump(astrm2, "=== astrm2={ 4,5,6,-1} ===");

		ArrayStream astrm3 = astrm1;
		dump(astrm3, "=== astrm3=astrm1 {1,2,3,-1}=== ");
		astrm3 = astrm2;
		dump(astrm3, "=== astrm3=astrm2 {4,5,6,-1}=== ");
	}

	public static void dump(ArrayStream strm, String msg){
		double v = 0.0;
		RWConsole rwc = new RWConsole();
		rwc.println(msg);
		while(strm.set()){
			v = strm.get();
			rwc.println("value = " + v) ;
			if( v == -1) break;
		}
	}

}
