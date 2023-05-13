import java.util.Scanner;
import java.util.Locale;

public class exe3 {

	public static void main(String[] args) {
		
		double raio;
		double area;
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		area = 3.14159 * (Math.pow(raio, 2.0));
		
		System.out.printf("A = %.4f%n ", area);
		

	}

}
