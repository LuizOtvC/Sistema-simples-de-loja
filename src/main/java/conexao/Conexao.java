package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//conexao com o banco de dados
public class Conexao {
    private static Connection conn = null;
    private static final String url = "jdbc:mysql://localhost:3306/gerenciador";
    private static final String user = "root";
    private static final String senha = "12345";
   
    private Conexao(){
        
    }
    
    public static synchronized Connection conectar(){
        try{
            if(conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(url, user, senha);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
            
    
    
}
