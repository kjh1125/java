package javatest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		/*
		 * 2�� ���� { "���=2","����=1","����=1","��=1","��ġĵ=6","���=8" } ������ ���� ������ �ֽ��ϴ�. �ش� ��ٱ��ϴ�
		 * ������ŭ ��ü ���� ����Ͽ� �� ������ �ݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ� [���� 1���� ����] ��� = 250 ���� = 200 ���� =
		 * 700 �� = 2300 ��ġĵ = 1100 ��� = 850 [������] �����Ͻð��� �ϴ� �� ���� �ݾ��� : XXXXX �� �Դϴ�. ��
		 * ���� 1���� ���� ���� ���� �迭�� ���� �����Ͻñ� �ٶ��, �ش� �迭 �⺻���� ���� ���� ������ �ʾƾ� �մϴ�. ���� 1���� ���� ����
		 * ������ ������ java ���Ͽ��� �ε� �Ͽ� �������ñ� �ٶ��ϴ�. test2.java test2_data.java�� �Բ� �̿��մϴ�.
		 * 
		 * Split���� ������ �ڿ� ���� ���ڷ� ���� �� static�� �־ ���.
		 * 
		 */
		basket b = new basket();
		b.basket_data();
		System.out.println();
	

}
}

class basket extends test2_data {
	
	static int total = 0;
	
	public void basket_data() {
		String menu[] = { "���=2", "����=1", "����=1", "��=1", "��ġĵ=6", "���=8" };
		System.out.println(Arrays.toString(this.price));
		
	}
	
}