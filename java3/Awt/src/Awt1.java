import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 {

	/*
	 * GUI 모드 : (Java7이후) AWT(abstract window 도구툴(계산기)), SWING( AWT-그래픽 )
	 * CUI 모드 : Scanner
	 
	 *SWING : JFrame -> JPanel -> JObject
	 */
	
	public static void main(String[] args) {
		
		//awt 생성방식
		//Frame -> Panel -> Object (생성)
		//Object -> Panel -> Frame (적용)
		popclose pc = new popclose();
		
		
		Frame fr = new Frame(); //프레임 창
		fr.setTitle("사용자 로그인"); //창 이름
		fr.setSize(500,500); // 창 크기
		fr.setVisible(true); // 사용유무
		fr.addWindowListener(pc); // awt 메소드를 상속받아서 처리
		Panel pa = new Panel(); // 패널 
		
		
		
		
		CheckboxGroup radio = new CheckboxGroup();
		
		
		TextField id = new TextField(10); // TextField 10자까지
		TextField pw = new TextField(10);
		TextField sa = new TextField("사원번호를 입력하세요"); //입력데이터가 미리적용되어 있음.ㄴㄴ
		Button b1 = new Button("로그인"); //object
		Checkbox c1 = new Checkbox("자동로그인");
		Checkbox c2 = new Checkbox("동의 함",true,radio);
		Checkbox c3 = new Checkbox("동의 안 함",false,radio);
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		
		pa.add(id);
		pa.add(pw);
		pa.add(sa);
		
		pa.add(b1); // add 명령어로 패널 < - 오브젝트를 추가
		fr.add(pa); // 프레임 <- 패널을 추가
		
		
		
	}

}

class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램 종료합니다.");
		System.exit(0);
		System.gc();
	}
	
}
