package List1;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ش� ������ �� �� �޸�� �����ʹ� ��� �����ؾ� �մϴ�.
		 * �� ������ 
		 * {"�����","������","��â��","�ڵ���","�̰���","������","������"};
		 * �����,�������� ���
		 
		String customer[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> cu = new ArrayList<>(Arrays.asList(customer));
		int ea = cu.size();
		int w1 = 0;
		while(w1<ea) {
			
			if(!cu.get(0).equals("�����") && !cu.get(0).equals("������")) {
				
				cu.remove(0);
				
			}
			System.out.println(cu);
			w1++;
		}
		
	
		int w = 4;
		while(w>=0) {
			
			cu.remove(w);
			
			w--;
		}
		
		int w = 0;
		while(w<ea) {
			int ea2 = cu.size(); // node ������ �ٽ� �ľ���
			int ww=0;
			
			while(ww<ea2) {
			
			if(!cu.get(ww).equals("�����") && !cu.get(ww).equals("������")) {
				
				cu.remove(0);
				System.out.println(cu);
			}
			
			
		}
			w++;
		}
		
		
		 * ���빮�� ¦���� ���ڸ� ��� ����
		 * 10,7,6,1,11,37,41,22
		 * 7,1,11,37,41
		*/
		
		Integer number[] = {10,10,7,6,1,11,37,41,22};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(number));
		/*
		int w = num.size();
		int ww = w-1;
		
		
		while(ww>=0) {
			
			if(num.get(ww)%2==0)
			{
				num.remove(ww);
			}
			
			ww--;
		}
		System.out.println(num);
		*/
		
		int no =num.size();
		int z = 0;
		
		do {
			int no2 = num.size(); 
			int zz=0;
			System.out.println(num);
			do {
				if(num.get(zz)%2==0) {
				num.remove(zz);
				break;
				}
				zz++;
				
			}while(zz<no2);
			
			
			z++;
		}while(z<no);
		
		
		
	}
	
	
}

