import java.util.Scanner;

public class Margem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res = "";
		double valor, margem;
		do {
			System.out.println("Digite o valor:");
			valor = in.nextDouble();
			System.out.println("Digite a margem de lucro:");
			margem = in.nextDouble();
			
			System.out.println(valor + (valor*margem/100));
			System.out.println("Deseja continuar: (S/N)");
			res = in.next();
		}while(!res.equalsIgnoreCase("n"));
	}
}
