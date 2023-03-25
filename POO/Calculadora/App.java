import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite o n1");
		calc.n1 = in.nextDouble();
		System.out.println("Digite o n2");
		calc.n2 = in.nextDouble();
		System.out.println("Faça sua escolha:\n1 - Soma\n2-Subtração\n3 - Multiplicação\n4 - Divisão:");
		int esc = in.nextInt();
		if(esc == 1) {
			calc.som();
		}else if(esc == 2) {
			calc.sub();
		}else if(esc == 3) {
			calc.mut();
		}else if(esc == 4) {
			calc.div();
		}else {
			System.out.println("ERROR IN EXCEPTION FX0068836: LINE 34:23");
		}
		System.out.println("O resultado é: "+calc.res);
		
	}
}
