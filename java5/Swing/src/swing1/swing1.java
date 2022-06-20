package swing1;

public class swing1 {

	public static void main(String[] args) {
		// wrapper class (Box상태)
		// float,char,byte,long,short(기본타입)
		// wrapper class : Byte, Integer, Long, Double
		Integer a = new Integer(20); // new Integer(박싱)
		int b = new Integer(20); // 언박싱
		//둘 중 하나만 박싱상태라면 ==로 비교가 가능하지만 둘 다 박싱상태라면 equals 명령어로 비교해야됨.
		if(a==b) {
			System.out.println(a+b);
		}
		
		Integer no1 = 10; //언박싱
		Integer no = new Integer(99); // 박싱
		//int aa = no; //언박싱(자동)
		Integer bb = no.intValue(); // 언박싱, intValue 명령어로 값 가져옴.
		System.out.println(bb);
		
		//둘 중 하나만 박싱상태라면 ==로 비교가 가능하지만 둘 다 박싱상태라면 equals 명령어로 비교해야됨.

	}

}
