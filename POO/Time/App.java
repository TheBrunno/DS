import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Jogador j = new Jogador();
		System.out.println("Digite o nome do jogador");
		j.nome = in.next();
		System.out.println("Nome do jogador: "+j.nome);
		j.chutar();
		j.fazerGol();
	}

}
