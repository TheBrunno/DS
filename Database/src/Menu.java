import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
	
	private JMenu arquivos = new JMenu("Arquivos");
	private JMenu adicionar = new JMenu("Adicionar");
	private JMenu visualizar = new JMenu("Visualizar");
	private JMenu ajuda = new JMenu("Ajuda");
	
	//arquivos
	private JMenuItem sair = new JMenuItem("Sair");
	
	// cadastrar
	private JMenuItem add_categoria = new JMenuItem("Categoria");
	private JMenuItem add_produto = new JMenuItem("Produto");
	
	//visualizar
	private JMenuItem vis_categoria = new JMenuItem("Categoria");
	private JMenuItem vis_produto = new JMenuItem("Produto");
	
	//ajuda
	private JMenuItem sobre = new JMenuItem("Sobre");
	
	private JMenuBar bar = new JMenuBar();
	
	//windows
	private Sobre sobre_window = new Sobre();
	
	public Menu() {
		this.setTitle("ETEC de Guaianazes");
		this.setSize(1100, 900);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		
		arquivos.add(sair);
		
		adicionar.add(add_categoria);
		adicionar.add(add_produto);
		
		visualizar.add(vis_categoria);
		visualizar.add(vis_produto);
		
		ajuda.add(sobre);
		
		this.setJMenuBar(bar);
		bar.add(arquivos);
		bar.add(adicionar);
		bar.add(visualizar);
		bar.add(ajuda);
		
		add_categoria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastrarCategorias add_categoria_window = new CadastrarCategorias();
				add_categoria_window.setVisible(true);
			}
		});
		add_produto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastrarProdutos cad_produtos_window = new CadastrarProdutos();
				cad_produtos_window.setVisible(true);
			}
		});
		vis_categoria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GerenciarCategoria ger_categoria_window = new GerenciarCategoria();
				ger_categoria_window.setVisible(true);
			}
		});
		vis_produto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GerenciarProduto ger_produto_window = new GerenciarProduto();
				ger_produto_window.setVisible(true);
			}
		});
		sobre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sobre_window.setVisible(true);
			}
		});
		
		this.setLayout(null);
		this.setVisible(true);
	}
}
