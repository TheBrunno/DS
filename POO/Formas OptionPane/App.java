import javax.swing.JOptionPane;
public class App {
	public static void main(String[] args) {
		Object[] formas = {"Quadrado", "Retangulo", "Triangulo", "Trapezio"};
		Object escolha = JOptionPane.showInputDialog(null, "Escolha a forma", "App", JOptionPane.INFORMATION_MESSAGE, null, formas, formas[0]);
		
		if(escolha == "Quadrado") {
			Quadrado quadrado = new Quadrado();
			quadrado.lerDados();
			quadrado.calcular();
		}else if(escolha == "Retangulo") {
			Retangulo retangulo = new Retangulo();
			retangulo.lerDados();
			retangulo.calcular();
		}else if(escolha == "Triangulo") {
			Triangulo triangulo = new Triangulo();
			triangulo.lerDados();
			triangulo.calcular();
		}else if(escolha == "Trapezio") {
			Trapezio trapezio = new Trapezio();
			trapezio.lerDados();
			trapezio.calcular();
		}
		else {
			JOptionPane.showMessageDialog(null, "Não cancele o nosso programa ;-; >_< T_T", "Istou titi contigo", JOptionPane.ERROR_MESSAGE);
		}
	}
}
