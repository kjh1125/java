package Ex;

public class Example2 {

	public static void main(String[] args) {
		//DB 중 naver.com 사용자의 이름과 네이버를 사용하는 고객 인원수 출력, 단, DB 로드시 추상클래스에서 로드하도록 함.
		//DB 순서 {이름, 통신사, 전화번호, 나이, 주소, 이메일,포인트}
		
		ac1 a12 = new ac1();
		a12.output();
	}

}

abstract class ac{
	protected String adata[][] = {
			 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
			};
	
	abstract public void output();
}

class ac1 extends ac{
	
	private String a="";
	private int ct=0;
	
	@Override
	public void output() {
	int ea = this.adata.length;
	
	
	
	int w = 0;
	
	while(w<ea) {
		int ww=0;
		
	    //원시상태의 배열로 indexof -1(없음), 그 외 모든 정수는 값이 있는것
		//Arraylist로 생성 시 메모리 할당이 오버되는 상황 발생 할 수 있음.
			if(this.adata[w][5].indexOf("naver.com")!=-1) {
				this.a += this.adata[w][0]+","+this.adata[w][5]+"\n";
				this.ct++;
		
		}
		w++;
	}
		System.out.println(this.a + "\n" +"총인원은 "+this.ct+"명");
		
	}
	
	
}
