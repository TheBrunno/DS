import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GerenciarProduto extends JDialog {
	
	private JLabel produto = new JLabel();
	private JLabel edt_produto = new JLabel();
	private JLabel edt_valorProduto = new JLabel();
	private JLabel edt_descProduto = new JLabel();
	private JLabel edt_qtdeProduto = new JLabel();
	private JLabel edt_categoriaProduto = new JLabel();
	
	private JLabel ex_produto = new JLabel();
	private JLabel ex_valorProduto = new JLabel();
	private JLabel ex_descProduto = new JLabel();
	private JLabel ex_qtdeProduto = new JLabel();
	private JLabel ex_categoriaProduto = new JLabel();
	
	private JTextField tx_produto = new JTextField();
	private JTextField tx_edtProduto = new JTextField();
	private JTextField tx_edtValorProduto = new JTextField();
	private JTextField tx_edtDescProduto = new JTextField();
	private JTextField tx_edtQtdeProduto = new JTextField();
	
	private JComboBox<String> cb_edtCategoria = new JComboBox<>();
	
	private JButton criar = new JButton();
	private JButton editar = new JButton();
	private JButton deletar = new JButton();
	private JButton edt_confirm = new JButton();
	
	private JButton pesquisar = new JButton();
	private ResultSet resultset;
	private Statement state;
	
	private String PK;
	
	public GerenciarProduto() {
		this.setTitle("Gerenciar produtos");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setModal(true);
		this.setResizable(false);
		
		produto.setText("Pesquisar produtos:");
		produto.setBounds(64, 24, 200, 30);
		produto.setFont(new Font(produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(produto);
	
		tx_produto.setBounds(240, 24, 300, 30);
		this.add(tx_produto);
		
		pesquisar.setFocusPainted(false);
		pesquisar.setBounds(580, 16, 45, 45);
		pesquisar.setBackground(new Color(255, 255, 255));
		pesquisar.setFont(new Font(pesquisar.getFont().getFontName(), Font.PLAIN, 16));
		this.add(pesquisar);
		
		//
		
		edt_produto.setText("Produto:");
		edt_produto.setBounds(64, 104, 200, 30);
		edt_produto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_produto);
	
		tx_edtProduto.setBounds(200, 104, 300, 30);
		this.add(tx_edtProduto);
		
		edt_valorProduto.setText("Valor:");
		edt_valorProduto.setBounds(64, 144, 200, 30);
		edt_valorProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_valorProduto);
	
		tx_edtValorProduto.setBounds(200, 144, 300, 30);
		this.add(tx_edtValorProduto);
		
		edt_descProduto.setText("Descricao:");
		edt_descProduto.setBounds(64, 184, 200, 30);
		edt_descProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_descProduto);
	
		tx_edtDescProduto.setBounds(200, 184, 300, 30);
		this.add(tx_edtDescProduto);
		
		edt_qtdeProduto.setText("Quantidade:");
		edt_qtdeProduto.setBounds(64, 224, 200, 30);
		edt_qtdeProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_qtdeProduto);
	
		tx_edtQtdeProduto.setBounds(200, 224, 300, 30);
		this.add(tx_edtQtdeProduto);
		
		edt_categoriaProduto.setText("Categoria:");
		edt_categoriaProduto.setBounds(64, 264, 200, 30);
		edt_categoriaProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_categoriaProduto);
		
		cb_edtCategoria.setBounds(200, 264, 200, 30);
		this.add(cb_edtCategoria);
		
		ex_produto.setText("nomeProduto");
		ex_produto.setBounds(140, 104, 200, 30);
		ex_produto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(ex_produto);

		ex_valorProduto.setText("valorProduto");
		ex_valorProduto.setBounds(120, 144, 200, 30);
		ex_valorProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(ex_valorProduto);
		
		ex_descProduto.setText("descProduto");
		ex_descProduto.setBounds(155, 184, 350, 30);
		ex_descProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(ex_descProduto);
		
		ex_qtdeProduto.setText("qtdeProduto");
		ex_qtdeProduto.setBounds(165, 224, 200, 30);
		ex_qtdeProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(ex_qtdeProduto);
		
		ex_categoriaProduto.setText("categoriaProduto");
		ex_categoriaProduto.setBounds(150, 264, 200, 30);
		ex_categoriaProduto.setFont(new Font(edt_produto.getFont().getFontName(), Font.PLAIN, 16));
		this.add(ex_categoriaProduto);
		
		Conexao conex = new Conexao();
		
		String sql = "SELECT * FROM tbCategoria WHERE deleted = 0";
					
		conex.conectar();      
					
		try{                  
				
			state = (Statement) Conexao.con.createStatement();
			resultset = state.executeQuery(sql);
				
				while(resultset.next()){
					cb_edtCategoria.addItem(resultset.getString("nomeCategoria"));
				}                         
		}
		catch(SQLException err){
			System.out.println("Erro na consulta!");
		}     
			
		conex.desconectar();
		
		edt_confirm.setFocusPainted(false);
		edt_confirm.setBounds(510, 196, 45, 45);
		edt_confirm.setBackground(new Color(255, 255, 255));
		edt_confirm.setFont(new Font(edt_confirm.getFont().getFontName(), Font.PLAIN, 16));
		this.add(edt_confirm);
		
		edt_produto.setVisible(false);
		tx_edtProduto.setVisible(false);
		edt_valorProduto.setVisible(false);
		tx_edtValorProduto.setVisible(false);
		edt_descProduto.setVisible(false);
		tx_edtDescProduto.setVisible(false);
		edt_qtdeProduto.setVisible(false);
		tx_edtQtdeProduto.setVisible(false);
		edt_categoriaProduto.setVisible(false);
		cb_edtCategoria.setVisible(false);
		ex_produto.setVisible(false);
		ex_valorProduto.setVisible(false);
		ex_descProduto.setVisible(false);
		ex_qtdeProduto.setVisible(false);
		ex_categoriaProduto.setVisible(false);
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
				
				edt_produto.setVisible(false);
				tx_edtProduto.setVisible(false);
				edt_valorProduto.setVisible(false);
				tx_edtValorProduto.setVisible(false);
				edt_descProduto.setVisible(false);
				tx_edtDescProduto.setVisible(false);
				edt_qtdeProduto.setVisible(false);
				tx_edtQtdeProduto.setVisible(false);
				edt_categoriaProduto.setVisible(false);
				cb_edtCategoria.setVisible(false);
				ex_produto.setVisible(false);
				ex_valorProduto.setVisible(false);
				ex_descProduto.setVisible(false);
				ex_qtdeProduto.setVisible(false);
				ex_categoriaProduto.setVisible(false);
				edt_confirm.setVisible(false);
				deletar.setVisible(false);
				editar.setVisible(false);
				criar.setVisible(false);
				
				Statement state;
				Conexao con = new Conexao();
				String sql = "SELECT idProduto FROM tbProduto where nomeProduto = '"+tx_produto.getText()+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					resultset = state.executeQuery(sql);
					
					if(!resultset.next()) {
						//n existe
						criar.setVisible(true);
					}else {
						//existe
						PK = resultset.getString("idProduto");
						editar.setVisible(true);
						deletar.setVisible(true);
						
						edt_produto.setVisible(true);
						edt_valorProduto.setVisible(true);
						edt_descProduto.setVisible(true);
						edt_qtdeProduto.setVisible(true);
						edt_categoriaProduto.setVisible(true);
						ex_produto.setVisible(true);
						ex_valorProduto.setVisible(true);
						ex_descProduto.setVisible(true);
						ex_qtdeProduto.setVisible(true);
						ex_categoriaProduto.setVisible(true);
						
						String sqlExibir = "SELECT * FROM tbProduto WHERE nomeProduto ='"+tx_produto.getText()+"' and deleted = 0";
						ResultSet exibirSet;
						ResultSet categoriaSet;
						
						
						try {
							exibirSet = state.executeQuery(sqlExibir);
							if(exibirSet.next()) {
								String exibirCategoria = "SELECT nomeCategoria FROM tbCategoria WHERE idCategoria = "+exibirSet.getString("idCategoria")+" ";
								
								ex_produto.setText(exibirSet.getString("nomeProduto"));
								ex_valorProduto.setText(""+exibirSet.getDouble("valorProduto"));
								ex_descProduto.setText(exibirSet.getString("descProduto"));
								ex_qtdeProduto.setText(""+exibirSet.getInt("quantidadeProduto"));
								
								categoriaSet = state.executeQuery(exibirCategoria);
								if(categoriaSet.next()) {
									ex_categoriaProduto.setText(categoriaSet.getString("nomeCategoria"));
								}
							}
						} catch (SQLException e1) {
							System.out.println("Erro na visualizacao do produto");
						}
						
					}
				}catch(SQLException err) {
					System.out.println("Erro na consulta.");
				}
				con.desconectar();
			}
		});
		
		criar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarProdutos cad_produtos_window = new CadastrarProdutos();
				cad_produtos_window.setVisible(true);
			}
		});
		
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				String sql = "SELECT * FROM tbProduto WHERE nomeProduto ='"+tx_produto.getText()+"' and deleted = 0";
				con.conectar();
				ResultSet produtoset;
				
				edt_produto.setVisible(true);
				tx_edtProduto.setVisible(true);
				edt_valorProduto.setVisible(true);
				tx_edtValorProduto.setVisible(true);
				edt_descProduto.setVisible(true);
				tx_edtDescProduto.setVisible(true);
				edt_qtdeProduto.setVisible(true);
				tx_edtQtdeProduto.setVisible(true);
				edt_categoriaProduto.setVisible(true);
				cb_edtCategoria.setVisible(true);
				edt_confirm.setVisible(true);
				
				ex_produto.setVisible(false);
				ex_valorProduto.setVisible(false);
				ex_descProduto.setVisible(false);
				ex_qtdeProduto.setVisible(false);
				ex_categoriaProduto.setVisible(false);
				
				try {
					state = (Statement) Conexao.con.createStatement();
					produtoset = state.executeQuery(sql);
					if(produtoset.next()) {
						ResultSet categoriaSet;
						String exibirCategoria = "SELECT nomeCategoria FROM tbCategoria WHERE idCategoria = "+produtoset.getString("idCategoria");
						
						tx_edtValorProduto.setText(""+produtoset.getDouble("valorProduto"));
						tx_edtDescProduto.setText(produtoset.getString("descProduto"));
						tx_edtQtdeProduto.setText(""+produtoset.getInt("quantidadeProduto"));
						
						categoriaSet = state.executeQuery(exibirCategoria);
						
						if(categoriaSet.next()) {
							cb_edtCategoria.setSelectedItem(categoriaSet.getString("nomeCategoria"));
						}
					}
				} catch (SQLException e1) {
					System.out.println("Erro na visualizacao do produto");
				}
				con.desconectar();
				editar.setVisible(false);
				deletar.setVisible(false);
				
				tx_edtProduto.setText(tx_produto.getText());
			}
		});
		
		edt_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement state;
				Conexao con = new Conexao();
				
				ResultSet nomeCat;
				String idCategoria = "1";
				try {
					con.conectar();
					state = (Statement) Conexao.con.createStatement();
					
					String selected = (String)cb_edtCategoria.getSelectedItem();
					String cat = "SELECT idCategoria FROM tbCategoria WHERE nomeCategoria = '"+selected+"' and deleted = 0";
					
					nomeCat = state.executeQuery(cat);
					if(nomeCat.next()) {
						idCategoria = nomeCat.getString("idCategoria");
					}
					
					con.desconectar();
				} catch (SQLException e1) {
					System.out.println("Erro na selecao da categoria");
				}
				
				String sql = "UPDATE tbProduto SET nomeProduto = '"+tx_edtProduto.getText()+"', valorProduto = "+tx_edtValorProduto.getText()+", descProduto = '"+tx_edtDescProduto.getText()+"', quantidadeProduto = "+tx_edtQtdeProduto.getText()+", idCategoria = "+idCategoria+"  WHERE idProduto = '"+PK+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					
					
					JOptionPane.showMessageDialog(null,"Seu produto foi editado com sucesso.", "Edicao SQL", 1, null);
					editar.setVisible(false);
					edt_produto.setVisible(false);
					tx_edtProduto.setVisible(false);
					edt_valorProduto.setVisible(false);
					tx_edtValorProduto.setVisible(false);
					edt_descProduto.setVisible(false);
					tx_edtDescProduto.setVisible(false);
					edt_qtdeProduto.setVisible(false);
					tx_edtQtdeProduto.setVisible(false);
					edt_categoriaProduto.setVisible(false);
					cb_edtCategoria.setVisible(false);
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
				String sql = "UPDATE tbProduto SET deleted = 1 WHERE idProduto = '"+PK+"' and deleted = 0";
				
				con.conectar();
				
				try {
					state = (Statement) Conexao.con.createStatement();
					state.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"Seu produto foi excluida com sucesso.", "Exclusao SQL", 1, null);
					editar.setVisible(false);
					deletar.setVisible(false);
					
					edt_produto.setVisible(false);
					edt_valorProduto.setVisible(false);
					edt_descProduto.setVisible(false);
					edt_qtdeProduto.setVisible(false);
					edt_categoriaProduto.setVisible(false);
					ex_produto.setVisible(false);
					ex_valorProduto.setVisible(false);
					ex_descProduto.setVisible(false);
					ex_qtdeProduto.setVisible(false);
					ex_categoriaProduto.setVisible(false);
					
				}catch(SQLException err) {
					System.out.println("Erro no delete");
				}
				con.desconectar();
			}
		});
		
		this.setLayout(null);
	}
}
