package pay_roll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Login_form extends javax.swing.JFrame 
{
  Connection con=null;
  ResultSet rs=null;
  PreparedStatement pst=null;
 
    public Login_form() 
    {
        initComponents();
        con=db_connectivity.java_db(); 
        currentdate();
    }

    public void currentdate()
    {
       Calendar cal=new GregorianCalendar();
       
       int month= cal.get(Calendar.MONTH);
       int year=cal.get(Calendar.YEAR);
       int day=cal.get(Calendar.DAY_OF_MONTH);
       label_date.setText(day+"/"+month+"/"+year);
     
       int sec=cal.get(Calendar.SECOND);
       int min=cal.get(Calendar.MINUTE);
       int hour=cal.get(Calendar.HOUR);
       label_time.setText(hour+":"+min+":"+sec);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        label_time = new javax.swing.JLabel();
        label_date = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 0, 0));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pay_roll/images/Log Details.png"))); // NOI18N
        b1.setText("LOGIN");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(240, 300, 110, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 200, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 100, 20);

        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameTextField);
        UsernameTextField.setBounds(250, 140, 170, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 300, 100, 30);
        getContentPane().add(PasswordTextField);
        PasswordTextField.setBounds(250, 200, 170, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("PAYROLL MANAGEMENT SYSTEM");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 500, 60);

        label_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_time.setForeground(new java.awt.Color(255, 204, 204));
        label_time.setText("Time");
        getContentPane().add(label_time);
        label_time.setBounds(460, 10, 110, 30);

        label_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_date.setForeground(new java.awt.Color(255, 204, 204));
        label_date.setText("Date");
        getContentPane().add(label_date);
        label_date.setBounds(10, 10, 110, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 300, 140, 30);

        jLabel5.setBackground(new java.awt.Color(153, 255, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pay_roll/images/img 2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 570, 370);

        setSize(new java.awt.Dimension(584, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
try
        {
          con=db_connectivity.java_db();
          String query2="select *from Employee where EmailId=? and Password=?";       
          PreparedStatement pst=con.prepareStatement(query2);
          pst.setString(1,UsernameTextField.getText());
          pst.setString(2,PasswordTextField.getText());
            
          ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                 if(UsernameTextField.getText().equals("admin@gmail.com")&&PasswordTextField.getText().equals("admin@1234"))
                {
                    MainMenu a=new MainMenu();
                    a.setVisible(true);
                    setVisible(false);
                }
                 else  if(UsernameTextField.getText().equals(rs.getString("EmailId"))&&PasswordTextField.getText().equals(rs.getString("Password")))
                 {
                EmployeeLogin w=new EmployeeLogin(UsernameTextField.getText());
                w.setVisible(true);
                setVisible(false);
                }
                
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Entered Wrong username or password","Wrong Pass",JOptionPane.ERROR_MESSAGE);
            PasswordTextField.setText("");
            UsernameTextField.setText("");
            
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }    }//GEN-LAST:event_b1ActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Signup s=new Signup();
        s.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
               try
                {
                    
                
                  con=db_connectivity.java_db();
                   //employee e=new employee(); 
                  String input = JOptionPane.showInputDialog("Sir/Madam Please Enter Username");
                  System.out.println(input);
                  String query1="select * from users where username='"+input+"';";
                   
                  
                    pst=con.prepareStatement(query1);
                    ResultSet rs1=pst.executeQuery();
                    if(rs1.next())
                    {
                      String op1=rs1.getString("password");
                      JOptionPane.showMessageDialog(null,op1);
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null,"Please check Username");
                    }
                    
                 }catch(Exception e) 
                 {
                       
                       
                 }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_time;
    // End of variables declaration//GEN-END:variables
}