import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/* 정적배열
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32;
		
		/* 동적배열
		int b[] = {1,2,3,4};
		int[] c = {1,2,3,4};
		int[] d = new int[]{1,2,3,4};
		*/
		
		//2차배열 [][] 
		/* 2차 정적배열
		String member2[][] = new String[3][3];
		*/
		// 2차 동적배열
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
		//System.out.println(member[0][2]);
		int f, ff;
		int ea = member.length; // 배열 갯수가 몇 개 있는지 2차 배열이기 때문에 2로 나옴. 
		int ea1 = member[0].length; // 해당 배열에서 데이터 객체가 몇 개 있는지 확인.
 
       // System.out.println(ea);
        
        for(f=0;f<ea;f++) { // 큰 반복문은 배열 갯수 만큼 loop
        	
        	for(ff=0;ff<ea1;ff++) { // 작은 반복문은 배열에 있는 데이터 갯수만큼 loop
        //		System.out.println(member[f][ff]);
        	}
        	
        }
        
        int [][] datas = {
        		{1,3,5},
        		{2,4,6}
        };
        
        int fea = datas.length; // 배열 개수
        int dea = datas[0].length; // 배열 안의 데이터 개수
        
        int w,ww;
        int total=0;
        
        for(w=0;w<fea;w++) {
        	//System.out.println(Arrays.toString(datas[w]));
        	for(ww=0;ww<dea;ww++) {
        		total+=datas[w][ww];
            }
            	
        }
        
        //System.out.println("총 합계:"+total);       
 
        /*
         * 응용문제
         * 해당 데이터 배열에 있는 모든 값중 짝수 값만 모두 더하시오.
         * 1번 데이터 - 11,42,22,16
         * 2번 데이터 - 7,33,10,29
         */
        
        int num[][] = {
        		{11,42,22,16},
        		{7,33,10,29}
        };
        
        int numea = num.length; // 배열 개수
        int numea1 = num[0].length; // 배열 안의 데이터 개수
		
        int dw=0;
        int total1=0;
        int ddw;
        do {
        	
        	ddw=0;
        	do{
        		if(num[dw][ddw]%2==0)
        		{
        			total1+=num[dw][ddw];
        		}
        		ddw++;
        		
        	}while(ddw<numea1);
        	
        	dw++;
        }while(dw<numea);
        
        System.out.println("총 합계는:"+total1);
        
	}

}
