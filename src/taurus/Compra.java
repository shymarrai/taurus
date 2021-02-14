package taurus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icest
 */
public class Compra {
    
    String cod_compra;
    String data_compra; //
    String produtos; //
    String pagamento; //
    String troco;//
    String valor_compra;//
    String cliente;//
    String Obs;//
    String status;//

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
   
    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }
    
    public String getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(String cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(String valor_compra) {
        this.valor_compra = valor_compra;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
