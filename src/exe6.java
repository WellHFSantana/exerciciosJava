import java.util.Scanner;
import java.util.Locale;

public class exe6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble(); 
		B = sc.nextDouble(); 
		C = sc.nextDouble();
		
		triangulo = (A * C)/2;
		circulo = Math.pow(C, 2) * 3.14159;
		trapezio = ((A + B) * C)/2;
		quadrado = B * B;
		retangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
