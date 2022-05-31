
public class Array1 {

	public static void main(String[] args) {
		//배열이란? 나열된 데이터 형태를 말함. (Array)
		//배열 기호 [], {} 
		int a[] = new int[4]; // a[] 변수이지만 배열 값을 받는 변수
		//new int[4] : 숫자로 된 4개의 데이터를 생성함
		
		a[0]=5; // 배열은 무조건 0부터 시작함
		a[1]=15;
		a[2]=25;
		a[3]=35;
		//new int[배열범위] : 해당 범위는 실제 데이터보다 무조건 커야 함.
		
		
		int ea = a.length; //length는 배열의 갯수를 파악할 때 사용함.
		//System.out.println(ea);
		int f;
		for(f=0;f<ea;f++) {
		//	System.out.println(a[f]);
			//a[f] : a[0] ~ a[4] 
		}
		
		String user[] = new String[3];
		user[0]="홍길동";
		user[1]="이순신";
		user[2]="강감찬";
		
		int k = user.length;
		int w = 0;
	
		do {
			//System.out.println(user[w]);
			w++;
			
		}while(w<k);

		
		//int[]z : 배열값을 선언하고 해당 데이터를 직접적으로 자동 구분하여 적용
		//int z[]: 배열값을 선언하면서 직접 0부터 시작하여 값을 구분함.
		int[] z = new int[] {10,20,30,33,42,11}; //1차배열
		int zea = z.length;
		//System.out.println(zea);
		int ww=0;
		
		do {
		//	System.out.println(z[ww]);
			ww++;
			
		}while(ww<zea);
		
		
		// aa[] 배열 사용시 배열범위+값을 지속적으로 넣어야 하는 불편함이 있음.
		// 버전이 변경되면서 a[] 배열값을 {}로 인식시킬 수 있도록 변화됨.
		int aa[] = {10,11,22,33,55};
		
		int aea = aa.length;
		
		int w1=0;
		
		while(w1<aea) {
			
			System.out.println(aa[w1]);
			w1++;
		}
		
		
		
	}

}
