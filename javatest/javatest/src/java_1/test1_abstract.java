package java_1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class test1_abstract {

	ArrayList<String> total = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String c = "";
	String msg = "";
	boolean d = false;

	public void setter() {

		db();
		question();

	};

	public void question() {
		
		System.out.println("과목추가[1],과목삭제[2],과목리스트 확인[3],프로그램종료[4]");
		int b = sc.nextInt();

		if (b == 1) {
			this.d = false;
			System.out.println("추가할 과목명을 입력하세요");
			c = sc.next();
			for (int f = 0; f < this.total.size(); f++) {

				if (c.equals(this.total.get(f))) {
					this.msg = "등록된 과목입니다";
					this.d = true;
				}

			}
		if(this.d==true) {
			System.out.println(msg);
			question();
		}
		else {
			System.out.println("정상적으로 등록되었습니다.");
			this.total.add(c);
			question();
		} 
			
			
		} 
		else if (b == 2) {
			this.d = false;
			System.out.println("삭제할 과목명을 입력하세요");
			c = sc.next();
			for (int f = 0; f < this.total.size(); f++) {

				if (c.equals(this.total.get(f))) {
					this.total.remove(f);
					System.out.println("정상적으로 삭제되었습니다");
					this.d=true;
					question();
				} 
			}
			if(this.d==false) {
				System.out.println("해당 과목명이 없습니다.");
				question();
			}

		}

		else if(b == 3) {
			System.out.println(this.total);
			question();
		}
		
		else {
			System.out.println("종료");
			sc.close();
			System.exit(0);
		}

	}

	public void db() {

		String a[] = { "영어", "수학", "한국사", "물리학", "생명과학" };

		for (int f = 0; f < a.length; f++) {
			this.total.add(a[f]);
		}

	};

}
