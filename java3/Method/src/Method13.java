
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(상속)
		/*
		 * 절대 부모 클래스의 construct 부분에 인수값을 적용하면 안 됨.
		 * 인수값을 적용할 경우 자식 클래스에서 로드를 못 하게 됨.
		 * 단, 자식 클래스에서는 인수값을 적용하여 construct를 사용할 수 있음.
		 */
		mth1 m1 = new mth1();
		mth2 m2 = new mth2(50);
		
		
	}

}

class mth1{
	public int no;
	public mth1(){
		this.no = 20;
		System.out.println("mth1");
	}
	
}

class mth2 extends mth1{
	public mth2(int z) {
		this.no = z;
		System.out.println("mth2");
		System.out.println(this.no);
	}
	
}
