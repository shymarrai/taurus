package taurus;
import org.xml.sax.Attributes;

import conexoes.ConexaoSQLite;
//import java.sql.Date;
import java.util.Date; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class Historico extends javax.swing.JFrame {
ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    /**
     * Creates new form Historico
     */
String status;
    public Historico() {
        initComponents();
        
        txtDataHist.setText(getDateTime());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlHistorico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHist = new javax.swing.JTable();
        btnAtualizarHist = new javax.swing.JButton();
        radioAnd = new javax.swing.JRadioButton();
        radioTer = new javax.swing.JRadioButton();
        txtDataHist = new javax.swing.JFormattedTextField();
        btnAlterarHist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHistorico.setBackground(new java.awt.Color(255, 255, 255));
        pnlHistorico.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Histórico de Pedidos");
        pnlHistorico.add(jLabel2);
        jLabel2.setBounds(170, 0, 260, 40);

        tblHist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DATA", "TOTAL", "CLIENTE", "PRODUTOS", "OBS", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHist.setEditingColumn(1);
        tblHist.setEditingRow(1);
        tblHist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHist);

        pnlHistorico.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 570, 260);

        btnAtualizarHist.setText("Atualizar");
        btnAtualizarHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarHistActionPerformed(evt);
            }
        });
        pnlHistorico.add(btnAtualizarHist);
        btnAtualizarHist.setBounds(480, 370, 100, 40);

        radioAnd.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioAnd);
        radioAnd.setSelected(true);
        radioAnd.setText("Em Andamento");
        radioAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAndActionPerformed(evt);
            }
        });
        pnlHistorico.add(radioAnd);
        radioAnd.setBounds(200, 60, 120, 24);

        radioTer.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioTer);
        radioTer.setText("Terminado");
        pnlHistorico.add(radioTer);
        radioTer.setBounds(320, 60, 110, 24);

        try {
            txtDataHist.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlHistorico.add(txtDataHist);
        txtDataHist.setBounds(50, 60, 90, 30);

        btnAlterarHist.setBackground(new java.awt.Color(0, 0, 204));
        btnAlterarHist.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarHist.setText("Alterar");
        btnAlterarHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarHistActionPerformed(evt);
            }
        });
        pnlHistorico.add(btnAlterarHist);
        btnAlterarHist.setBounds(20, 380, 73, 26);

        getContentPane().add(pnlHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 590, 420));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resumo-de-fundo-com-um-desenho-geometrico_1048-1511.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 467));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAndActionPerformed
    
    
    
    public String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date(System.currentTimeMillis());
    return dateFormat.format(date);
        
    
    }
 
    private void LimparTabela() {
        int linhas = 0;
        int colunas = 0;
        String zer = null;

        for (linhas = 0; linhas <= tblHist.getRowCount() - 1; linhas++) {
            for (colunas = 0; colunas <= tblHist.getColumnCount() - 1; colunas++) {
                tblHist.setValueAt(zer, linhas, colunas);
            }
        }
       
    }
 
    private void btnAtualizarHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarHistActionPerformed
        // TODO add your handling code here:
        
        LimparTabela();
        ResultSet resultSet = null;
        Statement statement = null;
        conexaoSQLite.conectar();

        statement = conexaoSQLite.criarStatement();
        String data = txtDataHist.getText(); 
        String status;
        
        if(radioAnd.isSelected()){
            status = "EM ANDAMENTO";
        }else{
             status = "TERMINADO";
        }
            
        
        try{
           
            String query = "SELECT * FROM compra WHERE status = '"+ status+"' AND data_compra <= '"+data +"' ORDER BY data_compra DESC;";
            
            resultSet = statement.executeQuery(query);
            int i = 0;
                
            while(resultSet.next()){
               
                tblHist.setValueAt((resultSet.getString("cod_compra")),i,0);
                tblHist.setValueAt((resultSet.getString("data_compra")),i,1);
                tblHist.setValueAt((resultSet.getString("valor_compra")),i,2);
                tblHist.setValueAt((resultSet.getString("cliente")),i,3);
                tblHist.setValueAt((resultSet.getString("produtos")),i,4);
                tblHist.setValueAt((resultSet.getString("obs")),i,5);
                tblHist.setValueAt((resultSet.getString("status")),i,6);
                i++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Query de pesquisa nao executada.");
        }
        conexaoSQLite.desconectar();
        
        
        
    }//GEN-LAST:event_btnAtualizarHistActionPerformed

    private void tblHistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHistMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_tblHistMouseClicked

    private void btnAlterarHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarHistActionPerformed
        // TODO add your handling code here:
        
        
        
        
       String li = String.valueOf(tblHist.getValueAt(tblHist.getSelectedRow(),6));
       String il = String.valueOf(tblHist.getValueAt(tblHist.getSelectedRow(),0));
       
       ResultSet resultSet = null;
        Statement statement = null;
        conexaoSQLite.conectar();
        
        statement = conexaoSQLite.criarStatement();
        
        
        if(li.equals("EM ANDAMENTO")){
             status = "TERMINADO";
            
        }else{
             status = "EM ANDAMENTO";
             
        }
       
        //System.out.println(status.toString());
        
        try{
           
            String query = "UPDATE compra SET status = '"+status+"' WHERE cod_compra ="+ il +";";
            System.out.println(query);
            
            resultSet = statement.executeQuery(query);
           
            
            
            
            
            
        }catch(SQLException e){
           // JOptionPane.showMessageDialog(null,"Query de pesquisa nao executada.");
        }
        conexaoSQLite.desconectar();

    }//GEN-LAST:event_btnAlterarHistActionPerformed

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
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarHist;
    private javax.swing.JButton btnAtualizarHist;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHistorico;
    private javax.swing.JRadioButton radioAnd;
    private javax.swing.JRadioButton radioTer;
    private javax.swing.JTable tblHist;
    private javax.swing.JFormattedTextField txtDataHist;
    // End of variables declaration//GEN-END:variables
}
