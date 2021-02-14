package taurus;


import conexoes.ConexaoSQLite;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import static java.time.Instant.now;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Caixa {
    ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    
    String cod_caixa;
    String data_abertura;
    String data_fechamento;
    float saldo_inicial;
    String saldo_final;
    String observacao;

    public String getCod_caixa() {
        return cod_caixa;
    }

    public void setCod_caixa(String cod_caixa) {
        this.cod_caixa = cod_caixa;
    }

    public String getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(String data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(String data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public float getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(float saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public String getSaldo_final() {
        return saldo_final;
    }

    public void setSaldo_final(String saldo_final) {
        this.saldo_final = saldo_final;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
        
   
    
    public void RegistroAbre(){
        conexaoSQLite.conectar();
        String data_abertura = getDateTime();
         //int saldo_inicial;
        String saldo_inicial = JOptionPane.showInputDialog(null,"Saldo Inicial");
        
        
        
        
        String sqlInsert = "INSERT INTO caixa("
                + "cod_caixa,"
                + "data_abertura,"
                + "data_fechamento,"
                + "saldo_inicial,"
                + "saldo_final,"
                + "observacao"
                + ") VALUES(null,?,null,?,null,null);";

    
    
                PreparedStatement preparedStatement =  conexaoSQLite.criarPreparedStatement(sqlInsert);

                try{
                    
                    
                    preparedStatement.setString(1,data_abertura);
                    preparedStatement.setString(2,saldo_inicial);
                    
                    
                    
                    preparedStatement.executeUpdate();
                    
                    
                    
                    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                    
                }finally{
                    if(preparedStatement != null){
                        try {
                            preparedStatement.close();
                            conexaoSQLite.desconectar();
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            conexaoSQLite.desconectar();
                        }
                    }
                    conexaoSQLite.desconectar();
                }
        conexaoSQLite.desconectar();
       
        
    }
    
    public void RegistroFecha(){
        
        Caixa caixa = new Caixa();
        caixa.getDateTime();
        
        
        String data_fechamento = caixa.getDateTime();
         Statement statement = null;
         //ResultSet resultSet = null;
        String saldo_final = JOptionPane.showInputDialog(null,"Saldo Final?");
        String obs =   JOptionPane.showInputDialog(null,"Alguma Observação?");
        
               conexaoSQLite.conectar();
                statement = conexaoSQLite.criarStatement();
                     
                    

                 
                try{
                    
                String sqlInsert = "UPDATE caixa SET "
                + "data_fechamento = "+ "'"+ data_fechamento +"'"
                + ",saldo_final = "+ "'"+ saldo_final +"'"
                + ",observacao = "+ "'"+ obs +"'"
                + "WHERE data_abertura = (SELECT MAX(data_abertura) FROM caixa)"
                + ";";
               statement.executeQuery(sqlInsert);
                }catch(SQLException e){
                    //JOptionPane.showMessageDialog(null,e);
                   
                }
                    
                    conexaoSQLite.desconectar();
                
        
        
        
    }
    
    
    
    public String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date(System.currentTimeMillis());
    return dateFormat.format(date);
        
    
    }
    
    
}
    
