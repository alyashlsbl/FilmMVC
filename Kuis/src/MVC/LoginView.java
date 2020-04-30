
package MVC;

import javax.swing.*;
import java.sql.Statement;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LoginView extends JFrame{
    
    JLabel luser, lpass;
    JTextField txuser;
    JPasswordField txpass;
    JButton login;
    
    public LoginView(){
 
        luser = new JLabel("Username");
        lpass = new JLabel("Password");
        
        txuser = new JTextField("");
        txpass = new JPasswordField("");
        
        login = new JButton("Login");
        
        setLayout(null);
        add(luser);
        add(lpass);
        add(txuser);
        add(txpass);
        add(login);
        
        luser.setBounds(75, 50, 100, 20);
        lpass.setBounds(75, 90, 100, 20);
        txuser.setBounds(200, 50, 100, 20);
        txpass.setBounds(200, 90, 100, 20);
        login.setBounds(200, 130, 80, 20);
        
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public String getUser(){
        return txuser.getText();
    }
    public String getPass(){
        String pass = new String(txpass.getPassword());
        return pass;
    }
    
}
