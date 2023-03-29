import java.util.Scanner;
public class AreaPerimetro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double altura, base, area, perimetro;
		System.out.println("Digite a altura do retangulo");
		altura = in.nextDouble();
		System.out.println("Digite a base do retangulo");
		base = in.nextDouble();
		area = altura*base;
		perimetro = (altura+base)*2;
		System.out.println("Area:" +area);
		System.out.println("Perimetro: " +perimetro);
	}
}
