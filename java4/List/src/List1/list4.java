package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer num1[] = {3,6,9,12,15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(num1));
		//게시판 같이 출력만하는 경우 Arrayslist 사용 // 전체 삭제
		//삭제를 해야되는 경우 LinkedList를 사용, 입력은 느리지만 중간 부분 수정은 빠름.
		ln.add(33);
		System.out.println(ln);

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();//비어있는 배열
		String user;
		//for(;;):무한루프
		while(true) { //무한루프
			System.out.println("숫자를 입력하시오");
			user = sc.next();				
			try { //사용자가 입력한 값이 오류가 있는지 확인하는 파트
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea>=5) { // 배열이 5개 이상이면 무한루프를 빠져나옴.
					break;
				}
			} catch(Exception e){ // 오류가 발생한 경우 작동되는 파트
				System.out.println("해당 입력사항은 문자입니다");
				
			}
		}
		System.out.println(list);
		
	}

}
