import javax.swing.JOptionPane;

public class Retangulo extends Forma{
	public void calcular() {
		setRes(getBase() * getAltura());
		JOptionPane.showMessageDialog(null, getRes(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
