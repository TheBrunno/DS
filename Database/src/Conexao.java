import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Connection;

public class Conexao {
   static Connection con;   

    public void conectar(){
        try{
           Class.forName("com.mysql.jdbc.Driver");

           con = DriverManager.getConnection("jdbc:mysql://localhost/bdlojinho","root","");

           System.out.println("Conexao realizada com sucesso.");
        }
         catch(ClassNotFoundException ex){
	        System.out.println("Driver JDBC-ODBC nao encontrado"); 
	    }	         
         catch(SQLException ex){
           System.out.println("Problemas na conexao com o banco de dados."); 
        }         
    }

    public void desconectar(){
         try{	           
           con.close();
           System.out.println("Conexao finalizada com sucesso");
         }
         catch(SQLException ex){
            System.out.println("Problemas ao encerrar a conexao."); 
         }
    }
}
