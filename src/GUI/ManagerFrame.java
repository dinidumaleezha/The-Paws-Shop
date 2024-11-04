package GUI;

import Class.UserData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManagerFrame extends javax.swing.JFrame {

    private static final String dbuserName = "root";
    private static final String password = "";
    private static final String baseUrl = "jdbc:mysql://localhost:3306/the_paws_shop";
    
    private Connection config = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;
    private int number1;
    
    public ManagerFrame() {
        initComponents();
        loadDashboard();
        tableUpdate();
        updateCategoryComboBox();
        updateProductComboBox();
        loadRemoveAndUpdateComboBox();
        cashierTableUpdate();
        updateCashierComboBox();
        
        UserData uData = new UserData();
        uName = new JLabel();
        uName.setText("Welcome, " + uData.getName() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        mainPanel1 = new javax.swing.JPanel();
        dashbrordPanel = new RoundedPanel(10, new Color(78,80,82));
        uName = new javax.swing.JLabel();
        jPanel6 = new RoundedPanel(90, new Color(53,56,57));
        jLabel6 = new javax.swing.JLabel();
        jjj = new javax.swing.JLabel();
        selectHomeButton = new javax.swing.JButton();
        selectProductDButton = new javax.swing.JButton();
        selectSearchProductDButton = new javax.swing.JButton();
        selectAddCategoryButton = new javax.swing.JButton();
        selectCreateAccButton = new javax.swing.JButton();
        selectAddProductDButton = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        TabbedPanel = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jPanel9 =  new RoundedPanel(10, new Color(252,194,0));
        jLabel5 = new javax.swing.JLabel();
        totalCategory = new javax.swing.JLabel();
        jPanel12 = new RoundedPanel(10, new Color(65,105,225));
        jLabel3 = new javax.swing.JLabel();
        cashierCount = new javax.swing.JLabel();
        jPanel13 =  new RoundedPanel(10, new Color(255,127,80));
        jLabel4 = new javax.swing.JLabel();
        totalProduct = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        selectCashierComboBox = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        cashierTable3 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        addUserPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        contactNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        cashierAddButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        ProductDetailsPanel = new javax.swing.JPanel();
        petDetailsPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        removeComboBox = new javax.swing.JComboBox<>();
        selectComboBox1 = new javax.swing.JComboBox<>();
        ItemDeleteButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        searchProductPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        searchData = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        addProductDetailsPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JproductName = new javax.swing.JTextField();
        categortComboBox = new javax.swing.JComboBox<>();
        Jprice = new javax.swing.JTextField();
        JquantityInStock = new javax.swing.JTextField();
        JsizeWeight = new javax.swing.JTextField();
        Jdescription = new javax.swing.JTextField();
        ButtonAddDetails = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        addCategoryDetailsPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JcategoryName = new javax.swing.JTextField();
        ButtonCategory = new javax.swing.JButton();
        categoryRemoveButton = new javax.swing.JButton();
        categortCombobox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        uodateProductDetailsPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JproductNameU = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        categortComboBoxU = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        JpriceU = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JquantityInStockU = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        JsizeWeightU = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        JdescriptionU = new javax.swing.JTextField();
        updateDetailsButton = new javax.swing.JButton();
        closeUpbateButton = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel1.setLayout(null);

        dashbrordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uName.setBackground(new java.awt.Color(255, 255, 255));
        uName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        uName.setForeground(new java.awt.Color(255, 255, 255));
        uName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uName.setText("Dinidu Maleesha");
        dashbrordPanel.add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, -1));

        jPanel6.setBackground(new java.awt.Color(78, 80, 82));

        jLabel6.setBackground(new java.awt.Color(78, 80, 82));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/profile_3135715.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dashbrordPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 90));

        jjj.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jjj.setForeground(new java.awt.Color(204, 204, 204));
        jjj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jjj.setText("Manager");
        dashbrordPanel.add(jjj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 20));

        selectHomeButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectHomeButton.setText("Dashboard");
        selectHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectHomeButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 40));

        selectProductDButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectProductDButton.setText("Product Details ");
        selectProductDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProductDButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectProductDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, 40));

        selectSearchProductDButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectSearchProductDButton.setText("Search product Details");
        selectSearchProductDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSearchProductDButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectSearchProductDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 40));

        selectAddCategoryButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectAddCategoryButton.setText("Add Category");
        selectAddCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAddCategoryButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectAddCategoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 150, 40));

        selectCreateAccButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectCreateAccButton.setText("Create new account ");
        selectCreateAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCreateAccButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectCreateAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 40));

        selectAddProductDButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectAddProductDButton.setText("Add product Details");
        selectAddProductDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAddProductDButtonActionPerformed(evt);
            }
        });
        dashbrordPanel.add(selectAddProductDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 40));

        logOut.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        dashbrordPanel.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 150, 40));

        mainPanel1.add(dashbrordPanel);
        dashbrordPanel.setBounds(10, 10, 170, 620);

        parentPanel.setLayout(null);

        TabbedPanel.setMinimumSize(new java.awt.Dimension(100, 150));
        TabbedPanel.setPreferredSize(new java.awt.Dimension(100, 80));

        homePanel.setLayout(null);

        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Category");
        jPanel9.add(jLabel5);
        jLabel5.setBounds(10, 10, 200, 19);

        totalCategory.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        totalCategory.setForeground(new java.awt.Color(255, 255, 255));
        totalCategory.setText("0");
        jPanel9.add(totalCategory);
        totalCategory.setBounds(10, 40, 150, 30);

        homePanel.add(jPanel9);
        jPanel9.setBounds(500, 80, 210, 70);

        jPanel12.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cashier Count");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(10, 10, 200, 19);

        cashierCount.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        cashierCount.setForeground(new java.awt.Color(255, 255, 255));
        cashierCount.setText("0");
        jPanel12.add(cashierCount);
        cashierCount.setBounds(10, 40, 150, 30);

        homePanel.add(jPanel12);
        jPanel12.setBounds(20, 80, 210, 70);

        jPanel13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total product");
        jPanel13.add(jLabel4);
        jLabel4.setBounds(10, 10, 200, 19);

        totalProduct.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        totalProduct.setForeground(new java.awt.Color(255, 255, 255));
        totalProduct.setText("0");
        jPanel13.add(totalProduct);
        totalProduct.setBounds(10, 40, 150, 30);

        homePanel.add(jPanel13);
        jPanel13.setBounds(260, 80, 210, 70);

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cashier Details And Contrrol");
        homePanel.add(jLabel18);
        jLabel18.setBounds(20, 170, 350, 26);
        homePanel.add(jSeparator1);
        jSeparator1.setBounds(20, 200, 690, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Manager Dashboard");
        homePanel.add(jLabel19);
        jLabel19.setBounds(20, 30, 350, 26);

        okButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 51, 51));
        okButton.setText("Drop Cashier");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        homePanel.add(okButton);
        okButton.setBounds(580, 220, 130, 40);

        selectCashierComboBox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        selectCashierComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        homePanel.add(selectCashierComboBox);
        selectCashierComboBox.setBounds(20, 220, 550, 40);

        cashierTable3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        cashierTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "First Name", "Last Name", "Email", "Contact Number", "Role"
            }
        ));
        jScrollPane7.setViewportView(cashierTable3);
        if (cashierTable3.getColumnModel().getColumnCount() > 0) {
            cashierTable3.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        homePanel.add(jScrollPane7);
        jScrollPane7.setBounds(20, 280, 690, 360);
        homePanel.add(jSeparator2);
        jSeparator2.setBounds(20, 60, 690, 20);

        TabbedPanel.addTab("tab1", homePanel);

        addUserPanel.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Adding New User Account ");
        addUserPanel.add(jLabel21);
        jLabel21.setBounds(20, 30, 350, 26);

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name ");
        addUserPanel.add(jLabel7);
        jLabel7.setBounds(20, 90, 110, 16);

        firstName.setBackground(new java.awt.Color(60, 63, 65));
        addUserPanel.add(firstName);
        firstName.setBounds(20, 110, 690, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name ");
        addUserPanel.add(jLabel8);
        jLabel8.setBounds(20, 170, 110, 18);

        lastName.setBackground(new java.awt.Color(60, 63, 65));
        addUserPanel.add(lastName);
        lastName.setBounds(20, 190, 690, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email Address ");
        addUserPanel.add(jLabel9);
        jLabel9.setBounds(20, 250, 110, 18);

        email.setBackground(new java.awt.Color(60, 63, 65));
        addUserPanel.add(email);
        email.setBounds(20, 270, 690, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number ");
        addUserPanel.add(jLabel10);
        jLabel10.setBounds(20, 330, 130, 18);

        contactNo.setBackground(new java.awt.Color(60, 63, 65));
        addUserPanel.add(contactNo);
        contactNo.setBounds(20, 350, 690, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password ");
        addUserPanel.add(jLabel11);
        jLabel11.setBounds(20, 410, 110, 18);

        Password.setBackground(new java.awt.Color(60, 63, 65));
        addUserPanel.add(Password);
        Password.setBounds(20, 430, 690, 40);

        cashierAddButton.setForeground(new java.awt.Color(255, 255, 255));
        cashierAddButton.setText("ADD CASHIER");
        cashierAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierAddButtonActionPerformed(evt);
            }
        });
        addUserPanel.add(cashierAddButton);
        cashierAddButton.setBounds(20, 500, 690, 40);
        addUserPanel.add(jSeparator3);
        jSeparator3.setBounds(20, 60, 690, 10);

        TabbedPanel.addTab("tab2", addUserPanel);

        ProductDetailsPanel.setLayout(null);

        petDetailsPanel.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Manage Product");
        petDetailsPanel.add(jLabel22);
        jLabel22.setBounds(10, 530, 350, 26);

        jTable1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Price", "In stock", "Size / Weight", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        petDetailsPanel.add(jPanel14);
        jPanel14.setBounds(12, 64, 690, 450);

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Select Product :");
        petDetailsPanel.add(jLabel23);
        jLabel23.setBounds(10, 590, 160, 18);

        removeComboBox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        petDetailsPanel.add(removeComboBox);
        removeComboBox.setBounds(330, 580, 200, 40);

        selectComboBox1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        petDetailsPanel.add(selectComboBox1);
        selectComboBox1.setBounds(130, 580, 190, 40);

        ItemDeleteButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ItemDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        ItemDeleteButton.setText("OK");
        ItemDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDeleteButtonActionPerformed(evt);
            }
        });
        petDetailsPanel.add(ItemDeleteButton);
        ItemDeleteButton.setBounds(540, 580, 160, 40);
        petDetailsPanel.add(jSeparator4);
        jSeparator4.setBounds(10, 50, 690, 10);

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("View All Product Details");
        petDetailsPanel.add(jLabel37);
        jLabel37.setBounds(10, 20, 350, 26);
        petDetailsPanel.add(jSeparator9);
        jSeparator9.setBounds(10, 560, 690, 10);

        ProductDetailsPanel.add(petDetailsPanel);
        petDetailsPanel.setBounds(6, 10, 720, 710);

        TabbedPanel.addTab("tab3", ProductDetailsPanel);

        searchProductPanel.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Search Products");
        searchProductPanel.add(jLabel24);
        jLabel24.setBounds(10, 30, 350, 26);

        searchData.setBackground(new java.awt.Color(60, 63, 65));
        searchData.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });
        searchData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchDataKeyReleased(evt);
            }
        });
        searchProductPanel.add(searchData);
        searchData.setBounds(10, 80, 700, 40);

        searchTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Price", "In stock", "Size / Weight", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(searchTable);

        searchProductPanel.add(jScrollPane5);
        jScrollPane5.setBounds(10, 140, 700, 500);
        searchProductPanel.add(jSeparator5);
        jSeparator5.setBounds(10, 60, 700, 10);

        TabbedPanel.addTab("tab4", searchProductPanel);

        addProductDetailsPanel.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adding Products");
        addProductDetailsPanel.add(jLabel12);
        jLabel12.setBounds(20, 30, 350, 26);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Product Name ");
        addProductDetailsPanel.add(jLabel15);
        jLabel15.setBounds(20, 90, 124, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Category ");
        addProductDetailsPanel.add(jLabel14);
        jLabel14.setBounds(20, 170, 124, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Product Price ");
        addProductDetailsPanel.add(jLabel13);
        jLabel13.setBounds(20, 250, 140, 16);

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Quantity In Stock");
        addProductDetailsPanel.add(jLabel25);
        jLabel25.setBounds(20, 330, 140, 16);

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Size / Weight ");
        addProductDetailsPanel.add(jLabel16);
        jLabel16.setBounds(20, 410, 140, 16);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Description  ");
        addProductDetailsPanel.add(jLabel17);
        jLabel17.setBounds(20, 490, 140, 16);

        JproductName.setBackground(new java.awt.Color(60, 63, 65));
        JproductName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(JproductName);
        JproductName.setBounds(20, 110, 680, 40);

        categortComboBox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(categortComboBox);
        categortComboBox.setBounds(20, 190, 680, 40);

        Jprice.setBackground(new java.awt.Color(60, 63, 65));
        Jprice.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(Jprice);
        Jprice.setBounds(20, 270, 680, 40);

        JquantityInStock.setBackground(new java.awt.Color(60, 63, 65));
        JquantityInStock.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(JquantityInStock);
        JquantityInStock.setBounds(20, 350, 680, 40);

        JsizeWeight.setBackground(new java.awt.Color(60, 63, 65));
        JsizeWeight.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(JsizeWeight);
        JsizeWeight.setBounds(20, 430, 680, 40);

        Jdescription.setBackground(new java.awt.Color(60, 63, 65));
        Jdescription.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.add(Jdescription);
        Jdescription.setBounds(20, 520, 680, 40);

        ButtonAddDetails.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ButtonAddDetails.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddDetails.setText("ADD PET DETAILS");
        ButtonAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddDetailsActionPerformed(evt);
            }
        });
        addProductDetailsPanel.add(ButtonAddDetails);
        ButtonAddDetails.setBounds(20, 580, 680, 40);
        addProductDetailsPanel.add(jSeparator6);
        jSeparator6.setBounds(20, 60, 680, 20);

        TabbedPanel.addTab("tab5", addProductDetailsPanel);

        addCategoryDetailsPanel.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Adding Category");
        addCategoryDetailsPanel.add(jLabel26);
        jLabel26.setBounds(20, 30, 350, 26);

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel27.setText("Category Name : ");
        addCategoryDetailsPanel.add(jLabel27);
        jLabel27.setBounds(20, 100, 124, 18);

        JcategoryName.setBackground(new java.awt.Color(60, 63, 65));
        JcategoryName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        JcategoryName.setForeground(new java.awt.Color(255, 255, 255));
        addCategoryDetailsPanel.add(JcategoryName);
        JcategoryName.setBounds(170, 90, 390, 40);

        ButtonCategory.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ButtonCategory.setText("ADD");
        ButtonCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCategoryActionPerformed(evt);
            }
        });
        addCategoryDetailsPanel.add(ButtonCategory);
        ButtonCategory.setBounds(580, 90, 130, 40);

        categoryRemoveButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        categoryRemoveButton.setText("Remove");
        categoryRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryRemoveButtonActionPerformed(evt);
            }
        });
        addCategoryDetailsPanel.add(categoryRemoveButton);
        categoryRemoveButton.setBounds(580, 150, 130, 40);

        categortCombobox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        categortCombobox.setToolTipText("nhngh");
        addCategoryDetailsPanel.add(categortCombobox);
        categortCombobox.setBounds(170, 150, 390, 40);

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("All Category");
        addCategoryDetailsPanel.add(jLabel28);
        jLabel28.setBounds(20, 210, 610, 26);

        jLabel29.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel29.setText("Remove Category : ");
        addCategoryDetailsPanel.add(jLabel29);
        jLabel29.setBounds(20, 160, 140, 18);

        categoryTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATEGORY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(categoryTable);

        addCategoryDetailsPanel.add(jScrollPane6);
        jScrollPane6.setBounds(20, 260, 690, 380);
        addCategoryDetailsPanel.add(jSeparator7);
        jSeparator7.setBounds(20, 60, 690, 30);
        addCategoryDetailsPanel.add(jSeparator10);
        jSeparator10.setBounds(20, 240, 690, 10);

        TabbedPanel.addTab("tab6", addCategoryDetailsPanel);

        uodateProductDetailsPanel.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Update Product Details");
        uodateProductDetailsPanel.add(jLabel30);
        jLabel30.setBounds(20, 40, 350, 26);

        jLabel31.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel31.setText("Product Name");
        uodateProductDetailsPanel.add(jLabel31);
        jLabel31.setBounds(20, 100, 124, 16);

        JproductNameU.setBackground(new java.awt.Color(60, 63, 65));
        JproductNameU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(JproductNameU);
        JproductNameU.setBounds(20, 120, 680, 40);

        jLabel32.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel32.setText("Category");
        uodateProductDetailsPanel.add(jLabel32);
        jLabel32.setBounds(20, 180, 124, 18);

        categortComboBoxU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(categortComboBoxU);
        categortComboBoxU.setBounds(20, 200, 680, 40);

        jLabel33.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel33.setText("Price");
        uodateProductDetailsPanel.add(jLabel33);
        jLabel33.setBounds(20, 260, 140, 18);

        JpriceU.setBackground(new java.awt.Color(60, 63, 65));
        JpriceU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(JpriceU);
        JpriceU.setBounds(20, 280, 680, 40);

        jLabel34.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel34.setText("In Stock");
        uodateProductDetailsPanel.add(jLabel34);
        jLabel34.setBounds(20, 340, 140, 16);

        JquantityInStockU.setBackground(new java.awt.Color(60, 63, 65));
        JquantityInStockU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(JquantityInStockU);
        JquantityInStockU.setBounds(20, 360, 680, 40);

        jLabel35.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel35.setText("Size / Weight");
        uodateProductDetailsPanel.add(jLabel35);
        jLabel35.setBounds(20, 420, 140, 16);

        JsizeWeightU.setBackground(new java.awt.Color(60, 63, 65));
        JsizeWeightU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(JsizeWeightU);
        JsizeWeightU.setBounds(20, 440, 680, 40);

        jLabel36.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel36.setText("Description");
        uodateProductDetailsPanel.add(jLabel36);
        jLabel36.setBounds(20, 500, 140, 16);

        JdescriptionU.setBackground(new java.awt.Color(60, 63, 65));
        JdescriptionU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        uodateProductDetailsPanel.add(JdescriptionU);
        JdescriptionU.setBounds(20, 520, 680, 40);

        updateDetailsButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        updateDetailsButton.setText("UPDATE PET DETAILS");
        updateDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsButtonActionPerformed(evt);
            }
        });
        uodateProductDetailsPanel.add(updateDetailsButton);
        updateDetailsButton.setBounds(20, 590, 340, 40);

        closeUpbateButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        closeUpbateButton.setText("Close");
        closeUpbateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeUpbateButtonActionPerformed(evt);
            }
        });
        uodateProductDetailsPanel.add(closeUpbateButton);
        closeUpbateButton.setBounds(370, 590, 330, 40);
        uodateProductDetailsPanel.add(jSeparator8);
        jSeparator8.setBounds(20, 70, 680, 40);

        TabbedPanel.addTab("tab7", uodateProductDetailsPanel);

        parentPanel.add(TabbedPanel);
        TabbedPanel.setBounds(0, -46, 731, 870);

        mainPanel1.add(parentPanel);
        parentPanel.setBounds(180, 0, 720, 640);

        MainPanel.add(mainPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            config = DriverManager.getConnection(baseUrl, dbuserName, password);
        } catch (Exception erorr){
            JOptionPane.showMessageDialog(this, erorr);
        }
    }
    
    
    private void selectHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectHomeButtonActionPerformed
        TabbedPanel.setSelectedIndex(0);
        loadDashboard();
    }//GEN-LAST:event_selectHomeButtonActionPerformed

    private void loadDashboard(){
        try {
            Connection(); 
            pst = config.prepareStatement("SELECT COUNT(*) AS cashierCount FROM users WHERE role = 'cashier'");
            ResultSet result1 = pst.executeQuery();
            if (result1.next()) {
                cashierCount.setText(result1.getString("cashierCount"));
            } else {
                cashierCount.setText("Error Loading Data");
            }
            result1.close();

            pst = config.prepareStatement("SELECT COUNT(*) AS totalProduct FROM products");
            ResultSet result2 = pst.executeQuery();
            if (result2.next()) {
                totalProduct.setText(result2.getString("totalProduct"));
            } else {
                totalProduct.setText("Error Loading Data");
            }
            result2.close();

            pst = config.prepareStatement("SELECT COUNT(*) AS totalCategory FROM categorys");
            ResultSet result3 = pst.executeQuery();
            if (result3.next()) {
                totalCategory.setText(result3.getString("totalCategory"));
            } else {
                totalCategory.setText("Error Loading Data");
            }
        } catch (Exception e) {
            cashierCount.setText("Error Loading Data");
            totalProduct.setText("Error Loading Data");
            totalCategory.setText("Error Loading Data");
        }
    }
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String selectedOptions = (String) selectCashierComboBox.getSelectedItem(); 
        if ("Select Cashier".equals(selectedOptions)){
            JOptionPane.showMessageDialog(this, "Please Select Cashier Name!");
        } else {
            try {
                Connection();
                pst = config.prepareStatement("DELETE FROM users WHERE firstName = ?");
                String selectedItem = (String) selectCashierComboBox.getSelectedItem(); 
                pst.setString(1, selectedItem);
            
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cashier Deleded Successfully");
                cashierTableUpdate();
                updateCashierComboBox();
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Cashier Deleded failed. Please try again.");
            }
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void selectCreateAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCreateAccButtonActionPerformed
        TabbedPanel.setSelectedIndex(1);
        cashierTableUpdate();
        updateCashierComboBox();
    }//GEN-LAST:event_selectCreateAccButtonActionPerformed

    private void cashierAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierAddButtonActionPerformed
       try{
            if (firstName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Cashier First Name!");
            } else if (lastName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Cashier Last Name!");
            } else if (email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Cashier Email!");
            } else if (contactNo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Cashier Phone Number!");
            } else if (Password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Cashier Password!");
            } else {
                Connection();
                pst = config.prepareStatement("insert into users(firstName, lastName, email, contactNumber, password, role)value( ?, ?, ?, ?, ?, ?)");
                pst.setString(1, firstName.getText());
                pst.setString(2, lastName.getText());
                pst.setString(3, email.getText());
                pst.setString(4, contactNo.getText());
                pst.setString(5, Password.getText());
                pst.setString(6, "cashier");

                int result1 = pst.executeUpdate();

                if (result1 > 0) {
                    JOptionPane.showMessageDialog(this, "Cashier Added Successfully.");
                    cashierTableUpdate();
                    updateCashierComboBox();
                    loadDashboard();
                    TabbedPanel.setSelectedIndex(0);
                    
                    firstName.setText("");
                    lastName.setText("");
                    email.setText("");
                    contactNo.setText("");
                    Password.setText("");
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Cashier Added failed. Please try again.");
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_cashierAddButtonActionPerformed

    //--------------------------------------------------------------------------//
    // Start product Details Page *Event =======================================//
    private void selectProductDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProductDButtonActionPerformed
        TabbedPanel.setSelectedIndex(2);
        tableUpdate();
    }//GEN-LAST:event_selectProductDButtonActionPerformed

    private void ItemDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDeleteButtonActionPerformed
        Connection();
        String selectedOptions = (String) removeComboBox.getSelectedItem();
        if ("Update Item".equals(selectedOptions)){
            TabbedPanel.setSelectedIndex(6);
            try {
                Connection();
                pst = config.prepareStatement("select ProductName, Category, Price, QuantityInStock, SizeWeight, ProductDescription from products WHERE ProductName = ?");
                String selectedItem = (String) selectComboBox1.getSelectedItem();
                pst.setString(1, selectedItem);
                result = pst.executeQuery();
                if (result.next()==false){
                    JOptionPane.showMessageDialog(this, "Record Not Found");
                    JproductNameU.setText("");
                    JpriceU.setText("");
                    JquantityInStockU.setText("");
                    JsizeWeightU.setText("");
                    JdescriptionU.setText("");
                }else{
                    JproductNameU.setText(result.getString("ProductName"));
                    String category = result.getString("Category");
                    categortComboBoxU.addItem(category);
                    categortComboBoxU.setSelectedItem(category);
                    JpriceU.setText(result.getString("Price"));
                    JquantityInStockU.setText(result.getString("QuantityInStock"));
                    JsizeWeightU.setText(result.getString("SizeWeight"));
                    JdescriptionU.setText(result.getString("ProductDescription"));
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        } else if ("Delete Item".equals(selectedOptions)){
            try {
                pst = config.prepareStatement("DELETE FROM products WHERE ProductName = ?");
                String selectedItem = (String) selectComboBox1.getSelectedItem();
                pst.setString(1, selectedItem);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Deleded Successfully");
                updateCategoryComboBox();
                updateProductComboBox();
                loadRemoveAndUpdateComboBox();
                tableUpdate();
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Product Deleded failed. Please try again.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select Options");
        }
    }//GEN-LAST:event_ItemDeleteButtonActionPerformed
    // End product Details Page *Event =========================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Search product Details Page *Event ================================//
    private void selectSearchProductDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSearchProductDButtonActionPerformed
        TabbedPanel.setSelectedIndex(3);
        tableUpdate();
    }//GEN-LAST:event_selectSearchProductDButtonActionPerformed

    private void searchDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchDataKeyReleased
        String SearchString = searchData.getText();
        search(SearchString);
    }//GEN-LAST:event_searchDataKeyReleased

    public void search(String str){
        DefaultTableModel tblModel= (DefaultTableModel)searchTable.getModel();
        TableRowSorter<DefaultTableModel> trs= new TableRowSorter<>(tblModel);
        searchTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    // End Search product Details Page *Event ==================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Add product Details Page *Event ==================================//
    private void selectAddProductDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAddProductDButtonActionPerformed
        TabbedPanel.setSelectedIndex(4);
    }//GEN-LAST:event_selectAddProductDButtonActionPerformed

    private void ButtonAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddDetailsActionPerformed
        try{
            if (JproductName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Product Name!");
            } else if (Jprice.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Price!");
            } else if (JquantityInStock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Quantity In Stock!");
            } else if (JsizeWeight.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter size or weight!");
            } else if (Jdescription.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter description!");
            } else {
                Connection();
                String selectedItem = (String) categortComboBox.getSelectedItem();
                pst = config.prepareStatement("insert into products( ProductName, Category, Price, QuantityInStock, SizeWeight, ProductDescription )value( ?, ?, ?, ?, ?, ? )");
                pst.setString(1, JproductName.getText());
                pst.setString(2, selectedItem);
                pst.setString(3, Jprice.getText());
                pst.setString(4, JquantityInStock.getText());
                pst.setString(5, JsizeWeight.getText());
                pst.setString(6, Jdescription.getText());

                int result1 = pst.executeUpdate();

                if (result1 > 0) {
                    JOptionPane.showMessageDialog(this, "Product Added Successfully.");
                    TabbedPanel.setSelectedIndex(2);
                    tableUpdate();
                    updateCategoryComboBox();
                    
                    JproductName.setText("");
                    Jprice.setText("");
                    JquantityInStock.setText("");
                    JsizeWeight.setText("");
                    Jdescription.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Product Added failed. Please try again.");
                }
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ButtonAddDetailsActionPerformed
    // End Add product Details Page *Event =====================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Add Category Details Page *Event ==================================//
    private void selectAddCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAddCategoryButtonActionPerformed
        TabbedPanel.setSelectedIndex(5);
        categoryTableView();
    }//GEN-LAST:event_selectAddCategoryButtonActionPerformed

    private void ButtonCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCategoryActionPerformed
        try{
            if (JcategoryName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter category name!");

            } else {
                Connection();
                pst = config.prepareStatement("insert into categorys( Category )value( ? )");
                pst.setString(1, JcategoryName.getText());

                int result = pst.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Category Added successfully.");
                    JcategoryName.setText("");
                    categoryTableView();
                    updateCategoryComboBox();
                    updateProductComboBox();
                    loadRemoveAndUpdateComboBox();
                } else {
                    JOptionPane.showMessageDialog(this, "Category Added failed. Please try again.");
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ButtonCategoryActionPerformed

    private void categoryRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryRemoveButtonActionPerformed
        String selectedItem = (String) categortCombobox.getSelectedItem(); 
        if ("Select".equals(selectedItem)){
            JOptionPane.showMessageDialog(this, "Please Select Category Name!");
        } else {
            try {
                Connection();
                pst = config.prepareStatement("DELETE FROM categorys WHERE Category = ?");
                pst.setString(1, selectedItem);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Categort Deleded Successfully");
                categoryTableView();
                updateCategoryComboBox();
                updateProductComboBox();
                loadRemoveAndUpdateComboBox();
            } catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Categort Deleded failed. Please try again.");
            }
        }
    }//GEN-LAST:event_categoryRemoveButtonActionPerformed

    public void categoryTableView(){
        try{
            Connection();
            pst = config.prepareStatement("select * from categorys ORDER BY `Category` DESC"); 
            result = pst.executeQuery();

            DefaultTableModel tbModel = (DefaultTableModel) categoryTable.getModel();
            tbModel.setRowCount(0); 
            while(result.next()){
                String Category = result.getString("Category");
                String tbData[] = {Category};
                tbModel.addRow(tbData);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Database connection failed.");
        }
    }
    // End Add Category Details Page *Event ====================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Update Details Page *Event ========================================//
    private void updateDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsButtonActionPerformed
        try{
            if (JproductNameU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Product Name!");
            } else if (JpriceU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Price!");
            } else if (JquantityInStockU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Quantity In Stock!");
            } else if (JsizeWeightU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter size or weight!");
            } else if (JdescriptionU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter description!");
            } else {
                Connection();
                String selectedItem = (String) categortComboBoxU.getSelectedItem();
                pst = config.prepareStatement("UPDATE products SET ProductName = ?, Category = ?, Price = ?, QuantityInStock = ?, SizeWeight = ?, ProductDescription = ? WHERE ProductName = ?");
                pst.setString(1, JproductNameU.getText());
                pst.setString(2, selectedItem);
                pst.setString(3, JpriceU.getText());
                pst.setString(4, JquantityInStockU.getText());
                pst.setString(5, JsizeWeightU.getText());
                pst.setString(6, JdescriptionU.getText());
                pst.setString(7, JproductNameU.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Update Successfully");
                tableUpdate();
                TabbedPanel.setSelectedIndex(2);

                JproductNameU.setText("");
                JpriceU.setText("");
                JquantityInStockU.setText("");
                JsizeWeightU.setText("");
                JdescriptionU.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_updateDetailsButtonActionPerformed

    private void closeUpbateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeUpbateButtonActionPerformed
        TabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_closeUpbateButtonActionPerformed
    // End Update Details Page *Event ==========================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Log Out *Event ====================================================//
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LoginFrame dbcon = new LoginFrame();
        this.dispose();
        dbcon.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed
    // End Log Out *Event ======================================================//
    //--------------------------------------------------------------------------//
    
    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDataActionPerformed
    
    
    // Start Method ============================================================//
    //--------------------------------------------------------------------------//
    // Start Table Details Update *Method ======================================//
    public void tableUpdate(){
        Connection();
        try (PreparedStatement pst = config.prepareStatement("SELECT * FROM products ORDER BY `ProductID` DESC");
            ResultSet result = pst.executeQuery()) {
            
            DefaultTableModel tbModel1 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel tbModel2 = (DefaultTableModel) searchTable.getModel();
            //DefaultTableModel tbModel3 = (DefaultTableModel) JproductsTable.getModel();
              
            tbModel1.setRowCount(0);
            tbModel2.setRowCount(0);
            //tbModel3.setRowCount(0);
              
            while (result.next()) {
                String productID = String.valueOf(result.getInt("ProductID"));
                String productName = result.getString("ProductName");
                String category = result.getString("Category");
                String price = result.getString("Price");
                String quantityInStock = result.getString("QuantityInStock");
                String sizeWeight = result.getString("SizeWeight");
                String productDescription = result.getString("ProductDescription");

                String[] tbData = {productID, productName, category, price, quantityInStock, sizeWeight, productDescription};

                tbModel1.addRow(tbData);
                tbModel2.addRow(tbData);
                //tbModel3.addRow(tbData);
            }
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
    
    private void cashierTableUpdate(){
        Connection();
        try (PreparedStatement pst = config.prepareStatement("SELECT * FROM users ORDER BY `userID` DESC");
            ResultSet result = pst.executeQuery()) {
            
            //DefaultTableModel tbModel1 = (DefaultTableModel) cashierTable2.getModel();
            DefaultTableModel tbModel2 = (DefaultTableModel) cashierTable3.getModel();
              
            //tbModel1.setRowCount(0);
            tbModel2.setRowCount(0);
              
            while (result.next()) {
                String userID = String.valueOf(result.getInt("userID"));
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                String email = result.getString("email");
                String contactNumber = result.getString("contactNumber");
                String role = result.getString("role");

                String[] tbData = {userID, firstName, lastName, email, contactNumber, role};

                //tbModel1.addRow(tbData);
                tbModel2.addRow(tbData);
            }
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
    // End Table Details Update *Method ========================================//
    //--------------------------------------------------------------------------//

    // Update All Combobox =====================================================//
    // Start Update Category Combobox //
    
    private void updateCategoryComboBox() {
        try {
            Connection();
            pst = config.prepareStatement("SELECT * FROM categorys ORDER BY `Category` DESC");
            result = pst.executeQuery();

            categortCombobox.removeAllItems();
            categortCombobox.addItem("Select");
            categortCombobox.setSelectedItem("Select"); 
                    
            categortComboBox.removeAllItems();
            categortComboBox.addItem("Select");
            categortComboBox.setSelectedItem("Select");

            while (result.next()) {
                String item = result.getString(1);
                categortCombobox.addItem(item);
                categortComboBox.addItem(item);
                categortComboBoxU.addItem(item);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // End Update Category Combobox //
    
    // Start Update Products Combobox //
    private void updateProductComboBox() {
        try {
            Connection();
            pst = config.prepareStatement("SELECT * FROM products ORDER BY `ProductID` DESC");
            result = pst.executeQuery();

            selectComboBox1.removeAllItems();
            selectComboBox1.addItem("Select");
            selectComboBox1.setSelectedItem("Select");
            
            while (result.next()) {
                String item = result.getString(2);
                selectComboBox1.addItem(item);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // End Update Products Combobox //
    
    private void updateCashierComboBox() {
        try {
            Connection();
            pst = config.prepareStatement("SELECT firstName, lastName FROM users ORDER BY `userID` DESC");
            result = pst.executeQuery();
            selectCashierComboBox.removeAllItems();
            selectCashierComboBox.addItem("Select Cashier");
            selectCashierComboBox.setSelectedItem("Select Cashier");
            
            while (result.next()) {
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                String fullName = firstName + " " + lastName;
                selectCashierComboBox.addItem(firstName);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Start Load Remove And Update ComboBox //
    private void loadRemoveAndUpdateComboBox() {
        removeComboBox.removeAllItems();
        removeComboBox.addItem("Select");
        removeComboBox.addItem("Update Item");
        removeComboBox.addItem("Delete Item");
    }
    // End Load Remove And Update ComboBox //
    // End Method ==============================================================//
    // Update All Combobox =====================================================//
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
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddDetails;
    private javax.swing.JButton ButtonCategory;
    private javax.swing.JButton ItemDeleteButton;
    private javax.swing.JTextField JcategoryName;
    private javax.swing.JTextField Jdescription;
    private javax.swing.JTextField JdescriptionU;
    private javax.swing.JTextField Jprice;
    private javax.swing.JTextField JpriceU;
    private javax.swing.JTextField JproductName;
    private javax.swing.JTextField JproductNameU;
    private javax.swing.JTextField JquantityInStock;
    private javax.swing.JTextField JquantityInStockU;
    private javax.swing.JTextField JsizeWeight;
    private javax.swing.JTextField JsizeWeightU;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField Password;
    private javax.swing.JPanel ProductDetailsPanel;
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JPanel addCategoryDetailsPanel;
    private javax.swing.JPanel addProductDetailsPanel;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JButton cashierAddButton;
    private javax.swing.JLabel cashierCount;
    private javax.swing.JTable cashierTable3;
    private javax.swing.JComboBox<String> categortComboBox;
    private javax.swing.JComboBox<String> categortComboBoxU;
    private javax.swing.JComboBox<String> categortCombobox;
    private javax.swing.JButton categoryRemoveButton;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton closeUpbateButton;
    private javax.swing.JTextField contactNo;
    private javax.swing.JPanel dashbrordPanel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jjj;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton logOut;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel petDetailsPanel;
    private javax.swing.JComboBox<String> removeComboBox;
    private javax.swing.JTextField searchData;
    private javax.swing.JPanel searchProductPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton selectAddCategoryButton;
    private javax.swing.JButton selectAddProductDButton;
    private javax.swing.JComboBox<String> selectCashierComboBox;
    private javax.swing.JComboBox<String> selectComboBox1;
    private javax.swing.JButton selectCreateAccButton;
    private javax.swing.JButton selectHomeButton;
    private javax.swing.JButton selectProductDButton;
    private javax.swing.JButton selectSearchProductDButton;
    private javax.swing.JLabel totalCategory;
    private javax.swing.JLabel totalProduct;
    private javax.swing.JLabel uName;
    private javax.swing.JPanel uodateProductDetailsPanel;
    private javax.swing.JButton updateDetailsButton;
    // End of variables declaration//GEN-END:variables

        class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
            graphics.setColor(getForeground());
 //           graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);            
        }
    }
}
