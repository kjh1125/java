import java.awt.*;


public class awt3 {

	public static void main(String[] args) {
		
		popup p = new popup();
		p.design("awt연습 타이틀");
		popup2 p2 = new popup2();
		p2.design("awt연습 프레임");
		
	}

}



abstract class design{
	Frame fr = new Frame();
	
	public void design(String title) {
		this.fr.setTitle(title);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(0,0,300,300);
	}
	public abstract void page();
	
}

class popup2 extends design{
	@Override
	public void page() {
		
	}
	
}

class popup extends design{
	@Override
	public void page() {
		
	}
	
}