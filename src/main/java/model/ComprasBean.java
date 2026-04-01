/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class ComprasBean {
    private int id;
    private int id_roupa;
    private String nome;
    private double preco;
    private int quantidade;
    private String data;
    private double PrecoTotal;

    public ComprasBean() {
    }

    public ComprasBean(int id, int id_roupa, String nome, double preco, int quantidade, String data, double PrecoTotal) {
        this.id = id;
        this.id_roupa = id_roupa;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
        this.PrecoTotal = PrecoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_roupa() {
        return id_roupa;
    }

    public void setId_roupa(int id_roupa) {
        this.id_roupa = id_roupa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(double PrecoTotal) {
        this.PrecoTotal = PrecoTotal;
    }

    
}