package GUI;

import com.formdev.flatlaf.FlatDarkLaf;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CashierFrame extends javax.swing.JFrame {
    
    private static final String dbuserName = "root";
    private static final String password = "";
    private static final String baseUrl = "jdbc:mysql://localhost:3306/the_paws_shop";
    
    private Connection config = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;
    private int number1;

    public CashierFrame() {
    initComponents();
    FlatDarkLaf.setup();
    tableUpdate();
    updateCategoryComboBox();
    updateProductComboBox();
    loadRemoveAndUpdateComboBox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MainPanel2 = new javax.swing.JPanel();
        dashbrordPanel = new RoundedPanel(10, new Color(78,80,82));
        cashierName = new javax.swing.JLabel();
        profilePanel = new RoundedPanel(90, new Color(53,56,57));
        userProfilePick = new javax.swing.JLabel();
        userRole = new javax.swing.JLabel();
        setProductDetailsPanel = new javax.swing.JButton();
        addProductDetailsPanel = new javax.swing.JButton();
        searchProductDetailsPanel = new javax.swing.JButton();
        addCategoryDetailsPanel = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        TabbedPanel = new javax.swing.JTabbedPane();
        productDetailsPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        removeComboBox = new javax.swing.JComboBox<>();
        selectComboBox1 = new javax.swing.JComboBox<>();
        ItemDeleteButton = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        addCategoryPanel = new javax.swing.JPanel();
        JcategoryName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        categortCombobox = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        ButtonCategory = new javax.swing.JButton();
        categoryRemoveButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        updateDetailsPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        JproductNameU = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        JpriceU = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        JsizeWeightU = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        JdescriptionU = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        JquantityInStockU = new javax.swing.JTextField();
        categortComboBoxU = new javax.swing.JComboBox<>();
        updateDetailsButton = new javax.swing.JButton();
        closeUpbateButton = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        searchDetailsPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchData = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        addProductDetailPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        JproductName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Jprice = new javax.swing.JTextField();
        categortComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JsizeWeight = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Jdescription = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JquantityInStock = new javax.swing.JTextField();
        ButtonAddDetails = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel2.setLayout(null);

        dashbrordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashierName.setBackground(new java.awt.Color(255, 255, 255));
        cashierName.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        cashierName.setForeground(new java.awt.Color(255, 255, 255));
        cashierName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashierName.setText("Dinidu Maleesha");
        dashbrordPanel.add(cashierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, -1));

        profilePanel.setBackground(new java.awt.Color(78, 80, 82));

        userProfilePick.setBackground(new java.awt.Color(78, 80, 82));
        userProfilePick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/profile_3135715.png"))); // NOI18N

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userProfilePick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userProfilePick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dashbrordPanel.add(profilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 90));

        userRole.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        userRole.setForeground(new java.awt.Color(204, 204, 204));
        userRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userRole.setText("Cashier");
        dashbrordPanel.add(userRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 20));

        setProductDetailsPanel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        setProductDetailsPanel.setText("Product Details ");
        setProductDetailsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setProductDetailsPanelActionPerformed(evt);
            }
        });
        dashbrordPanel.add(setProductDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        addProductDetailsPanel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailsPanel.setText("Add product Details ");
        addProductDetailsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductDetailsPanelActionPerformed(evt);
            }
        });
        dashbrordPanel.add(addProductDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 40));

        searchProductDetailsPanel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchProductDetailsPanel.setText("Search product Details ");
        searchProductDetailsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductDetailsPanelActionPerformed(evt);
            }
        });
        dashbrordPanel.add(searchProductDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, 40));

        addCategoryDetailsPanel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addCategoryDetailsPanel.setText("Add Category");
        addCategoryDetailsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryDetailsPanelActionPerformed(evt);
            }
        });
        dashbrordPanel.add(addCategoryDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 150, 40));

        logOut.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        dashbrordPanel.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 40));

        MainPanel2.add(dashbrordPanel);
        dashbrordPanel.setBounds(10, 10, 170, 580);

        parentPanel.setBackground(new java.awt.Color(51, 51, 51));
        parentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedPanel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        TabbedPanel.setToolTipText("");
        TabbedPanel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        productDetailsPanel.setLayout(null);

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        productDetailsPanel.add(jPanel7);
        jPanel7.setBounds(12, 64, 617, 430);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel19.setText("Select Product :");
        productDetailsPanel.add(jLabel19);
        jLabel19.setBounds(10, 560, 110, 18);

        removeComboBox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        productDetailsPanel.add(removeComboBox);
        removeComboBox.setBounds(310, 550, 170, 40);

        selectComboBox1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        productDetailsPanel.add(selectComboBox1);
        selectComboBox1.setBounds(130, 550, 170, 40);

        ItemDeleteButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ItemDeleteButton.setText("OK");
        ItemDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDeleteButtonActionPerformed(evt);
            }
        });
        productDetailsPanel.add(ItemDeleteButton);
        ItemDeleteButton.setBounds(490, 550, 140, 40);

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("View All Product Details");
        productDetailsPanel.add(jLabel37);
        jLabel37.setBounds(10, 20, 350, 26);
        productDetailsPanel.add(jSeparator4);
        jSeparator4.setBounds(10, 50, 620, 10);

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Manage Product");
        productDetailsPanel.add(jLabel29);
        jLabel29.setBounds(10, 500, 280, 26);
        productDetailsPanel.add(jSeparator9);
        jSeparator9.setBounds(10, 530, 620, 10);

        TabbedPanel.addTab("tab1", productDetailsPanel);

        addCategoryPanel.setLayout(null);

        JcategoryName.setBackground(new java.awt.Color(60, 63, 65));
        JcategoryName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        JcategoryName.setForeground(new java.awt.Color(255, 255, 255));
        addCategoryPanel.add(JcategoryName);
        JcategoryName.setBounds(170, 80, 330, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel9.setText("Category Name : ");
        addCategoryPanel.add(jLabel9);
        jLabel9.setBounds(20, 90, 124, 18);

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel10.setText("Remove Category : ");
        addCategoryPanel.add(jLabel10);
        jLabel10.setBounds(20, 150, 140, 18);

        categortCombobox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        categortCombobox.setToolTipText("nhngh");
        addCategoryPanel.add(categortCombobox);
        categortCombobox.setBounds(170, 140, 330, 40);

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
        jScrollPane3.setViewportView(categoryTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        addCategoryPanel.add(jPanel8);
        jPanel8.setBounds(20, 250, 610, 340);

        ButtonCategory.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ButtonCategory.setText("ADD");
        ButtonCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCategoryActionPerformed(evt);
            }
        });
        addCategoryPanel.add(ButtonCategory);
        ButtonCategory.setBounds(510, 80, 120, 40);

        categoryRemoveButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        categoryRemoveButton.setText("Remove");
        categoryRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryRemoveButtonActionPerformed(evt);
            }
        });
        addCategoryPanel.add(categoryRemoveButton);
        categoryRemoveButton.setBounds(510, 140, 120, 40);
        addCategoryPanel.add(jSeparator7);
        jSeparator7.setBounds(20, 60, 610, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Adding Category");
        addCategoryPanel.add(jLabel30);
        jLabel30.setBounds(20, 30, 350, 26);

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("All Category");
        addCategoryPanel.add(jLabel31);
        jLabel31.setBounds(20, 200, 610, 26);
        addCategoryPanel.add(jSeparator10);
        jSeparator10.setBounds(20, 230, 610, 10);

        TabbedPanel.addTab("tab4", addCategoryPanel);

        jPanel6.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Price ");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(20, 210, 140, 16);

        JproductNameU.setBackground(new java.awt.Color(60, 63, 65));
        JproductNameU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(JproductNameU);
        JproductNameU.setBounds(20, 90, 600, 40);

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Category ");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(20, 140, 124, 16);

        JpriceU.setBackground(new java.awt.Color(60, 63, 65));
        JpriceU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(JpriceU);
        JpriceU.setBounds(20, 230, 600, 40);

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Product Name ");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(20, 70, 124, 18);

        jLabel26.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Size / Weight ");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(20, 350, 140, 16);

        JsizeWeightU.setBackground(new java.awt.Color(60, 63, 65));
        JsizeWeightU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(JsizeWeightU);
        JsizeWeightU.setBounds(20, 370, 600, 40);

        jLabel27.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Description  ");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(20, 420, 140, 16);

        JdescriptionU.setBackground(new java.awt.Color(60, 63, 65));
        JdescriptionU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(JdescriptionU);
        JdescriptionU.setBounds(20, 440, 600, 40);

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("In Stock ");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(20, 280, 140, 16);

        JquantityInStockU.setBackground(new java.awt.Color(60, 63, 65));
        JquantityInStockU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(JquantityInStockU);
        JquantityInStockU.setBounds(20, 300, 600, 40);

        categortComboBoxU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel6.add(categortComboBoxU);
        categortComboBoxU.setBounds(20, 160, 600, 40);

        updateDetailsButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        updateDetailsButton.setText("UPDATE PET DETAILS");
        updateDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsButtonActionPerformed(evt);
            }
        });
        jPanel6.add(updateDetailsButton);
        updateDetailsButton.setBounds(20, 510, 290, 40);

        closeUpbateButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        closeUpbateButton.setText("Close");
        closeUpbateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeUpbateButtonActionPerformed(evt);
            }
        });
        jPanel6.add(closeUpbateButton);
        closeUpbateButton.setBounds(330, 510, 290, 40);

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Update Product Details");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(20, 20, 270, 26);
        jPanel6.add(jSeparator8);
        jSeparator8.setBounds(20, 50, 600, 40);

        javax.swing.GroupLayout updateDetailsPanelLayout = new javax.swing.GroupLayout(updateDetailsPanel);
        updateDetailsPanel.setLayout(updateDetailsPanelLayout);
        updateDetailsPanelLayout.setHorizontalGroup(
            updateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateDetailsPanelLayout.setVerticalGroup(
            updateDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateDetailsPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPanel.addTab("tab5", updateDetailsPanel);

        searchDetailsPanel.setLayout(null);

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

        searchDetailsPanel.add(jScrollPane5);
        jScrollPane5.setBounds(10, 110, 620, 480);

        searchData.setBackground(new java.awt.Color(60, 63, 65));
        searchData.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        searchData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchDataKeyReleased(evt);
            }
        });
        searchDetailsPanel.add(searchData);
        searchData.setBounds(10, 60, 620, 40);

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Search Products");
        searchDetailsPanel.add(jLabel33);
        jLabel33.setBounds(10, 20, 350, 26);
        searchDetailsPanel.add(jSeparator5);
        jSeparator5.setBounds(10, 50, 620, 10);

        TabbedPanel.addTab("tab3", searchDetailsPanel);

        addProductDetailPanel.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price ");
        addProductDetailPanel.add(jLabel13);
        jLabel13.setBounds(20, 210, 140, 18);

        JproductName.setBackground(new java.awt.Color(60, 63, 65));
        JproductName.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(JproductName);
        JproductName.setBounds(20, 90, 600, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Category ");
        addProductDetailPanel.add(jLabel14);
        jLabel14.setBounds(20, 140, 124, 18);

        Jprice.setBackground(new java.awt.Color(60, 63, 65));
        Jprice.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(Jprice);
        Jprice.setBounds(20, 230, 600, 40);

        categortComboBox.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(categortComboBox);
        categortComboBox.setBounds(20, 160, 600, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Product Name ");
        addProductDetailPanel.add(jLabel15);
        jLabel15.setBounds(20, 70, 124, 18);

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Size / Weight ");
        addProductDetailPanel.add(jLabel16);
        jLabel16.setBounds(20, 350, 140, 18);

        JsizeWeight.setBackground(new java.awt.Color(60, 63, 65));
        JsizeWeight.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(JsizeWeight);
        JsizeWeight.setBounds(20, 370, 600, 40);

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Description  ");
        addProductDetailPanel.add(jLabel17);
        jLabel17.setBounds(20, 420, 140, 18);

        Jdescription.setBackground(new java.awt.Color(60, 63, 65));
        Jdescription.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(Jdescription);
        Jdescription.setBounds(20, 440, 600, 40);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("In Stock ");
        addProductDetailPanel.add(jLabel20);
        jLabel20.setBounds(20, 280, 140, 18);

        JquantityInStock.setBackground(new java.awt.Color(60, 63, 65));
        JquantityInStock.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addProductDetailPanel.add(JquantityInStock);
        JquantityInStock.setBounds(20, 300, 600, 40);

        ButtonAddDetails.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ButtonAddDetails.setText("ADD PET DETAILS");
        ButtonAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddDetailsActionPerformed(evt);
            }
        });
        addProductDetailPanel.add(ButtonAddDetails);
        ButtonAddDetails.setBounds(20, 500, 600, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adding Products");
        addProductDetailPanel.add(jLabel12);
        jLabel12.setBounds(20, 20, 270, 26);
        addProductDetailPanel.add(jSeparator6);
        jSeparator6.setBounds(20, 50, 600, 20);

        TabbedPanel.addTab("tab2", addProductDetailPanel);

        parentPanel.add(TabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 640));
        TabbedPanel.getAccessibleContext().setAccessibleName("Pet Details ");

        MainPanel2.add(parentPanel);
        parentPanel.setBounds(190, 0, 650, 600);

        MainPanel.add(MainPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    // End Table Details Update *Method ========================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start product Details Page *Event =======================================//
    private void setProductDetailsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setProductDetailsPanelActionPerformed
        TabbedPanel.setSelectedIndex(0);
        tableUpdate();
    }//GEN-LAST:event_setProductDetailsPanelActionPerformed

    private void ItemDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDeleteButtonActionPerformed
        Connection();
        String selectedOptions = (String) removeComboBox.getSelectedItem(); 
        if ("Update Item".equals(selectedOptions)){
            TabbedPanel.setSelectedIndex(2);
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
                TabbedPanel.setSelectedIndex(0);
                
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
        TabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_closeUpbateButtonActionPerformed
    // End product Details Page *Event =========================================//
    //--------------------------------------------------------------------------//
    
    //--------------------------------------------------------------------------//
    // Start Add product Details Page *Event ==================================//
    private void addProductDetailsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductDetailsPanelActionPerformed
        TabbedPanel.setSelectedIndex(4);
        updateCategoryComboBox();
        updateProductComboBox();
        loadRemoveAndUpdateComboBox();
    }//GEN-LAST:event_addProductDetailsPanelActionPerformed

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
                    pst = config.prepareStatement("select * from products"); 
                    result = pst.executeQuery();

                    //DefaultTableModel tbModel = (DefaultTableModel) JproductsTable.getModel();
                    //tbModel.setRowCount(0); 
                    while(result.next()){
                    tableUpdate();
                    TabbedPanel.setSelectedIndex(0);

                    JproductName.setText("");
                    Jprice.setText("");
                    JquantityInStock.setText("");
                    JsizeWeight.setText("");
                    Jdescription.setText("");
                    }      
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
    // Start Search product Details Page *Event ================================//
    private void searchProductDetailsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductDetailsPanelActionPerformed
        TabbedPanel.setSelectedIndex(3);
        tableUpdate();
    }//GEN-LAST:event_searchProductDetailsPanelActionPerformed

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
    // Start Add Category Details Page *Event ==================================//
    private void addCategoryDetailsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryDetailsPanelActionPerformed
        TabbedPanel.setSelectedIndex(1);
        updateCategoryComboBox();
        updateProductComboBox();
        loadRemoveAndUpdateComboBox();
        categoryTableView();
    }//GEN-LAST:event_addCategoryDetailsPanelActionPerformed

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
    // Start Log Out *Event ====================================================//
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LoginFrame dbcon = new LoginFrame();
        this.dispose();
        dbcon.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed
    // End Log Out *Event ======================================================//
    //--------------------------------------------------------------------------//
    
    // Start Method ============================================================//
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
    private javax.swing.JPanel MainPanel2;
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JButton addCategoryDetailsPanel;
    private javax.swing.JPanel addCategoryPanel;
    private javax.swing.JPanel addProductDetailPanel;
    private javax.swing.JButton addProductDetailsPanel;
    private javax.swing.JLabel cashierName;
    private javax.swing.JComboBox<String> categortComboBox;
    private javax.swing.JComboBox<String> categortComboBoxU;
    private javax.swing.JComboBox<String> categortCombobox;
    private javax.swing.JButton categoryRemoveButton;
    private javax.swing.JTable categoryTable;
    private javax.swing.JButton closeUpbateButton;
    private javax.swing.JPanel dashbrordPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOut;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel productDetailsPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JComboBox<String> removeComboBox;
    private javax.swing.JTextField searchData;
    private javax.swing.JPanel searchDetailsPanel;
    private javax.swing.JButton searchProductDetailsPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JComboBox<String> selectComboBox1;
    private javax.swing.JButton setProductDetailsPanel;
    private javax.swing.JButton updateDetailsButton;
    private javax.swing.JPanel updateDetailsPanel;
    private javax.swing.JLabel userProfilePick;
    private javax.swing.JLabel userRole;
    // End of variables declaration//GEN-END:variables
    
class RoundedPanel extends JPanel {
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
