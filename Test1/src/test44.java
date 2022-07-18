
import java.util.ArrayList;
import java.util.Scanner;

public class test44 {

   public static void main(String[] args) {

      test4_1 t = new test4_1();
      t.test4_1();

   }

}

class test4_1 {

   Scanner sc = null;
   ArrayList<String> eng = new ArrayList<>();
   ArrayList<String> kor = new ArrayList<>();
   String a="";
   boolean b = false;
   
   public void test4_1() {
      System.out.println("1.입력  2.검색  3.가장 긴 단어찾기 1~3 이외의 숫자:종료");
      this.sc = new Scanner(System.in);
      try {
         this.a = sc.next();
         int b = Integer.parseInt(this.a);
         
         if (b == 1) {
            input();
         } else if (b == 2) {
            search();
         } else if (b == 3) {
            find();
         } else {
            exit();
         }
         
      } catch (Exception e) {
         System.out.println("숫자만 입력하세요");
         test4_1();
      }
      
      
   

   }

   public void input() {
      System.out.println("영어단어:");
      this.a = this.sc.next();
      this.eng.add(a);
      System.out.println("한국어:");
      this.a = this.sc.next();
      this.kor.add(a);
      test4_1();
      
   }

   public void search() {
      this.b=false;
      System.out.println("검색한 단어를 영어나 한글로 입력하세요");
      this.a = this.sc.next();
      int w = 0;
      
      while(w<this.eng.size()) {
         if(this.a.equals(this.eng.get(w))) {
            System.out.println(this.kor.get(w));
            this.b = true;
            break;
         }
         else if(this.a.equals(this.kor.get(w))) {
            System.out.println(this.eng.get(w));
            this.b = true;
            break;
         }
         
         
         w++;
      }
      
      if(this.b==false) {
         System.out.println("없는 단어입니다. 다시 입력해주세요");
         search();
      }
      
      test4_1();
      
   }

   public void find() {
      
      int w =0;
      String b =this.eng.get(0);
      while(w<this.eng.size()) {
         
         if(b.length()<this.eng.get(w).length()) {
            b = this.eng.get(w);
         }
         
         w++;
      }
      System.out.println(b);
   
      test4_1();
      }
      
      
   
   public void exit() {
      System.out.println("종료");
      sc.close();
      System.exit(0);
   }

}