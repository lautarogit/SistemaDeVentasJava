package graphicInterface;

import general.*;
import interfaces.VerifyTextFields;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SaleListWindow extends javax.swing.JFrame implements VerifyTextFields 
{
    private DefaultTableModel model = new DefaultTableModel();
    private String []tableRowInfo=new String[0];
    private ProductListWindow productStockWindow = new ProductListWindow();
    private ClientListWindow clientListWindow = new ClientListWindow();
    private Product product = new Product();
    private Client client = new Client();
    private Sale sale = new Sale();
    
    public SaleListWindow()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        int  i = 0;
        int row = 0;
        
        model = (DefaultTableModel)this.jTableSales.getModel(); 
        
        jButtonAddSale.setOpaque(false);
        jButtonAddSale.setContentAreaFilled(false);
        jButtonAddSale.setBorderPainted(false);
        jButtonModifySale.setOpaque(false);
        jButtonModifySale.setContentAreaFilled(false);
        jButtonModifySale.setBorderPainted(false);
        jButtonDeleteSale.setOpaque(false);
        jButtonDeleteSale.setContentAreaFilled(false);
        jButtonDeleteSale.setBorderPainted(false);
 
        if(sale.isFileExists("sales.txt"))
        {
            sale.setSaleList(sale.readFile("sales.txt"));

            if(!sale.getSaleList().isEmpty())
            {                
                for(i=0;i<sale.getSaleList().size();i++) 
                {
                    model.addRow(tableRowInfo);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getId(), row, 0);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getProductId(), row, 1);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getClientId(), row, 2);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getDescription(), row, 3);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getPrice(), row, 4);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getQuantity(), row, 5);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getDate(), row, 6);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getPaid(), row, 7);
                    jTableSales.setValueAt(sale.getSaleList().get(i).getTotal(), row, 8);    
                    row++; 
                }
                //changeSortButtonsDisplay(true);
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneSales = new javax.swing.JScrollPane();
        jTableSales = new javax.swing.JTable();
        jButtonProductStockTable = new javax.swing.JButton();
        jButtonClientList = new javax.swing.JButton();
        jButtonAddSale = new javax.swing.JButton();
        jButtonModifySale = new javax.swing.JButton();
        jButtonDeleteSale = new javax.swing.JButton();
        jLabelTaxRate = new javax.swing.JLabel();
        jTextFieldTaxRate = new javax.swing.JTextField();
        jLabelProductId1 = new javax.swing.JLabel();
        jTextFieldProductId = new javax.swing.JTextField();
        jLabelClientId1 = new javax.swing.JLabel();
        jTextFieldClientId = new javax.swing.JTextField();
        jLabelQuantity1 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabelDate1 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelDate3 = new javax.swing.JLabel();
        jComboBoxPad = new javax.swing.JComboBox<>();
        jComboBoxPadChanged = new javax.swing.JComboBox<>();
        jLabelDate = new javax.swing.JLabel();
        jTextFieldSaleIdDeleteFunction = new javax.swing.JTextField();
        jTextFieldDateChanged = new javax.swing.JTextField();
        jLabelDate2 = new javax.swing.JLabel();
        jTextFieldQuantityChanged = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldClientIdChanged = new javax.swing.JTextField();
        jLabelClientId = new javax.swing.JLabel();
        jTextFieldProductIdChanged = new javax.swing.JTextField();
        jLabelProductId2 = new javax.swing.JLabel();
        jTextFieldSaleIdModifyFunction = new javax.swing.JTextField();
        jLabelSaleId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash register v2.0");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Producto", "ID Cliente", "Descripción", "Precio", "Cantidad", "Fecha","Pagado", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class,java.lang.String.class,java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSales.setShowGrid(true);
        jScrollPaneSales.setViewportView(jTableSales);

        getContentPane().add(jScrollPaneSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 1110, 500));

        jButtonProductStockTable.setBackground(new java.awt.Color(255, 153, 0));
        jButtonProductStockTable.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonProductStockTable.setText("Stock de productos");
        jButtonProductStockTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductStockTableActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProductStockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 30));

        jButtonClientList.setBackground(new java.awt.Color(255, 153, 0));
        jButtonClientList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonClientList.setText("Lista de clientes");
        jButtonClientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 30));

        jButtonAddSale.setBackground(new java.awt.Color(0, 255, 0));
        jButtonAddSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddNoClicked.png"))); // NOI18N
        jButtonAddSale.setToolTipText("Añadir venta");
        jButtonAddSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddSale.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddClicked.png"))); // NOI18N
        jButtonAddSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddSaleMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonAddSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 50, 50));

        jButtonModifySale.setBackground(new java.awt.Color(204, 102, 0));
        jButtonModifySale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyNoClicked.png"))); // NOI18N
        jButtonModifySale.setToolTipText("Modificar venta");
        jButtonModifySale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModifySale.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyClicked.png"))); // NOI18N
        jButtonModifySale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModifySaleMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonModifySale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, 50, 50));

        jButtonDeleteSale.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleteSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteNoClicked.png"))); // NOI18N
        jButtonDeleteSale.setToolTipText("Borrar venta");
        jButtonDeleteSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteSale.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteClicked.png"))); // NOI18N
        jButtonDeleteSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteSaleMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonDeleteSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 120, 50, 50));

        jLabelTaxRate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTaxRate.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTaxRate.setText("Tasa de impuesto");
        getContentPane().add(jLabelTaxRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 20));

        jTextFieldTaxRate.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTaxRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTaxRateKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldTaxRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 50, -1));

        jLabelProductId1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelProductId1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelProductId1.setText("ID Producto");
        getContentPane().add(jLabelProductId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 20));

        jTextFieldProductId.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProductIdKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, -1));

        jLabelClientId1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelClientId1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelClientId1.setText("ID Cliente");
        getContentPane().add(jLabelClientId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 20));

        jTextFieldClientId.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldClientId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClientIdKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldClientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));

        jLabelQuantity1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelQuantity1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelQuantity1.setText("Cantidad");
        getContentPane().add(jLabelQuantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 60, 20));

        jTextFieldQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 80, -1));

        jLabelDate1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDate1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDate1.setText("Fecha");
        getContentPane().add(jLabelDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 20));

        jTextFieldDate.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 80, -1));

        jLabelDate3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDate3.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDate3.setText("Pago");
        getContentPane().add(jLabelDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 40, 20));

        jComboBoxPad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        getContentPane().add(jComboBoxPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 60, -1));

        jComboBoxPadChanged.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        getContentPane().add(jComboBoxPadChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 60, -1));

        jLabelDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDate.setText("Pago");
        getContentPane().add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, 40, 20));

        jTextFieldSaleIdDeleteFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSaleIdDeleteFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaleIdDeleteFunctionActionPerformed(evt);
            }
        });
        jTextFieldSaleIdDeleteFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSaleIdDeleteFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldSaleIdDeleteFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, 100, -1));

        jTextFieldDateChanged.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldDateChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 100, -1));

        jLabelDate2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDate2.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDate2.setText("Fecha");
        getContentPane().add(jLabelDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 40, 20));

        jTextFieldQuantityChanged.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldQuantityChanged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityChangedKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldQuantityChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 90, -1));

        jLabelQuantity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jLabelQuantity.setText("Cantidad");
        getContentPane().add(jLabelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 60, 20));

        jTextFieldClientIdChanged.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldClientIdChanged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClientIdChangedKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldClientIdChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 90, -1));

        jLabelClientId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelClientId.setForeground(new java.awt.Color(153, 153, 153));
        jLabelClientId.setText("ID Cliente");
        getContentPane().add(jLabelClientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 70, 20));

        jTextFieldProductIdChanged.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldProductIdChanged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProductIdChangedKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldProductIdChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 90, -1));

        jLabelProductId2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelProductId2.setForeground(new java.awt.Color(153, 153, 153));
        jLabelProductId2.setText("ID Producto");
        getContentPane().add(jLabelProductId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 20));

        jTextFieldSaleIdModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSaleIdModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSaleIdModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldSaleIdModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 90, -1));

        jLabelSaleId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelSaleId.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSaleId.setText("ID Venta");
        getContentPane().add(jLabelSaleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ID Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, -1, -1));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verifyInputPrice (java.awt.event.KeyEvent evt)
    {
        int key = evt.getKeyChar();
        
        if((key>=0 && key<=45) || key>=58)
        {
            evt.consume();
        }
    }
    
    public void verifyInputNumber (java.awt.event.KeyEvent evt)
    {
        char key = evt.getKeyChar();

        if(key<'0' || key>'9')
        {
            evt.consume();
        }
    }
    
    private void jButtonProductStockTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductStockTableActionPerformed
        ProductListWindow productListWindow = new ProductListWindow();
        productListWindow.setVisible(true);
    }//GEN-LAST:event_jButtonProductStockTableActionPerformed

    private void jButtonClientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientListActionPerformed
        ClientListWindow clientListWindow = new ClientListWindow();
        clientListWindow.setVisible(true);
    }//GEN-LAST:event_jButtonClientListActionPerformed

    private void jButtonAddSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddSaleMouseClicked
        int cont=0;
        int row=0;
        int i=0;
        int productIdIndex=0;
        float taxRate=0;
        float price=0;
        float total=0;
        
        product.setProductList(product.readFile("products.txt"));
        client.setClientList(client.readFile("clients.txt"));
        sale.setProductId(Integer.parseInt(jTextFieldProductId.getText()));
        productIdIndex = product.searchProduct(sale.getProductId());
        
        if(!jTextFieldProductId.getText().isEmpty() && !jTextFieldClientId.getText().isEmpty() && !jTextFieldQuantity.getText().isEmpty() && !jTextFieldDate.getText().isEmpty()
        && !jTextFieldTaxRate.getText().isEmpty())
        {
            if((product.searchProduct(Integer.parseInt(jTextFieldProductId.getText())) == -1) && (client.searchClient(Integer.parseInt(jTextFieldClientId.getText())) == -1))
            {
                JOptionPane.showMessageDialog(null, "Los ID de cliente y producto no existen. Ingrese nuevamente");
            }
            else if((product.searchProduct(Integer.parseInt(jTextFieldProductId.getText())) != -1) && (client.searchClient(Integer.parseInt(jTextFieldClientId.getText())) == -1))
            {
                JOptionPane.showMessageDialog(null, "El ID del cliente no existe. Ingrese nuevamente");
            }
            else if((product.searchProduct(Integer.parseInt(jTextFieldProductId.getText())) == -1) && (client.searchClient(Integer.parseInt(jTextFieldClientId.getText())) != -1))
            {
                JOptionPane.showMessageDialog(null, "El ID del producto no existe. Ingrese nuevamente");
            }
            else
            {
                if((Integer.parseInt(jTextFieldQuantity.getText()) <= product.getProductList().get(productIdIndex).getQuantity()) 
                && product.getProductList().get(productIdIndex).getQuantity()>0 && Integer.parseInt(jTextFieldQuantity.getText())>0)
                {
                    taxRate = (Float.parseFloat(jTextFieldTaxRate.getText()) / 100) + 1;
                    taxRate = Math.round(taxRate*100)/100f;
                    price = product.getProductList().get(productIdIndex).getPrice() * taxRate;
                    total = price * Integer.parseInt(jTextFieldQuantity.getText());
                    total = Math.round(total*100)/100f;
                    sale.setClientId(Integer.parseInt(jTextFieldClientId.getText()));
                    sale.setQuantity(Integer.parseInt(jTextFieldQuantity.getText()));
                    i = product.getProductList().get(productIdIndex).getQuantity() - sale.getQuantity();
                    product.getProductList().get(productIdIndex).setQuantity(i);
                    sale.setQuantity(Integer.parseInt(jTextFieldQuantity.getText()));
                    sale.setPaid((String)jComboBoxPad.getSelectedItem());
                    sale.setDescription(product.getProductList().get(productIdIndex).getName());
                    sale.setPrice(price);
                    sale.setTotal(total);
                    sale.setDate((jTextFieldDate.getText()));
                    sale.AddToSaleList(sale);
                    sale.writeFile("sales.txt");
                    product.writeFile("products.txt"); 

                    if(!sale.getSaleList().isEmpty())
                    {
                        sale.setSaleList(sale.readFile("sales.txt"));          
                        i = sale.getSaleList().size() - 1;
                        row = i;

                        while(sale.searchSale(i+cont) != -1)
                        {
                            cont++;
                        }
                        sale.getSaleList().get(i).setId(i+cont);

                        model.addRow(tableRowInfo);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getId(), row, 0);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getProductId(), row, 1);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getClientId(), row, 2);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getDescription(), row, 3);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getPrice(), row, 4);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getQuantity(), row, 5);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getDate(), row, 6);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getPaid(), row, 7);
                        jTableSales.setValueAt(sale.getSaleList().get(i).getTotal(), row, 8);
                        //changeSortButtonsDisplay(true);
                    }
                    sale.writeFile("sales.txt");
                    clearJTextFields();  
                }
                else if(Integer.parseInt(jTextFieldQuantity.getText()) > product.getProductList().get(productIdIndex).getQuantity() 
                && product.getProductList().get(productIdIndex).getQuantity()>0)
                {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada supera la cantidad que hay en stock de "+product.getProductList().get(productIdIndex).getName());
                }
                else if(Integer.parseInt(jTextFieldQuantity.getText())<1 && product.getProductList().get(productIdIndex).getQuantity()>0)
                {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada no puede ser menor que 1");
                }
                else if(product.getProductList().get(productIdIndex).getQuantity()<1)
                {
                    JOptionPane.showMessageDialog(null, "No hay stock de "+product.getProductList().get(productIdIndex).getName());
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonAddSaleMouseClicked

    private void jButtonModifySaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModifySaleMouseClicked
        Sale aux = new Sale();
        int saleListIndex=0;
        int id=0;
        int row=0;
        int productIdIndex=0;
        int aux1 = 0;
        product.setProductList(product.readFile("products.txt"));
        client.setClientList(client.readFile("clients.txt"));
        sale.setSaleList(sale.readFile("sales.txt"));

        if(!jTextFieldProductIdChanged.getText().isEmpty() && !jTextFieldClientIdChanged.getText().isEmpty() 
        && !jTextFieldQuantityChanged.getText().isEmpty() && !jTextFieldSaleIdModifyFunction.getText().isEmpty()
        && !jTextFieldDateChanged.getText().isEmpty() && jButtonModifySale.isEnabled())
        {
            if(product.searchProduct(Integer.parseInt(jTextFieldProductIdChanged.getText())) != -1 
            && client.searchClient(Integer.parseInt(jTextFieldClientIdChanged.getText())) != -1)
            {
                //Collections.sort(product.getProductList(), new SortProductIdLowToHigh());
                //refreshTableProductStock();

                //product.setProductList(product.readFile("products.txt"));
                id=Integer.parseInt(jTextFieldSaleIdModifyFunction.getText());
                saleListIndex = sale.searchSale(id);
                productIdIndex = product.searchProduct(id);

                if(saleListIndex!=-1)
                {
                    aux.setId(id);
                    aux.setProductId(Integer.parseInt(jTextFieldProductIdChanged.getText()));
                    aux.setClientId(Integer.parseInt(jTextFieldClientIdChanged.getText()));
                    aux.setPrice(product.getProductList().get(productIdIndex).getPrice());
                    aux.setQuantity(Integer.parseInt(jTextFieldQuantityChanged.getText())); 
                    aux.setPaid((String)jComboBoxPadChanged.getSelectedItem());
                    aux.setDescription(product.getProductList().get(productIdIndex).getName());
                    aux.setDate(jTextFieldDateChanged.getText());
                    aux.setTotal(product.getProductList().get(productIdIndex).getPrice() * aux.getQuantity());
                    aux1 = product.getProductList().get(productIdIndex).getQuantity() + sale.getSaleList().get(saleListIndex).getQuantity();;
                    product.getProductList().get(productIdIndex).setQuantity(aux1 - aux.getQuantity());
                    sale.replaceSale(aux, saleListIndex);
                    sale.getSaleList().get(saleListIndex).setId(id);

                } 
                else
                {
                    JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente"); 
                }

                if(!sale.getSaleList().isEmpty() && saleListIndex!=-1)
                {
                    row=saleListIndex;

                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getId(), row, 0);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getProductId(), row, 1);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getClientId(), row, 2);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getDescription(), row, 3);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getPrice(), row, 4);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getQuantity(), row, 5);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getDate(), row, 6);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getPaid(), row, 7);
                    jTableSales.setValueAt(sale.getSaleList().get(saleListIndex).getTotal(), row, 8);

                }
                sale.writeFile("sales.txt");
                product.writeFile("products.txt");
                client.writeFile("clients.txt");
                clearJTextFields(); 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ID producto/cliente incorrectos");
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }

    }//GEN-LAST:event_jButtonModifySaleMouseClicked

    private void jButtonDeleteSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteSaleMouseClicked
        int id=0;
        int posSearched=0;
        int confirmDialogOption=0;
        int add=0;
        int pos=0;
        int quantityAux=0;
        
        if(!jTextFieldSaleIdDeleteFunction.getText().isEmpty() && jButtonDeleteSale.isEnabled())
        {    
            product.setProductList(product.readFile("products.txt"));
            sale.setSaleList(sale.readFile("sales.txt"));
            id=Integer.parseInt(jTextFieldSaleIdDeleteFunction.getText());
            posSearched= sale.searchSale(id);
            
            if(posSearched!=-1)
            {  
                //changeSortButtonsDisplay(false);    
                confirmDialogOption = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar la Venta del ID "+id+"?");
            
                if(confirmDialogOption==0)
                {   
                    quantityAux = sale.getSaleList().get(posSearched).getQuantity();
                    pos = product.searchProduct(sale.getSaleList().get(posSearched).getProductId());
                    add = product.getProductList().get(pos).getQuantity();
                    product.getProductList().get(pos).setQuantity(quantityAux + add);
                    
                    if(!sale.getSaleList().isEmpty())
                    {
                        if(id==sale.getSaleList().get(posSearched).getId())
                        {
                            sale.deleteSale(posSearched);

                            if(sale.getSaleList().size()<1)
                            {
                                //changeSortButtonsDisplay(false);
                            }
                            product.writeFile("products.txt");
                            sale.writeFile("sales.txt");
                            model.removeRow(posSearched);
                        }   
                    }
                    // refreshTableProductStock();
                    clearJTextFields();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente"); 
                jTextFieldSaleIdDeleteFunction.setText("");
            }
            //changeSortButtonsDisplay(true); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonDeleteSaleMouseClicked

    private void jTextFieldSaleIdDeleteFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaleIdDeleteFunctionActionPerformed
      
    }//GEN-LAST:event_jTextFieldSaleIdDeleteFunctionActionPerformed

    private void jTextFieldProductIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductIdKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldProductIdKeyTyped

    private void jTextFieldClientIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientIdKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldClientIdKeyTyped

    private void jTextFieldQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldQuantityKeyTyped

    private void jTextFieldSaleIdModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaleIdModifyFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldSaleIdModifyFunctionKeyTyped

    private void jTextFieldProductIdChangedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductIdChangedKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldProductIdChangedKeyTyped

    private void jTextFieldClientIdChangedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientIdChangedKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldClientIdChangedKeyTyped

    private void jTextFieldQuantityChangedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityChangedKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldQuantityChangedKeyTyped

    private void jTextFieldSaleIdDeleteFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaleIdDeleteFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldSaleIdDeleteFunctionKeyTyped

    private void jTextFieldTaxRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTaxRateKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldTaxRateKeyTyped
    
    @Override
    public void clearJTextFields ()
    {
       jTextFieldProductId.setText("");
       jTextFieldClientId.setText("");
       jTextFieldQuantity.setText("");
       jTextFieldDate.setText("");
       jTextFieldProductIdChanged.setText("");
       jTextFieldClientIdChanged.setText("");
       jTextFieldQuantityChanged.setText("");
       jTextFieldDateChanged.setText("");
       jTextFieldSaleIdDeleteFunction.setText("");
       jTextFieldSaleIdModifyFunction.setText("");
    }
    
    public void addDatasToTableSales ()
    {  
        int row=0;
        for(int i=0;i<sale.getSaleList().size();i++) 
        {
            model.addRow(tableRowInfo);
                jTableSales.setValueAt(sale.getSaleList().get(i).getId(), row, 0);
                jTableSales.setValueAt(sale.getSaleList().get(i).getProductId(), row, 1);
                jTableSales.setValueAt(sale.getSaleList().get(i).getClientId(), row, 2);
                jTableSales.setValueAt(sale.getSaleList().get(i).getDescription(), row, 3);
                jTableSales.setValueAt(sale.getSaleList().get(i).getPrice(), row, 4);
                jTableSales.setValueAt(sale.getSaleList().get(i).getQuantity(), row, 5);
                jTableSales.setValueAt(sale.getSaleList().get(i).getDate(), row, 6);
                jTableSales.setValueAt(sale.getSaleList().get(i).getPaid(), row, 7);
                jTableSales.setValueAt(sale.getSaleList().get(i).getTotal(), row, 8);
            row++; 
        } 
    }
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(SaleListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() 
            {
                new SaleListWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddSale;
    private javax.swing.JButton jButtonClientList;
    private javax.swing.JButton jButtonDeleteSale;
    private javax.swing.JButton jButtonModifySale;
    private javax.swing.JButton jButtonProductStockTable;
    private javax.swing.JComboBox<String> jComboBoxPad;
    private javax.swing.JComboBox<String> jComboBoxPadChanged;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClientId;
    private javax.swing.JLabel jLabelClientId1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDate1;
    private javax.swing.JLabel jLabelDate2;
    private javax.swing.JLabel jLabelDate3;
    private javax.swing.JLabel jLabelProductId1;
    private javax.swing.JLabel jLabelProductId2;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelQuantity1;
    private javax.swing.JLabel jLabelSaleId;
    private javax.swing.JLabel jLabelTaxRate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPaneSales;
    private javax.swing.JTable jTableSales;
    private javax.swing.JTextField jTextFieldClientId;
    private javax.swing.JTextField jTextFieldClientIdChanged;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldDateChanged;
    private javax.swing.JTextField jTextFieldProductId;
    private javax.swing.JTextField jTextFieldProductIdChanged;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldQuantityChanged;
    private javax.swing.JTextField jTextFieldSaleIdDeleteFunction;
    private javax.swing.JTextField jTextFieldSaleIdModifyFunction;
    private javax.swing.JTextField jTextFieldTaxRate;
    // End of variables declaration//GEN-END:variables
}
