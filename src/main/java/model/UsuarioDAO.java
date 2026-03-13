/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class UsuarioDAO {
    public void cadastrar(UsuarioBean usuario){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("INSERT INTO usuarios (nome, usuario, senha, admin) VALUES (?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.setBoolean(4, false);
            stmt.executeUpdate();
        }catch (SQLException e){
           e.printStackTrace(); 
        }
    }
    
    public UsuarioBean logar(String usuario, String senha){
        UsuarioBean user = new UsuarioBean();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * from usuarios where usuarios.usuario = ? and usuarios.senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            if(rs.next()){
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("Nome"));
                user.setUsuario(rs.getString("Usuario"));
                user.setSenha(rs.getString("senha"));
                user.setAdmin(rs.getBoolean("Admin"));
                
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    
    public void deletar(int id){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("DELETE FROM usuarios where id = ?");
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch (SQLException e){
           e.printStackTrace(); 
        }
    }
    
}