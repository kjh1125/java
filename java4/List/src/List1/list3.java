package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ѹ������� 1: 3,6,9,12,15
		 * �ѹ������� 2: 2,4
		 * 
		 * ��� 3,6,9,12,15,2,4
		 */
		// Arrays.sort : �迭���� ���¿��� �����. // ArrayList������ ��� �Ұ�.
		
		Integer num1[] = {3,6,9,12,15};
		Integer num2[] = {2,4};
		
		ArrayList<Integer> nu1 = new ArrayList<>(Arrays.asList(num1));  
		ArrayList<Integer> nu2 = new ArrayList<>(Arrays.asList(num2));
		
		
		int ea = nu2.size();
		int ea2 = nu1.size();
		int w = 0;
		int w1 = ea2;
		
		while(w<ea) {
			
			nu1.add(w1,nu2.get(w));
			
			w1++;
			w++;
		}
		
		Collections.sort(nu1); // ArrayList, LinkdList���� ����ϴ� �������� ������ �ϱ� ���� ��ɾ�
		System.out.println(nu1);
	}

}
