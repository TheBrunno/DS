import javax.swing.JOptionPane;

public class Triangulo extends Forma{
	public void calcular() {
		setRes(getBase() * getAltura() / 2);
		JOptionPane.showMessageDialog(null, getRes(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
