
import java.util.Random;

public class Main {


  public static void main(String[] args) {
    Random r = new Random();

    Section s1 = new Section();

    for (int i = 0; i < r.nextInt(10); i++){ //здесь консоль выводит значения
      s1.sum();
    }


     /* Section[] s = new Section[r.nextInt(10)]; // тут я не могу врубиться как записхать рандомные значения в массив,
      просто так по заданию написано


      for (int j =0 ; j < s.length - 1; j++) {
        //s[j] = s1.sum();

        System.out.println(j);
      }
*/


  }
}

