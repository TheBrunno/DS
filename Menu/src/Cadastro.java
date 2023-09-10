import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.plaf.ColorUIResource;
// <html> <body>  </body> </html>
// \
public class Cadastro extends JDialog {
	public Cadastro() {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = now.format(formatter);
		
		this.setTitle("Login");
		this.setSize(800, 610);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		UIManager.put("RadioButton.focus", new ColorUIResource(new Color(255, 255, 255)));
		UIManager.put("CheckBox.focus", Color.WHITE);
		UIManager.put("Button.focus", new ColorUIResource(new Color(91, 139, 50)));
		
		JLabel header = new JLabel();
		header.setBounds(0, 30, 800, 30);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setText("<html><body> <h1 style='color:#5b8b32;'> MCN - The Minecraft Network </h1> </body> </html>");
		this.add(header);
		
		JLabel nome1 = new JLabel();
		nome1.setBounds(20, 90, 50, 30);
		nome1.setText("<html> <body> <p style='font-size: 11px;'>Nome:</p> </body> </html>");
		this.add(nome1);
		
		JTextField nome2 = new JTextField();
		nome2.setBounds(70, 92, 150, 25);
		this.add(nome2);
		
		JLabel idade1 = new JLabel();
		idade1.setBounds(20, 120, 50, 30);
		idade1.setText("<html> <body> <p style='font-size:11px;'>Idade:</p></body> </html>");
		this.add(idade1);
		
		JTextField idade2 = new JTextField();
		idade2.setBounds(70, 122, 150, 25);
		this.add(idade2);
		
		JLabel sexo1 = new JLabel();
		sexo1.setBounds(20, 150, 50, 30);
		sexo1.setText("<html> <body> <p style='font-size:11px;'>Sexo:</p></body> </html>");
		this.add(sexo1);
		
		JRadioButton rdSexo1 = new JRadioButton();
		rdSexo1.setBounds(70, 155, 40, 20);
		rdSexo1.setText("M");
		rdSexo1.setBackground(new Color(255, 255, 255));
		this.add(rdSexo1);

		JRadioButton rdSexo2 = new JRadioButton();
		rdSexo2.setBounds(110, 155, 40, 20);
		rdSexo2.setText("F");
		rdSexo2.setBackground(new Color(255, 255, 255));
		this.add(rdSexo2);
		
		JRadioButton rdSexo3 = new JRadioButton();
		rdSexo3.setBounds(150, 155, 60, 20);
		rdSexo3.setText("Outro");
		rdSexo3.setBackground(new Color(255, 255, 255));
		this.add(rdSexo3);
		
		ButtonGroup bgSexo = new ButtonGroup();
		bgSexo.add(rdSexo1);
		bgSexo.add(rdSexo2);
		bgSexo.add(rdSexo3);
		
		JLabel edicao = new JLabel();
		edicao.setBounds(20, 180, 50, 30);
		edicao.setText("<html> <body> <p style='font-size:11px;'>Edicao:</p></body> </html>");
		this.add(edicao);
		
		JCheckBox ckEdicao1 = new JCheckBox();
		ckEdicao1.setBounds(75, 180, 60, 30);
		ckEdicao1.setText("Java");
		ckEdicao1.setBackground(Color.WHITE);
		this.add(ckEdicao1);

		JCheckBox ckEdicao2 = new JCheckBox();
		ckEdicao2.setBounds(135, 180, 80, 30);
		ckEdicao2.setText("Bedrock");
		ckEdicao2.setBackground(Color.WHITE);
		this.add(ckEdicao2);
		
		JLabel dimensao = new JLabel();
		dimensao.setBounds(20, 210, 80, 30);
		dimensao.setText("<html> <body> <p style='font-size:11px;'>Dimensao:</p></body> </html>");
		this.add(dimensao);
		
		JComboBox dimensao2 = new JComboBox();
		dimensao2.setBounds(100, 210, 100, 30);
		dimensao2.addItem("Overworld");
		dimensao2.addItem("Nether");
		dimensao2.addItem("The End");
		this.add(dimensao2);

		JLabel mobsSection = new JLabel();
		mobsSection.setText("<html> <body> <p style='font-size:11px;'>Escolha seu mob favorito: </p></body> </html>");
		mobsSection.setBounds(100, 270, 200, 30);
		this.add(mobsSection);

		JRadioButton mob1 = new JRadioButton();
		mob1.setBounds(20, 310, 30, 30);
		mob1.setBackground(new Color(255, 255, 255));
		this.add(mob1);

		JLabel mob1Image = new JLabel();
		mob1Image.setBounds(50, 310, 67, 70);
		ImageIcon image = new ImageIcon("img/mcn/steve.png");
		Image imageResizor = image.getImage().getScaledInstance(mob1Image.getWidth(), mob1Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imageResized = new ImageIcon(imageResizor);
		mob1Image.setIcon(imageResized);
		this.add(mob1Image);

		JRadioButton mob2 = new JRadioButton();
		mob2.setBounds(135, 310, 30, 30);
		mob2.setBackground(new Color(255, 255, 255));
		this.add(mob2);

		JLabel mob2Image = new JLabel();
		mob2Image.setBounds(165, 310, 67, 70);
		ImageIcon image2 = new ImageIcon("img/mcn/zombie.png");
		Image image2Resizor = image2.getImage().getScaledInstance(mob2Image.getWidth(), mob2Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2Resized = new ImageIcon(image2Resizor);
		mob2Image.setIcon(image2Resized);
		this.add(mob2Image);

		JRadioButton mob3 = new JRadioButton();
		mob3.setBounds(245, 310, 30, 30);
		mob3.setBackground(new Color(255, 255, 255));
		this.add(mob3);

		JLabel mob3Image = new JLabel();
		mob3Image.setBounds(275, 310, 67, 70);
		ImageIcon image3 = new ImageIcon("img/mcn/skeleton.png");
		Image image3Resizor = image3.getImage().getScaledInstance(mob3Image.getWidth(), mob3Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image3Resized = new ImageIcon(image3Resizor);
		mob3Image.setIcon(image3Resized);
		this.add(mob3Image);

		JRadioButton mob4 = new JRadioButton();
		mob4.setBounds(20, 410, 30, 30);
		mob4.setBackground(new Color(255, 255, 255));
		this.add(mob4);

		JLabel mob4Image = new JLabel();
		mob4Image.setBounds(50, 410, 67, 70);
		ImageIcon image4 = new ImageIcon("img/mcn/creeper.png");
		Image image4Resizor = image4.getImage().getScaledInstance(mob1Image.getWidth(), mob1Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image4Resized = new ImageIcon(image4Resizor);
		mob4Image.setIcon(image4Resized);
		this.add(mob4Image);

		JRadioButton mob5 = new JRadioButton();
		mob5.setBounds(135, 410, 30, 30);
		mob5.setBackground(new Color(255, 255, 255));
		this.add(mob5);

		JLabel mob5Image = new JLabel();
		mob5Image.setBounds(165, 410, 67, 70);
		ImageIcon image5 = new ImageIcon("img/mcn/wither_skeleton.png");
		Image image5Resizor = image5.getImage().getScaledInstance(mob5Image.getWidth(), mob5Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image5Resized = new ImageIcon(image5Resizor);
		mob5Image.setIcon(image5Resized);
		this.add(mob5Image);

		JRadioButton mob6 = new JRadioButton();
		mob6.setBounds(245, 410, 30, 30);
		mob6.setBackground(new Color(255, 255, 255));
		this.add(mob6);

		JLabel mob6Image = new JLabel();
		mob6Image.setBounds(275, 410, 75, 70);
		ImageIcon image6 = new ImageIcon("img/mcn/piglin.png");
		Image image6Resizor = image6.getImage().getScaledInstance(mob6Image.getWidth(), mob6Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image6Resized = new ImageIcon(image6Resizor);
		mob6Image.setIcon(image6Resized);
		this.add(mob6Image);

		ButtonGroup bgMobs = new ButtonGroup();
		bgMobs.add(mob1);
		bgMobs.add(mob2);
		bgMobs.add(mob3);
		bgMobs.add(mob4);
		bgMobs.add(mob5);
		bgMobs.add(mob6);

		JButton btnConfirm = new JButton();
		btnConfirm.setBounds(120, 500, 150, 45);
		btnConfirm.setText("<html> <body> <p style='font-size:11px;'>Enviar!</p></body> </html>\"");
		btnConfirm.setBackground(new Color(91, 139, 50));
		btnConfirm.setForeground(Color.white);
		this.add(btnConfirm);
		
		String[] imagensDimensao = {"img/mcn/overworld.png", "img/mcn/\\nether.png", "img/mcn/\\the_end.png"};
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black, 4);
		Border thickline = BorderFactory.createLineBorder(Color.black, 6);
		
		JLabel mobPerfil = new JLabel();
		mobPerfil.setBounds(455, 180, 67, 70);
		ImageIcon imagePerfil = new ImageIcon("img/mcn/steve.png");
		Image imagePResizor = imagePerfil.getImage().getScaledInstance(mobPerfil.getWidth(), mobPerfil.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagePResized = new ImageIcon(imagePResizor);
		mobPerfil.setIcon(imagePResized);
		this.add(mobPerfil);
		mobPerfil.setVisible(false);
		
		JLabel mobBg  = new JLabel();
		mobBg.setBounds(449, 175, 80, 80);
		mobBg.setBackground(Color.WHITE);
		mobBg.setOpaque(true);
		mobBg.setBorder(blackline);
		this.add(mobBg);
		mobBg.setVisible(false);
		
		
		JLabel bgPerfil = new JLabel();
		bgPerfil.setBounds(429, 84, 292, 150);
		ImageIcon imagebgPerfil = new ImageIcon("img/mcn/overworld.png");
		Image bgResizor = imagebgPerfil.getImage().getScaledInstance(bgPerfil.getWidth(), bgPerfil.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon bgResized = new ImageIcon(bgResizor);
		bgPerfil.setIcon(bgResized);
		this.add(bgPerfil);
		bgPerfil.setVisible(false);
		
		JLabel pNome = new JLabel();
		pNome.setBounds(440, 244, 250, 50);
		pNome.setText("<html><body> <h2 style='color:#9bfda1;'> Player </h1> </body> </html>");
		this.add(pNome);
		pNome.setVisible(false);
		
		JLabel pIdade = new JLabel();
		pIdade.setBounds(440, 274, 250, 50);
		pIdade.setText("Idade: 18");
		pIdade.setForeground(Color.WHITE);
		this.add(pIdade);
		pIdade.setVisible(false);
		
		JLabel pSexo = new JLabel();
		pSexo.setBounds(440, 294, 250, 50);
		pSexo.setText("Sexo: M");
		pSexo.setForeground(Color.WHITE);
		this.add(pSexo);
		pSexo.setVisible(false);
		
		JLabel pEdicoes = new JLabel();
		pEdicoes.setBounds(440, 314, 250, 50);
		pEdicoes.setText("Edicoes: Java");
		pEdicoes.setForeground(Color.WHITE);
		this.add(pEdicoes);
		pEdicoes.setVisible(false);
		
		JLabel pData = new JLabel();
		pData.setBounds(440, 384, 250, 50);
		pData.setText("<html> <body> <p style='font-size:12px; color:#dadada'> Data de Criação </p> </html> </body>");
		this.add(pData);
		pData.setVisible(false);
		
		JLabel pCriacao = new JLabel();
		pCriacao.setBounds(440, 414, 250, 50);
		pCriacao.setText("01/01/1970");
		pCriacao.setForeground(Color.WHITE);
		this.add(pCriacao);
		pCriacao.setVisible(false);
		
		JLabel perfil = new JLabel();
		perfil.setBounds(425, 80, 300, 450);
		perfil.setBorder(thickline);
		perfil.setOpaque(true);
		perfil.setBackground(Color.GRAY);
		this.add(perfil);
		perfil.setVisible(false);
		
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mob1.isSelected()) {
					mobPerfil.setBounds(455, 180, 67, 70);
					mobPerfil.setIcon(imageResized);
				} else if(mob2.isSelected()) {
					mobPerfil.setBounds(455, 180, 67, 70);
					mobPerfil.setIcon(image2Resized);
				} else if(mob3.isSelected()) {
					mobPerfil.setBounds(455, 180, 67, 70);
					mobPerfil.setIcon(image3Resized);
				} else if(mob4.isSelected()) {
					mobPerfil.setBounds(455, 180, 67, 70);
					mobPerfil.setIcon(image4Resized);
				} else if(mob5.isSelected()) {
					mobPerfil.setBounds(455, 180, 67, 70);
					mobPerfil.setIcon(image5Resized);
				} else if(mob6.isSelected()) {
					mobPerfil.setBounds(451, 180, 75, 70);
					mobPerfil.setIcon(image6Resized);
				}
				mobPerfil.setVisible(true);
				
				if(dimensao2.getSelectedIndex()==0) {
					ImageIcon imagebgPerfil = new ImageIcon("img/mcn/overworld.png");
					Image bgResizor = imagebgPerfil.getImage().getScaledInstance(bgPerfil.getWidth(), bgPerfil.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon bgResized = new ImageIcon(bgResizor);
					bgPerfil.setIcon(bgResized);
				}else if(dimensao2.getSelectedIndex()==1) {
					ImageIcon imagebgPerfil = new ImageIcon("img/mcn/nether.png");
					Image bgResizor = imagebgPerfil.getImage().getScaledInstance(bgPerfil.getWidth(), bgPerfil.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon bgResized = new ImageIcon(bgResizor);
					bgPerfil.setIcon(bgResized);
				}else if(dimensao2.getSelectedIndex()==2) {
					ImageIcon imagebgPerfil = new ImageIcon("img/mcn/the_end.png");
					Image bgResizor = imagebgPerfil.getImage().getScaledInstance(bgPerfil.getWidth(), bgPerfil.getHeight(), Image.SCALE_SMOOTH);
					ImageIcon bgResized = new ImageIcon(bgResizor);
					bgPerfil.setIcon(bgResized);
				}
				bgPerfil.setVisible(true);
				
				if(nome2.getText().isBlank()) {
					pNome.setText("<html><body> <h2 style='color:#9bfda1;'> Guest </h1> </body> </html>");
				} else {
					pNome.setText("<html><body> <h2 style='color:#9bfda1;'>"+nome2.getText()+"</h1> </body> </html>");
				}
				pNome.setVisible(true);
				
				if(idade2.getText().isBlank()) {
					pIdade.setText("Idade: Desconhecido");
				} else {
					pIdade.setText("Idade: "+idade2.getText());
				}
				pIdade.setVisible(true);
				
				if(rdSexo1.isSelected()) {
					pSexo.setText("Sexo: "+rdSexo1.getText());
				} else if(rdSexo2.isSelected()) {
					pSexo.setText("Sexo: "+rdSexo2.getText());
				} else if(rdSexo3.isSelected()) {
					pSexo.setText("Sexo: "+rdSexo3.getText());
				}
				pSexo.setVisible(true);
				
				String pEdi = "Edicoes: ";
				
				if(ckEdicao1.isSelected()) {
					pEdi = pEdi +"Java ";
				}
				if(ckEdicao2.isSelected()) {
					pEdi = pEdi + "Bedrock";
				}
				pEdicoes.setText(pEdi);
				pEdicoes.setVisible(true);
				
				pCriacao.setText(formattedDate);
				pCriacao.setVisible(true);
				
				pData.setVisible(true);
				perfil.setVisible(true);
				mobBg.setVisible(true);
				
			}
		});

		ImageIcon img = new ImageIcon("mcn/img/aha.png");
		this.setIconImage(img.getImage());
		this.setLayout(null);
		
		
		
	}
	
}