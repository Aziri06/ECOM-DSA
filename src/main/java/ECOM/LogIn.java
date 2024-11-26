
package ECOM;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LogIn extends JFrame {
    
    private JTextField userName;
    private JPasswordField pass;
    private JLabel nametxt, usertxt, passtxt;
    private JButton logbtn, cnclbtn, regbtn;
    private JComboBox recent;
    
    LogIn (){
        setSize(550, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        Font font = new Font("Arial" , Font.BOLD, 25); 
        JLabel nametxt = new JLabel("E-COMMERCE NAME");
        nametxt.setBounds(135, 30, 400, 60);
        add(nametxt);                                                                                                                                                                                                                         
        nametxt.setFont(font);
        
        JLabel usertxt = new JLabel("User Name:");
        usertxt.setBounds(110, 130, 70, 30);
        add(usertxt);
        
        JTextField userName = new JTextField();
        userName.setBounds(200, 130, 200, 25);
        add(userName);
          
         JLabel passtxt = new JLabel("Password:");
        passtxt.setBounds(110, 165, 70, 30);
        add(passtxt);
        
        JPasswordField pass = new JPasswordField();
        pass.setBounds(200, 165, 200, 25);
        add(pass);
        
        JButton logbtn = new JButton("Log In");
        logbtn.setBounds(300, 200, 100, 30);
        add(logbtn);
//        logbtn.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = usertxt.getText();
//                String password = new String(pass.getPassword());
//                
//                if(username.isEmpty()){
//                    JOptionPane.showMessageDialog(LogIn.this, "Enter Username", "Input Error", JOptionPane.ERROR_MESSAGE);
////                } else if (pass.isEmpty){
////                    JOptionPane.showMessageDialog(LogIn.this, "Enter Password", "Input Error", JOptionPane.ERROR_MESSAGE);                   
////                }
//                MainFrame main = new MainFrame(); 
//                main.setVisible(true);
//                dispose();
//            }
//        });
        
        JButton cnclbtn = new JButton("Cancel");
        cnclbtn.setBounds(190, 200, 100, 30);
        add(cnclbtn);
        
        JButton regbtn = new JButton("Register Here");
        regbtn.setBounds(190, 240, 210, 30);
        add(regbtn);
        //action for regbtn
        regbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegForm registration = new RegForm(); 
                registration.setVisible(true);
                dispose();
            }
        });
            
            }
        
        
//        RegForm regform = new RegForm();
//        regbtn.add(regform);
//        regform.setVisible(true);
//        this.dispose();
  
  } 

