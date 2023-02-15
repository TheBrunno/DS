import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor, bruto, sal=0;
		int aulas;
		System.out.println("Digite o valor da sua hora aula");
		valor = in.nextDouble();
		System.out.println("Digite a quantidade de aulas");
		aulas = in.nextInt();
		bruto = valor*aulas;
		double valores[] = {1212, 2427.35, 3641.03, 7087.22, 12136.79, 24273.57, 47333.46};
		double aliquota[] = {7.5, 9, 12, 14, 14.5, 16.5, 19, 22};
		for(int i=0;i<7;i++) {
			if(bruto<valores[i] || i==6) {
				sal = bruto - (bruto*aliquota[i]/100);
				break;
			} else if(i==6) {
				sal = bruto - (bruto*aliquota[i+1]/100);
				break;
			}
		}
		System.out.println("Seu salario e: R$"+sal);
	}
}
