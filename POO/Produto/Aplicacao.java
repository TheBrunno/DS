import java.util.Scanner;
public class Aplicacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto p = new Produto();
		String produto, descricao;
		int mes, dia, ano;
		
		
		System.out.println("Digite o id do produto");
		p.setId(in.nextInt());
		
		System.out.println("Digite o nome do produto");
		produto = in.nextLine();
		produto = in.nextLine();
		p.setProduto(produto);
		
		System.out.println("Digite a descricao do produto");
		descricao = in.nextLine();
		p.setDescricao(descricao);
		
		System.out.println("Digite o valor do produto");
		p.setValor(in.nextDouble());
		
		System.out.println("Digite o dia de registro do produto");
		dia = in.nextInt();
		System.out.println("Digite o mes de registro do produto");
		mes = in.nextInt();
		System.out.println("Digite o ano de registro do produto");
		ano = in.nextInt();
		p.setData(dia, mes, ano);
		
		System.out.println("Id: "+p.getId());
		System.out.println("Produto: "+p.getProduto());
		System.out.println("Descricao: "+p.getDescricao());
		System.out.println("Valor: "+p.getValor());
		System.out.println("Data de Registro: "+p.getData());
		in.close();
	}
}
