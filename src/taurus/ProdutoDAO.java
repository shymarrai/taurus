package taurus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import conexoes.ConexaoSQLite;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author icest
 */
public class ProdutoDAO extends Produto {
    ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    
    public List<Produto> read(){
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        conexaoSQLite.conectar();

            List<Produto> produtos = new ArrayList<>();
        
           try {
               
                String sql = "SELECT * FROM produtos;";
                stmt = conexaoSQLite.criarPreparedStatement(sql);
        
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                
                produto.setCod_produto(rs.getString("cod_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco_custo(rs.getFloat("preco_custo"));
                produto.setPreco_venda(rs.getFloat("preco_venda"));
                produtos.add(produto);
            }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                stmt.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
               conexaoSQLite.desconectar();
           }
            
        return produtos;
    }
            
    
}
