import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제 9 A학생에 대한 성적을 입력받고 평균점수가 나오는 프로그램을 제작합니다. "점수를 입력하세요"라는 문구가 총 5번이 나오게 되며
		 * 모든 점수는 합산한 후 5개의 점수에대한 평균값이 출력됩니다. 출력메세지: "해당 점수의 평점 : " 출력 단, 평점 점수가 40점 이하
		 * 일경우 "재시험입니다."라고 출력하시오. 
		 * 
		 * [추가기획] "입력하실 과목 수를 넣어주세요 :"라고 제일 먼저 출력후 해당 과목 수만큼 반복문이
		 * 적용이 되며, 과목 수만큼 평균값이 적용되어야 합니다.
		 *
		 */

		int a; // 반복문에 사용.
		int sum = 0; // 합계에 사용.
		String msg = "입력하실 과목 수를 넣어주세요";

		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int num = sc.nextInt();
		msg = "번째 점수를 입력하세요\n";
		
		
		for (a = 1; a <= num; a++) {
			System.out.printf(a + msg);
			int score = sc.nextInt(); // 점수 입력
			sum += score;

		}
		double grade = (double)sum / num; // 평균계산
		int average = 40; // 합격선

		if (grade > average) {
			msg = "합격입니다.";
			System.out.printf("평점: %f "+msg,grade);
			
		} else {
			msg = "재시험";
			System.out.printf("평점: %f "+msg,grade);
				
		}
		sc.close();
		

		

	}

}
