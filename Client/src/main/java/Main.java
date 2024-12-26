
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main extends javax.swing.JFrame implements DocumentListener {
    boolean validateServlet = false;
    boolean validateJSP = false;
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        userName.getDocument().addDocumentListener(this);
        ID.getDocument().addDocumentListener(this);
        pass.getDocument().addDocumentListener(this);
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        validateServlet = false;
        validateJSP = false;
        systemGroupButton.setEnabled(false);
        tcpButton.setEnabled(false);
        arpButton.setEnabled(false);
        statisticsButton.setEnabled(false);
        servletButton.setEnabled(true);
        jspButton.setEnabled(true);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        validateServlet = false;
        validateJSP = false;
        systemGroupButton.setEnabled(false);
        tcpButton.setEnabled(false);
        arpButton.setEnabled(false);
        statisticsButton.setEnabled(false);
        servletButton.setEnabled(true);
        jspButton.setEnabled(true);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        validateServlet = false;
        validateJSP = false;
        systemGroupButton.setEnabled(false);
        tcpButton.setEnabled(false);
        arpButton.setEnabled(false);
        statisticsButton.setEnabled(false);
        servletButton.setEnabled(true);
        jspButton.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        systemGroupButton = new javax.swing.JButton();
        tcpButton = new javax.swing.JButton();
        arpButton = new javax.swing.JButton();
        statisticsButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        servletButton = new javax.swing.JButton();
        jspButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SNMP Manager");
        setResizable(false);

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        mainLabel.setText("SNMP Manager");

        systemGroupButton.setText("System Data");
        systemGroupButton.setEnabled(false);
        systemGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemGroupButtonActionPerformed(evt);
            }
        });

        tcpButton.setText("TCP Table");
        tcpButton.setEnabled(false);
        tcpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpButtonActionPerformed(evt);
            }
        });

        arpButton.setText("ARP Table");
        arpButton.setEnabled(false);
        arpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arpButtonActionPerformed(evt);
            }
        });

        statisticsButton.setText("SNMP Group Statistics");
        statisticsButton.setEnabled(false);
        statisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsButtonActionPerformed(evt);
            }
        });

        userNameLabel.setText("Username");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        idLabel.setText("ID");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        servletButton.setText("Verify1");
        servletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servletButtonActionPerformed(evt);
            }
        });

        jspButton.setText("Verify2");
        jspButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jspButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(mainLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameLabel)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idLabel)
                        .addComponent(passwordLabel)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(systemGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tcpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statisticsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jspButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(mainLabel)
                .addGap(20, 20, 20)
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servletButton)
                    .addComponent(jspButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemGroupButton)
                    .addComponent(tcpButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arpButton)
                    .addComponent(statisticsButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void systemGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemGroupButtonActionPerformed
        SystemGroup systemData = new SystemGroup(this);
        systemData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_systemGroupButtonActionPerformed

    private void tcpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpButtonActionPerformed
        TCP tcpTable = new TCP(this);
        tcpTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tcpButtonActionPerformed

    private void arpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arpButtonActionPerformed
        ARP arpTable = new ARP(this);
        arpTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arpButtonActionPerformed

    private void statisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsButtonActionPerformed
        Statistics statistics = new Statistics(this);
        statistics.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_statisticsButtonActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void servletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servletButtonActionPerformed
        String name = userName.getText();
        String password = new String(pass.getPassword());
        String url = "http://localhost:8080/TomcatServer/Verify1";
        String data = "name=" + URLEncoder.encode(name, StandardCharsets.UTF_8) + "&password=" + URLEncoder.encode(password, StandardCharsets.UTF_8);
        validateServlet = sendRequest(url, data);
        if (validateServlet && validateJSP) {
            userName.setText("");
            this.ID.setText("");
            pass.setText("");
            systemGroupButton.setEnabled(true);
            tcpButton.setEnabled(true);
            arpButton.setEnabled(true);
            statisticsButton.setEnabled(true);
            servletButton.setEnabled(false);
            jspButton.setEnabled(false);
        }
    }//GEN-LAST:event_servletButtonActionPerformed

    private void jspButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jspButtonActionPerformed
        String id = ID.getText();
        String password = new String(pass.getPassword());
        String url = "http://localhost:8080/TomcatServer/Verify2.jsp";
        String data = "id=" + URLEncoder.encode(id, StandardCharsets.UTF_8) + "&password=" + URLEncoder.encode(password, StandardCharsets.UTF_8);
        validateJSP = sendRequest(url, data);
        if (validateServlet && validateJSP) {
            userName.setText("");
            this.ID.setText("");
            pass.setText("");
            systemGroupButton.setEnabled(true);
            tcpButton.setEnabled(true);
            arpButton.setEnabled(true);
            statisticsButton.setEnabled(true);
            servletButton.setEnabled(false);
            jspButton.setEnabled(false);
        }
    }//GEN-LAST:event_jspButtonActionPerformed

    public boolean sendRequest(String url, String data) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

            // Set the request method to POST
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            
            // Write the parameters to the request body
            try ( OutputStream os = conn.getOutputStream()) {
                byte[] input = data.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }
            
            conn.getResponseCode();

            // Read the response then close the connection
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            conn.disconnect();

            // Display response
            JOptionPane.showMessageDialog(rootPane, response.toString(), "Response", response.toString().equals("Permit") ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
            return response.toString().equals("Permit");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, e, "Server Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    public static void main(String[] args) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Main.class.getSimpleName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
        new Main().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton arpButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jspButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton servletButton;
    private javax.swing.JButton statisticsButton;
    private javax.swing.JButton systemGroupButton;
    private javax.swing.JButton tcpButton;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
