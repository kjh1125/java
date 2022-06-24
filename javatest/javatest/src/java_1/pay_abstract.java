package java_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {

	FileReader fr = null;
	ArrayList<String> em = null;
	final int money = 87000000; // 회사 총 잔고금액
	public abstract void start();
	protected String se =""; // 
	// 오버로딩 // 한 파트만 쓰는 명령어는 abstract를 지움
	public void start(String a) {}; 
	abstract void db2() throws IOException; // public 빼고 사용
	public abstract int check()[]; //getter //return 2개 이상
}
