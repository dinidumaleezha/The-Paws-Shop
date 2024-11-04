package GUI;
import Class.UserData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;

public class LoginFrame extends javax.swing.JFrame {

    private static final String dbuserName = "root";
    private static final String password = "";
    private static final String baseUrl = "jdbc:mysql://localhost:3306/the_paws_shop";
    
    private Connection config = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;
    private int number1;
    
    public LoginFrame() {
        initComponents();
        setTitle("Login Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            config = DriverManager.getConnection(baseUrl, dbuserName, password);
        } catch (Exception erorr){
            JOptionPane.showMessageDialog(this, erorr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(10, new Color(51,51,51));
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        userP_text = new javax.swing.JLabel();
        userN_text = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showHide = new javax.swing.JCheckBox();
        Password = new javax.swing.JPasswordField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rb_136742.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("www.pawsshop.lk");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 400));

        userEmail.setBackground(new java.awt.Color(60, 63, 65));
        userEmail.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        userEmail.setForeground(new java.awt.Color(255, 255, 255));
        userEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 386, 40));

        userP_text.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        userP_text.setForeground(new java.awt.Color(255, 255, 255));
        userP_text.setText("Password");
        jPanel1.add(userP_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 274, -1));

        userN_text.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        userN_text.setForeground(new java.awt.Color(255, 255, 255));
        userN_text.setText("User Name");
        jPanel1.add(userN_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        loginButton.setBackground(new java.awt.Color(0, 102, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 386, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Back!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 315, 40));

        showHide.setForeground(new java.awt.Color(255, 255, 255));
        showHide.setText("Show Password");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });
        jPanel1.add(showHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));

        Password.setBackground(new java.awt.Color(60, 63, 65));
        Password.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 386, 40));

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        setSize(new java.awt.Dimension(835, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        userN_text.setForeground(new java.awt.Color(255,255,255));
        userP_text.setForeground(new java.awt.Color(255,255,255));
        try {
            Connection();
            pst = config.prepareStatement("select firstName, lastName, email, password, role from users WHERE email = ?");
            String email = userEmail.getText();
            pst.setString(1, email); 
            result = pst.executeQuery();
            if (result.next() == false){
                userN_text.setText("Incorrect User Name");
                userP_text.setText("Password");
                userN_text.setForeground(new java.awt.Color(255,0,51));
            }else{
                String Email = result.getString("email");
                String user_Password = result.getString("password");
                String role = result.getString("role");
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");
                
                String fullName = firstName + " " + lastName;
                UserData uData = new UserData();
                uData.setName(fullName);
                
                userCheck(Email, user_Password, role);
            }
         
        } catch (Exception erorr){
            JOptionPane.showMessageDialog(this, erorr);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userCheck(String Email, String user_Password, String role){
        if (role.equals("cashier")) {
            if (Email.equals(userEmail.getText())) {
                if (user_Password.equals(Password.getText())) {  
                    CashierFrame Cashier = new CashierFrame();
                    this.dispose();
                    Cashier.setVisible(true);
                } else {
                    userN_text.setText("User Name");
                    userP_text.setText("Incorrect Password");
                    userP_text.setForeground(new java.awt.Color(255,0,51));
                }
            }
        } else if (role.equals("manager")) {
            if (Email.equals(userEmail.getText())) {
                if (user_Password.equals(Password.getText())) {  
                    ManagerFrame Manager = new ManagerFrame();
                    this.dispose();
                    Manager.setVisible(true);
                } else {
                    userN_text.setText("User Name");
                    userP_text.setText("Incorrect Password");
                    userP_text.setForeground(new java.awt.Color(255,0,51));
                }
            }
        }
    }

    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        if (showHide.isSelected()){
            Password.setEchoChar((char)0);
        } else {
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_showHideActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JCheckBox showHide;
    private javax.swing.JTextField userEmail;
    private javax.swing.JLabel userN_text;
    private javax.swing.JLabel userP_text;
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
            //graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);            
        }
    }
}
