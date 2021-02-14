package taurus;


import conexoes.ConexaoSQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icest
 */
public class Produto {
    String cod_produto;
    String nome;
    Float preco_custo;
    Float preco_venda;

    
    public String getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(String cod_produto) {
        this.cod_produto = cod_produto;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(Float preco_custo) {
        this.preco_custo = preco_custo;
    }

    public Float getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(Float preco_vendar) {
        this.preco_venda = preco_vendar;
    }
   
    
    
    
    
    
    
    @Override
    public String toString(){
       
        return getNome();
        
    }
    public float flu(float x){
        
     return getPreco_venda();
        
    }
}
