package java_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Example1_1 {

	public static void main(String[] args) {
		lotto lt = new lotto();
		lt.setter();

	}

}


class lotto{
	Scanner sc = null;
	LinkedList<Integer> k = null;
	String url ="C:\\javatest\\javatest\\src\\java_1\\lotto.txt";
	public void setter() {
		try {
			this.fileload();
			
		} catch (Exception e) {
		}
	}
	public String getter() {
		return null;
	}
	
	public void fileload() throws IOException {
		//InputStream is = new FileInputStream(null);
		
		try {
			FileInputStream fi = new FileInputStream(this.url);
			System.out.println(fi.available()); //��ü ũ��
			byte[] temp = new byte[fi.available()]; // ���� ũ�⿡ ���� temp ����
			int ea = fi.read(temp);
			String test = new String(temp,0,ea);
			System.out.println(test);
			//���� �ݺ��� �̿��ؼ� Linkedlist�� �߰��ϸ� ��.
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}