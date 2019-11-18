import java.util.Scanner;
public class z2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] Chi = new int[3];
		for (int i=0;i<3;i++ ) {
			System.out.println("Введите число");
			int a = s.nextInt();
			Chi[i] = a;
			
		}
		int i;
		int max=Chi[0];
		int smax=Chi[1];
		for(i=0;i<3;i++) { 
	        
	         if(Chi[i]>max){
	             smax=max;  
	             max=Chi[i];  
	          }  
	         else if(Chi[i]>smax &&Chi[i]!=max) {
	           smax=Chi[i];
	         }
	         else if(max==smax) {  
	           smax=Chi[i];  
	         }
	      }
		System.out.println("Второй максимум =" + smax);
		s.close();
	}
		
	


}
