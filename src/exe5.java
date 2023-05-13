import java.util.Scanner;
import java.util.Locale;

public class exe5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int codPec1, numPec1, codPec2, numPec2;
		double valorPec1, totalPec1, valorPec2, totalPec2, valorPagar;
		
		codPec1 = sc.nextInt(); 
		numPec1 = sc.nextInt(); 
		valorPec1 = sc.nextDouble();
		
		codPec2 = sc.nextInt(); 
		numPec2 = sc.nextInt(); 
		valorPec2 = sc.nextDouble();
		
		valorPagar = (numPec1 * valorPec1) + (numPec2 * valorPec2);
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		sc.close();

	}

}
