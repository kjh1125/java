package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		// add(�߰�), get(�����ͷε�), remove(����), size(index ����) : ArrayList��� uill �޼ҵ忡�� ����ϴ�
		// ��ɾ�
		// Arrays.asList: �ε��� �迭 ������ ����
		// �߿�: ADD�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰� �� ��, index��ȣ�� ���� �� ���� �����ϸ�
		// �ش� index�κп� �߰��� ����.

		String member[] = { "�̼���", "ȫ�浿", "������", "������" };
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		// System.out.println(mb);
		int ea = mb.size();
		// System.out.println(ea);
		mb.add("������");
		// System.out.println(mb);
		mb.remove(1);
		// System.out.println(mb);
		mb.add(3, "�������");
		// System.out.println(mb);
		String checks = mb.get(2);
		// System.out.println(checks);
		
		/*
		 * ���빮��
		 * �� �����͸� Ŀ�����Ͽ� ���� ���ó�� ����Ͻÿ�.
		 * ��� - [7,15,22,8,11,39,41]
		 */
		// ArrayList���� int�� ������� �ʰ� integer�� ��� �����.
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> nb = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nb);
		nb.remove(5);
		nb.remove(2);
		nb.add(4,39);
		nb.add(0,7);
		System.out.println(nb);
		
		
	}

}
