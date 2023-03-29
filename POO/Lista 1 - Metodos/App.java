import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o numero do exercicio: ");
		int opt = in.nextInt();
		if(opt == 1) {
			System.out.println("Digite o peso (kg)");
			double n1 = in.nextDouble();
			System.out.println("Digite a altura (m)");
			double n2 = in.nextDouble();
			Imc imc = new Imc(n1, n2);
			System.out.println(imc.Calcular());
		}else if(opt == 2) {
			new Pares();
		}else if(opt == 3) {
			System.out.println("Digite o numero");
			int n3 = in.nextInt();
			new Tabuada(n3);
		}else if(opt == 4) {
			System.out.println("Digite o nome");
			String nome = in.nextLine();
			nome = in.nextLine();
			System.out.println("Digite a idade");
			int idade = in.nextInt();
			System.out.println("Digite o peso");
			double peso = in.nextDouble();
			Usuario user = new Usuario();
			String[] a = user.Info(nome, idade, peso);
			for(int i=0; i<4; i++) {
				System.out.println(a[i]);
			}
		}else if(opt == 5) {
			new Somatoria();
		}else {
			System.out.println("ERROR: EXCEPTION IN FX0000065384");
		}
		
		in.close();
	}
}
