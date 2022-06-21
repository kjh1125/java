import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// IOException + Exception  
public class File3 {

	public static void main(String[] args) throws IOException,Exception{
		
		filein f = new filein();
		

	}

}

class filein {
	FileReader fr = null;
	public filein() throws IOException,Exception{
		
		try {
			this.fr = new FileReader("C:\\java5\\File_Stream\\src\\data.dat");
			this.word();
			
		} catch (IOException e) {
			if(e.getMessage()!=null) {
				
				System.out.println(e);
			}
		}
		catch (Exception e2) {
				if(e2.getMessage()!=null) {
					
					System.out.println(e2);
				}
		
		}
		
	}
	
	public void word() throws IOException {
		
		try {
			int w;
			while(true) {
				
				w = this.fr.read();
				System.out.print((char)w);
				if(w==-1) {
					break;
				}
				
			}
			this.fr.close();
			
		} catch (Exception e1) {
			if(e1.getMessage()!=null) {
				System.exit(0);
			}
		}
		
	}
	
}