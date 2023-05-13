import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int diferenca;
	
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + diferenca);
		

	}

}
