
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member(); 
		// 객체 : Member
		// mb : 인스턴스
		// new Member() : 메모리에 인스턴스 명을 생성하여 사용할 수 있도록 함.
		
		mb.user_age = 33;
		System.out.println(mb.user_age);
		
		int total = 25 * mb.user_agree;
		System.out.println(total);
		
		final int agree = mb.user_agree; 
		// Member 인스턴스를 load -> agree라는 필드 상수값으로 전달.
		mb.user_agree = 80; //메모리에 등록된 필드명에 해당되는 값을 변경함.
		System.out.println(mb.user_agree);
		System.out.println(agree);
		
		/*
		 * 일반 클래스 메소드 부분  // Coupon
		 * 일반 클래스 메소드를 사용 시 별도의 객체 및 인스턴스를 만들 필요가 없습니다. 
		 * 왜? Static 자체가 메모리 인스턴스를 사용한다는 뜻입니다.
		 */
		
		//Coupon.events();
		mb.member_event();
		
	}

}

class Member{ //클래스 
	String user_name; // 변수 필드명(user_name)을 생성
	int user_age;
	int user_level;
	int user_agree=6; // 변수 필드명(user_agree)에 필드 값(1)을 선언
	public void member_event() { //메소드 함수값.
		Coupon.events(); //클래스에 대한 메소드를 바로 호출가능.
		//단, events라는 메소드에 변수 필드 및 변수 필드값을 class에 선언하게 되면
		//그 때는 객체+인스턴스를 생성해야만 로드가 됩니다. // new로 선언.
	
	}
}

class Coupon{
	public static void events() {
		int cp = 30;
	System.out.println(cp);
	}
	
}

/*
 * 하나의 Project 중 서로 다른 package라도 한 번 사용한 class명은 다른 곳에서 사용불가.
 */
