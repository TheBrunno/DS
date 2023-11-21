import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class CadastrarProdutos extends JDialog {
	
	private JLabel titulo = new JLabel();
	
	private JLabel produto = new JLabel();
	private JLabel categoria = new JLabel();
	private JLabel valor = new JLabel();
	private JLabel descricao = new JLabel();
	private JLabel quantidade = new JLabel();
	
	private JTextField tx_produto = new JTextField();
	private JTextField tx_valor = new JTextField();
	private JTextField tx_descricao = new JTextField();
	private JTextField tx_quantidade = new JTextField();
	
	private JComboBox<String> tx_categoria = new JComboBox<>();
	
	private ResultSet resultset;
	private	Statement state;
	
	private JButton salvar = new JButton();
	
	public CadastrarProdutos() {
		this.setTitle("Cadastrar produtos");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		titulo.setText("Cadastrar produtos");
		titulo.setBounds(0, 30, 700, 30);
		titulo.setFont(new Font(titulo.getFont().getFontName(), Font.PLAIN, 28));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(titulo);
		
		produto.setText("Produto:");
		categoria.setText("Categoria:");
		valor.setText("Valor:");
		descricao.setText("Descricao:");
		quantidade.setText("Quantidade:");
		
		produto.setBounds(110, 130, 200, 30);
		categoria.setBounds(110, 180, 200, 30);
		valor.setBounds(110, 230, 200, 30);
		descricao.setBounds(110, 280, 200, 30);
		quantidade.setBounds(110, 330, 200, 30);
		
		produto.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 20));
		categoria.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 20));
		valor.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 20));
		descricao.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 20));
		quantidade.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 20));
		
		this.add(produto);
		this.add(categoria);
		this.add(valor);
		this.add(descricao);
		this.add(quantidade);
		
		tx_produto.setBounds(240, 130, 300, 30);
		tx_categoria.setBounds(240, 180, 300, 30);
		tx_valor.setBounds(240, 230, 300, 30);
		tx_descricao.setBounds(240, 280, 300, 30);
		tx_quantidade.setBounds(240, 330, 300, 30);
		
		Conexao conex = new Conexao();
		
		String sql = "SELECT * FROM tbCategoria WHERE deleted = 0";
					
		conex.conectar();      
					
		try{                  
				
			state = (Statement) Conexao.con.createStatement();
			resultset = state.executeQuery(sql);
				
				while(resultset.next()){
					tx_categoria.addItem(resultset.getString("nomeCategoria"));
				}                         
		}
		catch(SQLException err){
			System.out.println("Erro na consulta!");
		}     
			
		conex.desconectar();

		
		this.add(tx_produto);
		this.add(tx_categoria);
		this.add(tx_valor);
		this.add(tx_descricao);
		this.add(tx_quantidade);
		
		salvar.setFocusPainted(false);
		salvar.setBounds(700/2-65, 380, 130, 45);
		salvar.setText("Salvar");
		salvar.setBackground(new Color(50, 168, 82));
		salvar.setForeground(Color.WHITE);
		salvar.setFont(new Font(salvar.getFont().getFontName(), Font.PLAIN, 16));
		this.add(salvar);
		
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexao con = new Conexao();
				String sql = "INSERT INTO tbProduto(nomeProduto, valorProduto, descProduto, quantidadeProduto, idCategoria) VALUES('"+tx_produto.getText()+"', '"+tx_valor.getText()+"', '"+tx_descricao.getText()+"', '"+tx_quantidade.getText()+"', '"+(tx_categoria.getSelectedIndex()+1)+"')";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					
					state.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Seu produto foi inserido com sucesso.", "Insercao SQL", 1, null);
				} catch(SQLException err) {
					System.out.println("Erro na insercao.");
				}
				con.desconectar();
			}
		});
		
		this.setLayout(null);
	}
}
