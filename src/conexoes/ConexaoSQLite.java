/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author icest
 */
public class ConexaoSQLite {
    
    private Connection conexao;
    
    public boolean conectar(){
        
        
        try{
        String url = "jdbc:sqlite:banco_de_dados/controle.db";
        
        this.conexao = DriverManager.getConnection(url);
    }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return false;
    }
        return true;
    }
    
    public boolean desconectar(){
        
        try{
        if(this.conexao.isClosed() == false){
            this.conexao.close();
        }
    }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return false;
    }
        
        return true;
    }
    
    
    public Statement criarStatement(){
        try{
            return this.conexao.createStatement();
        }catch(SQLException e){
            return null;
        }
               
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try{
            return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;
        }
               
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
}
