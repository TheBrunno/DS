import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		System.out.println("Digite a base");
		ret.base = in.nextDouble();
		System.out.println("Digite a altura");
		ret.altura = in.nextDouble();
		ret.area();
		System.out.println("Area: "+ret.res);
		ret.perimetro();
		System.out.println("Perimetro: "+ret.res);
	}
}
