import java.util.Scanner;
public class z3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] Chi = new int[3];
		for (int i=0;i<3;i++ ) {
			System.out.println("Введите число");
			int a = s.nextInt();
			Chi[i] = a;
			
		}
		int i;
		int k=0;
		int max=Chi[0];
		for (i=0;i<3; i++) {
			if (max<=Chi[i]) {
				max=Chi[i];
				
			}
		}
		for (i=0;i<3; i++) {
			if (max==Chi[i]) {
				k=k+1;
				
			}
		}
		System.out.println("Максимальное число  =" + max);
		System.out.println("Количество максимальных чисел (k) =" + k);
		s.close();
		
		
		
		
		
		
		
		
	}
}
