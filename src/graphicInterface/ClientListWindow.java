package graphicInterface;

import clientearraylistsorts.*;
import interfaces.Generals;
import general.Client;
import interfaces.VerifyTextFields;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientListWindow extends javax.swing.JFrame implements Generals, VerifyTextFields
{
    DefaultTableModel model = new DefaultTableModel();
    String []tableRowInfo=new String[0];
    Client client = new Client();
    
    private int sortIdTurn=0; //     
    private int sortNameTurn=0; 
    private int sortLastNameTurn=0;
    private int sortResidenceTurn=0;
    private int sortNationalityTurn=0;
    private int sortDniTurn=0;
    private int sortDateOfBirthTurn=0;
    private int saveFileTurn=0;
    
    public ClientListWindow() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        int i=0;
        int row=0;
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
        
        jButtonAddClient.setOpaque(false);
        jButtonAddClient.setContentAreaFilled(false);
        jButtonAddClient.setBorderPainted(false);
        jButtonModifyClient.setOpaque(false);
        jButtonModifyClient.setContentAreaFilled(false);
        jButtonModifyClient.setBorderPainted(false);
        jButtonDeleteClient.setOpaque(false);
        jButtonDeleteClient.setContentAreaFilled(false);
        jButtonDeleteClient.setBorderPainted(false);
        
        jButtonSaveFile.setEnabled(false);
        jButtonSaveFile.setOpaque(false);
        jButtonSaveFile.setContentAreaFilled(false);
        jButtonSaveFile.setBorderPainted(false);
        
        changeSortButtonsDisplay(false);
        
        model = (DefaultTableModel)jTableClientList.getModel();
        
        if(client.isFileExists("clients.txt"))
        {
            client.setClientList(client.readFile("clients.txt"));

            if(!client.getClientList().isEmpty())
            {
                i = client.getClientList().size()-1;
                
                for(i=0;i<client.getClientList().size();i++) 
                {
                    model.addRow(tableRowInfo);
                    jTableClientList.setValueAt(client.getClientList().get(i).getId(), row, 0);
                    jTableClientList.setValueAt(client.getClientList().get(i).getName(), row, 1);
                    jTableClientList.setValueAt(client.getClientList().get(i).getLastName(), row, 2);
                    jTableClientList.setValueAt(client.getClientList().get(i).getResidence(), row, 3);
                    jTableClientList.setValueAt(client.getClientList().get(i).getNationality(), row, 4);
                    jTableClientList.setValueAt(client.getClientList().get(i).getDni(), row, 5);
                    jTableClientList.setValueAt(client.getClientList().get(i).getDateOfBirth(), row, 6);
                    row++; 
                }
                changeSortButtonsDisplay(true);
            }
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
        jScrollPane = new javax.swing.JScrollPane();
        jTableClientList = new javax.swing.JTable();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelNationality = new javax.swing.JLabel();
        jComboBoxNationality = new javax.swing.JComboBox<>();
        jLabelResidence = new javax.swing.JLabel();
        jTextFieldResidence = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelIdModifiyFunction = new javax.swing.JLabel();
        jTextFieldIdModifyFunction = new javax.swing.JTextField();
        jLabelNameModifyFunction = new javax.swing.JLabel();
        jTextFieldNameModifyFunction = new javax.swing.JTextField();
        jLabelLastNameModifyFunction = new javax.swing.JLabel();
        jTextFieldLastNameModifyFunction = new javax.swing.JTextField();
        jLabelResidenceModifyFunction = new javax.swing.JLabel();
        jTextFieldResidenceModifyFunction = new javax.swing.JTextField();
        jLabelNationalityModifyFunction = new javax.swing.JLabel();
        jComboBoxNationalityModifyFunction = new javax.swing.JComboBox<>();
        jLabelDniModifyFunction = new javax.swing.JLabel();
        jTextFieldDniModifyFunction = new javax.swing.JTextField();
        jLabelIdDeleteFunction = new javax.swing.JLabel();
        jTextFieldIdDeleteFunction = new javax.swing.JTextField();
        jButtonAddClient = new javax.swing.JButton();
        jButtonModifyClient = new javax.swing.JButton();
        jButtonDeleteClient = new javax.swing.JButton();
        jLabelTableColors = new javax.swing.JLabel();
        jLabelTableBackgroundColor = new javax.swing.JLabel();
        jLabelTableForegroundColor = new javax.swing.JLabel();
        jLabelSortCritery = new javax.swing.JLabel();
        jLabelSave = new javax.swing.JLabel();
        jLabelSortCritery2 = new javax.swing.JLabel();
        jButtonColorChooserTableBackground = new javax.swing.JButton();
        jButtonColorChooserTableForeground = new javax.swing.JButton();
        jButtonIdSort = new javax.swing.JToggleButton();
        jButtonNameSort = new javax.swing.JToggleButton();
        jButtonLastNameSort = new javax.swing.JToggleButton();
        jButtonResidenceSort = new javax.swing.JToggleButton();
        jButtonNationalitySort = new javax.swing.JToggleButton();
        jButtonDniSort = new javax.swing.JToggleButton();
        jButtonDateOfBirthSort = new javax.swing.JToggleButton();
        jButtonSaveFile = new javax.swing.JButton();
        jLabelBackground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de clientes");
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

        jScrollPane.setBackground(new java.awt.Color(59, 58, 58));
        jScrollPane.setForeground(new java.awt.Color(59, 58, 58));

        jTableClientList.setBackground(new java.awt.Color(59, 58, 58));
        jTableClientList.setForeground(new java.awt.Color(153, 153, 153));
        jTableClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Residencia", "Nacionalidad", "DNI", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientList.setShowGrid(true);
        jScrollPane.setViewportView(jTableClientList);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 830, 380));

        jLabelDateOfBirth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDateOfBirth.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDateOfBirth.setText("Fecha de Nacimiento");
        getContentPane().add(jLabelDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(153, 153, 153));
        jLabelName.setText("Nombres");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 20));

        jTextFieldName.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 160, -1));

        jLabelLastName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLastName.setText("Apellidos");
        getContentPane().add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, 20));

        jTextFieldLastName.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, -1));

        jLabelNationality.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNationality.setForeground(new java.awt.Color(153, 153, 153));
        jLabelNationality.setText("Nacionalidad");
        getContentPane().add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jComboBoxNationality.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "Rep. Centroafricana", "Rep. Checa", "Rep. del Congo", "Rep. Demo. del Congo", "Rep. Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San V. y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        getContentPane().add(jComboBoxNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, -1));

        jLabelResidence.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelResidence.setForeground(new java.awt.Color(153, 153, 153));
        jLabelResidence.setText("Residencia");
        getContentPane().add(jLabelResidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 70, 20));

        jTextFieldResidence.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldResidence, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 170, -1));

        jLabelDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDni.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDni.setText("DNI");
        getContentPane().add(jLabelDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 30, -1));

        jTextFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDniKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 130, -1));

        jLabelIdModifiyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelIdModifiyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelIdModifiyFunction.setText("ID Cliente");
        getContentPane().add(jLabelIdModifiyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 20));

        jTextFieldIdModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldIdModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, -1));

        jLabelNameModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelNameModifyFunction.setText("Nombre");
        getContentPane().add(jLabelNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 20));

        jTextFieldNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, -1));

        jLabelLastNameModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelLastNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLastNameModifyFunction.setText("Apellidos");
        getContentPane().add(jLabelLastNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 20));

        jTextFieldLastNameModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldLastNameModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, -1));

        jLabelResidenceModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelResidenceModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelResidenceModifyFunction.setText("Residencia");
        getContentPane().add(jLabelResidenceModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 70, 20));

        jTextFieldResidenceModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextFieldResidenceModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 80, -1));

        jLabelNationalityModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNationalityModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelNationalityModifyFunction.setText("Nacionalidad");
        getContentPane().add(jLabelNationalityModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jComboBoxNationalityModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxNationalityModifyFunction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "Rep. Centroafricana", "Rep. Checa", "Rep. del Congo", "Rep. Demo. del Congo", "Rep. Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San V. y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        getContentPane().add(jComboBoxNationalityModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 160, -1));

        jLabelDniModifyFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDniModifyFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelDniModifyFunction.setText("DNI");
        getContentPane().add(jLabelDniModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 30, -1));

        jTextFieldDniModifyFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDniModifyFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDniModifyFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 130, -1));

        jLabelIdDeleteFunction.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelIdDeleteFunction.setForeground(new java.awt.Color(153, 153, 153));
        jLabelIdDeleteFunction.setText("ID Cliente");
        getContentPane().add(jLabelIdDeleteFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, 20));

        jTextFieldIdDeleteFunction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdDeleteFunctionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdDeleteFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 130, -1));

        jButtonAddClient.setBackground(new java.awt.Color(0, 255, 0));
        jButtonAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddNoClicked.png"))); // NOI18N
        jButtonAddClient.setToolTipText("Añadir cliente");
        jButtonAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddClient.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddClicked.png"))); // NOI18N
        jButtonAddClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddClientMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonAddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 50));

        jButtonModifyClient.setBackground(new java.awt.Color(204, 102, 0));
        jButtonModifyClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyNoClicked.png"))); // NOI18N
        jButtonModifyClient.setToolTipText("Modificar cliente");
        jButtonModifyClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModifyClient.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModifyClicked.png"))); // NOI18N
        jButtonModifyClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModifyClientMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonModifyClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 50, 50));

        jButtonDeleteClient.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleteClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteNoClicked.png"))); // NOI18N
        jButtonDeleteClient.setToolTipText("Borrar cliente");
        jButtonDeleteClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteClient.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteClicked.png"))); // NOI18N
        jButtonDeleteClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteClientMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonDeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 50, 50));

        jLabelTableColors.setText("Colores de la tabla");
        getContentPane().add(jLabelTableColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 20));

        jLabelTableBackgroundColor.setText("Color de fondo");
        getContentPane().add(jLabelTableBackgroundColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, 20));

        jLabelTableForegroundColor.setText("Color de letras");
        getContentPane().add(jLabelTableForegroundColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 90, 20));

        jLabelSortCritery.setText("Criterio de ordenacion");
        getContentPane().add(jLabelSortCritery, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabelSave.setText("Guardar");
        getContentPane().add(jLabelSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabelSortCritery2.setText("criterio de ordenacion");
        getContentPane().add(jLabelSortCritery2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 30));

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
        getContentPane().add(jButtonIdSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jButtonNameSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonNameSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonNameSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonNameSort.setText("Nombres");
        jButtonNameSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNameSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNameSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        jButtonLastNameSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonLastNameSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonLastNameSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonLastNameSort.setText("Apellidos");
        jButtonLastNameSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLastNameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastNameSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLastNameSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        jButtonResidenceSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonResidenceSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonResidenceSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonResidenceSort.setText("Residencia");
        jButtonResidenceSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonResidenceSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResidenceSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResidenceSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        jButtonNationalitySort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonNationalitySort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonNationalitySort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonNationalitySort.setText("Nacionalidad");
        jButtonNationalitySort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNationalitySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNationalitySortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNationalitySort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        jButtonDniSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonDniSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonDniSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonDniSort.setText("DNI");
        jButtonDniSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDniSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDniSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDniSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        jButtonDateOfBirthSort.setBackground(new java.awt.Color(63, 63, 246));
        jButtonDateOfBirthSort.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonDateOfBirthSort.setForeground(new java.awt.Color(9, 9, 9));
        jButtonDateOfBirthSort.setText("Fecha de nac.");
        jButtonDateOfBirthSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDateOfBirthSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDateOfBirthSortActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDateOfBirthSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 30));

        jButtonSaveFile.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSaveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FileNoClicked.png"))); // NOI18N
        jButtonSaveFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSaveFile.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FileClicked.png"))); // NOI18N
        jButtonSaveFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveFileMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSaveFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 70, 60));

        jLabelBackground1.setBackground(new java.awt.Color(59, 58, 58));
        jLabelBackground1.setForeground(new java.awt.Color(59, 58, 58));
        jLabelBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackgroundBlueLines.png"))); // NOI18N
        getContentPane().add(jLabelBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    
    private void jButtonColorChooserBackgroundOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserBackgroundOKActionPerformed
        jDesktopPaneColorChooserBackground.setVisible(false);
        jColorChooserTableBackground.setVisible(false);
        jButtonColorChooserBackgroundOK.setVisible(false);
        jTableClientList.setBackground(jColorChooserTableBackground.getColor());
    }//GEN-LAST:event_jButtonColorChooserBackgroundOKActionPerformed

    private void jButtonColorChooserForegroundOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorChooserForegroundOKActionPerformed
        jDesktopPaneColorChooserForeground.setVisible(false);
        jColorChooserTableForeground.setVisible(false);
        jButtonColorChooserForegroundOK.setVisible(false);
        jTableClientList.setForeground(jColorChooserTableForeground.getColor());
    }//GEN-LAST:event_jButtonColorChooserForegroundOKActionPerformed

    private void jButtonAddClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddClientMouseClicked
        int cont=0;
        int i=0;
        int row=0;

        if(!jTextFieldName.getText().isEmpty() && !jTextFieldLastName.getText().isEmpty() && !jTextFieldResidence.getText().isEmpty() && !jTextFieldDni.getText().isEmpty())  
        {
            client.setName(jTextFieldName.getText());
            client.setLastName(jTextFieldLastName.getText());
            client.setResidence(jTextFieldResidence.getText());
            client.setNationality((String)jComboBoxNationality.getSelectedItem());
            client.setDni(Integer.parseInt(jTextFieldDni.getText()));
            client.setDateOfBirth("(no funcional)");
            client.addToClientList(client);
            client.writeFile("clients.txt");

            if(!client.getClientList().isEmpty())
            {
                client.setClientList(client.readFile("clients.txt"));
                i=client.getClientList().size()  - 1 ;
                row=i;
                while(client.searchClient(i+cont) != -1)
                {
                    cont++;
                }
                client.getClientList().get(i).setId(i+cont);

                model.addRow(tableRowInfo);
                jTableClientList.setValueAt(client.getClientList().get(i).getId(), row, 0);
                jTableClientList.setValueAt(client.getClientList().get(i).getName(), row, 1);
                jTableClientList.setValueAt(client.getClientList().get(i).getLastName(), row, 2);
                jTableClientList.setValueAt(client.getClientList().get(i).getResidence(), row, 3);
                jTableClientList.setValueAt(client.getClientList().get(i).getNationality(), row, 4);
                jTableClientList.setValueAt(client.getClientList().get(i).getDni(), row, 5);
                jTableClientList.setValueAt(client.getClientList().get(i).getDateOfBirth(), row, 6);
                changeSortButtonsDisplay(true);
            }
            client.writeFile("clients.txt");
            clearJTextFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonAddClientMouseClicked

    private void jButtonModifyClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModifyClientMouseClicked
        Client clientAux = new Client();
        int index=0;
        int id=0;
        int row=0;

        if(!jTextFieldNameModifyFunction.getText().isEmpty() && !jTextFieldLastNameModifyFunction.getText().isEmpty()
        && !jTextFieldResidenceModifyFunction.getText().isEmpty() && !jTextFieldIdModifyFunction.getText().isEmpty())
        {
            Collections.sort(client.getClientList(), new SortClientIdLowToHigh());
            refreshTableClientList();

            client.setClientList(client.readFile("clients.txt"));
            id=Integer.parseInt(jTextFieldIdModifyFunction.getText());
            index = client.searchClient(id);

            if(index!=-1)
            {
                clientAux.setId(id);
                clientAux.setName(jTextFieldNameModifyFunction.getText());
                clientAux.setLastName(jTextFieldLastNameModifyFunction.getText());
                clientAux.setResidence(jTextFieldResidenceModifyFunction.getText());
                clientAux.setNationality((String)jComboBoxNationalityModifyFunction.getSelectedItem());
                clientAux.setDni(Integer.parseInt(jTextFieldDniModifyFunction.getText()));
                clientAux.setDateOfBirth("(no funcional)");
                client.replaceClient(clientAux, index);
                client.getClientList().get(index).setId(id);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente");
                jTextFieldIdModifyFunction.setText("");
            }

            if(!client.getClientList().isEmpty() && index!=-1)
            {
                row=index;
                jTableClientList.setValueAt(clientAux.getId(), row, 0);
                jTableClientList.setValueAt(clientAux.getName(), row, 1);
                jTableClientList.setValueAt(clientAux.getLastName(), row, 2);
                jTableClientList.setValueAt(clientAux.getResidence(), row, 3);
                jTableClientList.setValueAt(clientAux.getNationality(), row, 4);
                jTableClientList.setValueAt(clientAux.getDni(), row, 5);
                jTableClientList.setValueAt(clientAux.getDateOfBirth(), row, 6);
            }
            client.writeFile("clients.txt");
            clearJTextFields();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonModifyClientMouseClicked

    private void jButtonDeleteClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteClientMouseClicked
        int id=0;
        int posSearched=0;
        int confirmDialogOption=0;

        if(!jTextFieldIdDeleteFunction.getText().isEmpty())
        {
            Collections.sort(client.getClientList(), new SortClientIdLowToHigh());
            refreshTableClientList();

            client.setClientList(client.readFile("clients.txt"));
            id=Integer.parseInt(jTextFieldIdDeleteFunction.getText());
            posSearched=client.searchClient(id);

            if(posSearched!=-1)
            {
                changeSortButtonsDisplay(false);
                confirmDialogOption = JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar el cliente de ID "+id+"?");

                if(confirmDialogOption==0)
                {
                    if(!client.getClientList().isEmpty())
                    {
                        if(id==client.getClientList().get(posSearched).getId())
                        {
                            client.deleteClient(posSearched);;

                            if(client.getClientList().size()<1)
                            {
                                changeSortButtonsDisplay(false);
                            }
                            client.writeFile("clients.txt");
                            model.removeRow(posSearched);
                        }
                    }
                    refreshTableClientList();
                    clearJTextFields();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El ID ingresado no existe. Intente nuevamente");
                jTextFieldIdDeleteFunction.setText("");
            }
            changeSortButtonsDisplay(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos de texto");
        }
    }//GEN-LAST:event_jButtonDeleteClientMouseClicked

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

    private void jButtonIdSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortIdTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientIdHighToLow());
            sortIdTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientIdLowToHigh());
            sortIdTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonIdSortActionPerformed

    private void jButtonNameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNameSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortNameTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientNameHighToLow());
            sortNameTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientNameLowToHigh());
            sortNameTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonNameSortActionPerformed

    private void jButtonLastNameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastNameSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortLastNameTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientLastNameHighToLow());
            sortLastNameTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientLastNameLowToHigh());
            sortLastNameTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonLastNameSortActionPerformed

    private void jButtonResidenceSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResidenceSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortResidenceTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientResidenceHighToLow());
            sortResidenceTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientResidenceLowToHigh());
            sortResidenceTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonResidenceSortActionPerformed

    private void jButtonNationalitySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNationalitySortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortNationalityTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientNationalityHighToLow());
            sortNationalityTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientNationalityLowToHigh());
            sortNationalityTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonNationalitySortActionPerformed

    private void jButtonDniSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDniSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortDniTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientDniHighToLow());
            sortDniTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientDniLowToHigh());
            sortDniTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonDniSortActionPerformed

    private void jButtonSaveFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveFileMouseClicked
        if(saveFileTurn==0)
        {
            jButtonSaveFile.setEnabled(false);
            client.writeFile("clients.txt");
            saveFileTurn=1;
        }
    }//GEN-LAST:event_jButtonSaveFileMouseClicked

    private void jButtonDateOfBirthSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDateOfBirthSortActionPerformed
        client.setClientList(client.readFile("clients.txt"));

        if(sortDateOfBirthTurn==0)
        {
            Collections.sort(client.getClientList(), new SortClientDateOfBirthHighToLow());
            sortDateOfBirthTurn=1;
        }
        else
        {
            Collections.sort(client.getClientList(), new SortClientDateOfBirthLowToHigh());
            sortDateOfBirthTurn=0;
        }

        refreshTableClientList();

        jButtonSaveFile.setEnabled(true);
        saveFileTurn=0;
    }//GEN-LAST:event_jButtonDateOfBirthSortActionPerformed

    private void jTextFieldIdModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdModifyFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldIdModifyFunctionKeyTyped

    private void jTextFieldDniModifyFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniModifyFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldDniModifyFunctionKeyTyped

    private void jTextFieldDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldDniKeyTyped

    private void jTextFieldIdDeleteFunctionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdDeleteFunctionKeyTyped
        verifyInputNumber(evt);
    }//GEN-LAST:event_jTextFieldIdDeleteFunctionKeyTyped

    @Override
    public void clearJTextFields() 
    {
        jTextFieldName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldResidence.setText("");
        jTextFieldDni.setText("");
        jTextFieldIdModifyFunction.setText("");
        jTextFieldNameModifyFunction.setText("");
        jTextFieldLastNameModifyFunction.setText("");
        jTextFieldResidenceModifyFunction.setText("");
        jTextFieldDniModifyFunction.setText("");
    }
    
    public void addDatasToTableClientList ()
    {  
        int row=0;
        
        for(int i=0;i<client.getClientList().size();i++) 
        {
            model.addRow(tableRowInfo);
            jTableClientList.setValueAt(client.getClientList().get(i).getId(), row, 0);
            jTableClientList.setValueAt(client.getClientList().get(i).getName(), row, 1);
            jTableClientList.setValueAt(client.getClientList().get(i).getLastName(), row, 2);
            jTableClientList.setValueAt(client.getClientList().get(i).getResidence(), row, 3);
            jTableClientList.setValueAt(client.getClientList().get(i).getNationality(), row, 4);
            jTableClientList.setValueAt(client.getClientList().get(i).getDni(), row, 5);
            jTableClientList.setValueAt(client.getClientList().get(i).getDateOfBirth(), row, 6);
            row++; 
        } 
    }

    public void refreshTableClientList ()
    {
        int start=client.getClientList().size()-1;
        int dimension=client.getClientList().size();
                    
        for(int j=start;j<dimension && j>-1;j--)
        {
            model.removeRow(j);
        }

        addDatasToTableClientList();
    }
    
    public void changeSortButtonsDisplay (boolean value)
    {
        jButtonIdSort.setEnabled(value);
        jButtonNameSort.setEnabled(value);
        jButtonLastNameSort.setEnabled(value);
        jButtonResidenceSort.setEnabled(value);
        jButtonNationalitySort.setEnabled(value);
        jButtonDniSort.setEnabled(value);
        jButtonDateOfBirthSort.setEnabled(value);
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
            java.util.logging.Logger.getLogger(ClientListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientListWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddClient;
    private javax.swing.JToggleButton jButtonColorChooserBackgroundOK;
    private javax.swing.JToggleButton jButtonColorChooserForegroundOK;
    private javax.swing.JButton jButtonColorChooserTableBackground;
    private javax.swing.JButton jButtonColorChooserTableForeground;
    private javax.swing.JToggleButton jButtonDateOfBirthSort;
    private javax.swing.JButton jButtonDeleteClient;
    private javax.swing.JToggleButton jButtonDniSort;
    private javax.swing.JToggleButton jButtonIdSort;
    private javax.swing.JToggleButton jButtonLastNameSort;
    private javax.swing.JButton jButtonModifyClient;
    private javax.swing.JToggleButton jButtonNameSort;
    private javax.swing.JToggleButton jButtonNationalitySort;
    private javax.swing.JToggleButton jButtonResidenceSort;
    private javax.swing.JButton jButtonSaveFile;
    private javax.swing.JColorChooser jColorChooserTableBackground;
    private javax.swing.JColorChooser jColorChooserTableForeground;
    private javax.swing.JComboBox<String> jComboBoxNationality;
    private javax.swing.JComboBox<String> jComboBoxNationalityModifyFunction;
    private javax.swing.JDesktopPane jDesktopPaneColorChooserBackground;
    private javax.swing.JDesktopPane jDesktopPaneColorChooserForeground;
    private javax.swing.JLabel jLabelBackground1;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelDniModifyFunction;
    private javax.swing.JLabel jLabelIdDeleteFunction;
    private javax.swing.JLabel jLabelIdModifiyFunction;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLastNameModifyFunction;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameModifyFunction;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelNationalityModifyFunction;
    private javax.swing.JLabel jLabelResidence;
    private javax.swing.JLabel jLabelResidenceModifyFunction;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JLabel jLabelSortCritery;
    private javax.swing.JLabel jLabelSortCritery2;
    private javax.swing.JLabel jLabelTableBackgroundColor;
    private javax.swing.JLabel jLabelTableColors;
    private javax.swing.JLabel jLabelTableForegroundColor;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableClientList;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldDniModifyFunction;
    private javax.swing.JTextField jTextFieldIdDeleteFunction;
    private javax.swing.JTextField jTextFieldIdModifyFunction;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldLastNameModifyFunction;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameModifyFunction;
    private javax.swing.JTextField jTextFieldResidence;
    private javax.swing.JTextField jTextFieldResidenceModifyFunction;
    // End of variables declaration//GEN-END:variables
}
