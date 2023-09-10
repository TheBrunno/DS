import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;

public class Sobre extends JDialog{
	private int height = 500;
	private int width = 900;
	
	public Sobre() {
		this.setTitle("Sobre");
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		JLabel linha = new JLabel();
		linha.setBounds(width/2-15, 0, 6, height);
		ImageIcon imgLinha = new ImageIcon("img/sobre/vertical-bar.png");
		linha.setIcon(imgLinha);
		this.add(linha);
		
		JLabel img1 = new JLabel();
		img1.setBounds(24, 24, 100, 100);
		ImageIcon img1Image = new ImageIcon("img/sobre/bruno.png");
		ImageIcon img1Risized = new ImageIcon(img1Image.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH));
		img1.setIcon(img1Risized);
		this.add(img1);
		
		JLabel img2 = new JLabel();
		img2.setBounds(width/2+24, 24, 100, 100);
		ImageIcon img2Image = new ImageIcon("img/sobre/eduardo.png");
		ImageIcon img2Risized = new ImageIcon(img2Image.getImage().getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH));
		img2.setIcon(img2Risized);
		this.add(img2);
		
		JLabel title1 = new JLabel();
		title1.setText("<html><body><h1>Bruno Oliveira</h1></body></html>");
		title1.setBounds(148, 34, 200, 30);
		this.add(title1);
		
		JLabel title2 = new JLabel();
		title2.setText("<html><body><h1>Eduardo Chen</h1></body></html>");
		title2.setBounds(width/2+148, 34, 200, 30);
		this.add(title2);
		
		JLabel github1 = new JLabel();
		github1.setText("<html><body><p>@thebrunno</p></body></html>");
		github1.setBounds(148, 54, 200, 30);
		github1.setForeground(new Color(149, 149, 149));
		this.add(github1);
		
		JLabel github2 = new JLabel();
		github2.setText("<html><body><p>@rivkafranz</p></body></html>");
		github2.setBounds(width/2+148, 54, 200, 30);
		github2.setForeground(new Color(149, 149, 149));
		this.add(github2);
		
        JButton linkButton1 = new JButton("Github");
        linkButton1.setBounds(148, 84, 80, 30);
        linkButton1.setFocusPainted(false);
        linkButton1.setBackground(new Color(255, 255, 255));
        linkButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.github.com/TheBrunno"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        this.add(linkButton1);
        
        JButton linkButton2 = new JButton("Github");
        linkButton2.setBounds(width/2+148, 84, 80, 30);
        linkButton2.setFocusPainted(false);
        linkButton2.setBackground(new Color(255, 255, 255));
        linkButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.github.com/Westwitt"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        this.add(linkButton2);
        
        JLabel frase1 = new JLabel();
        frase1.setText("<html><body><p style='font-size:13px;font-family: 'Arial';>Meu coração está na tecnologia, e meu sonho é fazer máquinas aprenderem a sonhar.</p></body></html>");
        frase1.setBounds(30, 130, width/2-30, 100);
        this.add(frase1);
        
        JLabel frase2 = new JLabel();
        frase2.setText("<html><body><p style='font-size:13px;font-family: 'Arial';>Meu coração está na tecnologia, e meu sonho é fazer máquinas aprenderem a sonhar.</p></body></html>");
        frase2.setBounds(width/2+30, 130, width/2-30, 100);
        this.add(frase2);
        
        JLabel bio1 = new JLabel();
        bio1.setText("<html><body><p style='font-size:13px;font-family: 'Arial';>Um jovem de 17 anos apaixonado por Desenvolvimento de Sistemas, com um foco irresistível no back-end e um toque de ousadia no front-end. Seu sonho é mergulhar de cabeça na inteligência artificial, dominando Python, Java, JavaScript, C++, SQL Server e MongoDB no caminho para o sucesso.</p></body></html>");
        bio1.setBounds(30, 220, width/2-55, 200);
        bio1.setFont(new Font(bio1.getFont().getFontName(), Font.PLAIN, bio1.getFont().getSize()));
        this.add(bio1);
        
        JLabel bio2 = new JLabel();
        bio2.setText("<html><body><p style='font-size:13px;font-family: 'Arial';>Um jovem de 17 anos apaixonado por Desenvolvimento de Sistemas, com um foco irresistível no back-end e um toque de ousadia no front-end. Seu sonho é mergulhar de cabeça na inteligência artificial, dominando Python, Java, JavaScript, C++, SQL Server e MongoDB no caminho para o sucesso.</p></body></html>");
        bio2.setBounds(width/2+30, 220, width/2-55, 200);
        bio2.setFont(new Font(bio1.getFont().getFontName(), Font.PLAIN, bio1.getFont().getSize()));
        this.add(bio2);
        
        
		this.setLayout(null);
	}
}