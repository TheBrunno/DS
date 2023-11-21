import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Connection;

public class Conexao {
   static Connection con;   

    public void conectar(){
        try{
           Class.forName("com.mysql.jdbc.Driver");

           con = DriverManager.getConnection("jdbc:mysql://localhost:3301/bdlojinho","root","");

           System.out.println("Conex�o realizada com sucesso.");
        }
         catch(ClassNotFoundException ex){
	        System.out.println("Driver JDBC-ODBC n�o encontrado"); 
	    }	         
         catch(SQLException ex){
           System.out.println("Problemas na conex�o com o banco de dados."); 
        }         
    }

    public void desconectar(){
         try{	           
           con.close();
           System.out.println("Conexao finalizada com sucesso");
         }
         catch(SQLException ex){
            System.out.println("Problemas ao encerrar a conex�o."); 
         }
    }
}
