import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		double res = 0;
		System.out.println("Digite o n1");
		calc.n1 = in.nextDouble();
		System.out.println("Digite o n2");
		calc.n2 = in.nextDouble();
		System.out.println("Faça sua escolha:\n1 - Soma\n2-Subtração\n3 - Multiplicação\n4 - Divisão:");
		int esc = in.nextInt();
		if(esc == 1) {
			calc.som();
			res = calc.som(calc.n1, calc.n2);
		}else if(esc == 2) {
			res = calc.sub();
			calc.sub(calc.n1, calc.n2);
		}else if(esc == 3) {
			res = calc.mut();
			calc.mut(calc.n1, calc.n2);
		}else if(esc == 4) {
			calc.div();
			res = calc.div(calc.n1, calc.n2);
		}else {
			System.out.println("ERROR IN EXCEPTION FX0068836: LINE 34:23");
		}
		System.out.println("O resultado é: "+res);
		System.out.println("O resultado é: "+calc.res);
		
	}
}
