import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame{

	public GUI() {
		this.setTitle("Calculadora Básica");
		this.setSize(1035, 405);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		
		JLabel lbN1 = new JLabel();
		lbN1.setBounds(20,20,100,25);
		lbN1.setText("Número 1:");
		this.add(lbN1);
		
		JLabel lbN2 = new JLabel();
		lbN2.setBounds(20,70,100,25);
		lbN2.setText("Número 2:");
		this.add(lbN2);
		
		JTextField tfN1 = new JTextField();
		tfN1.setBounds(90,20,130,25);
		this.add(tfN1);
		
		JTextField tfN2 = new JTextField();
		tfN2.setBounds(90,70,130,25);
		this.add(tfN2);
		
		JButton btSoma = new JButton();
		btSoma.setBounds(20, 320, 130, 30);
		btSoma.setText("Soma");
		btSoma.setBackground(new Color(173,30,36));
		btSoma.setForeground(Color.white);
		this.add(btSoma);
		
		JButton btSub = new JButton();
		btSub.setBounds(170, 320, 130, 30);
		btSub.setText("Subtração");
		btSub.setBackground(new Color(173,30,36));
		btSub.setForeground(Color.white);
		this.add(btSub);
		
		JButton btMul = new JButton();
		btMul.setBounds(320, 320, 130, 30);
		btMul.setText("Multiplicação");
		btMul.setBackground(new Color(173,30,36));
		btMul.setForeground(Color.white);
		this.add(btMul);
		
		JButton btDiv = new JButton();
		btDiv.setBounds(470, 320, 130, 30);
		btDiv.setText("Divisão");
		btDiv.setBackground(new Color(173,30,36));
		btDiv.setForeground(Color.white);
		this.add(btDiv);
		
		JLabel dialogo = new JLabel();
		dialogo.setBounds(300, 00, 300, 269);
		dialogo.setIcon(new ImageIcon("img\\dialogo.png"));
		this.add(dialogo);
		
		
		JLabel lbRes = new JLabel();
		lbRes.setBounds(340,60,300,95);
		this.add(lbRes);
		lbRes.setText("<html> <center> Ahoy, preguiçoso ser humano! <br>"
				+ " É hora de um emocionante e <br>"
				+ "misterioso encontro com a calculadora! <br>"
				+ " Está pronto para uma dose <br>"
				+ "de matemática mortal? </center> </html>");
		lbRes.setVisible(true);
		JLabel mono = new JLabel();
		mono.setBounds(600, 50, 394, 300);
		mono.setIcon(new ImageIcon("img\\normal2.png"));
		this.add(mono);
		
		ImageIcon img = new ImageIcon("img\\aha.png");
		this.setIconImage(img.getImage());
		
		btSoma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valido(tfN1.getText(), tfN2.getText())) {
					double n1 = Double.parseDouble(tfN1.getText());
					double n2 = Double.parseDouble(tfN2.getText());
					double x = n1+n2;
					lbRes.setText("<html> <center>O resultado é... "+x+"! <br> "
							+ "Parece que você escapou de <br>"
							+ " uma armadilha <br>"
							+ "matemática dessa vez!</center> </html>");
					lbRes.setBounds(365,60,300,95);
					mono.setIcon(new ImageIcon("img\\ownt2.png"));
					mono.setBounds(650, 50, 394, 300);
				}else {
					lbRes.setText("<html> <center> O que é isso?! Não é um número!! <br>"
							+ "Você acha que pode escapar do <br> Desespero "
							+ "Matemático assim tão <br>"
							+ "facilmente?! <br>"
							+ "Isso é inaceitável! </center> </html>");
					lbRes.setBounds(355,60,300,95);
					mono.setIcon(new ImageIcon("img\\bravo2.png"));
					mono.setBounds(610, 50, 394, 300);
				}
				
			}
		});
		
		btSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valido(tfN1.getText(), tfN2.getText())) {
					double n1 = Double.parseDouble(tfN1.getText());
					double n2 = Double.parseDouble(tfN2.getText());
					double x = n1-n2;
					lbRes.setText("<html> <center>O resultado é... "+x+"! <br> "
							+ "Parece que você escapou de <br>"
							+ " uma armadilha <br>"
							+ "matemática dessa vez!</center> </html>");
					lbRes.setBounds(365,60,300,95);
					mono.setIcon(new ImageIcon("img\\ownt2.png"));
					mono.setBounds(650, 50, 394, 300);
				}else {
					lbRes.setText("<html> <center> O que é isso?! Não é um número!! <br>"
							+ "Você acha que pode escapar do <br> Desespero "
							+ "Matemático assim tão <br>"
							+ "facilmente?! <br>"
							+ "Isso é inaceitável! </center> </html>");
					lbRes.setBounds(355,60,300,95);
					mono.setIcon(new ImageIcon("img\\bravo2.png"));
					mono.setBounds(610, 50, 394, 300);
				}
			}
		});
		
		
		btMul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valido(tfN1.getText(), tfN2.getText())) {
					double n1 = Double.parseDouble(tfN1.getText());
					double n2 = Double.parseDouble(tfN2.getText());
					double x = n1*n2;
					lbRes.setText("<html> <center>O resultado é... "+x+"! <br> "
							+ "Parece que você escapou de <br>"
							+ " uma armadilha <br>"
							+ "matemática dessa vez!</center> </html>");
					lbRes.setBounds(365,60,300,95);
					mono.setIcon(new ImageIcon("img\\ownt2.png"));
					mono.setBounds(650, 50, 394, 300);
				}else {
					lbRes.setText("<html> <center> O que é isso?! Não é um número!! <br>"
							+ "Você acha que pode escapar do <br> Desespero "
							+ "Matemático assim tão <br>"
							+ "facilmente?! <br>"
							+ "Isso é inaceitável! </center> </html>");
					lbRes.setBounds(355,60,300,95);
					mono.setIcon(new ImageIcon("img\\bravo2.png"));
					mono.setBounds(610, 50, 394, 300);
				}
				
			}
		});
		
		
		btDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(valido(tfN1.getText(), tfN2.getText())) {
					double n1 = Double.parseDouble(tfN1.getText());
					double n2 = Double.parseDouble(tfN2.getText());
					if(n2 == 0) {
						lbRes.setText("<html> <center>Oh-oh! Dividir por zero?<br>"
								+ " Você está brincando com fogo, humano!<br>"
								+ " Isso não é apenas matemática, é um<br>"
								+ " portal direto para o abismo do Desespero! </center> </html>");
						lbRes.setBounds(335,50,300,95);
						mono.setIcon(new ImageIcon("img\\medo2.png"));
						mono.setBounds(610, 50, 394, 300);
					} else {
						double x = n1/n2;
						lbRes.setText("<html> <center>O resultado é... "+x+"! <br> "
								+ "Parece que você escapou de <br>"
								+ " uma armadilha <br>"
								+ "matemática dessa vez!</center> </html>");
						lbRes.setBounds(365,60,300,95);
						mono.setIcon(new ImageIcon("img\\ownt2.png"));
						mono.setBounds(650, 50, 394, 300);
					}
				}else {
					lbRes.setText("<html> <center> O que é isso?! Não é um número!! <br>"
							+ "Você acha que pode escapar do <br> Desespero "
							+ "Matemático assim tão <br>"
							+ "facilmente?! <br>"
							+ "Isso é inaceitável! </center> </html>");
					lbRes.setBounds(355,60,300,95);
					mono.setIcon(new ImageIcon("img\\bravo2.png"));
					mono.setBounds(610, 50, 394, 300);
				}
			}
		});
		
		
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public boolean valido(String x, String y) {
		try {
			double n1 = Double.parseDouble(x);
			double n2 = Double.parseDouble(y);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
