import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame{
	public Menu() {
		this.setTitle("Menu de projetos");
		this.setSize(700, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		
		JMenu files = new JMenu("Funcoes");
		JMenu apps = new JMenu("Aplicativos");
		JMenu help = new JMenu("Ajuda");
		
		JMenuItem exit = new JMenuItem("Sair");
		JMenuItem mcn = new JMenuItem("MCN - The Minecraft Network");
		JMenuItem calc = new JMenuItem("Calculadora Monokuma");
		JMenuItem budget = new JMenuItem("Orcamento Symmas Concessionaria");
		JMenuItem about = new JMenuItem("Sobre");
		
		files.add(exit);
		apps.add(mcn);
		apps.add(calc);
		apps.add(budget);
		help.add(about);
		
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);
		bar.add(files);
		bar.add(apps);
		bar.add(help);
		
		JLabel title = new JLabel();
		title.setText("<html><body><h1>WebSamurais</h1></body></html>");
		title.setBounds(0, 155, 700, 30);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(title);
		
		JLabel subtitle = new JLabel();
		subtitle.setText("<html><body><h3>Bruno & Eduardo</h3></body></html>");
		subtitle.setBounds(7, 300, 700, 30);
		subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(subtitle);
		
		Symmas con = new Symmas();
		Calculadora mono = new Calculadora();
		Cadastro mc = new Cadastro();
		Sobre sob = new Sobre();
		
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
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
}
