package java_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {

	FileReader fr = null;
	ArrayList<String> em = null;
	final int money = 87000000; // ȸ�� �� �ܰ�ݾ�
	public abstract void start();
	protected String se =""; // 
	// �����ε� // �� ��Ʈ�� ���� ��ɾ�� abstract�� ����
	public void start(String a) {}; 
	abstract void db2() throws IOException; // public ���� ���
	public abstract int check()[]; //getter //return 2�� �̻�
}
