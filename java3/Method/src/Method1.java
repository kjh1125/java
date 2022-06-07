
public class Method1 {

	public static void main(String[] args) {
		
		tests t1 = new tests();
		t1.a1++;
		t1.a2++;
		t1.name1();
		t1.b1 += " 유관순";
		t1.b2 += " 유관순";
		t1.name2();
		
		tests t2 = new tests();
		t2.a1++;
		t2.a2++;
		t2.name1();
		t2.b1 += " 강감찬";
		t2.b2 += " 강감찬";
		t2.name2();
	}

}

class tests{
	
	int a1 = 1; // 새로운 객체 생성 및 클래스로 호출 시 이전 값은 지워지고 기존값(1)을 다시 불러옴. (동적변수)
	public static int a2 = 1; // 새로운 객체 생성 및 클래스로 호출하더라도 기존값(1)이 아닌 이전에 계산된 값을 가지고 있음. (정적변수)
	
	String b1 ="이순신";
	public static String b2 ="홍길동";
	
	
	public void name1() {
		//System.out.println(a1);
		//System.out.println(a2);
	}
    public void name2() {
    	System.out.println(b1);
		System.out.println(b2);
	}
	
}