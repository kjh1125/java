
public class Score2 {

	private String name, subject;
	private String sign = "false";
	private String score = null;
	private int index;
	
	
	// 사용자 정보 확인 및 데이터 검수 파트
	public void stdata(String name, String subject) {
		this.name = name;
		this.subject =subject;
	String st[][]={ //setter
			{"박은경","이경훈","장운","조기현","김진수"},
			{"80","78","92","67","40"},
			{"40","80","80","92","100"},
			{"95","30","55","90","65"},
			{"20","80","100","95","30"}
			};
	
	//System.out.println(name+","+subject);
	
	int ea = st[0].length;
	int w = 0;
	int f;
	String aa = "";
	
	while(w<ea) {
		if(this.subject==null||this.name!=null) {
			if(this.name.equals(st[0][w])) {
				this.sign ="true";
				this.index = w;
			
			}
		
			else if (this.subject!=null) {
				
				
				switch(this.subject) {
				
				case "국어" ->{
					this.score = st[1][this.index];
					
				}
                case "수학" ->{
                	this.score = st[2][this.index];
				}
                case "과학" ->{
                	this.score = st[3][this.index];
				}
                case "역사" ->{
                	this.score = st[4][this.index];
                }
                default ->{
                	
                		this.score = st[1][this.index]+","+st[2][this.index]+","+st[3][this.index]+","+st[4][this.index];
                	
                }
				
				}
			}
		}
		
		w++;
	}
	
	
	
	}
	public String gtdata() { //getter
		if(this.subject==null) {
			
			return this.sign;
		}
		else {
			//return this.score;
			return this.score;
		}
		
		
		
	}
	
}

