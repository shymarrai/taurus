package taurus;

import org.xml.sax.Attributes;
import conexoes.ConexaoSQLite;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icest
 */
public class CriarBancoSQLite {
    private final ConexaoSQLite conexaoSQLite;
    public CriarBancoSQLite(ConexaoSQLite pConexaoSQLite){
        this.conexaoSQLite = pConexaoSQLite;
       
    }
    public void criarTabelaUsuario(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios"
                + "(cod_user integer PRIMARY KEY AUTOINCREMENT,"
                + "nome varchar(50),"
                + "login varchar(10),"
                + "senha varchar(10),"
                + "admin integer(1)"
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            }
        }
    }
    
public void criarTabelaClientes(){
        String sql = "CREATE TABLE IF NOT EXISTS clientes"
                + "(cod_cliente integer PRIMARY KEY AUTOINCREMENT,"
                + "nome varchar(50),"
                + "telefone varchar(12),"
                + "celular varchar(12),"
                + "end varchar(60),"
                + "observacao text"
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada 2");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada 2");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            }
        }
    }

public void criarTabelaProdutos(){
        String sql = "CREATE TABLE IF NOT EXISTS produtos"
                + "(cod_produto integer PRIMARY KEY AUTOINCREMENT,"
                + "nome varchar(20),"
                + "preco_custo float(4,2),"
                + "preco_venda float(4,2)"
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada 3");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada 3");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            }
        }
    }

public void criarTabelaDespeza(){
        String sql = "CREATE TABLE IF NOT EXISTS despeza"
                + "(cod_despeza integer PRIMARY KEY AUTOINCREMENT,"
                + "nome varchar(20),"
                + "valor float(4,2),"
                + "obs text,"
                + "data_despeza datetime"
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada 4");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada 4");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            }
        }
    }

public void criarTabelaCaixa(){
        String sql = "CREATE TABLE IF NOT EXISTS caixa"
                + "(cod_caixa integer PRIMARY KEY AUTOINCREMENT,"
                + "data_abertura datetime ,"
                + "data_fechamento datetime ,"
                + "saldo_inicial decimal(4,00) ,"
                + "saldo_final decimal(4,00),"
                + "observacao text"
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada 5");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada 5");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            }
        }
    }

public void criarTabelaCompra(){
        String sql = "CREATE TABLE IF NOT EXISTS compra"
                + "(cod_compra integer PRIMARY KEY AUTOINCREMENT,"
                + "data_compra datetime,"
                + "valor_compra decimal(3,00),"
                + "cliente varchar,"
                + "produtos varchar,"
                + "obs varchar,"
                + "status varchar "
                + " );";
        
        boolean conectou = false;
        try{
            conectou = this.conexaoSQLite.conectar();
            
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
            System.out.println("tabela criada 6");
        }catch(SQLException e){
            //mensagem
               System.out.println("Tabela nao criada 6");
        }finally{
            if(conectou){
            this.conexaoSQLite.desconectar();
            
            }
        }
    }


}
