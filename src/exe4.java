import java.util.Scanner;
import java.util.Locale;

public class exe4 {

	public static void main(String[] args) {
		
		int numFunc;
		double horas;
		double valor;
		double salario;
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		numFunc = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();

		salario = horas * valor;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n ", salario);
		

	}

}
