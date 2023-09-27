import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame{
	public Menu() {
		this.setTitle("Menu de projetos");
		this.setSize(1920, 1080);
		this.setExtendedState(JFrame. MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		
		
		
		JMenu files = new JMenu("Funcoes");
		JMenu apps = new JMenu("Aplicativos");
		JMenu help = new JMenu("Ajuda");
		
		JMenuItem exit = new JMenuItem("Sair");
		JMenuItem mcn = new JMenuItem("MCN - The Minecraft Network");
		JMenuItem calc = new JMenuItem("Calculadora Monokuma");
		JMenuItem budget = new JMenuItem("Symmas Concessionaria Turbo");
		JMenuItem game = new JMenuItem("Jogo da Velha");
		JMenuItem about = new JMenuItem("Sobre");
		
		files.add(exit);
		apps.add(mcn);
		apps.add(calc);
		apps.add(budget);
		apps.add(game);
		help.add(about);
		
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);
		bar.add(files);
		bar.add(apps);
		bar.add(help);
		
		JLabel title = new JLabel();
		title.setText("<html><body><h1 style='font-size: 60px;'>WebSamurais</h1></body></html>");
		title.setBounds(0, 0, 1920, 780);
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.CENTER);
		this.add(title);
		
		JLabel subtitle = new JLabel();
		subtitle.setText("<html><body><h1>Bruno & Eduardo</h1></body></html>");
		subtitle.setBounds(0, 120, 1920, 780);
		subtitle.setForeground(Color.WHITE);
		subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		subtitle.setVerticalAlignment(SwingConstants.CENTER);
		this.add(subtitle);
		
		ImageIcon imageBg = new ImageIcon("img/amorgus.jpg");
		Image bgRe = imageBg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newBoard = new ImageIcon(bgRe);
		JLabel background = new JLabel();
		background.setBounds(0, 0, this.getWidth(), this.getHeight());
		background.setIcon(newBoard);
		this.add(background);
		
		Orcamento con = new Orcamento();
		Calculadora mono = new Calculadora();
		Cadastro mc = new Cadastro();
		Sobre sob = new Sobre();
		JogoDaVelha velha = new JogoDaVelha();
		
		budget.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				con.setVisible(true);
			}
		});
		
		calc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mono.setVisible(true);
			}
		});
		
		mcn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.setVisible(true);
			}
		});
		
		game.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				velha.setVisible(true);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		about.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sob.setVisible(true);
			}
		});
		
		ImageIcon icon = new ImageIcon("img/icon.png");
		this.setIconImage(icon.getImage());
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
}
