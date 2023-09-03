import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Gui extends JFrame  {
	private int height = 780;
	private int width = 1000;

	public Gui() {
		this.setTitle("Symmas Concessionária Turbo (Orçamento)");
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));

		UIManager.put("RadioButton.focus", Color.WHITE);
		UIManager.put("CheckBox.focus", Color.WHITE);
		UIManager.put("ComboBox.focus", Color.WHITE);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, width, height);

		try {
			Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("../img/fonts/High Speed.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(customFont);

			JLabel carroNome = new JLabel();
			carroNome.setBounds(450, 520, 420, 50);
			carroNome.setText("<html><body style='font-size: 30px'>Camaro</body></html>");
			carroNome.setHorizontalAlignment(SwingConstants.CENTER);
			carroNome.setFont(customFont);
			layeredPane.add(carroNome, 1);
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel header = new JLabel();
		header.setBounds(430, 85, 1000, 40);
		header.setText("<html><body> <h1 style='font-family: \"Century Gothic\"; font-size: 25px; '> Monte o carro do seus sonhos </h1> </body> </html>");
		layeredPane.add(header, 1);
		
		JLabel logo = new JLabel();
		logo.setBounds(50, 40, 305, 117);
		ImageIcon imgLogo = new ImageIcon("../img/logo.png");
		ImageIcon logoRisized = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH));
		logo.setIcon(logoRisized);
		layeredPane.add(logo, 1);
		
		JLabel linha = new JLabel();
		linha.setBounds(0, 200, width, 5);
		ImageIcon imgLinha = new ImageIcon("../img/line.png");
		ImageIcon linhaRisized = new ImageIcon(imgLinha.getImage().getScaledInstance(linha.getWidth(), linha.getHeight(), Image.SCALE_SMOOTH));
		linha.setIcon(linhaRisized);
		layeredPane.add(linha, 1);
		
		JLabel informacoes = new JLabel();
		informacoes.setBounds(30, 180, 300, 40);
		informacoes.setText("<html><body style='font-size: 14px; padding: 0 15px; background-color:#fff;'>Informações pessoais</body></html>");
		layeredPane.add(informacoes, new Integer(2));

		JLabel nome = new JLabel();
		nome.setBounds(30, 230, 60, 30);
		nome.setText("<html><body style='font-size: 11px'>Nome:</body></html>");
		layeredPane.add(nome, 1);

		JTextField nomeTx = new JTextField();
		nomeTx.setBounds(85, 235, 150, 25);
		layeredPane.add(nomeTx, 1);

		JLabel celular = new JLabel();
		celular.setBounds(300, 230, 60, 30);
		celular.setText("<html><body style='font-size: 11px'>Celular:</body></html>");
		layeredPane.add(celular, 1);

		JTextField celularTx = new JTextField();
		celularTx.setBounds(365, 235, 150, 25);
		layeredPane.add(celularTx, 1);

		JLabel email = new JLabel();
		email.setBounds(580, 230, 60, 30);
		email.setText("<html><body style='font-size: 11px'>Email:</body></html>");
		layeredPane.add(email, 1);

		JTextField emailTx = new JTextField();
		emailTx.setBounds(633, 235, 300, 25);
		layeredPane.add(emailTx, 1);

		JLabel linha2 = new JLabel();
		linha2.setBounds(0, 290, width, 5);
		linha2.setIcon(linhaRisized);
		layeredPane.add(linha2, 1);
		
		JLabel carro = new JLabel();
		carro.setBounds(30, 270, 300, 40);
		carro.setText("<html><body style='font-size: 14px; padding: 0 15px; background-color:#fff;'>Seu carro</body></html>");
		layeredPane.add(carro, new Integer(2));

		JLabel marca = new JLabel();
		marca.setBounds(30, 320, 60, 30);
		marca.setText("<html><body style='font-size: 11px'>Marca:</body></html>");
		layeredPane.add(marca, 1);

		JComboBox marcaCb = new JComboBox();
		marcaCb.setBounds(90, 320, 170, 30);
		marcaCb.addItem("Fiat");
		marcaCb.addItem("Chevrolet");
		marcaCb.addItem("Lamborghini");
		marcaCb.setBackground(Color.WHITE);
		layeredPane.add(marcaCb, 1);

		JLabel modelo = new JLabel();
		modelo.setBounds(30, 370, 60, 30);
		modelo.setText("<html><body style='font-size: 11px'>Modelo:</body></html>");
		layeredPane.add(modelo, 1);

		JComboBox modeloCb = new JComboBox();
		modeloCb.setBounds(100, 370, 160, 30);
		modeloCb.addItem("Fiat");
		modeloCb.addItem("Chevrolet");
		modeloCb.addItem("Lamborghini");
		modeloCb.setBackground(Color.WHITE);
		layeredPane.add(modeloCb, 1);

		JLabel cor = new JLabel();
		cor.setBounds(30, 425, 60, 30);
		cor.setText("<html><body style='font-size: 11px'>Cor:</body></html>");
		layeredPane.add(cor, 1);

		JRadioButton rdCor1 = new JRadioButton();
		rdCor1.setBounds(70, 420, 70, 25);
		rdCor1.setText("Branco");
		rdCor1.setBackground(new Color(255, 255, 255));
		layeredPane.add(rdCor1, 1);

		JRadioButton rdCor2 = new JRadioButton();
		rdCor2.setBounds(147, 420, 60, 25);
		rdCor2.setText("Preto");
		rdCor2.setBackground(new Color(255, 255, 255));
		layeredPane.add(rdCor2);
		
		JRadioButton rdCor3 = new JRadioButton();
		rdCor3.setBounds(70, 440, 70, 25);
		rdCor3.setText("Cinza");
		rdCor3.setBackground(new Color(255, 255, 255));
		layeredPane.add(rdCor3);

		JRadioButton rdCor4 = new JRadioButton();
		rdCor4.setBounds(147, 440, 120, 25);
		rdCor4.setText("Vermelho");
		rdCor4.setBackground(new Color(255, 255, 255));
		layeredPane.add(rdCor4);
		
		ButtonGroup bgCor = new ButtonGroup();
		bgCor.add(rdCor1);
		bgCor.add(rdCor2);
		bgCor.add(rdCor3);
		bgCor.add(rdCor4);
		
		JLabel opcionais = new JLabel();
		opcionais.setBounds(120, 470, 100, 30);
		opcionais.setText("<html><body style='font-size: 12px'>Opcionais:</body></html>");
		layeredPane.add(opcionais, 1);

		JCheckBox ckOne = new JCheckBox();
		ckOne.setBounds(30, 500, 150, 30);
		ckOne.setText("Ar Condicionado");
		ckOne.setBackground(Color.WHITE);
		layeredPane.add(ckOne, 1);

		JCheckBox ckTwo = new JCheckBox();
		ckTwo.setBounds(190, 500, 150, 30);
		ckTwo.setText("Rodas Liga Leve");
		ckTwo.setBackground(Color.WHITE);
		layeredPane.add(ckTwo, 1);

		JCheckBox ckThree = new JCheckBox();
		ckThree.setBounds(30, 530, 150, 30);
		ckThree.setText("Direção Hidráulica");
		ckThree.setBackground(Color.WHITE);
		layeredPane.add(ckThree, 1);

		JCheckBox ckFour = new JCheckBox();
		ckFour.setBounds(190, 530, 150, 30);
		ckFour.setText("Kit Multimidia");
		ckFour.setBackground(Color.WHITE);
		layeredPane.add(ckFour, 1);

		JButton btnConfirm = new JButton();
		btnConfirm.setFocusPainted(false);
		btnConfirm.setBounds(30, 580, 130, 45);
		btnConfirm.setText("<html> <body> <p style='font-size:11px;'>Enviar</p></body> </html>\"");
		btnConfirm.setBackground(new Color(252, 192, 62));
		layeredPane.add(btnConfirm, 1);

		JButton btnCancel = new JButton();
		btnCancel.setFocusPainted(false);
		btnCancel.setBounds(180, 580, 130, 45);
		btnCancel.setText("<html> <body> <p style='font-size:11px;'>Cancelar</p></body> </html>\"");
		btnCancel.setBackground(new Color(246, 70, 58));
		layeredPane.add(btnCancel, 1);

		JLabel carroImg = new JLabel();
		carroImg.setBounds(450, 320, 420, 232);
		ImageIcon imgCarro = new ImageIcon("../img/chevrolet/camaro-black.png");
		ImageIcon carroRisized = new ImageIcon(imgCarro.getImage().getScaledInstance(carroImg.getWidth(), carroImg.getHeight(), Image.SCALE_SMOOTH));
		carroImg.setIcon(carroRisized);
		layeredPane.add(carroImg, 1);

		JLabel chamas = new JLabel();
		chamas.setBounds(0, height-155, width, 117);
		ImageIcon imgChamas = new ImageIcon("../img/chamas.png");
		ImageIcon chamasRisized = new ImageIcon(imgChamas.getImage().getScaledInstance(chamas.getWidth(), chamas.getHeight(), Image.SCALE_SMOOTH));
		chamas.setIcon(chamasRisized);
		layeredPane.add(chamas, 1);

		this.add(layeredPane);
		ImageIcon img = new ImageIcon("../img/icon.png");
		this.setIconImage(img.getImage());
		this.setLayout(null);
		this.setVisible(true);
	}
}
