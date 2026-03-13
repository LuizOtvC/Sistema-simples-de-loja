package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//conexao com o banco de dados
public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3307/gerenciador";
    private static final String user = "root";
    private static final String senha = "";
   
    public static Connection conectar(){
    Connection conn = null;
    try{
        conn = DriverManager.getConnection(url, user, senha);
    }catch (SQLException e) {
        e.printStackTrace();
    }
       return conn;    
}
    
    public void testarConexao(){
        Connection conn = conectar();
        if (conn == null){
            JOptionPane.showMessageDialog(null, "erro ao conectar ao banco de dados");
        }else{
            JOptionPane.showMessageDialog(null, "conectado ao banco de dados");
        }
    }
}
