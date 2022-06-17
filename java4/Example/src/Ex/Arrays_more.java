package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArrayList 2차 배열형태, 다차원 포함.
public class Arrays_more {

	public static void main(String[] args) {
		String member_data[][]= new String[][]{
			 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"}
			 };

			 //String[] : 2차배열 이상 Integer[] : 숫자 2차배열 이상
			 ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
			 
			 // 반복문으로 
			 int w = 0;
			 while(w<list.size()) {
				 
				 System.out.println(list.get(w)[2]); //.get(반복문)[index번호]
				 w++;
			 }
	
	
	}
	
	

}
