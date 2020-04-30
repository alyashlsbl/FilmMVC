
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class LoginController {
    
    LoginView loginview;
    
    
    public LoginController(LoginView loginview){
        this.loginview = loginview;
        
        loginview.login.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                    
                String user = loginview.getUser();
                String pass = loginview.getPass();
                
                if(user.isEmpty() || pass.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Username atau Password harus diisi!");
                } else if (user.equals("admin") && pass.equals("123")){
                    loginview.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    new FilmMVC();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah");
                }
                
            }
        });
        
    }
    
}
