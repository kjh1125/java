import java.util.ArrayList;
import java.util.Arrays;

public class test7 {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6};
		
		test7_1 t1 = new test7_1(a);
		test7_2 t2 = new test7_2(a);
		t1.start();
		t2.start();
		
	}

}


class test7_1 extends Thread{
	
	ArrayList<Integer> list=null;
	ArrayList<Integer> odd= null;
	
	
	public test7_1(Integer a[]) {
		this.list = new ArrayList<Integer>(Arrays.asList(a));
		
	}
	
	@Override
	public void run() {
		this.odd = new ArrayList<Integer>();
		for(int f=0; f<this.list.size();f++) {
			
			if(this.list.get(f)%2!=0) {
				int a = this.list.get(f);
				this.odd.add(a);
			}
			
		}
		System.out.println(this.odd);
		
	}
	
}

class test7_2 extends Thread{
	ArrayList<Integer> list=null;
	ArrayList<Integer> even=null;
	
	public test7_2(Integer a[]) {
		this.list = new ArrayList<Integer>(Arrays.asList(a));
		
	}
	
	@Override
	public void run() {
		this.even = new ArrayList<Integer>();
		for(int f=0; f<this.list.size();f++) {
			
			if(this.list.get(f)%2==0) {
				int a = this.list.get(f);
				this.even.add(a);
			}
			
		}
		System.out.println(this.even);
		
	}
	
}