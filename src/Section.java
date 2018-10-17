
import java.lang.Math;
import java.util.Random;

public class Section {

  Random random = new Random();





  public void sum() {
    Point p1 = new Point(random.nextInt(100), random.nextInt(100));  //Выводим рандомные значения
    Point p2 = new Point(random.nextInt(100), random.nextInt(100));
    double sum1;

    int x1 = p1.x;  //выводится рандомная точка x1
    int y1 = p1.y;  //выводится рандомная точка y1
    int x2 = p2.x;  //выводится рандомная точка x2
    int y2 = p2.y;  //выводится рандомная точка y2

    sum1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));// выодим длину отрезка двух точек на плоскости

    System.out.println(sum1);
  }
}
