import java.util.Scanner;
public class z1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¬ведите число a");
		double a = s.nextDouble();
		System.out.println("¬ведите число b");
		double b = s.nextDouble();
		System.out.println("¬ведите число c");
		double c = s.nextDouble();
		if ((a==b) || (a==c) || (b==c)) {
			System.out.println("—реди введенных чисел есть одинаковые");
		}
		else {
			System.out.println("—реди введенных чисел нет одинаковых");
		}
		s.close();
	}
	

}
