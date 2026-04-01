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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ComprasDAO { 
    public List<ComprasBean> ler() {
        List<ComprasBean> dados = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement("SELECT * FROM compras");
            rs = stmt.executeQuery();
            while (rs.next()) {

                ComprasBean roupas = new ComprasBean();

                roupas.setId(rs.getInt("id"));
                roupas.setNome(rs.getString("nome"));
                roupas.setPreco(rs.getDouble("preco"));
                roupas.setQuantidade(rs.getInt("quantidade"));
                roupas.setData(rs.getString("data"));
                roupas.setPrecoTotal(rs.getDouble("PrecoTotal"));
                dados.add(roupas);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dados;
    }
    
    public void salvar(ComprasBean c) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO compras (id_roupa, nome, preco, quantidade, data, PrecoTotal) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getId_roupa());
            ps.setString(2, c.getNome());
            ps.setDouble(3, c.getPreco());
            ps.setInt(4, c.getQuantidade());
            ps.setString(5, c.getData());
            ps.setDouble(6, c.getPrecoTotal());
            ps.executeUpdate();
            System.out.println("salvo");
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
    
