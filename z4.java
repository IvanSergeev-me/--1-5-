import java.util.Scanner;
public class z4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Введите х");
    double x = in.nextDouble();
    if (x < 0) System.out.println("Расстояние до отрезка= "+Math.abs(x));
    else if (x > 1) System.out.println("Расстояние до отрезка= " + (x-1));
    else System.out.println("Точка лежит на отрезке, поэтому= "+0);
}


}
