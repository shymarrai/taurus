package taurus;
import org.xml.sax.Attributes;

import conexoes.ConexaoSQLite;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
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
public class Calculo extends javax.swing.JFrame {
ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    /**
     * Creates new form Calculo
     */
    public Calculo() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCalcularResumo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAte = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSaldoInicial = new javax.swing.JLabel();
        lblSaldoFinal = new javax.swing.JLabel();
        txtSub = new javax.swing.JLabel();
        lblDesp = new javax.swing.JLabel();
        lblLucro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblMelhorData = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDataDe = new javax.swing.JFormattedTextField();
        txtDataAte = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnCalcularResumo.setText("Calcular");
        btnCalcularResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularResumoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularResumo);
        btnCalcularResumo.setBounds(300, 80, 81, 30);

        jLabel3.setText("De:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 60, 40, 16);

        jLabel4.setText("Até:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 60, 40, 16);

        jLabel5.setText("De:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 130, 30, 20);

        lblDe.setForeground(new java.awt.Color(0, 0, 204));
        lblDe.setText("00/00/0000");
        jPanel1.add(lblDe);
        lblDe.setBounds(100, 130, 70, 20);

        jLabel7.setText("Até:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(190, 130, 40, 16);

        lblAte.setForeground(new java.awt.Color(0, 0, 204));
        lblAte.setText("00/00/0000");
        jPanel1.add(lblAte);
        lblAte.setBounds(230, 130, 70, 20);

        jLabel9.setText("Saldo Inicial: R$");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 180, 100, 30);

        jLabel10.setText("Saldo Final: R$");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 210, 90, 30);

        jLabel11.setText("SubTotal: R$");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 240, 90, 30);

        jLabel12.setText("Despezas: R$");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 270, 80, 30);

        jLabel13.setText("Lucro: R$");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 300, 80, 30);

        lblSaldoInicial.setForeground(new java.awt.Color(0, 0, 204));
        lblSaldoInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoInicial.setText("0.00");
        jPanel1.add(lblSaldoInicial);
        lblSaldoInicial.setBounds(140, 180, 70, 30);

        lblSaldoFinal.setForeground(new java.awt.Color(0, 0, 204));
        lblSaldoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoFinal.setText("0.00");
        jPanel1.add(lblSaldoFinal);
        lblSaldoFinal.setBounds(130, 206, 90, 30);

        txtSub.setForeground(new java.awt.Color(0, 0, 204));
        txtSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSub.setText("0.00");
        jPanel1.add(txtSub);
        txtSub.setBounds(130, 240, 90, 30);

        lblDesp.setForeground(new java.awt.Color(0, 0, 204));
        lblDesp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesp.setText("0.00");
        jPanel1.add(lblDesp);
        lblDesp.setBounds(130, 270, 90, 30);

        lblLucro.setForeground(new java.awt.Color(0, 0, 204));
        lblLucro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLucro.setText("0.00");
        jPanel1.add(lblLucro);
        lblLucro.setBounds(130, 300, 90, 30);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(18, 170, 10, 170);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(230, 170, 10, 160);

        jLabel19.setText("Quantidade:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(240, 230, 80, 30);

        lblQtd.setForeground(new java.awt.Color(0, 0, 204));
        lblQtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQtd.setText("0");
        jPanel1.add(lblQtd);
        lblQtd.setBounds(320, 230, 60, 30);

        jLabel21.setText("Melhor Moemento");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(240, 180, 110, 30);

        lblMelhorData.setForeground(new java.awt.Color(0, 0, 204));
        lblMelhorData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMelhorData.setText("00/00/0000");
        jPanel1.add(lblMelhorData);
        lblMelhorData.setBounds(240, 200, 90, 30);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Folha de Resumo");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(100, 0, 230, 40);

        try {
            txtDataDe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDataDe);
        txtDataDe.setBounds(40, 80, 90, 30);

        try {
            txtDataAte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDataAte);
        txtDataAte.setBounds(170, 80, 90, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 450, 361));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resumo-de-fundo-com-um-desenho-geometrico_1048-1511.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 544, 385));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void CompraCalc(){
        
        ResultSet resultSet = null;
        Statement statement = null;
        conexaoSQLite.conectar();

        statement = conexaoSQLite.criarStatement();

            String dataDe = txtDataDe.getText();
            String dataAte = txtDataAte.getText();
        
        try{
            
            String query = "SELECT count(*) as NrVezes, data_compra FROM compra WHERE data_compra between '"+dataDe +"' AND '"+dataAte +"' GROUP BY data_compra ORDER BY NrVezes DESC ;";
            
            resultSet = statement.executeQuery(query);
            
                lblMelhorData.setText((resultSet.getString("data_compra")));
                lblQtd.setText((resultSet.getString("NrVezes")));
                
            
            
        }catch(SQLException e){
            
        }
        conexaoSQLite.desconectar();
        
        
    }
    
     public void CaixaCalcFinal(){
         
         ResultSet resultSet = null;
         Statement statement = null;
         conexaoSQLite.conectar();
        
          statement = conexaoSQLite.criarStatement();
            String dataDe = txtDataDe.getText();
            String dataAte = txtDataAte.getText();
        
          try{
            /*SALDOS*/
            
            String query = "SELECT sum(saldo_final) FROM caixa WHERE data_fechamento between '"+ dataDe +"' and '"+ dataAte +"' ;";
            resultSet = statement.executeQuery(query);
            
            lblSaldoFinal.setText(resultSet.getString("sum(saldo_final)"));
            
              }catch(SQLException e){
           
           
                    
        }
        conexaoSQLite.desconectar();
        
            
     }
     
     
     public void DespezaCalc(){
                 /*DESPEZAS*/
        ResultSet resultSet3 = null;
        Statement statement3 = null;
        conexaoSQLite.conectar();
        statement3 = conexaoSQLite.criarStatement();
        
            String dataDe = txtDataDe.getText();
            String dataAte = txtDataAte.getText();
            
         try{   
        String desp = "SELECT sum(valor) FROM despeza WHERE data_despeza between '"+dataDe +"' and '"+ dataAte +"' ;";
        resultSet3 = statement3.executeQuery(desp);
        lblDesp.setText(resultSet3.getString("sum(valor)"));
        }catch(SQLException e){
            
           
                    
        }
        conexaoSQLite.desconectar();
         
         }
     
    public void CaixaCalcInicial(){
        /*SALDOS*/
        
        Statement statement = null;
        ResultSet resultSet = null;


        
        conexaoSQLite.conectar();

        statement = conexaoSQLite.criarStatement();
        
            
            String dataDe = txtDataDe.getText();
            String dataAte = txtDataAte.getText();
        
        try{
            /*SALDOS*/
            String queryInicial = "SELECT sum(saldo_inicial) FROM caixa WHERE data_abertura between '"+dataDe +"' and '"+ dataAte +"' ;";
            

            resultSet = statement.executeQuery(queryInicial);
            

                lblSaldoInicial.setText(resultSet.getString("sum(saldo_inicial)"));

        }catch(SQLException e){
           
           
                    
        }
        conexaoSQLite.desconectar();
        
        
    }
    
    
    
    
    private void btnCalcularResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularResumoActionPerformed
  
        CaixaCalcInicial();
        CaixaCalcFinal();
        DespezaCalc();
        CompraCalc();
    
        ResultSet resultSet = null;
        Statement statement = null;
        conexaoSQLite.conectar();

        statement = conexaoSQLite.criarStatement();

            String dataDe = txtDataDe.getText();
            String dataAte = txtDataAte.getText();
        
            lblDe.setText(dataDe);
            lblAte.setText(dataAte);
        try{
            
            String query = "SELECT count(*) as NrVezes, data_compra FROM compra GROUP BY data_compra ORDER BY NrVezes DESC;";
            
            resultSet = statement.executeQuery(query);
            
                
                Float sub = Float.parseFloat(lblSaldoInicial.getText()) + Float.parseFloat(lblSaldoFinal.getText());
                txtSub.setText(sub.toString());
                
                /*LUCRO*/
                
                Float lucro = (Float.parseFloat(lblSaldoInicial.getText()) + Float.parseFloat(lblSaldoFinal.getText())) - Float.parseFloat(lblDesp.getText());
                lblLucro.setText(format(lucro));
            
            
        }catch(SQLException e){
            
        }
        conexaoSQLite.desconectar();
        
        
        
    }//GEN-LAST:event_btnCalcularResumoActionPerformed

    public static String format(float x) {  
    DecimalFormat df = new DecimalFormat("#0.00");  
    return df.format(x);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularResumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDesp;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JLabel lblMelhorData;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSaldoFinal;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JFormattedTextField txtDataAte;
    private javax.swing.JFormattedTextField txtDataDe;
    private javax.swing.JLabel txtSub;
    // End of variables declaration//GEN-END:variables
}
