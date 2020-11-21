package graphicInterface;

import general.Product;
import javax.swing.table.DefaultTableModel;

public class BackupProductListWindow extends javax.swing.JFrame 
{
    private DefaultTableModel model = new DefaultTableModel();
    private String []tableRowInfo=new String[0];
    private Product productDeleted = new Product();
   
    public BackupProductListWindow() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        int row=0;
        int i=0;   
        
        model = (DefaultTableModel)jTableBackupProductList.getModel();
        
        jButtonRecoverProduct.setOpaque(false);
        jButtonRecoverProduct.setContentAreaFilled(false);
        jButtonRecoverProduct.setBorderPainted(false);
            
        if(productDeleted.isFileExists("productsBackup.txt"))
        {
            System.out.println("entra file exists");
            
            productDeleted.setProductList(productDeleted.readFile("productsBackup.txt"));
            
            if(!productDeleted.getProductList().isEmpty())
            {
                System.out.println("entra empty");
                for(i=0;i<productDeleted.getProductList().size();i++) 
                {
                    System.out.println("for #"+i);
                    model.addRow(tableRowInfo);
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getId(), row, 0); 
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getName(), row, 1);
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getPrice(), row, 2);
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getQuantity(), row, 3);
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getStock(), row, 4);
                    jTableBackupProductList.setValueAt(productDeleted.getProductList().get(i).getState(), row, 5);
                    row++; 
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneBackupProductList = new javax.swing.JScrollPane();
        jTableBackupProductList = new javax.swing.JTable();
        jButtonRecoverProduct = new javax.swing.JButton();
        jLabelProductId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelRecover = new javax.swing.JLabel();
        jLabelProduct = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de productos eliminados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneBackupProductList.setBackground(new java.awt.Color(59, 58, 58));
        jScrollPaneBackupProductList.setForeground(new java.awt.Color(59, 58, 58));

        jTableBackupProductList.setBackground(new java.awt.Color(59, 58, 58));
        jTableBackupProductList.setForeground(new java.awt.Color(153, 153, 153));
        jTableBackupProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Cantidad", "Stock", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBackupProductList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableBackupProductList.setSelectionBackground(new java.awt.Color(59, 58, 58));
        jTableBackupProductList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableBackupProductList.setShowGrid(true);
        jScrollPaneBackupProductList.setViewportView(jTableBackupProductList);

        getContentPane().add(jScrollPaneBackupProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 680, 320));

        jButtonRecoverProduct.setBackground(new java.awt.Color(255, 0, 0));
        jButtonRecoverProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecoverNoClicked.png"))); // NOI18N
        jButtonRecoverProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecoverProduct.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecoverClicked.png"))); // NOI18N
        jButtonRecoverProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRecoverProductMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonRecoverProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 50));

        jLabelProductId.setText("ID Producto");
        getContentPane().add(jLabelProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabelRecover.setText("Recuperar");
        getContentPane().add(jLabelRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabelProduct.setText("producto");
        getContentPane().add(jLabelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRecoverProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRecoverProductMouseClicked
        
    }//GEN-LAST:event_jButtonRecoverProductMouseClicked
  
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
            java.util.logging.Logger.getLogger(BackupProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupProductListWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRecoverProduct;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelProductId;
    private javax.swing.JLabel jLabelRecover;
    private javax.swing.JScrollPane jScrollPaneBackupProductList;
    private javax.swing.JTable jTableBackupProductList;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
