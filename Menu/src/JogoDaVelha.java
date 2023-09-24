import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JogoDaVelha extends JDialog {
	public JogoDaVelha() {
		this.setTitle("Jogo da Velha");
		this.setModal(true);
		this.setSize(800,570);
		this.setResizable(false);
		
		Container janelaCalc = this.getContentPane();
		setLocationRelativeTo(janelaCalc);
		janelaCalc.setLayout(null);
		
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(0, 0, this.getWidth(), this.getHeight());
		
		UIManager.put("RadioButton.focus", new ColorUIResource(new Color(255, 255, 255)));
		UIManager.put("Button.focus", new ColorUIResource(new Color(91, 139, 50)));
		Border blackline = BorderFactory.createLineBorder(Color.black, 2);
		Border thickline = BorderFactory.createLineBorder(Color.black, 4);
		

		
		// Guia 1
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		
		JLabel header = new JLabel();
		header.setBounds(0, 30, 800, 30);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setText("<html><body> <h1 style='color:#bb9aff;'> Cadastro - Player 1 </h1> </body> </html>");
		p1.add(header);
		
		JLabel nome = new JLabel();
		nome.setBounds(30, 60, 70, 20);
		nome.setText("<html><body> <h2> Nome: </h2> </body> </html>");
		p1.add(nome);
		
		JTextField nomeinput = new JTextField();
		nomeinput.setBounds(100, 62, 150, 20);
		nomeinput.setBorder(blackline);
		p1.add(nomeinput);
		
		JLabel simbolo = new JLabel();
		simbolo.setBounds(30, 100, 90, 25);
		simbolo.setText("<html> <body> <h2>Simbolo:</h2></body> </html>");
		p1.add(simbolo);
		
		JComboBox<String> simboloinput = new JComboBox<String>();
		simboloinput.setBounds(120, 100, 100, 30);
		simboloinput.addItem("X");
		simboloinput.addItem("O");
		p1.add(simboloinput);
		
		JLabel win = new JLabel();
		win.setBounds(30, 140, 230, 25);
		win.setText("<html><body> <h2> Mensagem de Vitoria: </h2> </body> </html>");
		p1.add(win);
		
		JTextArea wininput = new JTextArea();
		wininput.setBounds(30, 170, 300, 100);
		wininput.setBorder(blackline);
		p1.add(wininput);
		
		JLabel mobsSection = new JLabel();
		mobsSection.setText("<html> <body> <p style='font-size:11px;'>Escolha seu mob favorito: </p></body> </html>");
		mobsSection.setBounds(100, 270, 200, 30);
		p1.add(mobsSection);

		JRadioButton mob1 = new JRadioButton();
		mob1.setBounds(20, 310, 30, 30);
		mob1.setBackground(new Color(255, 255, 255));
		p1.add(mob1);

		JLabel mob1Image = new JLabel();
		mob1Image.setBounds(50, 310, 67, 70);
		ImageIcon image = new ImageIcon("img/mcn/steve.png");
		Image imageResizor = image.getImage().getScaledInstance(mob1Image.getWidth(), mob1Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imageResized = new ImageIcon(imageResizor);
		mob1Image.setIcon(imageResized);
		p1.add(mob1Image);

		JRadioButton mob2 = new JRadioButton();
		mob2.setBounds(135, 310, 30, 30);
		mob2.setBackground(new Color(255, 255, 255));
		p1.add(mob2);

		JLabel mob2Image = new JLabel();
		mob2Image.setBounds(165, 310, 67, 70);
		ImageIcon image2 = new ImageIcon("img/mcn/zombie.png");
		Image image2Resizor = image2.getImage().getScaledInstance(mob2Image.getWidth(), mob2Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2Resized = new ImageIcon(image2Resizor);
		mob2Image.setIcon(image2Resized);
		p1.add(mob2Image);

		JRadioButton mob3 = new JRadioButton();
		mob3.setBounds(245, 310, 30, 30);
		mob3.setBackground(new Color(255, 255, 255));
		p1.add(mob3);

		JLabel mob3Image = new JLabel();
		mob3Image.setBounds(275, 310, 67, 70);
		ImageIcon image3 = new ImageIcon("img/mcn/skeleton.png");
		Image image3Resizor = image3.getImage().getScaledInstance(mob3Image.getWidth(), mob3Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image3Resized = new ImageIcon(image3Resizor);
		mob3Image.setIcon(image3Resized);
		p1.add(mob3Image);

		JRadioButton mob4 = new JRadioButton();
		mob4.setBounds(20, 410, 30, 30);
		mob4.setBackground(new Color(255, 255, 255));
		p1.add(mob4);

		JLabel mob4Image = new JLabel();
		mob4Image.setBounds(50, 410, 67, 70);
		ImageIcon image4 = new ImageIcon("img/mcn/creeper.png");
		Image image4Resizor = image4.getImage().getScaledInstance(mob1Image.getWidth(), mob1Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image4Resized = new ImageIcon(image4Resizor);
		mob4Image.setIcon(image4Resized);
		p1.add(mob4Image);

		JRadioButton mob5 = new JRadioButton();
		mob5.setBounds(135, 410, 30, 30);
		mob5.setBackground(new Color(255, 255, 255));
		p1.add(mob5);

		JLabel mob5Image = new JLabel();
		mob5Image.setBounds(165, 410, 67, 70);
		ImageIcon image5 = new ImageIcon("img/mcn/wither_skeleton.png");
		Image image5Resizor = image5.getImage().getScaledInstance(mob5Image.getWidth(), mob5Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image5Resized = new ImageIcon(image5Resizor);
		mob5Image.setIcon(image5Resized);
		p1.add(mob5Image);

		JRadioButton mob6 = new JRadioButton();
		mob6.setBounds(245, 410, 30, 30);
		mob6.setBackground(new Color(255, 255, 255));
		p1.add(mob6);

		JLabel mob6Image = new JLabel();
		mob6Image.setBounds(275, 410, 75, 70);
		ImageIcon image6 = new ImageIcon("img/mcn/piglin.png");
		Image image6Resizor = image6.getImage().getScaledInstance(mob6Image.getWidth(), mob6Image.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image6Resized = new ImageIcon(image6Resizor);
		mob6Image.setIcon(image6Resized);
		p1.add(mob6Image);

		ButtonGroup bgMobs = new ButtonGroup();
		bgMobs.add(mob1);
		bgMobs.add(mob2);
		bgMobs.add(mob3);
		bgMobs.add(mob4);
		bgMobs.add(mob5);
		bgMobs.add(mob6);
		
		
		JButton cadastrar = new JButton();
		cadastrar.setBounds(400, 430, 100, 40);
		cadastrar.setFocusPainted(false);
		cadastrar.setText("Cadastrar");
		cadastrar.setBackground(new Color(133, 85, 163));
		cadastrar.setForeground(Color.WHITE);
		p1.add(cadastrar);
		
		
		//Guia 2
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.WHITE);
		
		JLabel header2 = new JLabel();
		header2.setBounds(0, 30, 800, 30);
		header2.setHorizontalAlignment(SwingConstants.CENTER);
		header2.setText("<html><body> <h1 style='color:#bb9aff;'> Cadastro - Player 2 </h1> </body> </html>");
		p2.add(header2);
		
		JLabel nome2 = new JLabel();
		nome2.setBounds(30, 60, 70, 20);
		nome2.setText("<html><body> <h2> Nome: </h2> </body> </html>");
		p2.add(nome2);
		
		JTextField nomeinput2 = new JTextField();
		nomeinput2.setBounds(100, 62, 150, 20);
		nomeinput2.setBorder(blackline);
		p2.add(nomeinput2);
		
		JLabel win2 = new JLabel();
		win2.setBounds(30, 90, 230, 25);
		win2.setText("<html><body> <h2> Mensagem de Vitoria: </h2> </body> </html>");
		p2.add(win2);
		
		JTextArea wininput2 = new JTextArea();
		wininput2.setBounds(30, 120, 300, 150);
		wininput2.setBorder(blackline);
		p2.add(wininput2);
		
		JLabel mobsSection2 = new JLabel();
		mobsSection2.setText("<html> <body> <p style='font-size:11px;'>Escolha seu mob favorito: </p></body> </html>");
		mobsSection2.setBounds(100, 270, 200, 30);
		p2.add(mobsSection2);

		JRadioButton p2mob1 = new JRadioButton();
		p2mob1.setBounds(20, 310, 30, 30);
		p2mob1.setBackground(new Color(255, 255, 255));
		p2.add(p2mob1);

		JLabel p2mob1Image = new JLabel();
		p2mob1Image.setBounds(50, 310, 67, 70);
		p2mob1Image.setIcon(imageResized);
		p2.add(p2mob1Image);

		JRadioButton p2mob2 = new JRadioButton();
		p2mob2.setBounds(135, 310, 30, 30);
		p2mob2.setBackground(new Color(255, 255, 255));
		p2.add(p2mob2);

		JLabel p2mob2Image = new JLabel();
		p2mob2Image.setBounds(165, 310, 67, 70);
		p2mob2Image.setIcon(image2Resized);
		p2.add(p2mob2Image);

		JRadioButton p2mob3 = new JRadioButton();
		p2mob3.setBounds(245, 310, 30, 30);
		p2mob3.setBackground(new Color(255, 255, 255));
		p2.add(p2mob3);

		JLabel p2mob3Image = new JLabel();
		p2mob3Image.setBounds(275, 310, 67, 70);
		p2mob3Image.setIcon(image3Resized);
		p2.add(p2mob3Image);

		JRadioButton p2mob4 = new JRadioButton();
		p2mob4.setBounds(20, 410, 30, 30);
		p2mob4.setBackground(new Color(255, 255, 255));
		p2.add(p2mob4);

		JLabel p2mob4Image = new JLabel();
		p2mob4Image.setBounds(50, 410, 67, 70);
		p2mob4Image.setIcon(image4Resized);
		p2.add(p2mob4Image);

		JRadioButton p2mob5 = new JRadioButton();
		p2mob5.setBounds(135, 410, 30, 30);
		p2mob5.setBackground(new Color(255, 255, 255));
		p2.add(p2mob5);

		JLabel p2mob5Image = new JLabel();
		p2mob5Image.setBounds(165, 410, 67, 70);
		p2mob5Image.setIcon(image5Resized);
		p2.add(p2mob5Image);

		JRadioButton p2mob6 = new JRadioButton();
		p2mob6.setBounds(245, 410, 30, 30);
		p2mob6.setBackground(new Color(255, 255, 255));
		p2.add(p2mob6);

		JLabel p2mob6Image = new JLabel();
		p2mob6Image.setBounds(275, 410, 75, 70);
		p2mob6Image.setIcon(image6Resized);
		p2.add(p2mob6Image);

		ButtonGroup bgMobs2 = new ButtonGroup();
		bgMobs.add(p2mob1);
		bgMobs.add(p2mob2);
		bgMobs.add(p2mob3);
		bgMobs.add(p2mob4);
		bgMobs.add(p2mob5);
		bgMobs.add(p2mob6);
		
		JButton cadastrar2 = new JButton();
		cadastrar2.setBounds(400, 430, 100, 40);
		cadastrar2.setFocusPainted(false);
		cadastrar2.setText("Cadastrar");
		cadastrar2.setBackground(new Color(133, 85, 163));
		cadastrar2.setForeground(Color.WHITE);
		p2.add(cadastrar2);
		
		
		//Guia 3
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		p3.setBackground(Color.WHITE);
		
		JLabel board = new JLabel();
		board.setBounds(250, 50, 300, 300);
		ImageIcon boardimg = new ImageIcon("img/jogo/board.png");
		Image boardRe = boardimg.getImage().getScaledInstance(board.getWidth(), board.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newBoard = new ImageIcon(boardRe);
		board.setIcon(newBoard);
		p3.add(board);
		
		JLabel player1 = new JLabel();
		player1.setBounds(50, 400, 67, 70);
		try {
			BufferedImage mirror = ImageIO.read(new File("img/jogo/steve.png"));
			AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
            tx.translate(-mirror.getWidth(null), 0);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
            mirror = op.filter(mirror, null);
            ImageIcon rIcon = new ImageIcon(mirror);
            Image rIconRe = rIcon.getImage().getScaledInstance(player1.getWidth(), player1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newRIcon = new ImageIcon(rIconRe);
            player1.setIcon(newRIcon);
            p3.add(player1);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel borderP1 = new JLabel();
		borderP1.setBounds(45, 395, 77, 80);
		borderP1.setBorder(thickline);
		p3.add(borderP1);
		
		JLabel player2 = new JLabel();
		player2.setBounds(663, 400, 67, 70);
		player2.setIcon(imageResized);
		p3.add(player2);
		
		JLabel borderP2 = new JLabel();
		borderP2.setBounds(658, 395, 77, 80);
		borderP2.setBorder(thickline);
		p3.add(borderP2);
		
		JLabel nomeP1 = new JLabel();
		nomeP1.setBounds(130, 395, 200, 30);
		nomeP1.setText("<html><body> <h2 style='color:#5535e6;'> Player 1 </h2> </body> </html>");
		p3.add(nomeP1);
		
		JLabel nomeP2 = new JLabel();
		nomeP2.setBounds(453, 395, 200, 30);
		nomeP2.setText("<html><body> <h2 style='color:#5535e6;'> Player 2 </h2> </body> </html>");
		nomeP2.setHorizontalAlignment(SwingConstants.RIGHT);
		p3.add(nomeP2);
		
		JLabel winsP1 = new JLabel();
		winsP1.setBounds(130, 420, 200, 30);
		winsP1.setText("<html><body> <h3> Wins: 30 </h3> </body> </html>");
		p3.add(winsP1);
		
		JLabel winsP2 = new JLabel();
		winsP2.setBounds(453, 420, 200, 30);
		winsP2.setText("<html><body> <h3> Wins: 10 </h3> </body> </html>");
		winsP2.setHorizontalAlignment(SwingConstants.RIGHT);
		p3.add(winsP2);
		
		JLabel result = new JLabel();
		result.setBounds(20,120,200,30);
		result.setText("<html><body> <h1> Player 1 Wins! </h1> </body> </html>");
		p3.add(result);
		
		JLabel winMsg = new JLabel();
		winMsg.setBounds(20,140,200,100);
		winMsg.setText("<html><body> <h3> \"Insert player win message here\" </h3> </body> </html>");
		p3.add(winMsg);
		
		JButton reset = new JButton();
		reset.setBounds(600, 140, 150, 30);
		reset.setFocusPainted(false);
		reset.setText("Resetar Vitórias");
		reset.setBackground(new Color(133, 85, 163));
		reset.setForeground(Color.WHITE);
		p3.add(reset);
		
		JButton clear = new JButton();
		clear.setBounds(600, 200, 150, 30);
		clear.setFocusPainted(false);
		clear.setText("Limpar Tabela");
		clear.setBackground(new Color(133, 85, 163));
		clear.setForeground(Color.WHITE);
		p3.add(clear);
		
		JButton pos1 = new JButton();
		pos1.setBounds(260, 60, 80, 80);
		ImageIcon x = new ImageIcon("img/jogo/twitter.png");
		Image xRe = x.getImage().getScaledInstance(pos1.getWidth(), pos1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newX = new ImageIcon(xRe);
		pos1.setIcon(newX);
		pos1.setBackground(Color.WHITE);
		pos1.setBorder(null);
		pos1.setFocusPainted(false);
		p3.add(pos1);
		
		JButton pos2 = new JButton();
		pos2.setBounds(360, 60, 80, 80);
		ImageIcon o = new ImageIcon("img/jogo/circle.png");
		Image oRe = o.getImage().getScaledInstance(pos1.getWidth(), pos1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newO = new ImageIcon(oRe);
		pos2.setIcon(newO);
		pos2.setBackground(Color.WHITE);
		pos2.setBorder(null);
		pos2.setFocusPainted(false);
		p3.add(pos2);
		
		JButton pos3 = new JButton();
		pos3.setBounds(460, 60, 80, 80);
		pos3.setIcon(newX);
		pos3.setBackground(Color.WHITE);
		pos3.setBorder(null);
		pos3.setFocusPainted(false);
		p3.add(pos3);
		
		JButton pos4 = new JButton();
		pos4.setBounds(260, 160, 80, 80);
		pos4.setIcon(newX);
		pos4.setBackground(Color.WHITE);
		pos4.setBorder(null);
		pos4.setFocusPainted(false);
		p3.add(pos4);
		
		JButton pos5 = new JButton();
		pos5.setBounds(360, 160, 80, 80);
		pos5.setIcon(newX);
		pos5.setBackground(Color.WHITE);
		pos5.setBorder(null);
		pos5.setFocusPainted(false);
		p3.add(pos5);
		
		JButton pos6 = new JButton();
		pos6.setBounds(460, 160, 80, 80);
		pos6.setIcon(newX);
		pos6.setBackground(Color.WHITE);
		pos6.setBorder(null);
		pos6.setFocusPainted(false);
		p3.add(pos6);
		
		JButton pos7 = new JButton();
		pos7.setBounds(260, 260, 80, 80);
		pos7.setIcon(newX);
		pos7.setBackground(Color.WHITE);
		pos7.setBorder(null);
		pos7.setFocusPainted(false);
		p3.add(pos7);
		
		JButton pos8 = new JButton();
		pos8.setBounds(360, 260, 80, 80);
		pos8.setIcon(newX);
		pos8.setBackground(Color.WHITE);
		pos8.setBorder(null);
		pos8.setFocusPainted(false);
		p3.add(pos8);
		
		JButton pos9 = new JButton();
		pos9.setBounds(460, 260, 80, 80);
		pos9.setIcon(newX);
		pos9.setBackground(Color.WHITE);
		pos9.setBorder(null);
		pos9.setFocusPainted(false);
		p3.add(pos9);
		
		
		tp.addTab("Player 1", null, p1, "Cadastro Player 1");
		tp.addTab("Player 2", null, p2, "Cadastro Player 2");
		tp.addTab("Jogo", null, p3, "Jogo da Velha");
		janelaCalc.add(tp);
	}
}
