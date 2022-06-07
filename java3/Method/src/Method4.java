import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		// ruturn에 값 2개 사용하기
		per p = new per();
		
		String info = p.userinfo();
		String info2[] = info.split(",");
		System.out.println(info2[0]);
		System.out.println(Arrays.toString(info2));
		// return에 값 2개 사용하기 배열로 활용.
		
		String myinfo[] = p.user_info2();
		System.out.println(myinfo[0]+","+myinfo[1]);
	}

}

class per{
	public String userinfo() {
		String user_name = "홍길동";
		String user_id = "hong";
		String user_info = user_name+","+user_id;
		return user_info;
	}
	
	public String[] user_info2() {
		String user_name = "홍길동";
		String user_id = "hong";
		String user_array[] = {user_name,user_id}; 
		//1개 이상의 값을 return으로 보낼 경우 
		return user_array;
	}
}