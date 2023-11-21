import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GerenciarCategoria extends JDialog {
	
	private JLabel titulo = new JLabel();

	private JLabel categoria = new JLabel();
	private JLabel edt_categoria = new JLabel();
	
	private JTextField tx_categoria = new JTextField();
	private JTextField tx_edtCategoria = new JTextField();
	
	private JButton criar = new JButton();
	private JButton editar = new JButton();
	private JButton deletar = new JButton();
	private JButton edt_confirm = new JButton();
	
	private JButton pesquisar = new JButton();
	private ResultSet resultset;
	
	private String PK;
	
	public GerenciarCategoria() {
		this.setTitle("Gerenciar categorias");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		categoria.setText("Pesquisar categoria:");
		categoria.setBounds(64, 24, 200, 30);
		categoria.setFont(new Font(categoria.getFont().getFontName(), Font.PLAIN, 16));
		this.add(categoria);
	
		tx_categoria.setBounds(240, 24, 300, 30);
		this.add(tx_categoria);
		
		pesquisar.setFocusPainted(false);
		pesquisar.setBounds(580, 16, 45, 45);
		pesquisar.setBackground(new Color(255, 255, 255));
		pesquisar.setFont(new Font(pesquisar.getFont().getFontName(), Font.PLAIN, 16));
		this.add(pesquisar);
		
		//
		
		edt_categoria.setText("Editar categoria:");
		edt_categoria.setBounds(64, 204, 200, 30);
		edt_categoria.setFont(new Font(edt_categoria.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_categoria);
	
		tx_edtCategoria.setBounds(200, 204, 300, 30);
		this.add(tx_edtCategoria);
		
		edt_confirm.setFocusPainted(false);
		edt_confirm.setBounds(510, 196, 45, 45);
		edt_confirm.setBackground(new Color(255, 255, 255));
		edt_confirm.setFont(new Font(edt_confirm.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_confirm);
		
		edt_categoria.setVisible(false);
		tx_edtCategoria.setVisible(false);
		edt_confirm.setVisible(false);
		
		try {
            File file = new File("img/pesquisar.png");
            Image img = ImageIO.read(file);

            Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

            pesquisar.setIcon(new ImageIcon(scaledImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		try {
            File file = new File("img/edit.png");
            Image img = ImageIO.read(file);

            Image scaledImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

            edt_confirm.setIcon(new ImageIcon(scaledImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		criar.setFocusPainted(false);
		criar.setBounds(24, 400, 130, 45);
		criar.setText("Inserir");
		criar.setBackground(new Color(50, 168, 82));
		criar.setForeground(Color.WHITE);
		criar.setFont(new Font(criar.getFont().getFontName(), Font.PLAIN, 16));
		criar.setVisible(false);
		this.add(criar);
		
		editar.setFocusPainted(false);
		editar.setBounds(24, 400, 130, 45);
		editar.setText("Editar");
		editar.setBackground(new Color(50, 168, 82));
		editar.setForeground(Color.WHITE);
		editar.setFont(new Font(editar.getFont().getFontName(), Font.PLAIN, 16));
		editar.setVisible(false);
		this.add(editar);
		
		deletar.setFocusPainted(false);
		deletar.setBounds(178, 400, 130, 45);
		deletar.setText("Deletar");
		deletar.setBackground(new Color(50, 168, 82));
		deletar.setForeground(Color.WHITE);
		deletar.setFont(new Font(deletar.getFont().getFontName(), Font.PLAIN, 16));
		deletar.setVisible(false);
		this.add(deletar);
	
		pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edt_categoria.setVisible(false);
				tx_edtCategoria.setVisible(false);
				edt_confirm.setVisible(false);
				deletar.setVisible(false);
				editar.setVisible(false);
				criar.setVisible(false);
				
				Statement state;
				Conexao con = new Conexao();
				String sql = "SELECT idCategoria FROM tbCategoria where nomeCategoria = '"+tx_categoria.getText()+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					resultset = state.executeQuery(sql);
					
					if(!resultset.next()) {
						//n existe
						criar.setVisible(true);
						
					}else {
						//existe
						PK = resultset.getString("idCategoria");
						editar.setVisible(true);
						deletar.setVisible(true);
					}
				}catch(SQLException err) {
					System.out.println("Erro na consulta.");
				}
				con.desconectar();
			}
		});
		
		criar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				String sql = "INSERT INTO tbCategoria(nomeCategoria) VALUES ('"+tx_categoria.getText()+"')";
				String select = "SELECT idCategoria FROM tbCategoria where nomeCategoria = '"+tx_categoria.getText()+"'";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					resultset = state.executeQuery(select);
					
				    if (resultset.next()) { 
				        PK = resultset.getString("idCategoria");
				        JOptionPane.showMessageDialog(null,"Sua categoria foi inserida com sucesso.", "Insercao SQL", 1, null);
				        criar.setVisible(false);
				    }
				}catch(SQLException err) {
					System.out.println("Erro no insert");
				}
				con.desconectar();
			}
		});
		
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edt_categoria.setVisible(true);
				tx_edtCategoria.setVisible(true);
				edt_confirm.setVisible(true);
				
				editar.setVisible(false);
				deletar.setVisible(false);
				
				tx_edtCategoria.setText(tx_categoria.getText());
			}
		});
		
		edt_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				String sql = "UPDATE tbCategoria SET nomeCategoria = '"+tx_edtCategoria.getText()+"' WHERE idCategoria = '"+PK+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"Sua categoria foi editada com sucesso.", "Edi��o SQL", 1, null);
					editar.setVisible(false);
					edt_categoria.setVisible(false);
					tx_edtCategoria.setVisible(false);
					edt_confirm.setVisible(false);
					deletar.setVisible(false);
				}catch(SQLException err) {
					System.out.println("Erro no update");
				}
				con.desconectar();
			}
		});
		
		deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				String sql = "UPDATE tbCategoria SET deleted = 1 WHERE idCategoria = '"+PK+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"Sua categoria foi excluida com sucesso.", "Exclus�o SQL", 1, null);
					editar.setVisible(false);
					deletar.setVisible(false);
				}catch(SQLException err) {
					System.out.println("Erro no delete");
				}
				con.desconectar();
			}
		});
		
		this.setLayout(null);
	}
}
