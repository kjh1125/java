import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/* �����迭
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32;
		
		/* �����迭
		int b[] = {1,2,3,4};
		int[] c = {1,2,3,4};
		int[] d = new int[]{1,2,3,4};
		*/
		
		//2���迭 [][] 
		/* 2�� �����迭
		String member2[][] = new String[3][3];
		*/
		// 2�� �����迭
		String member[][] = {
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};
		//System.out.println(member[0][2]);
		int f, ff;
		int ea = member.length; // �迭 ������ �� �� �ִ��� 2�� �迭�̱� ������ 2�� ����. 
		int ea1 = member[0].length; // �ش� �迭���� ������ ��ü�� �� �� �ִ��� Ȯ��.
 
       // System.out.println(ea);
        
        for(f=0;f<ea;f++) { // ū �ݺ����� �迭 ���� ��ŭ loop
        	
        	for(ff=0;ff<ea1;ff++) { // ���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop
        //		System.out.println(member[f][ff]);
        	}
        	
        }
        
        int [][] datas = {
        		{1,3,5},
        		{2,4,6}
        };
        
        int fea = datas.length; // �迭 ����
        int dea = datas[0].length; // �迭 ���� ������ ����
        
        int w,ww;
        int total=0;
        
        for(w=0;w<fea;w++) {
        	//System.out.println(Arrays.toString(datas[w]));
        	for(ww=0;ww<dea;ww++) {
        		total+=datas[w][ww];
            }
            	
        }
        
        //System.out.println("�� �հ�:"+total);       
 
        /*
         * ���빮��
         * �ش� ������ �迭�� �ִ� ��� ���� ¦�� ���� ��� ���Ͻÿ�.
         * 1�� ������ - 11,42,22,16
         * 2�� ������ - 7,33,10,29
         */
        
        int num[][] = {
        		{11,42,22,16},
        		{7,33,10,29}
        };
        
        int numea = num.length; // �迭 ����
        int numea1 = num[0].length; // �迭 ���� ������ ����
		
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
        
        System.out.println("�� �հ��:"+total1);
        
	}

}
