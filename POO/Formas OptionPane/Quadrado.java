import javax.swing.JOptionPane;

public class Quadrado extends Forma{
	
	public void calcular() {
		setRes(getBase()*getBase());
		JOptionPane.showMessageDialog(null, getRes(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void lerDados() {
		
		try {
			setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base")));
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Insira um n�mero v�lido");
			System.exit(0);
		} catch(NullPointerException error) {
			JOptionPane.showMessageDialog(null, "N�o nos cancele ;-;");
			System.exit(0);
		}
		
	}
}
