package Ex;

public class Example2 {

	public static void main(String[] args) {
		//DB �� naver.com ������� �̸��� ���̹��� ����ϴ� �� �ο��� ���, ��, DB �ε�� �߻�Ŭ�������� �ε��ϵ��� ��.
		//DB ���� {�̸�, ��Ż�, ��ȭ��ȣ, ����, �ּ�, �̸���,����Ʈ}
		
		ac1 a12 = new ac1();
		a12.output();
	}

}

abstract class ac{
	protected String adata[][] = {
			 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
			 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
			 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
			 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
			 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
			 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
			 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
			 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
			 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
			 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
			};
	
	abstract public void output();
}

class ac1 extends ac{
	
	private String a="";
	private int ct=0;
	
	@Override
	public void output() {
	int ea = this.adata.length;
	
	
	
	int w = 0;
	
	while(w<ea) {
		int ww=0;
		
	    //���û����� �迭�� indexof -1(����), �� �� ��� ������ ���� �ִ°�
		//Arraylist�� ���� �� �޸� �Ҵ��� �����Ǵ� ��Ȳ �߻� �� �� ����.
			if(this.adata[w][5].indexOf("naver.com")!=-1) {
				this.a += this.adata[w][0]+","+this.adata[w][5]+"\n";
				this.ct++;
		
		}
		w++;
	}
		System.out.println(this.a + "\n" +"���ο��� "+this.ct+"��");
		
	}
	
	
}
