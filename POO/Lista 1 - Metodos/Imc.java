
public class Imc {
	public double peso;
	public double altura;
	
	public Imc(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public String Calcular() {
		double res = (this.peso)/(Math.pow(this.altura,2));
		String sit;
		if(res<18.5) {
			sit = "Abaixo do peso";
		} else if (res<25) {
			sit = "Peso normal";
		} else if (res<30) {
			sit = "Sobrepeso";
		} else if (res<35) {
			sit = "Obesidade grau 1";
		} else if (res<40) {
			sit = "Obesidade grau 2";
		} else {
			sit = "Obesidade grau 3";
		}
		return sit;
	}
}
