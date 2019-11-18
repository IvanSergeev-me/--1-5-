import java.util.Scanner;
public class z5 {
	static boolean prostoyeLi(int n){
        if (n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {

	

		System.out.println("Введите число: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 1){
            System.out.println("номеру 1 ссответвствует простое число "+ 2);
            return;
        }
        int prostoye = 2;
        int k = 1;
        for(int i = 3; k < n; i += 2){
            if(prostoyeLi(i)){
                k++;
                prostoye = i;
            }
        }
        System.out.println("номеру сответвствует простое число " + prostoye);
  
 }
}
