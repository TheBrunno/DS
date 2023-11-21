import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class CadastrarCategorias extends JDialog {
	
	private JLabel titulo = new JLabel();

	private JLabel categoria = new JLabel();
	private JTextField tx_categoria = new JTextField();
	
	private JButton salvar = new JButton();
	
	public CadastrarCategorias() {
		this.setTitle("Cadastrar categorias");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		titulo.setText("Cadastrar categorias");
		titulo.setBounds(0, 30, 700, 40);
		titulo.setFont(new Font(titulo.getFont().getFontName(), Font.PLAIN, 28));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(titulo);
		
		categoria.setText("Categoria:");
		categoria.setBounds(110, 180, 200, 30);
		categoria.setFont(new Font(categoria.getFont().getFontName(), Font.PLAIN, 20));
		this.add(categoria);
	
		tx_categoria.setBounds(240, 180, 300, 30);
		this.add(tx_categoria);
		
		salvar.setFocusPainted(false);
		salvar.setBounds(700/2-65, 380, 130, 45);
		salvar.setText("Salvar");
		salvar.setBackground(new Color(50, 168, 82));
		salvar.setForeground(Color.WHITE);
		salvar.setFont(new Font(salvar.getFont().getFontName(), Font.PLAIN, 16));
		this.add(salvar);
		
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				String sql = "INSERT INTO tbCategoria(nomeCategoria) VALUES('"+tx_categoria.getText()+"')";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Sua categoria foi inserida com sucesso.", "Insercao SQL", 1, null);
				} catch(SQLException err) {
					System.out.println("Erro na insercao.");
				}
				
				
				
				con.desconectar();
			}
		});
		
		this.setLayout(null);
	}
}
