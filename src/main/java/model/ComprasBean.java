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
    private double preco_total;
    private int quantidade;
    private String data;

    // Getters e Setters

    public ComprasBean() {
    }

    public ComprasBean(int id, int id_roupa, String nome, double preco_total, int quantidade, String data) {
        this.id = id;
        this.id_roupa = id_roupa;
        this.nome = nome;
        this.preco_total = preco_total;
        this.quantidade = quantidade;
        this.data = data;
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

    public double getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
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
    
}
    
