package App;

public class App2 {

	public static void main(String[] args) {
		
		
		

	}

}

class a12{
	
	private String a1[][];
	private String a2[] = new String[5];
	private String a3="";
	public boolean s123 = true;
	
	public a12(String c, String d) {
		
		String a[][] ={
			{"������","�̰���","���","������","������"},
			{"80","78","92","67","40"},
			{"40","80","80","92","100"},
			{"95","30","55","90","65"},
			{"20","80","100","95","30"}
			};
		
		
		
		this.a1 = a;
		
		
		
		if(!c.equals("������")&&!c.equals("�̰���")&&!c.equals("���")&&!c.equals("������")&&!c.equals("������")) {
			s123 = false;
		}
		

		if(d.equals("��ü")) {
		all(c,d);
		a5();
		}
		
		else if(d.equals("����")||d.equals("����")||d.equals("����")||d.equals("����")) {
		sel(c,d);
		a4();
		}
		
		else {
			
		}
		
		
		
		
	}
	public void all(String e,String f) {
		int w = 0;
		int aea = a1[0].length; // 5��
		
		while(w<aea) {
				
				if(e.equals("������")) {
					this.a2[w] = a1[w][0];
				}
				else if(e.equals("�̰���")) {
					this.a2[w] = a1[w][1];
				}
				else if(e.equals("���")) {
					this.a2[w] = a1[w][2];
				}
				else if(e.equals("������")) {
					this.a2[w] = a1[w][3];
				}
				else if(e.equals("������")) {
					this.a2[w] = a1[w][4];
				}
				
			
			w++;
			}
			
	}
	
	public void sel(String e,String f) { // e �л��̸� // f ����
		int w = 0;
		int aea = a1[0].length; // 5��
		
		while(w<aea) {
			
			if(e.equals("������")) {
				this.a2[w] = a1[w][0];
			}
			else if(e.equals("�̰���")) {
				this.a2[w] = a1[w][1];
			}
			else if(e.equals("���")) {
				this.a2[w] = a1[w][2];
			}
			else if(e.equals("������")) {
				this.a2[w] = a1[w][3];
			}
			else if(e.equals("������")) {
				this.a2[w] = a1[w][4];
			}
			
		
		w++;
		}
		
		switch(f) {
		
		case "����" ->{
			this.a3 = a2[1];
		}
		case "����" ->{
			this.a3 = a2[2];
		}
		case "����" ->{
			this.a3 = a2[3];
		}
		case "����" ->{
			this.a3 = a2[4];
		}
		
		
		
		}
			
			
	}
	
	
	public String[] a5() { //��ü ����
		String a123[] = this.a2;
		return a123;
	}
	public String a4() { // ���� ���� ����
		String a123 = this.a3;
		return a123;
	}

	}