import javax.swing.JOptionPane;
public abstract class Forma {
	private double base, altura, res;
	
	public abstract void calcular();
	public void lerDados() {
		try {
			this.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base"));
			this.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura"));
		} catch(NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Insira um número válido");
			System.exit(0);
		} catch(NullPointerException error) {
			JOptionPane.showMessageDialog(null, "Não nos cancele ;-;");
			System.exit(0);
		}
		
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	
	
}
