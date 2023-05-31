import javax.swing.JOptionPane;

public class Trapezio extends Forma {
	private double baseMaior, baseMenor;
	
	public void calcular() {
		setRes((baseMenor + baseMaior) * getAltura() / 2);
		JOptionPane.showMessageDialog(null, getRes(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
	public void lerDados() {
		try {
			baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base Maior"));
			baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base Menor"));
			setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura")));
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Insira um número válido");
			System.exit(0);
		} catch(NullPointerException error) {
			JOptionPane.showMessageDialog(null, "Não nos cancele ;-;");
			System.exit(0);
		}
	}
}
