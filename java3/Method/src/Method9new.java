import java.util.Arrays;

public class Method9new {

	public static void main(String[] args) {
		
		
		menus me = new menus();
		System.out.println(Arrays.toString(me.get()));
	}

}
class menus{
	private String mdata[][];
	private String rdata[] = new String[5];
	String a;
	
	public menus(){
		String ms[][] = {
				{"로켓배송","로켓프레쉬","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}
				
		};
		
		this.mdata = ms;
		
		redata();
	}

	public void redata() {
		int ea = this.mdata[0].length;
		int w = 0;
		String ww[] = new String[ea];
		int ct = 0;
		do {
			
			if(this.mdata[1][w].equals("Y")) {
				ww[ct] = this.mdata[0][w];
				ct++;
			}
			
			w++;
		}while(0<ea);
		
		this.rdata = ww;
		
		
	}
	
	public String[] get() {
		return this.rdata;
		
	}
}

/*
class aaa{
string a; -> field

public aaa(){ -> constructor

}
-> Method
public void
public static void
public String 

*/