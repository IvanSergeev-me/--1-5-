import java.util.Scanner;
public class z1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������� ����� a");
		double a = s.nextDouble();
		System.out.println("������� ����� b");
		double b = s.nextDouble();
		System.out.println("������� ����� c");
		double c = s.nextDouble();
		if ((a==b) || (a==c) || (b==c)) {
			System.out.println("����� ��������� ����� ���� ����������");
		}
		else {
			System.out.println("����� ��������� ����� ��� ����������");
		}
		s.close();
	}
	

}
