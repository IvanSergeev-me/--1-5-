import java.util.Scanner;
public class z4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("������� �");
    double x = in.nextDouble();
    if (x < 0) System.out.println("���������� �� �������= "+Math.abs(x));
    else if (x > 1) System.out.println("���������� �� �������= " + (x-1));
    else System.out.println("����� ����� �� �������, �������= "+0);
}


}
