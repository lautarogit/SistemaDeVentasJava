package graphicInterface;

import productarraylistsorts.*;
import general.Product;
import interfaces.Generals;
import interfaces.VerifyTextFields;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductListWindow extends javax.swing.JFrame implements Generals, VerifyTextFields 
{
    private DefaultTableModel model = new DefaultTableModel();
    private String []tableRowInfo=new String[0];
    private Product product = new Product();
    private Product productDeleted = new Product();
    private int sortIdTurn=0;
    private int sortPriceTurn=0; 
    private int sortQuantityTurn=0;
    private int sortNameTurn=0;
    private int sortStockState=0;
    private int sortStateTurn=0;
    private int saveFileTurn=0;
    
    public ProductListWindow() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        int row=0;
        int i=0;
        int productListDimension=0;
        
        model = (DefaultTableModel)jTableProductList.getModel();
        
        jButtonColorChooserTableBackground.setOpaque(false);
        jButtonColorChooserTableBackground.setContentAreaFilled(false);
        jButtonColorChooserTableBackground.setBorderPainted(false);
        jButtonColorChooserTableForeground.setOpaque(false);
        jButtonColorChooserTableForeground.setContentAreaFilled(false);
        jButtonColorChooserTableForeground.setBorderPainted(false);
        jDesktopPaneColorChooserBackground.setVisible(false);
        jColorChooserTableBackground.setVisible(false);
        jDesktopPaneColorChooserForeground.setVisible(false);
        jColorChooserTableForeground.setVisible(false);
        
        jButtonColorChooserBackgroundOK.setVisible(false);
        jButtonColorChooserForegroundOK.setVisible(false);
   
        jButtonAddProduct.setOpaque(false);
        jButtonAddProduct.setContentAreaFilled(false);
        jButtonAddProduct.setBorderPainted(false);
        jButtonModifyProduct.setOpaque(false);
        jButtonModifyProduct.setContentAreaFilled(false);
        jButtonModifyProduct.setBorderPainted(false);
        jButtonDeleteProduct.setOpaque(false);
        jButtonDeleteProduct.setContentAreaFilled(false);
        jButtonDeleteProduct.setBorderPainted(false);
        jButtonDeleteProductList.setOpaque(false);
        jButtonDeleteProductList.setContentAreaFilled(false);
        jButtonDeleteProductList.setBorderPainted(false);
        jButtonBackupList.setOpaque(false);
        jButtonBackupList.setContentAreaFilled(false);
        jButtonBackupList.setBorderPainted(false);
        
        jButtonSaveFile.setEnabled(false);
        jButtonSaveFile.setOpaque(false);
        jButtonSaveFile.setContentAreaFilled(false);
        jButtonSaveFile.setBorderPainted(false);
        
        changeSortButtonsDisplay(false);
 
        if(product.isFileExists("products.txt"))
        {
            product.setProductList(product.readFile("products.txt"));

            if(!product.getProductList().isEmpty())
            {
                productListDimension = product.getProductList().size();
                
                for(i=0;i<productListDimension;i++) 
                {
                    model.addRow(tableRowInfo);
                    jTableProductList.setValueAt(product.getProductList().get(i).getId(), row, 0);
                    jTableProductList.setValueAt(product.getProductList().get(i).getName(), row, 1);
                    jTableProductList.setValueAt(product.getProductList().get(i).getPrice(), row, 2);
                    jTableProductList.setValueAt(product.getProductList().get(i).getQuantity(), row, 3);
                    jTableProductList.setValueAt(product.getProductList().get(i).getStock(), row, 4);
                    jTableProductList.setValueAt(product.getProductList().get(i).getState(), row, 5);
                    row++; 
                }
                changeSortButtonsDisplay(true);
            }
        }
        else
        {
            jButtonModifyProduct.setEnabled(false);
            jButtonDeleteProduct.setEnabled(false);
            jButtonDeleteProductList.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonColorChooserBackgroundOK = new javax.swing.JToggleButton();
        jButtonColorChooserForegroundOK = new javax.swing.JToggleButton();
        jDesktopPaneColorChooserBackground = new javax.swing.JDesktopPane();
        jColorChooserTableBackground = new javax.swing.JColorChooser();
        jDesktopPaneColorChooserForeground = new javax.swing.JDesktopPane();
        jColorChooserTableForeground = new javax.swing.JColorChooser();
        jScrollPaneProductList = new javax.swing.JScrollPane();
        jTableProductList = new javax.swing.JTable();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jTextFieldExplorer = new javax.swing.JTextField();
        jLabelState = new javax.swing.JLabel();
        jComboBoxState = new javax.swing.JComboBox<>();
        jLabelProductIdModifiyFunction = new javax.swing.JLabel();
        jTextFieldIdModifyFunction = new javax.swing.JTextField();
        jLabelNameModifyFunction = new javax.swing.JLabel();
        jTextFieldNameModifyFunction = new javax.swing.JTextField();
        jLabelPriceModifyFunction = new javax.swing.JLabel();
        jTextFieldPriceModifyFunction = new javax.swing.JTextField();
        jLabelQuantityModifyFunction = new javax.swing.JLabel();
        jTextFieldQuantityModifyFunction = new javax.swing.JTextField();
        jLabelStateModifyFunction = new javax.swing.JLabel();
        jComboBoxStateModifyFunction = new javax.swing.JComboBox<>();
        jLabelProductIdDeleteFunction = new javax.swing.JLabel();
        jTextFieldIdDeleteFunction = new javax.swing.JTextField();
        jButtonAddProduct = new javax.swing.JButton();
        jButtonModifyProduct = new javax.swing.JButton();
        jButtonDeleteProduct = new javax.swing.JButton();
        jButtonDeleteProductList = new javax.swing.JButton();
        jButtonBackupList = new javax.swing.JButton();
        jLabelTableColors = new javax.swing.JLabel();
        jLabelTableBackgroundColor = new javax.swing.JLabel();
        jLabelTableForegroundColor = new javax.swing.JLabel();
        jLabelSortCritery = new javax.swing.JLabel();
        jButtonColorChooserTableBackground = new javax.swing.JButton();
        jButtonColorChooserTableForeground = new javax.swing.JButton();
        jButtonIdSort = new javax.swing.JToggleButton();
        jButtonPriceSort = new javax.swing.JToggleButton();
        jButtonQuantitySort = new javax.swing.JToggleButton();
        jButtonNameSort = new javax.swing.JToggleButton();
        jButtonStockSort = new javax.swing.JToggleButton();
        jButtonStateSort = new javax.swing.JToggleButton();
        jButtonSaveFile = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock de productos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonColorChooserBackgroundOK.setBackground(new java.awt.Color(59, 58, 58));
        jButtonColorChooserBackgroundOK.setText("OK");
        jButtonColorChooserBackgroundOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorChooserBackgroundOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColorChooserBackgroundOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 50, 40));

        jButtonColorChooserForegroundOK.setBackground(new java.awt.Color(59, 58, 58));
        jButtonColorChooserForegroundOK.setText("OK");
        jButtonColorChooserForegroundOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorChooserForegroundOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColorChooserForegroundOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 50, 40));

        jDesktopPaneColorChooserBackground.setBackground(new java.awt.Color(59, 58, 58));
        jDesktopPaneColorChooserBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jColorChooserTableBackground.setBackground(new java.awt.Color(59, 58, 58));
        jDesktopPaneColorChooserBackground.add(jColorChooserTableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 230));

        getContentPane().add(jDesktopPaneColorChooserBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 430, -1));

        jDesktopPaneColorChooserForeground.setBackground(new java.awt.Color(59, 58, 58));

        jColorChooserTableForeground.setBackground(new java.awt.Color(59, 58, 58));
        jDesktopPaneColorChooserForeground.add(jColorChooserTableForeground);
        jColorChooserTableForeground.setBounds(0, 0, 430, 230);

        getContentPane().add(jDesktopPaneColorChooserForeground, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 430, 230));

        jScrollPaneProductList.setBackground(new java.awt.Color(59, 58, 58));
        jScrollPaneProductList.setForeground(new java.awt.Color(59, 58, 58));

        jTableProductList.setBackground(new java.awt.Color(59, 58, 58));
        jTableProductList.setForeground(new java.awt.Color(153, 153, 153));
        jTableProductList.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProductList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableProductList.setSelectionBackground(new java.awt.Color(59, 58, 58));
        jTableProductList.setShowGrid(true);
        jScrollPaneProductList.setViewportView(jTableProductList);

        getContentPane().add(jScrollPaneProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 830, 370));

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(153, 153, 153));
        jLabelName.setText("Nombre");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 20));

        jTextFieldName.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, -1));

        jLabelPrice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPrice.setText("Precio");
        getContentPane().add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 40, 20));

        jTextFieldPrice.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPriceKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 150, -1));

        jLabelQuantity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jLabelQuantity.setText("Cantidad");
        getContentPane().add(jLabelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 60, 20));

        jTextFieldQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 150, -1));

        jTextFieldExplorer.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldExplorer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldExplorerKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldExplorer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 230, -1));

        jLabelState.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelState.setForeground(new java.awt.Color(153, 153, 153));
        jLabelState.setText("Estado");
        getContentPane().add(jLabelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 50, 20));

        jComboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja" }));
        getContentPane().add(jComboBoxState, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 60, -1));

        jLabelProductIdModifiyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelProductIdModifiyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelProductIdModifiyFunction.setText("ID Producto");
        getContentPane().add(jLabelProductIdModifiyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 20));

        jTextFieldIdModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldIdModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, -1));

        jLabelNameModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelNameModifyFunction.setText("Nombre");
        getContentPane().add(jLabelNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, 20));

        jTextFieldNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, -1));

        jLabelPriceModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelPriceModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelPriceModifyFunction.setText("Precio");
        getContentPane().add(jLabelPriceModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 40, 20));

        jTextFieldPriceModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPriceModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPriceModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldPriceModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        jLabelQuantityModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelQuantityModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelQuantityModifyFunction.setText("Cantidad");
        getContentPane().add(jLabelQuantityModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 60, 20));

        jTextFieldQuantityModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldQuantityModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldQuantityModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 80, -1));

        jLabelStateModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelStateModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelStateModifyFunction.setText("Estado");
        getContentPane().add(jLabelStateModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 50, 20));

        jComboBoxStateModifyFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja" }));
        getContentPane().add(jComboBoxStateModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 60, -1));

        jLabelProductIdDeleteFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelProductIdDeleteFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelProductIdDeleteFunction.setText("ID Producto");
        getContentPane().add(jLabelProductIdDeleteFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, 20));

        jTextFieldIdDeleteFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldIdDeleteFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdDeleteFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdDeleteFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 90, -1));

        jButtonAddProduct.setBackground(new java.awt.Color(0, 255, 0));
        jButtonAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddNoClicked.png"))); // NOI18N
        jButtonAddProduct.setToolTipText("Añadir producto");
        jButtonAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddProduct.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddClicked.png"))); // NOI18N
        jButtonAddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddProductMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 50));

        jButtonModifyProduct.setBackground(new java.awt.Color(204, 102, 0));
        jButtonModifyProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyNoClicked.png"))); // NOI18N
        jButtonModifyProduct.setToolTipText("Modificar producto");
        jButtonModifyProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModifyProduct.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyClicked.png"))); // NOI18N
        jButtonModifyProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModifyProductMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonModifyProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 50, 50));

        jButtonDeleteProduct.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteNoClicked.png"))); // NOI18N
        jButtonDeleteProduct.setToolTipText("Borrar producto");
        jButtonDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteProduct.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteClicked.png"))); // NOI18N
        jButtonDeleteProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteProductMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 50, 50));

        jButtonDeleteProductList.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleteProductList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteAllNoClicked.png"))); // NOI18N
        jButtonDeleteProductList.setToolTipText("Borrar todos los productos");
        jButtonDeleteProductList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteProductList.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteAllClicked.png"))); // NOI18N
        jButtonDeleteProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteProductListMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonDeleteProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 50, 50));

        jButtonBackupList.setBackground(new java.awt.Color(255, 0, 0));
        jButtonBackupList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackupListNoClicked.png"))); // NOI18N
        jButtonBackupList.setToolTipText("Mostrar lista de productos borrados");
        jButtonBackupList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBackupList.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackupListClicked.png"))); // NOI18N
        jButtonBackupList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackupListMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonBackupList, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 50, 50));

        jLabelTableColors.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTableColors.setText("Colores de la tabla");
        getContentPane().add(jLabelTableColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 20));

        jLabelTableBackgroundColor.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTableBackgroundColor.setText("Color de fondo");
        getContentPane().add(jLabelTableBackgroundColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, 20));

        jLabelTableForegroundColor.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTableForegroundColor.setText("Color de letras");
        getContentPane().add(jLabelTableForegroundColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 90, 20));

        jLabelSortCritery.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSortCritery.setText("Criterio de ordenacion");
        getContentPane().add(jLabelSortCritery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jButtonColorChooserTableBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ColorChooserNoClicked.png"))); // NOI18N
        jButtonColorChooserTableBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonColorChooserTableBackground.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ColorChooserClicked.png"))); // NOI18N
        jButtonColorChooserTableBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorChooserTableBackgroundActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColorChooserTableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 30, 30));

        jButtonColorChooserTableForeground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ColorChooserNoClicked.png"))); // NOI18N
        jButtonColorChooserTableForeground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonColorChooserTableForeground.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ColorChooserClicked.png"))); // NOI18N
        jButtonColorChooserTableForeground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorChooserTableForegroundActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColorChooserTableForeground, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 30, 30));

        jButtonIdSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonIdSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonIdSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonIdSort.setText("ID");
        jButtonIdSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIdSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIdSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, -1));

        jButtonPriceSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonPriceSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonPriceSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonPriceSort.setText("Precio");
        jButtonPriceSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPriceSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPriceSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPriceSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        jButtonQuantitySort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonQuantitySort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonQuantitySort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonQuantitySort.setText("Cantidad");
        jButtonQuantitySort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQuantitySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuantitySortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuantitySort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jButtonNameSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonNameSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonNameSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonNameSort.setText("Nombre");
        jButtonNameSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNameSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNameSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        jButtonStockSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonStockSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonStockSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonStockSort.setText("Stock");
        jButtonStockSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStockSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStockSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStockSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        jButtonStateSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonStateSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonStateSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonStateSort.setText("Estado");
        jButtonStateSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStateSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStateSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStateSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 30));

        jButtonSaveFile.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FileNoClicked.png"))); // NOI18N
        jButtonSaveFile.setToolTipText("Guardar criterio de ordenación");
        jButtonSaveFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaveFile.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FileClicked.png"))); // NOI18N
        jButtonSaveFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveFileMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSaveFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 60));

        jLabelBackground.setBackground(new java.awt.Color(59, 58, 58));
        jLabelBackground.setForeground(new java.awt.Color(59, 58, 58));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackgroundBlueLines.png"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    
    private void jButtonAddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddProductMouseClicked
        int cont=0;
        int lastIndex=0;
        int row=0;

        if(!jTextFieldName.getText().isEmpty() && jTextFieldName.getText()!=" " && !jTextFieldPrice.getText().isEmpty() && !jTextFieldQuantity.getText().isEmpty())
        {
            product.setName(jTextFieldName.getText());
            product.setPrice(Float.parseFloat(jTextFieldPrice.getText()));
            product.setQuantity(Integer.parseInt(jTextFieldQuantity.getText()));
            product.setStock(product.getQuantity()); 
            product.setState((String)jComboBoxState.getSelectedItem());
            product.addToProductList(product);
            product.writeFile("products.txt");
            
            if(!product.getProductList().isEmpty())
            {
                product.setProductList(product.readFile("products.txt"));
                lastIndex=product.getProductList().size()-1;
                row=lastIndex;

                while(product.searchProduct(lastIndex+cont) != -1)
                {
                    cont++;
                }
                product.getProductList().get(lastIndex).setId(lastIndex+cont);

                model.addRow(tableRowInfo);
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getId(), row, 0); 
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getName(), row, 1);
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getPrice(), row, 2);
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getQuantity(), row, 3);
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getStock(), row, 4);
                jTableProductList.setValueAt(product.getProductList().get(lastIndex).getState(), row, 5); 
                refreshTableProductStock();
                jButtonModifyProduct.setEnabled(true);
                jButtonDeleteProduct.setEnabled(true);
                jButtonDeleteProductList.setEnabled(true);
                changeSortButtonsDisplay(true);
            }
            product.writeFile("products.txt");
            clearJTextFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonAddProductMouseClicked
  
    private void jTextFieldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPriceKeyTyped
        verifyInputPrice(evt);
    }//GEN-LAST:event_jTextFieldPriceKeyTyped

    private void jTextFieldQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldQuantityKeyTyped

    private void jButtonModifyProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModifyProductMouseClicked
        Product productAux = new Product();
        int index=0;
        int id=0;
        int row=0;
        
        if(jButtonModifyProduct.isEnabled() && !jTextFieldNameModifyFunction.getText().isEmpty() && !jTextFieldPriceModifyFunction.getText().isEmpty() 
        && !jTextFieldQuantityModifyFunction.getText().isEmpty() && !jTextFieldIdModifyFunction.getText().isEmpty())
        {
            Collections.sort(product.getProductList(), new SortProductIdLowToHigh());
            refreshTableProductStock();
            
            product.setProductList(product.readFile("products.txt"));
            id=Integer.parseInt(jTextFieldIdModifyFunction.getText());
            index = product.searchProduct(id);
            
            if(index!=-1)
            {
                productAux.setId(id);
                productAux.setName(jTextFieldNameModifyFunction.getText());
                productAux.setPrice(Float.parseFloat(jTextFieldPriceModifyFunction.getText()));
                productAux.setQuantity(Integer.parseInt(jTextFieldQuantityModifyFunction.getText()));
                productAux.setStock(productAux.getQuantity()); 
                productAux.setState((String)jComboBoxStateModifyFunction.getSelectedItem());
                product.replaceProduct(productAux, index);
                product.getProductList().get(index).setId(id);
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente"); 
                jTextFieldIdModifyFunction.setText("");
            }
            
            if(!product.getProductList().isEmpty() && index!=-1)
            {
                row=index;
                jTableProductList.setValueAt(productAux.getId(), row, 0); 
                jTableProductList.setValueAt(productAux.getName(), row, 1);
                jTableProductList.setValueAt(productAux.getPrice(), row, 2);
                jTableProductList.setValueAt(productAux.getQuantity(), row, 3);
                jTableProductList.setValueAt(productAux.getStock(), row, 4);
                jTableProductList.setValueAt(productAux.getState(), row, 5);
            }
            
            if(product.getProductList().isEmpty())
            {
                jButtonModifyProduct.setEnabled(false);
                jButtonDeleteProduct.setEnabled(false);
                jButtonDeleteProductList.setEnabled(false);
            }
            product.writeFile("products.txt");
            clearJTextFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonModifyProductMouseClicked

    private void jButtonDeleteProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteProductMouseClicked
        int id=0;
        int posSearched=0;
        int confirmDialogOption=0;
        
        if(jButtonDeleteProduct.isEnabled() && !jTextFieldIdDeleteFunction.getText().isEmpty())
        {
            Collections.sort(product.getProductList(), new SortProductIdLowToHigh());    
            refreshTableProductStock();
           
            product.setProductList(product.readFile("products.txt"));
            productDeleted.setProductList(productDeleted.readFile("productsBackup.txt"));
            id=Integer.parseInt(jTextFieldIdDeleteFunction.getText());
            posSearched= product.searchProduct(id);
            
            if(posSearched!=-1)
            {  
                changeSortButtonsDisplay(false);    
                confirmDialogOption = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar el producto de ID "+id+"?");
            
                if(confirmDialogOption==0)
                {              
                    if(!product.getProductList().isEmpty())
                    {
                        if(id==product.getProductList().get(posSearched).getId())
                        {
                            productDeleted.addToProductList(product.getProductList().get(posSearched));
                            product.deleteProduct(posSearched);
                            productDeleted.writeFile("productsBackup.txt");
                            product.writeFile("products.txt");
                            model.removeRow(posSearched);
                        }   
                    }
                    refreshTableProductStock();
                    clearJTextFields();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente"); 
                jTextFieldIdDeleteFunction.setText("");
            }
            changeSortButtonsDisplay(true); 
            if(product.getProductList().isEmpty())
            {
                changeSortButtonsDisplay(false);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonDeleteProductMouseClicked

    private void jTextFieldPriceModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPriceModifyFunctionKeyTyped
        verifyInputPrice(evt);
    }//GEN-LAST:event_jTextFieldPriceModifyFunctionKeyTyped

    private void jTextFieldQuantityModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityModifyFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldQuantityModifyFunctionKeyTyped

    private void jTextFieldIdModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdModifyFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldIdModifyFunctionKeyTyped

    private void jTextFieldIdDeleteFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdDeleteFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldIdDeleteFunctionKeyTyped

    private void jButtonColorChooserTableBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserTableBackgroundActionPerformed
        if(!jDesktopPaneColorChooserForeground.isVisible() && !jDesktopPaneColorChooserBackground.isVisible())
        {
            jDesktopPaneColorChooserBackground.setVisible(true);
            jColorChooserTableBackground.setVisible(true);
            jButtonColorChooserBackgroundOK.setVisible(true); 
        }
        else
        {
            jDesktopPaneColorChooserBackground.setVisible(false);
            jColorChooserTableBackground.setVisible(false);
            jButtonColorChooserBackgroundOK.setVisible(false);
        }
    }//GEN-LAST:event_jButtonColorChooserTableBackgroundActionPerformed

    private void jButtonColorChooserTableForegroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserTableForegroundActionPerformed
        if(!jDesktopPaneColorChooserBackground.isVisible() && !jDesktopPaneColorChooserForeground.isVisible())
        {
            jDesktopPaneColorChooserForeground.setVisible(true);
            jColorChooserTableForeground.setVisible(true);
            jButtonColorChooserForegroundOK.setVisible(true);
        }
        else
        {
            jDesktopPaneColorChooserForeground.setVisible(false);
            jColorChooserTableForeground.setVisible(false);
            jButtonColorChooserForegroundOK.setVisible(false);
        }
    }//GEN-LAST:event_jButtonColorChooserTableForegroundActionPerformed

    private void jButtonColorChooserForegroundOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserForegroundOKActionPerformed
        jDesktopPaneColorChooserForeground.setVisible(false);
        jColorChooserTableForeground.setVisible(false);
        jButtonColorChooserForegroundOK.setVisible(false);
        jTableProductList.setForeground(jColorChooserTableForeground.getColor());
    }//GEN-LAST:event_jButtonColorChooserForegroundOKActionPerformed

    private void jButtonColorChooserBackgroundOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserBackgroundOKActionPerformed
        jDesktopPaneColorChooserBackground.setVisible(false);
        jColorChooserTableBackground.setVisible(false);
        jButtonColorChooserBackgroundOK.setVisible(false);
        jTableProductList.setBackground(jColorChooserTableBackground.getColor());
    }//GEN-LAST:event_jButtonColorChooserBackgroundOKActionPerformed

    private void jButtonIdSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdSortActionPerformed
        
        if(sortIdTurn==0)
        {
           Collections.sort(product.getProductList(), new SortProductIdHighToLow());
           sortIdTurn=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductIdLowToHigh());
           sortIdTurn=0;
        }
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonIdSortActionPerformed

    private void jButtonPriceSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPriceSortActionPerformed
        
        if(sortPriceTurn==0)
        {
           Collections.sort(product.getProductList(), new SortProductPriceHighToLow());
           sortPriceTurn=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductPriceLowToHigh());
           sortPriceTurn=0;
        }
        
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonPriceSortActionPerformed

    private void jButtonQuantitySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuantitySortActionPerformed
        
        if(sortQuantityTurn==0)
        {
           Collections.sort(product.getProductList(), new SortProductQuantityHighToLow());
           sortQuantityTurn=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductQuantityLowToHigh());
           sortQuantityTurn=0;
        }
        
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonQuantitySortActionPerformed

    private void jButtonNameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNameSortActionPerformed
        
        if(sortNameTurn==0)
        {
           Collections.sort(product.getProductList(), new SortProductNameHighToLow());
           sortNameTurn=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductNameLowToHigh());
           sortNameTurn=0;
        }
        
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonNameSortActionPerformed

    private void jButtonStockSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStockSortActionPerformed
        
        if(sortStockState==0)
        {
           Collections.sort(product.getProductList(), new SortProductStockHighToLow());
           sortStockState=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductStockLowToHigh());
           sortStockState=0;
        }
        
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonStockSortActionPerformed

    private void jButtonStateSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStateSortActionPerformed
        
        if(sortStateTurn==0)
        {
           Collections.sort(product.getProductList(), new SortProductStateHighToLow());
           sortStateTurn=1;
        }
        else
        {
           Collections.sort(product.getProductList(), new SortProductStateLowToHigh());
           sortStateTurn=0;
        }
        
        refreshTableProductStock();
        
        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonStateSortActionPerformed

    private void jButtonSaveFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveFileMouseClicked
        if(saveFileTurn==0)
        {
            jButtonSaveFile.setEnabled(false);
            product.writeFile("products.txt");
            saveFileTurn=1;
        }
    }//GEN-LAST:event_jButtonSaveFileMouseClicked

    private void jButtonDeleteProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteProductListMouseClicked
        int lastIndex=0;
        int productListDimension=0;
        int i=0;
        int cont=0;
        
        if(jButtonDeleteProductList.isEnabled())
        {
            if(productDeleted.getProductList().isEmpty())
            {
               productDeleted.setProductList(product.getProductList());
            }
            
            if(!product.getProductList().isEmpty())
            {
                lastIndex=product.getProductList().size()-1;
                productListDimension=product.getProductList().size();

                for(int j=lastIndex;j<productListDimension && j>-1;j--)
                {
                    model.removeRow(j);
                }

                jButtonModifyProduct.setEnabled(false);
                jButtonDeleteProduct.setEnabled(false);
                jButtonDeleteProductList.setEnabled(false);
                productDeleted.writeFile("productsBackup.txt"); 
                product.deleteFile("products.txt");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La lista esta vacía");
            } 
        } 
    }//GEN-LAST:event_jButtonDeleteProductListMouseClicked

    private void jButtonBackupListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackupListMouseClicked
       BackupProductListWindow backupProductListWindow = new BackupProductListWindow();
       backupProductListWindow.setVisible(true);
    }//GEN-LAST:event_jButtonBackupListMouseClicked

    private void jTextFieldExplorerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldExplorerKeyReleased
        Product auxProduct = new Product();
        Product finalProduct = new Product();
        int keyTyped = evt.getKeyCode();
        int lastIndex=0;
        int dimension=0;
        int finalDimension=0;
        int row=0;
        int i=0;
        int j=0;
        int iterator=0;
        String textWrited = jTextFieldExplorer.getText();
        
        auxProduct.setProductList(product.getProductList());
        lastIndex=auxProduct.getProductList().size()-1;
        dimension=auxProduct.getProductList().size();
        
        if((keyTyped>47 && keyTyped<58) || (keyTyped>64 && keyTyped<91) || (keyTyped>96 && keyTyped<123) || keyTyped>31)
        { 
            if(i==0)
            {
                for(j=lastIndex;j<auxProduct.getProductList().size() && j>-1;j--)
                {
                    model.removeRow(j);
                }
            }
            
            for(i=0;i<dimension;i++)
            {
                System.out.println("ToF: "+auxProduct.getProductList().get(i).nameStartsIn(textWrited));
                if(auxProduct.getProductList().get(i).nameStartsIn(textWrited))
                { 
                    finalProduct.setId(auxProduct.getProductList().get(i).getId());
                    finalProduct.setName(auxProduct.getProductList().get(i).getName());
                    finalProduct.setPrice(auxProduct.getProductList().get(i).getPrice());
                    finalProduct.setQuantity(auxProduct.getProductList().get(i).getQuantity());
                    finalProduct.setStock(auxProduct.getProductList().get(i).getQuantity()); 
                    finalProduct.setState(auxProduct.getProductList().get(i).getState());
                    finalProduct.addToProductList(finalProduct);
                    
                    if(finalProduct.getProductList().size()>0)
                    {
                        for(iterator=0;iterator<finalProduct.getProductList().size();iterator++) 
                        {
                            System.out.println("name cargado: "+finalProduct.getProductList().get(iterator).getName());
                            System.out.println("iterator: "+iterator);
                        } 
                    }
                    iterator++;  
                }     
            }
            iterator=0;
            
            if(!finalProduct.getProductList().isEmpty())
            {
                finalDimension=finalProduct.getProductList().size();
                
                for(i=0;i<finalDimension;i++) 
                {
                    jTableProductListDataSetter(finalProduct.getProductList(), i, row);
                    row++;  
                } 
            }
        }
    }//GEN-LAST:event_jTextFieldExplorerKeyReleased

    @Override
    public void clearJTextFields ()
    {
        jTextFieldName.setText("");
        jTextFieldPrice.setText("");
        jTextFieldQuantity.setText("");
        jTextFieldNameModifyFunction.setText("");
        jTextFieldPriceModifyFunction.setText("");
        jTextFieldQuantityModifyFunction.setText("");
        jTextFieldIdModifyFunction.setText("");
        jTextFieldIdDeleteFunction.setText("");
    }
    
    public void jTableProductListDataSetter (ArrayList<Product> productList, int i, int row)
    {
        model.addRow(tableRowInfo);
        jTableProductList.setValueAt(productList.get(i).getId(), row, 0);
        jTableProductList.setValueAt(productList.get(i).getName(), row, 1);
        jTableProductList.setValueAt(productList.get(i).getPrice(), row, 2);
        jTableProductList.setValueAt(productList.get(i).getQuantity(), row, 3);
        jTableProductList.setValueAt(productList.get(i).getStock(), row, 4);
        jTableProductList.setValueAt(productList.get(i).getState(), row, 5);
    }
    
    public void addDatasToTableProductStock ()
    {  
        int row=0;
        
        for(int i=0;i<product.getProductList().size();i++) 
        {
            jTableProductListDataSetter(product.getProductList(), i, row);
            row++; 
        } 
    }

    public void refreshTableProductStock ()
    {
        int lastIndex=0;
        int dimension=0;
        
        if(!product.getProductList().isEmpty())
        {
            lastIndex=product.getProductList().size()-1;
            dimension=product.getProductList().size();
            
            for(int j=lastIndex;j<dimension && j>-1;j--)
            {
                model.removeRow(j);
            }
        }
        
        addDatasToTableProductStock();
    }
    
    public void changeSortButtonsDisplay (boolean value)
    {
        jButtonIdSort.setEnabled(value);
        jButtonPriceSort.setEnabled(value);
        jButtonQuantitySort.setEnabled(value);
        jButtonNameSort.setEnabled(value);
        jButtonStockSort.setEnabled(value);
        jButtonStateSort.setEnabled(value);
        jButtonDeleteProduct.setEnabled(value);
        jButtonDeleteProductList.setEnabled(value);
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
            java.util.logging.Logger.getLogger(ProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() 
            {
                new ProductListWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddProduct;
    private javax.swing.JButton jButtonBackupList;
    private javax.swing.JToggleButton jButtonColorChooserBackgroundOK;
    private javax.swing.JToggleButton jButtonColorChooserForegroundOK;
    private javax.swing.JButton jButtonColorChooserTableBackground;
    private javax.swing.JButton jButtonColorChooserTableForeground;
    private javax.swing.JButton jButtonDeleteProduct;
    private javax.swing.JButton jButtonDeleteProductList;
    private javax.swing.JToggleButton jButtonIdSort;
    private javax.swing.JButton jButtonModifyProduct;
    private javax.swing.JToggleButton jButtonNameSort;
    private javax.swing.JToggleButton jButtonPriceSort;
    private javax.swing.JToggleButton jButtonQuantitySort;
    private javax.swing.JButton jButtonSaveFile;
    private javax.swing.JToggleButton jButtonStateSort;
    private javax.swing.JToggleButton jButtonStockSort;
    private javax.swing.JColorChooser jColorChooserTableBackground;
    private javax.swing.JColorChooser jColorChooserTableForeground;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JComboBox<String> jComboBoxStateModifyFunction;
    private javax.swing.JDesktopPane jDesktopPaneColorChooserBackground;
    private javax.swing.JDesktopPane jDesktopPaneColorChooserForeground;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameModifyFunction;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelPriceModifyFunction;
    private javax.swing.JLabel jLabelProductIdDeleteFunction;
    private javax.swing.JLabel jLabelProductIdModifiyFunction;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelQuantityModifyFunction;
    private javax.swing.JLabel jLabelSortCritery;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JLabel jLabelStateModifyFunction;
    private javax.swing.JLabel jLabelTableBackgroundColor;
    private javax.swing.JLabel jLabelTableColors;
    private javax.swing.JLabel jLabelTableForegroundColor;
    private javax.swing.JScrollPane jScrollPaneProductList;
    private javax.swing.JTable jTableProductList;
    private javax.swing.JTextField jTextFieldExplorer;
    private javax.swing.JTextField jTextFieldIdDeleteFunction;
    private javax.swing.JTextField jTextFieldIdModifyFunction;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameModifyFunction;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldPriceModifyFunction;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldQuantityModifyFunction;
    // End of variables declaration//GEN-END:variables
}
