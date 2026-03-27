package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoupasDAO {
    public List<RoupasBean> ler() {
        List<RoupasBean> dados = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            while (rs.next()) {

                RoupasBean roupas = new RoupasBean();

                roupas.setId(rs.getInt("id"));
                roupas.setNome(rs.getString("nome"));
                roupas.setPreco(rs.getDouble("preco"));
                roupas.setQuantidade(rs.getInt("quantidade"));

                dados.add(roupas);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dados;
    }
    
    public void deletar(int id){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("DELETE FROM produtos WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrar(RoupasBean id){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("INSERT INTO produtos ( nome, preco, quantidade) VALUES (?,?,?)");
            stmt.setString(1, id.getNome());
            stmt.setDouble(2, id.getPreco());
            stmt.setInt(3, id.getQuantidade());
            stmt.executeUpdate();
        }catch (SQLException e){
           e.printStackTrace(); 
        }
    }
    
    public void update(RoupasBean update){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("UPDATE produtos set nome = ?, preco = ?, quantidade = ? WHERE id = ? ");
            
            stmt.setString(1, update.getNome());
            stmt.setDouble(2, update.getPreco());
            stmt.setInt(3, update.getQuantidade());
            stmt.setInt(4, update.getId());
            
            stmt.executeUpdate();
        }catch (SQLException e){
           e.printStackTrace(); 
        }
        
    }
    
    public void updatEstoq(int id, int quantidade){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("UPDATE produtos set quantidade = ? WHERE id = ? ");
            
            stmt.setInt(1, quantidade);
            stmt.setInt(2, id);
            
            stmt.executeUpdate();
        }catch (SQLException e){
           e.printStackTrace(); 
        }
        
    }
}