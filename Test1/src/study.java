import java.util.Arrays;

public class study {

   public static void main(String[] args) {

      
      test13 t = new test13();
      t.name("honggildong");

   }

}
class test13 {
   public void name(String name) {
      String a[] = new String[name.length()];
      a = name.split("");
      System.out.println(Arrays.toString(a));
   }
}