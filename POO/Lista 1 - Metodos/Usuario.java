
public class Usuario {
	public String[] Info(String nome, int idade, double peso) {
		String[] a = new String[4];
		a[0] = "Nome: "+nome;
		a[1] = "Idade: "+idade;
		if(idade >= 18) {
			a[2] = "Maior de idade";
		}else {
			a[2] = "Menor de idade";
		}
		if(peso > 70) {
			a[3] = "Pesa mais que 70kg";
		}else {
			a[3] = "Pesa menos que 70kg";
		}
		return a;
	}
}
