import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번역하고 색상을 한글로 표기하십시오?");
		String sc1 = sc.next();
		String msg;
		
		switch(sc1){
			
		case "빨강" ->{
			msg = "red";
		}
		case "주황" ->{
			msg = "orange";
		}
		case "노랑" ->{
			msg = "yellow";
		}
		case "초록" ->{
			msg = "green";
		}
		default ->{
			msg = "해당 단어는 번역이 되지 않습니다";
		}
		
		}
		System.out.println(msg);
		sc.close();
	}

}
